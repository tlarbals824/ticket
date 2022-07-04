package webproject.ticket.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Place {

    @Id
    private Long place_id;

    private String location;
    private Seat seat;
}

