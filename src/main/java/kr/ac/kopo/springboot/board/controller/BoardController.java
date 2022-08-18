package kr.ac.kopo.springboot.board.controller;

import kr.ac.kopo.springboot.board.service.BoardService;
import kr.ac.kopo.springboot.board.vo.BoardVO;
import kr.ac.kopo.springboot.board.vo.ReplyVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @RequestMapping("/board")
    public String allboard(HttpServletRequest req) {
        List<BoardVO> boardlist = new ArrayList<>();
        boardlist = boardService.getAllBoard();
        req.setAttribute("boardlist", boardlist);
        return "board/list";
    }

    @RequestMapping("/board/detail/{boardNo}")
    public String detail(@PathVariable("boardNo") int no, Model model) {
        BoardVO board = boardService.getOneBoard(no);
        model.addAttribute("board", board);
        return "board/detail";
    }

    // 요청과 jsp주소가 같으면 return을 하지않아도 jsp 동작
    @GetMapping("/board/write")
    public void writeGet(Model model) {
        BoardVO boardVO1 = new BoardVO();
        model.addAttribute("boardVO1", boardVO1);
    }

    @PostMapping("/board/write")
    public String writePost(@Valid @ModelAttribute("boardVO1") BoardVO board, BindingResult result) {
        if(result.hasErrors()) {
            return "/board/write";
        } else {
            boardService.write(board);
            return "redirect:/board";
        }
    }


    @ResponseBody
    @PostMapping("/reply")
    public void write(ReplyVO replyVO){
        boardService.insert(replyVO);
    }

    @ResponseBody
    @GetMapping("/reply/{boardNo}")
    public List<ReplyVO> getAllReply(@PathVariable("boardNo") int boardNo){
        List<ReplyVO> replyList = boardService.getOneReply(boardNo);
        for(ReplyVO replyVO : replyList) {
            System.out.println(replyVO.toString());
        }
        return replyList;
    }

//    @Scheduled(fixedDelay = 3000)
//    @Scheduled(cron = "* * * * * * *")
    public void test() {
        System.out.println("test");
    }
}
