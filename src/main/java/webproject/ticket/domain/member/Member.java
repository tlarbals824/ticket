package webproject.ticket.domain.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Getter
@Setter
@Entity
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String member_id;
    //private String name;
    private String pw;
    //private String email;

}
