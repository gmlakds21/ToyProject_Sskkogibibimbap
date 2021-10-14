package kr.co.bibimbab.main;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@Resource(name="MainService")
	private MainService mainService;
	
	@RequestMapping("/Main.do")
	public String Main() {
		return "main/main.tiles";
	}
}
