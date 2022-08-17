package kr.ac.kopo.springboot.testmapper;

import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<MemberVO> getMemberList() {
        List<MemberVO> memberVOList = testMapper.getMember();
        return memberVOList;
    }
}
