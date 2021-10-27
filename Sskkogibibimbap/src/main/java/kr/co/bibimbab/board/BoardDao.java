package kr.co.bibimbab.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.bibimbab.vo.BoardVO;

@Repository("BoardDao")
public class BoardDao extends EgovAbstractMapper {

/*
https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte2:psl:dataaccess:mybatisguide
 */

/*
 * #3-2#
 * 
 * @Resource(name="BoardMapper") private BoardMapper boardMapper;
 */ 
	public List<BoardVO> readBoardList(String target) {
		/* #3-2# return boardMapper.readBoardList(target); */
		return selectList("readBoardList", target);
	} 
	
	public int countBoardList(String target) {
		return selectOne("countBoardList", target);
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
