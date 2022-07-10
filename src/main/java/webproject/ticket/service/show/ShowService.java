package webproject.ticket.service.show;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webproject.ticket.domain.show.Category;
import webproject.ticket.domain.show.Show;
import webproject.ticket.domain.show.ShowJpaRepository;
import webproject.ticket.domain.show.ShowRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;
    private final ShowJpaRepository showJpaRepository;

    @Transactional
    public Long registerShow(Show show) {
        showRepository.save(show);
        return show.getId();
    }


    public Show findOne(Long ShowId) {
        return showRepository.findOne(ShowId);
    }

    public List<Show> findAll() {
        return showRepository.findAll();
    }

    public List<Show> findPrepareShow() {
        return showJpaRepository.findByShowDateGreaterThan(LocalDateTime.now());
    }


}
