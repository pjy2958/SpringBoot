package kr.ac.kopo.springboot.board.service;

import kr.ac.kopo.springboot.board.dao.BoardDAO;
import kr.ac.kopo.springboot.board.vo.BoardVO;
import kr.ac.kopo.springboot.board.vo.ReplyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardDAO boardDAO;

    @Override
    public List<BoardVO> getAllBoard() {
        List<BoardVO> list = new ArrayList<>();
        list = boardDAO.selectAll();
        return list;
    }

    @Override
    public BoardVO getOneBoard(int boardNo) {
        BoardVO board = boardDAO.selectByNo(boardNo);
        return board;
    }

    @Override
    public void write(BoardVO board) {
        boardDAO.boardInsert(board);
    }

    @Override
    public void insert(ReplyVO replyVO) {
        boardDAO.insertReply(replyVO);
    }

    @Override
    public List<ReplyVO> getOneReply(int boardNo) {
        List<ReplyVO> replyVOList = boardDAO.selectOneReply(boardNo);
        return replyVOList;
    }
}
