package webproject.ticket.domain;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class Show {

    @Id
    private Long show_id;

    private Date show_date;
    private int max;
    private int price;
    private String show_name;
    private Category1 category;
    private Member member_id;
    private Place place_id;



}
