package webproject.ticket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webproject.ticket.domain.show.Category;
import webproject.ticket.domain.show.Show;
import webproject.ticket.domain.show.ShowRepository;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;

    public Long registerShow(Show show) {
        showRepository.register(show);
        return show.getId();
    }


    public Show findOne(Long ShowId) {
        return showRepository.findOne(ShowId);
    }

    public List<Show> findAll() {
        return showRepository.findAll();
    }

    public List<Show> findPrepareShow() {
        return showRepository.findPrepare();
    }


}
