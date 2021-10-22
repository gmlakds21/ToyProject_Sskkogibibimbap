package kr.co.bibimbab.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping("/BoardList.do")
	public String boardList() {
		boardService.readBoard();
		return "board/boardList.tiles";
	}
	
	@RequestMapping("/BoardWrite.do")
	public String boardWrite() {
		boardService.insertBoard();
		return "board/boardWrite.tiles";
	}
	
	@RequestMapping("/BoardUpdate.do")
	public String boardUpdate() {
		boardService.updateBoard();
		return "board/boardUpdate.tiles";
	}
}
