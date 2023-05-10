package com.infy.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Krupal_Tasare");
		return "index";
	}
	@RequestMapping("/collection")
	public String collection(Model model) {
		List<String> list=new ArrayList<String>();
		list.add("Alpesh");
		list.add("Aryan");
		list.add("Krushna");
		model.addAttribute("friendslist","list");
		return "home";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Krupal");
		modelAndView.setViewName("help");
		List<String> list=new ArrayList<String>();
		list.add("Akshay");
		list.add("Aryan");
		list.add("Alpesh");
		list.add("Tanmay");
		list.add("krushna");
		modelAndView.addObject("marks",list);
		return modelAndView;
	}
	
}
