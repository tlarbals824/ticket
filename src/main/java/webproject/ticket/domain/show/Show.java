package webproject.ticket.domain.show;




import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webproject.ticket.domain.show.Category;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "SHOWS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="show_id")
    private Long id;
    @Column(name="show_name")
    private String showName;
    @Column(name="show_date")
    private Date showDate;
    private int max;
    private int price;
    @Enumerated(EnumType.STRING)
    private Category category;
//    private Member member_id;
//    private Place place_id;




}

