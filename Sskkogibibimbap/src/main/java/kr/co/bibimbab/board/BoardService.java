package kr.co.bibimbab.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("BoardService")
public class BoardService {

	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
}
