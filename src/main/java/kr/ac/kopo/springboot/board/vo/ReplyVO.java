package kr.ac.kopo.springboot.board.vo;

import lombok.Data;

@Data
public class ReplyVO {
    private int no;
    private int boardNo;
    private String content;
    private String writer;
    private String regDate;
}
