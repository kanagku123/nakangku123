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
	public String userId(@RequestParam(value="userid",required=false) String uid, Model model) {
		/*
		 * required = true 옵션은 디폴트가 트루이고 , 써놓지않으며 디폴트값 적용
		 * 이 경우에는 반드시 주소창에 userid 파라미터 값을 넣어서 HTTP 요청을 넣어야한다. 안그러면 페이지 에러가 발생한다.  
		 * http://.localhost:8024/user/userid?userid=koreamonster
		 *false 지정하면 파라미터 값을 넣지 않고도  에러가 발생하지 않는다
		 * 
		 */
		model.addAttribute("userid", uid);
		
		return "/user/userinfo"; //userinfo.html
	}
	
	@GetMapping("/user/userparams")
	public String userParams(
			@RequestParam(value = "userid") String uid,
			@RequestParam(value = "username") String uname,
			@RequestParam(value = "useremail") String uemail,
			@RequestParam(value = "userhp") String uhp,
			Model model) {
		
		model.addAttribute("userid",uid);
		model.addAttribute("username",uname);
		model.addAttribute("useremail",uemail);
		model.addAttribute("userhp",uhp);
		
		
		return "/user/userinfo";
	}
	
	
	
	
	}
	
	
	

