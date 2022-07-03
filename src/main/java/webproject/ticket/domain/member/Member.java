package webproject.ticket.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Member {

    private final String member_id;
    private String member_name;
    private String pw;
    private Grade grade;
    private String email;

}
