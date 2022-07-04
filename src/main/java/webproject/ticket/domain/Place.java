package webproject.ticket.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Place {

    @Id @GeneratedValue
    @Column(name="place_id")
    private Long id;

    private String location;
    private Seat seat;
}

