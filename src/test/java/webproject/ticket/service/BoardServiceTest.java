package webproject.ticket.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import webproject.ticket.domain.board.Board;
import webproject.ticket.domain.board.BoardDTO;
import webproject.ticket.service.board.BoardServiceV1;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
@Transactional
public class BoardServiceTest {

    @Autowired
    private BoardServiceV1 boardServiceV1;


    /**
     * BoardSerivceV1
     * create() method test
     */
    @Test
    public void createTest() throws Exception {
        BoardDTO board = new BoardDTO("test","test", LocalDateTime.now());
        boardServiceV1.create(board);

        List<Board> all = boardServiceV1.findAll();
        for (Board board1 : all) {
            System.out.println("board1 = " + board1);
        }
    }

    @Test
    public void readTest() throws Exception {

    }


}
