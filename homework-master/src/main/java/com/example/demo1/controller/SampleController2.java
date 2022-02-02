package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController2 {
	
	@PostMapping("/post")
	public String demoPost( 
			
			@RequestParam String membername,
			@RequestParam String memberid,
			@RequestParam String memberemail,
			Model model
			
			) {
		
		model.addAttribute("membername",membername);
		model.addAttribute("memberid",memberid);
		model.addAttribute("memberemail",memberemail);
		
		/*
		 * Get방식 @GetMapping : @RequestParam post방식 @PostMapping
		 * : @RequestBody,@RequestParam
		 *
		 *
		 *
		 *
		 *//*
			 * System.out.println("성공"); System.out.println(req);
			 */
		
		return "/post/post"; //post.html
		
	}
	
	
	
}
