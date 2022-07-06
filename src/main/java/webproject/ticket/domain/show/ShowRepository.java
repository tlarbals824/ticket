package webproject.ticket.domain.show;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class ShowRepository {

    private final EntityManager em;

    public void register(Show show)
    {
        em.persist(show);
    }

    public Show findOne(Long id) {
        return em.find(Show.class, id);
    }

    // 남은 날짜 순으로 조회
    public List<Show> findPrepare() {
        Date now = new Date();
        return em.createQuery("select s from Show s where s.showDate > :date order by s.showDate asc")
                .setParameter("date", "now")
                .getResultList();
    }

    public List<Show> findAll() {
        return em.createQuery("select s from Show s", Show.class).getResultList();
    }



}
