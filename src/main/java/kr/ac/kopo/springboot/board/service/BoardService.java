package kr.ac.kopo.springboot.board.service;

import kr.ac.kopo.springboot.board.vo.BoardVO;
import kr.ac.kopo.springboot.board.vo.ReplyVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getAllBoard();
    BoardVO getOneBoard(int boardNo);
    void write(BoardVO board);
    void insert(ReplyVO replyVO);
    List<ReplyVO> getOneReply(int boardNo);
}
