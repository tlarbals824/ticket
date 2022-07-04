package webproject.ticket.domain;




import lombok.Getter;
import lombok.Setter;
import webproject.ticket.domain.member.Member;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Show {

    @Id @GeneratedValue
    @Column(name="show_id")
    private Long id;
    @Column(name="show_date")
    private Date date;
    private int max;
    private int price;
    @Column(name="show_name")
    private String name;
    private Category category;

    private Member member_id;
    private Place place_id;



}
