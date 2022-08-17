package kr.ac.kopo.springboot.testmapper;

import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<MemberVO> getMember();
}
