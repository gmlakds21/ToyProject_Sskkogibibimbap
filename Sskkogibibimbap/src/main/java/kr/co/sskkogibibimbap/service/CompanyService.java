package kr.co.sskkogibibimbap.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sskkogibibimbap.dao.CompanyDAO;

@Service("CompanyService")
public class CompanyService {

	@Resource(name="CompanyDAO")
	private CompanyDAO companyDAO;
}
