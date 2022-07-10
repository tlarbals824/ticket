package webproject.ticket.controller.show;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webproject.ticket.domain.show.Category;
import webproject.ticket.domain.show.Show;
import webproject.ticket.service.show.ShowService;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/shows")
public class ShowController {

    private final ShowService showService;


    @PostConstruct
    public void init() {

        showService.registerShow(new Show("show1", LocalDateTime.of(2022, 7, 10, 11, 0), "Seoul", 10, 100, 1000, Category.SPORTS));
    }


    @GetMapping
    public String list(Model model) {
        List<Show> shows = showService.findAll();
        model.addAttribute("shows", shows);
        return "show/showList";
    }

    @GetMapping("/{showId}")
    public String show(@RequestParam("showId") Long id) {

        return "show/show";
    }

    @GetMapping("/new")
    public String createForm() {
        return "show/ShowAdd";
    }

    @PostMapping("/new")
    public String create() {
        return "redirect:/";
    }

    @GetMapping("/{showId}/edit")
    public String updateShowForm() {

        return "show/ShowEdit";
    }

    @PostMapping("/{showId}/edit")
    public String updateShow() {

        return "redirect:/";
    }

}
