package kr.ac.kopo.springboot.member.service;

import kr.ac.kopo.springboot.member.dao.MemberDAO;
import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberDAO memberDAO;

    public MemberVO getMember(MemberVO member) {
        MemberVO authMember = memberDAO.selectUser(member);
        return authMember;
    }

    public void setMember(MemberVO member) {
        memberDAO.insertMember(member);
    }
}
