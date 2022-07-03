package webproject.ticket.domain.show;




import lombok.Getter;
import lombok.Setter;
import webproject.ticket.domain.show.Category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "SHOWS")
public class Show {

    @Id
    private Long show_id;

    private Date show_date;
    private int max;
    private int price;
    private String show_name;
    private Category category;

//    private Member member_id;
//    private Place place_id;

}
