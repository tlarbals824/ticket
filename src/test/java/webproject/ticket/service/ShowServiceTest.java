package webproject.ticket.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import webproject.ticket.domain.show.Category;
import webproject.ticket.domain.show.Show;
import webproject.ticket.domain.show.ShowJpaRepository;
import webproject.ticket.domain.show.ShowRepository;
import webproject.ticket.service.show.ShowService;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ShowServiceTest {

    @Autowired
    private EntityManager em;
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private ShowJpaRepository showJpaRepository;
    @Autowired
    private ShowService showService;


    @Test
    @Transactional
    public void 공연생성() {

        Show show1 = new Show(
                "show1", LocalDateTime.of(2022, 7, 10, 11, 0),
                "Seoul", 10000, 100, 30000, Category.SPORTS);
        showService.registerShow(show1);

        Show findShow = showService.findOne(show1.getId());
        assertThat(findShow).isEqualTo(show1);

    }

    @Test
    @Transactional
    public void 모든공연조회() {
        Show test1 = new Show(
                "test1", LocalDateTime.of(2022, 7, 10, 11, 0),
                "Seoul", 10000, 100, 30000, Category.SPORTS);
        Show test2 = new Show(
                "test2", LocalDateTime.of(2022, 7, 16, 11, 0),
                "Busan", 1000, 100, 50000, Category.MUSICAL);
        Show test3 = new Show(
                "test3", LocalDateTime.of(2022, 7, 4, 11, 0),
                "Busan", 5000, 500, 50000, Category.CONCERT);
        showService.registerShow(test1);
        showService.registerShow(test2);
        showService.registerShow(test3);

        List<Show> result = showService.findAll();

        assertThat(result).contains(test1, test2, test3);
    }

    @Test
    @Transactional
    public void 시작안한공연만조회() {
        Show test1 = new Show(
                "test1", LocalDateTime.of(2022, 7, 8, 11, 0),
                "Seoul", 10000, 100, 30000, Category.SPORTS);
        Show test2 = new Show(
                "test2", LocalDateTime.of(2022, 7, 20, 11, 0),
                "Busan", 1000, 100, 50000, Category.MUSICAL);
        Show test3 = new Show(
                "test3", LocalDateTime.of(2022, 7, 16, 11, 0),
                "Jeju", 5000, 500, 50000, Category.CONCERT);

        showService.registerShow(test1);
        showService.registerShow(test2);
        showService.registerShow(test3);


        List<Show> result = showService.findPrepareShow();
        for (Show show : result) {
            System.out.println("show = " + show.getShowName());
        }

    }

    @Test
    @Transactional
    public void 카테고리별로조회() {

    }

}
