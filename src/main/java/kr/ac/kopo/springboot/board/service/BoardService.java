package kr.ac.kopo.springboot.board.service;

import kr.ac.kopo.springboot.board.vo.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getAllBoard();
    BoardVO getOneBoard(int boardNo);
    void write(BoardVO board);
}
