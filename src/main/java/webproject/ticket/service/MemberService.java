package webproject.ticket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webproject.ticket.domain.member.Member;
import webproject.ticket.domain.member.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void signUp(Member member) {
        memberRepository.save(member);
    }
    /*
    public boolean signIn(String member_id, String pw) {
        Optional<Member> member = memberRepository.findByMemberId(member_id);
        if(member.get().getPw().equals(pw))
            return true;
        else
            return false;
    }
    */
}
