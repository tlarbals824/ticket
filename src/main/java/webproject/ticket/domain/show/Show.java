package webproject.ticket.domain.show;




import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webproject.ticket.domain.show.Category;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "SHOWS")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="show_id")
    private Long id;
    @Column(name="show_name")
    private String showName;
    @Column(name="show_date")
    private LocalDateTime showDate;
    private String location;    //장소
    private int maxSeat;
    private int currentSeat;
    private int price;
    @Enumerated(EnumType.STRING)
    private Category category;




    public Show(String showName, LocalDateTime showDate, String location, int maxSeat, int currentSeat, int price, Category category) {
        this.showName = showName;
        this.showDate = showDate;
        this.location = location;
        this.maxSeat = maxSeat;
        this.currentSeat = currentSeat;
        this.price = price;
        this.category = category;
    }


}

