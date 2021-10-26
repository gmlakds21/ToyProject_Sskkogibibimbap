package kr.co.bibimbab.board;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.bibimbab.vo.BoardVO;

@Repository("BoardDao")
public class BoardDao extends EgovAbstractMapper {

/*
https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte2:psl:dataaccess:mybatisguide
 */
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<BoardVO> readBoardList(String target) {
		System.out.println("=== Dao 들어감");
		return (List<BoardVO>) list("boardMapper.readBoardList", target);
	}
	
	public BoardVO readBoardOne() {
		// "boardMapper.readBoardOne"
		return null;
	}
	
	public int insertBoard() {
		// "boardMapper.insertBoard
		return 1;
	}
	
	public int updateBoard() {
		// "boardMapper.updateBoard
		return 1;
	}
	
	public int deleteBoard() {
		// "boardMapper.deleteBoard"
		return 1;
	}
}
