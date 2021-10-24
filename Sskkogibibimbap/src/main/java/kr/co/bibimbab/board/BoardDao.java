package kr.co.bibimbab.board;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.bibimbab.vo.BoardVO;

@Repository("BoardDao")
public class BoardDao extends EgovAbstractMapper {

	/*
	 * @Resource(name="sqlSession") public void
	 * setSqlSessionFactory(SqlSessionFactory sqlSession) {
	 * super.setSqlSessionFactory(sqlSession); }
	 */
	
	
	// @Autowired private SqlSession sqlSession;
	 
	
	public List<BoardVO> readBoardList() {
		// list("boardMapper.readBoardList"); }
		return null;
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
