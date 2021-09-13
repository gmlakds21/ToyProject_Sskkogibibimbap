package kr.co.sskkogibibimbap.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sskkogibibimbap.dao.MenuDAO;

@Service("MenuService")
public class MenuService {

	@Resource(name="MenuDAO")
	private MenuDAO menuDAO;
}
