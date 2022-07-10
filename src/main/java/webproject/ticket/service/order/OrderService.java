package webproject.ticket.service.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webproject.ticket.domain.member.Member;
import webproject.ticket.domain.member.MemberRepository;
import webproject.ticket.domain.order.Order;
import webproject.ticket.domain.order.OrderRepository;
import webproject.ticket.domain.show.Show;
import webproject.ticket.domain.show.ShowRepository;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final MemberRepository memberRepository;
    private final ShowRepository showRepository;
    private final OrderRepository orderRepository;

    //예약? 주문?
    public Long order(Long memberId, Long showId) { //Member findOne(memberId) 만들어주세요.

//        Member member = memberRepository.findByMemberId(memberId);
//        Show show = showRepository.findOne(showId);
//
//        Order order = Order.createOrder(member, show);
//
//        orderRepository.save(order);
//        return order.getId();
    }

    //취소
    public void cancelOrder(Long orderId) {

        Order order = orderRepository.findOne(orderId);
        order.cancel();
    }
}
