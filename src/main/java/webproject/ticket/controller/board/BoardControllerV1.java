package webproject.ticket.controller.board;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webproject.ticket.domain.board.Board;
import webproject.ticket.domain.board.BoardDTO;
import webproject.ticket.service.board.BoardServiceV1;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;


@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/board")
public class BoardControllerV1 {

    private final BoardServiceV1 boardServiceV1;


    @PostConstruct
    public void init() {
        for (int i = 1; i <= 10; i++) {
            String test = "test" + i;
            boardServiceV1.create(new BoardDTO(test, test, LocalDateTime.now()));
        }
    }

    /**
     * CRUD : Read(GET)
     * URL  : /board/
     */
    @GetMapping
    public String mainBoardPage(Model model){
        List<Board> list = boardServiceV1.findAll();
        model.addAttribute("list",list);
        return "board/mainBoardPage";
    }


    @GetMapping(value = "/{boardId}")
    public String boardPage(@RequestParam("boardId") Long id){

        return "/board/boardPage";
    }
}

