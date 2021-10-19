package kr.co.bibimbab.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping("/Board.do")
	public String Board() {
		return "board/boardList.tiles";
	}
}
