package kr.ac.kopo.springboot.testmapper;

import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String getMemberList(HttpServletRequest req) {
        List<MemberVO> memberVOList = testService.getMemberList();
        req.setAttribute("memberList", memberVOList);
        System.out.println("-----------------------------------");
        for(MemberVO member : memberVOList) {
            System.out.println(member.getId());
        }
        System.out.println("-----------------------------------");
        return "/test/test";
    }
}