package kr.co.bibimbab.menu;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

	@Resource(name="MenuService")
	private MenuService menuService;
	
	@RequestMapping("/Menu.do")
	public String Menu() {
		return "menu/menu.tiles";
	}
}
