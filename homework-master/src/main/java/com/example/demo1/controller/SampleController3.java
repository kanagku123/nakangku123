package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo1.DTO.userDTO;







@Controller
public class SampleController3 {
/*
	@PostMapping("/SampleController3")
	public String userForm(
			
			@RequestParam String userName,
			@RequestParam String userId,
			@RequestParam String userPhone
			
			) { 
		
		System.out.println("-----------------");
		System.out.println(userName);
		System.out.println(userId);
		System.out.println(userPhone);
		System.out.println("------------------");
		
		
		
		return "/post/SampleController3View";
		*/
	
	
	@PostMapping("/SampleController3")
	public String userForm(
			
			userDTO userDTO,
			Model model
			
			) {
		System.out.println( userDTO.getUserName());
		System.out.println( userDTO.getUserId());
		System.out.println( userDTO.getUserPhone());
		
		model.addAttribute("heading","Spring Boot");
		
		
		return "/post/SampleController3View";
	}
	
	}
	
