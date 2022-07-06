package webproject.ticket.domain.order;

import lombok.Getter;
import lombok.Setter;
import webproject.ticket.domain.show.Show;

import javax.persistence.*;

@Entity
@Table(name = "ORDERSHOW")
@Getter @Setter
public class OrderShow {

    @Id @GeneratedValue
    @Column(name = "order_show_id")
    private Long id;

    private Show show;

    private int showPrice;

//    public void cancel() {
//        //공연 좌석 수 원복
//        //getShow.addSeat?Stock(1);..?
//    }
}
