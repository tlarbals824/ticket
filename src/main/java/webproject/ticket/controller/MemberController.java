package webproject.ticket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import webproject.ticket.domain.member.Member;
import webproject.ticket.service.MemberService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member/signup")
    public String signUpPage() {
        return "/member/signup";
    }

    @PostMapping("/member/signup")
    public String signUp(@ModelAttribute Member member) {
        memberService.signUp(member);
        System.out.println(member.getId());
        System.out.println(member.getMember_id());
        System.out.println(member.getPw());
        return "redirect:/";
    }

    @GetMapping("/member/signin")
    public String signInPage() {
        return "/member/signin";
    }
    /*
    @PostMapping("/member/signin")
    public String signIn(@RequestParam("member_id") String member_id, @RequestParam("pw") String pw) {
        if(memberService.signIn(member_id, pw))
            return "redirect:/";
        else
            return "/member/signin";

    }
    */
}
