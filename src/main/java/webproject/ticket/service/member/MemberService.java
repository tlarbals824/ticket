package webproject.ticket.service.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webproject.ticket.domain.member.Member;
import webproject.ticket.domain.member.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public boolean checkIdDuplicate(String memberId)
    {
        return memberRepository.existsByMemberId(memberId);
    }

    public boolean signUp(Member member) {
        if(checkIdDuplicate(member.getMemberId()))  //ID가 이미 존재하면
            return false;
        memberRepository.save(member);
        return true;
    }

    public boolean signIn(String memberId, String pw) {
        Optional<Member> member = memberRepository.findByMemberId(memberId);
        if (member.isPresent())  //member != null, 즉 DB에 일치하는 memberId가 있으면}
            if (member.get().getPw().equals(pw))    //pw가 일치하면
                return true;
        return false;
    }
}