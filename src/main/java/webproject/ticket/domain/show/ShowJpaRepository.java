package webproject.ticket.domain.show;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ShowJpaRepository extends JpaRepository<Show, Long> {
    @Query("select s from Show s where s.showDate > :now order by s.showDate asc")
    List<Show> findByShowDateGreaterThan(@Param("now")LocalDateTime now);
}
