package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	//단순 요청
	@GetMapping("user/userinfo")
	public String userInfo() {
		
		return "/user/userinfo";
	}
	
	
	@GetMapping("user/userdata")
	public String userData(Model model) {
		
		model.addAttribute("username","홍길동");
		// 모델은 데이터 값을 홍길동으로 적용 뷰페이지로 전달
		//뷰페이지단으로 같이 데이터를 전달
		return "/user/userinfo";
	}
	
	
	@GetMapping("/user/userid")
	public String userId(@RequestParam("userid") String uid, Model model) {
		
		model.addAttribute("userid", uid);
		
		return "/user/userinfo"; //userinfo.html
	}
	
	
	
	
	
	
	
	
}
