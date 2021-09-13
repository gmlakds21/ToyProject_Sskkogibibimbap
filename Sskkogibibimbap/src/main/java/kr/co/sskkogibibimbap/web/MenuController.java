package kr.co.sskkogibibimbap.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sskkogibibimbap.service.MenuService;

@Controller
public class MenuController {

	@Resource(name="MenuService")
	private MenuService menuService;
	
	@RequestMapping("/Menu.do")
	public String Menu() {
		return "menu/menu.tiles";
	}
}
