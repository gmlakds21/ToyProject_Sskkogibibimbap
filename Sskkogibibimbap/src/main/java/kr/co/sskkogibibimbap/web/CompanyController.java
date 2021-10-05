package kr.co.sskkogibibimbap.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sskkogibibimbap.service.CompanyService;

@Controller
public class CompanyController {
	
	@Resource(name="CompanyService")
	private CompanyService companyService;
	
	@RequestMapping("/Company.do")
	public String Company() {
		return "company/company.tiles";
	}
}
