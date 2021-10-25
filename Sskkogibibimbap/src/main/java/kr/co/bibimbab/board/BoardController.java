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
	
	/* 기타상담 목록	*/
	@RequestMapping("/BoardList.do")
	public ModelAndView boardList(ModelAndView mv, String cp, String target) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdList", boardService.readBoardList());
		/* mv.addObject("bdCount", boardService.countBoard()); */
		return mv;
	}
	
	/* 기타상담 상세보기 */
	@RequestMapping("/BoardView.do")
	public ModelAndView boardView(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardView.tiles");
		mv.addObject("bdVO", boardService.readBoardOne());
		return mv;
	}
	
	/* 기타상담 상담하기 */
	@RequestMapping("/BoardWrite.do")
	public String boardWrite() {
		return "board/boardWrite.tiles";
	}
	
	/* 기타상담 상담등록 */
	@RequestMapping("/BoardWriteOK.do")
	public ModelAndView boardWriteOK(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdVO", boardService.insertBoard());
		return mv;
	}
	
	/* 기타상담 수정하기 */
	@RequestMapping("/BoardUpdate.do")
	public String boardUpdate(String CP, String SEQNO) {
		return "board/boardUpdate.tiles";
	}
	
	/* 기타상담 수정등록 */
	@RequestMapping("/BoardUpdateOK.do")
	public ModelAndView boardUpdateOK(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdVO", boardService.updateBoard());
		return mv;
	}
	
	/* 기타상담 삭제하기 */
	@RequestMapping("/BoardDelete.do")
	public String boardDelete(String CP, String SEQNO) {
		boardService.deleteBoard();
		return "board/boardDelete.tiles";
	}
}
