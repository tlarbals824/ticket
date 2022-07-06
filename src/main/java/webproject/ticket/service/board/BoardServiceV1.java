package webproject.ticket.service.board;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webproject.ticket.domain.board.*;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardServiceV1 {

    private final BoardJpaRepository boardJpaRepository;

    //게시글 작성
    @Transactional
    public void create(BoardDTO board){
        Board saveBoard = new Board(board.getTitle(), board.getContent(), board.getBoardDate());
        boardJpaRepository.save(saveBoard);
    }

    //게시글 보기
    @Transactional
    public Board read(Long boardId) {
        Board board = findOne(boardId);
        board.increaseReadCount();
        return board;
    }

    //게시글 수정
    @Transactional
    public void update(Long boardId,BoardDTO board){
        Board findBoard = findOne(boardId);
        findBoard.update(board);
    }

    //게시글 삭제
    @Transactional
    public void delete(Long boardId){
        boardJpaRepository.deleteById(boardId);
    }

    //게시글 전체 조회
    public List<Board> findAll(){
        return boardJpaRepository.findAll();
    }

    //게시글 검색
    public Board findOne(Long boardId){
        return boardJpaRepository.findById(boardId)
                .orElse(new Board("", "", LocalDateTime.now()));
    }


}
