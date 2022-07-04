package webproject.ticket.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

<<<<<<< HEAD
@Getter
@RequiredArgsConstructor
public class Member {

    private final String member_id;
=======
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@RequiredArgsConstructor
public class Member {

    @Id
    private String member_id;
>>>>>>> origin/master
    private String member_name;
    private String pw;
    private Grade grade;
    private String email;

}
