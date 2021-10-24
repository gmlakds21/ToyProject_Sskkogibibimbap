package kr.co.bibimbab.store;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("StoreService")
public class StoreService {

	@Resource(name="StoreDao")
	private StoreDao storeDao;
}
