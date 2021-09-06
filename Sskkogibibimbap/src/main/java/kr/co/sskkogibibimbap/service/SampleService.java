package kr.co.sskkogibibimbap.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sskkogibibimbap.dao.SampleDAO;
import kr.co.sskkogibibimbap.vo.SampleVO;

@Service("SampleService")
public class SampleService {

	@Resource(name="SampleDAO")
	private SampleDAO sampleDAO;
	
	public List<SampleVO> sampleList(String order) {
		return sampleDAO.sampleList(order);
	}
	
}
