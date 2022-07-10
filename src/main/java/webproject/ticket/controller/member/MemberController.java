package webproject.ticket.controller.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import webproject.ticket.domain.member.Member;
import webproject.ticket.service.member.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("") ///members GET 메인 페이지
    public String home(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession(false);
        if(session == null)
            return "members/home";

        String memberId = (String)session.getAttribute("memberId");
        if(memberId == null)
            return "members/home";

        model.addAttribute("memberId", memberId);
        return "members/sign-in-home";
    }

    @GetMapping("/sign-up")  ///members/sign-up GET 회원가입 폼
    public String signUpPage() {
        return "/members/sign-up";
    }

    @PostMapping("/sign-up")  ///members/sign-up POST 회원가입 정보 전송
    public String signUp(@ModelAttribute Member member) {
        if(memberService.signUp(member))    //없는 ID, 신규 생성
            return "redirect:/members";
        return "members/sign-up";   //있는 ID, 다시 시도
    }

    @GetMapping("/sign-in")  ///members/sign-in GET 로그인 폼
    public String signInPage() {
        return "members/sign-in";
    }

    @PostMapping("/sign-in")    ///members/sign-in POST 로그인 정보 전송
    public String signIn(@RequestParam("memberId") String memberId, @RequestParam("pw") String pw, HttpServletRequest request) {
        if (!memberService.signIn(memberId, pw)) //ID나 PW가 다르면
            return "members/sign-in";   //다시 시도

        HttpSession session = request.getSession();  //세션이 있으면 있는 세션 반환, 없으면 신규 세션을 생성
        session.setAttribute("memberId", memberId); //세션에 로그인 회원 정보 보관

        return "redirect:/members";
    }

    @GetMapping("/sign-out")    ///members/sign-out GET 로그아웃
    public String signOut(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/members";
    }
}
