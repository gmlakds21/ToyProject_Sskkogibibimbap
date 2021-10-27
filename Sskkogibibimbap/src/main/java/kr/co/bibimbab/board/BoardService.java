package kr.co.bibimbab.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.bibimbab.vo.BoardVO;

@Service("BoardService")
public class BoardService {

	@Resource(name="BoardDao")
	private BoardDao boardDao;
	
	/* 해당하는 조건의 Board List 조회 */
	public List<BoardVO> readBoardList(String target) {
		System.out.println("=== 서비스 들어감");
		return boardDao.readBoardList(target);
	}
	
	/* 해당하는 조건의 Board 갯수를 Count */
	public int countBoardList(String target) {
		return boardDao.countBoardList(target);
	}
	
	/* 선택한 Board 정보를 조회 */
	public BoardVO readBoardOne() {
		return boardDao.readBoardOne();
	}
	
	/* 입력한 Board 정보를 삽입 */
	public int insertBoard() {
		return boardDao.insertBoard();
	}
	
	/* 입력한 Board 정보를 수정 */
	public int updateBoard() {
		return boardDao.updateBoard();
	}

	/* 선택한 Board 정보를 삭제 */
	public int deleteBoard() {
		return boardDao.deleteBoard();
	}
}
