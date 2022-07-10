package webproject.ticket.domain.order;

import lombok.Getter;
import lombok.Setter;
import webproject.ticket.domain.member.Member;
import webproject.ticket.domain.show.Show;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private Member member;

//    private List<OrderShow> orderShows = new ArrayList<>();

    private Show show;

    private LocalDateTime orderDate;

    //연관관계 메서드
    public void setMember(Member member) {
        this.member = member;
        //member.getShow().add(this);
    }

//    public void addShowItem(OrderShow orderShow) {
//        orderShows.add(orderShow);
//        orderShow.setShow(this);
//    }

    public void setShow(Show show) {
        this.show = show;
//        show.getMember().add(this);
    }


    //생성 메서드
    public static Order createOrder(Member member, Show show) {
        Order order = new Order();
        order.setMember(member);
        order.setShow(show);
        order.setOrderDate(LocalDateTime.now());
        return order;
    }

    //비즈니스 로직
    public void cancel() {
//        for (OrderShow orderShow : orderShows) {
//            orderShow.cancel();
//        }
        //getShow().좌석 수 + 1?
        //
    }
}
