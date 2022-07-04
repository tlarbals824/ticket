package webproject.ticket.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@RequiredArgsConstructor
public class Member {

    @Id
    private String member_id;
    private String member_name;
    private String pw;
    private Grade grade;
    private String email;

}
