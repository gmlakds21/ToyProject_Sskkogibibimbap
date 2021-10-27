package kr.co.bibimbab.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.bibimbab.vo.BoardVO;

@Service("BoardService")
public class BoardService {

	@Resource(name="BoardDao")
	private BoardDao boardDao;
	
	public List<BoardVO> readBoardList(String target) {
		System.out.println("=== 서비스 들어감");
		return boardDao.readBoardList(target);
	}
	
	public int countBoardList(String target) {
		return boardDao.countBoardList(target);
	}
	
	public BoardVO readBoardOne() {
		return boardDao.readBoardOne();
	}
	
	public int insertBoard() {
		return boardDao.insertBoard();
	}
	
	public int updateBoard() {
		return boardDao.updateBoard();
	}

	public int deleteBoard() {
		return boardDao.deleteBoard();
	}
}
