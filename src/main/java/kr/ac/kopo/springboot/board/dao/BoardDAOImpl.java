package kr.ac.kopo.springboot.board.dao;

import kr.ac.kopo.springboot.board.vo.BoardVO;
import kr.ac.kopo.springboot.board.vo.ReplyVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<BoardVO> selectAll() {
        List<BoardVO> list = new ArrayList<>();
        list = sqlSessionTemplate.selectList("selectAll");
        return list;
    }

    @Override
    public BoardVO selectByNo(int boardNo) {
        BoardVO board = sqlSessionTemplate.selectOne("selectByNo", boardNo);
        return board;
    }

    @Override
    public void boardInsert(BoardVO board) {
        sqlSessionTemplate.insert("boardInsert", board);
    }

    @Override
    public void insertReply(ReplyVO replyVO) {
        sqlSessionTemplate.insert("insertReply", replyVO);
    }

    @Override
    public List<ReplyVO> selectOneReply(int boardNo) {
        List<ReplyVO> replyVOList = sqlSessionTemplate.selectList("selectOneReply", boardNo);
        return replyVOList;
    }
}
