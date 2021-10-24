package kr.co.bibimbab.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.bibimbab.vo.BoardVO;

@Service("BoardService")
public class BoardService {

	@Resource(name="BoardDao")
	private BoardDao boardDao;
	
	public List<BoardVO> readBoardList() {
		return boardDao.readBoardList();
	}
	
	public List<BoardVO> readBoardOne() {
		return boardDao.readBoardOne();
	}
	
	public List<BoardVO> insertBoard() {
		return boardDao.insertBoard();
	}
	
	public List<BoardVO> updateBoard() {
		return boardDao.updateBoard();
	}
}
