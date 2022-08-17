package kr.ac.kopo.springboot.board.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
@ToString
public class BoardVO {
    private int no;
    @NotEmpty(message = "필수사항 입니다.")
    private String title;
    @NotEmpty(message = "필수사항 입니다.")
    private String writer;
    @NotEmpty(message = "필수사항 입니다.")
    private String content;
    private int viewCnt;
    private String regDate;
}
