package webproject.ticket.domain.board;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@Getter
public class BoardDTO {

    private String title;
    private String content;
    private LocalDateTime boardDate;

    public BoardDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BoardDTO(String title, String content, LocalDateTime boardDate) {
        this.title = title;
        this.content = content;
        this.boardDate = boardDate;
    }
}
