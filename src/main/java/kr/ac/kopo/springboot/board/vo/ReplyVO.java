package kr.ac.kopo.springboot.board.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class ReplyVO {
    private int no;
    private int boardNo;
    private String content;
    private String writer;
    private String regDate;
}
