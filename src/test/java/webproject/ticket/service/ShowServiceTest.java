package webproject.ticket.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import webproject.ticket.domain.show.Category;
import webproject.ticket.domain.show.Show;
import webproject.ticket.domain.show.ShowRepository;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.Date;

public class ShowServiceTest {

    @Autowired EntityManager em;
    @Autowired ShowRepository showRepository;
    @Autowired ShowService showService;


    @Test
    @Transactional
    public void 공연생성() {

//       Show show = new Show("show",100, 10000, Category.SPORTS);
//       showRepository.register(show);


    }
}
