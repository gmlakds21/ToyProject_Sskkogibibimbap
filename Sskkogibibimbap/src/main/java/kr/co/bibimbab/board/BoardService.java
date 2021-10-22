package kr.co.bibimbab.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("BoardService")
public class BoardService {

	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
	
	public String readBoard() {
		return "";
	}
	
	public String insertBoard() {
		return "";
	}
	
	public String updateBoard() {
		return "";
	}
}
