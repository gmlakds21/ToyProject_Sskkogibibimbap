package kr.co.bibimbab.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.bibimbab.vo.BoardVO;

@Controller
public class BoardController {

	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping("/BoardList.do")
	public ModelAndView boardList(ModelAndView mv, String cp, String target) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdList", boardService.readBoardList());
		/* mv.addObject("bdCount", boardService.countBoard()); */
		return mv;
	}
	
	@RequestMapping("/BoardView.do")
	public ModelAndView boardView(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardView.tiles");
		mv.addObject("bdVO", boardService.readBoardOne());
		return mv;
	}
	
	@RequestMapping("/BoardWrite.do")
	public ModelAndView boardWrite(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardWrite.tiles");
		mv.addObject("bdVO", boardService.insertBoard());
		return mv;
	}
	
	@RequestMapping("/BoardUpdate.do")
	public ModelAndView boardUpdate(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardUpdate.tiles");
		mv.addObject("bdVO", boardService.updateBoard());
		return mv;
	}
	
	@RequestMapping("/BoardDelete.do")
	public ModelAndView boardDelete(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardDelete.tiles");
		mv.addObject("bdVO", boardService.deleteBoard());
		return mv;
	}
}
