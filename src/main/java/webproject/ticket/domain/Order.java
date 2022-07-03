package webproject.ticket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter @Setter
public class Order {

    private Long order_id;

    private String member_id;

    private Long show_id;

    private Date order_date;
}
