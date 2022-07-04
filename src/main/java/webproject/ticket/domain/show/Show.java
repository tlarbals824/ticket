package webproject.ticket.domain.show;




import lombok.Getter;
import lombok.Setter;
import webproject.ticket.domain.show.Category;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "SHOWS")
public class Show {

    @Id@GeneratedValue
    @Column(name="show_id")
    private Long show_id;
    @Column(name="show_date")
    private Date show_date;
    private int max;
    private int price;
    @Column(name="show_name")
    private String name;
    private Category category;

//    private Member member_id;
//    private Place place_id;

}
