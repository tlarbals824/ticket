package webproject.ticket.controller.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webproject.ticket.service.MemberService;
import webproject.ticket.service.order.OrderService;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final MemberService memberService;
    private final ShowService showService;
    private final OrderService orderService;

    @GetMapping(value = "/order")
    public String createForm(Model model) {
        return "order/orderForm"; //공연 장소 좌석이 나오게..?
    }

    @PostMapping(value = "/order")
    public String order(@RequestParam("memberId") Long memberId, @RequestParam("showId") Long showId) {

        //, @RequestParam("seatId") Long seatId?

        orderService.order(memberId, showId);
        return "redirect:/orders";
    }


}
