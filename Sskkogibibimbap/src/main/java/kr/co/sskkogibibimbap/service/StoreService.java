package kr.co.sskkogibibimbap.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sskkogibibimbap.dao.StoreDAO;

@Service("StoreService")
public class StoreService {

	@Resource(name="StoreDAO")
	private StoreDAO storeDAO;
}
