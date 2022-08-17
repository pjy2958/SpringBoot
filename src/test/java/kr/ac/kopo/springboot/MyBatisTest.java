package kr.ac.kopo.springboot;

import kr.ac.kopo.springboot.board.vo.BoardVO;
import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class MyBatisTest {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Test
    public void test() {
        assertNotNull(sqlSessionTemplate);
    }
    @Test
    public void boardSelectByNo() {
        BoardVO board = sqlSessionTemplate.selectOne("selectByNo", 3);
        System.out.println(board);
    }
    @Test
    public void hello () {
        System.out.println("hello");
    }

    @Test
    public void selectUser() {
        MemberVO member = new MemberVO();
        member.setId("test");
        member.setPassword("test");
        MemberVO testMember = sqlSessionTemplate.selectOne("selectUser", member);
        System.out.println(testMember.toString());

    }
}
