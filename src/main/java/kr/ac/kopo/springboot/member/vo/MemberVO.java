package kr.ac.kopo.springboot.member.vo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Data
@ToString
public class MemberVO {
    @NotEmpty(message = "아이디를 입력해주세요.")
    private String id;
    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password;
    private String name;
}
