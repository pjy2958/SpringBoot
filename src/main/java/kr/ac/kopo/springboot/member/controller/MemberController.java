package kr.ac.kopo.springboot.member.controller;

import kr.ac.kopo.springboot.member.service.MemberService;
import kr.ac.kopo.springboot.member.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@SessionAttributes("loginVO")
@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String login(Model model) {
        MemberVO memberVO = new MemberVO();
        model.addAttribute("memberVO", memberVO);
        return "member/login";
    }

    @PostMapping("/login")
    public String loginPost(@Valid MemberVO member, BindingResult result, Model model, HttpSession session) {
        // id 또는 password를 입력하지 않은 경우.
        if(result.hasErrors()) {
            return "member/login";
        }

        MemberVO authMember = memberService.getMember(member);

        // id 또는 password가 올바르지 않는 경우.
        if(authMember == null) {
            model.addAttribute("loginmsg", "id와 password가 유효하지 않습니다.");
            return "member/login";
        }

//        session.setAttribute("loginVO", authMember); -> session.invalidate();
        model.addAttribute("loginVO", authMember); // -> sessionStatus.setComplete();
        String dest = (String) session.getAttribute("dest");
        if(dest != null)
            return "redirect:" + dest;
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session, SessionStatus sessionStatus) {
        session.invalidate();
        sessionStatus.setComplete(); // session 만료
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(Model model) {
        MemberVO member = new MemberVO();
        model.addAttribute("memberVO", member);
        return "/member/registerForm";
    }

    @PostMapping("/register")
    public String register(MemberVO memberVO, HttpServletRequest req) {

        String repassword = (String) req.getAttribute("repassword");
        memberService.setMember(memberVO);
        return "redirect:/login";
    }
}
