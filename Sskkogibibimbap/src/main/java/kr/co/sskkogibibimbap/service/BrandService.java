package kr.co.sskkogibibimbap.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sskkogibibimbap.dao.BrandDAO;

@Service("BrandService")
public class BrandService {

	@Resource(name="BrandDAO")
	private BrandDAO brandDAO;
	
	
}
