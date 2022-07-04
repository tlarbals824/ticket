package webproject.ticket.domain.show;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Place {

    @Id @GeneratedValue
    @Column(name="place_id")
    private Long place_id;

    private String location;
//    private Seat seat;
}

