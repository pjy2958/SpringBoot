package kr.ac.kopo.springboot.board.dao;


import kr.ac.kopo.springboot.board.vo.BoardVO;
import kr.ac.kopo.springboot.board.vo.ReplyVO;

import java.util.List;

public interface BoardDAO {
    List<BoardVO> selectAll();
    BoardVO selectByNo(int boardNo);
    void boardInsert(BoardVO board);
    void insertReply(ReplyVO replyVO);
    List<ReplyVO> selectOneReply(int boardNo);
}
