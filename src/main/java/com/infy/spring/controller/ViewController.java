package com.infy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infy.spring.model.User;
import com.infy.spring.service.UserService;

@Controller
public class ViewController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonMethod(Model m) {
		m.addAttribute("desc", "LearnWith Krupal");
	}
	@RequestMapping("/contact")
	public String contact() {
	return "contact";	
	}
	
	@RequestMapping(path="proccessForm",method=RequestMethod.POST)
	public String handler(@ModelAttribute User user, Model model) {
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg","User is added with Id :"+createUser);
		System.out.println(user);
		
	return "success";
	}

}
