package webproject.ticket.domain.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "ORDERS")
public class Order {

    @Id
    private Long order_id;

    private String member_id;

    private Long show_id;

    private Date order_date;
}
