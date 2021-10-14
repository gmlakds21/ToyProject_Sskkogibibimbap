package kr.co.bibimbab.brand;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("BrandService")
public class BrandService {

	@Resource(name="BrandDAO")
	private BrandDAO brandDAO;
}
