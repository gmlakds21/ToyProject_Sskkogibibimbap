package kr.co.sskkogibibimbap.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sskkogibibimbap.service.StoreService;

@Controller
public class StoreController {

	@Resource(name="StoreService")
	private StoreService storeService;
	
	@RequestMapping("/Store.do")
	public String Store() {
		return "store/store.tiles";
	}
}
