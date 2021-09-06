package kr.co.sskkogibibimbap.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sskkogibibimbap.service.SampleService;

@Controller
public class SampleController {

	
	  @Resource(name = "SampleService")
	  private SampleService sampleService;
	  
	  @RequestMapping("/list.do")
	  public String SampleList(String order) {
		  sampleService.sampleList(order); 
		  return "/sample/sampleList";
	  }
}
