package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo1.DTO.userDTO;




@Controller
public class SampleController4 {

	@GetMapping("/SampleController4Form")
	public String mainPage() {
		
		return "/post/SampleController4Form";
	}
	
	
	@PostMapping("/SampleController4View")
	public String userForm(
			
			userDTO userDTO,
			Model model
			
			) {
		System.out.println("----------------");
		System.out.println(userDTO.getUserName());
		System.out.println(userDTO.getUserId());
		System.out.println(userDTO.getUserPhone());
		System.out.println("----------------");
		model.addAttribute("heading","User Information");
		
		return "/post/SampleController4View";
	}
	
}
