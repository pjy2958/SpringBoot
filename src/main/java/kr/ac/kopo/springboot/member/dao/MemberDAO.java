package kr.ac.kopo.springboot.member.dao;

import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public MemberVO selectUser(MemberVO member) {
        MemberVO authMember = sqlSessionTemplate.selectOne("selectUser", member);
        return authMember;
    }

    public void insertMember(MemberVO member) {
        sqlSessionTemplate.insert("insertMember", member);
    };
}
