package kr.co.sskkogibibimbap.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.sskkogibibimbap.vo.SampleVO;

@Repository("SampleDAO")
public class SampleDAO extends EgovAbstractMapper {
	
	@Resource(name="sqlSession")
	public void setSqlSessionFactory(SqlSessionFactory sqlSession) {
		super.setSqlSessionFactory(sqlSession);
	}
	
	public List<SampleVO> sampleList(String order) {
		return selectList("sampleMapper.selectList", order);
	}
}
