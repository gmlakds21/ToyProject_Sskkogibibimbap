package kr.co.bibimbab.menu;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("MenuService")
public class MenuService {

	@Resource(name="MenuDao")
	private MenuDao menuDao;
}
