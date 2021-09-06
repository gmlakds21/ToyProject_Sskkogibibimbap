package kr.co.sskkogibibimbap.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sskkogibibimbap.service.BrandService;

@Controller
public class BrandController {

	@Resource(name="BrandService")
	private BrandService brandService;
	
	@RequestMapping("/BrandStory.do")
	public String BrandStory() {
		return "BrandStory.tiles";
	}
}
