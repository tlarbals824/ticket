package webproject.ticket.domain.board;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Board {

    @Id@GeneratedValue
    @Column(name = "board_id")
    private Long id;

    private String title;
    private String content;
    private Date boardDate;

}
