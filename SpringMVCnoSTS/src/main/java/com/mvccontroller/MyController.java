package com.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/MyController")
public class MyController {

	@RequestMapping(method= RequestMethod.GET)
	public String displayTestPage(Model model){
		model.addAttribute("message", "Hello mvc spring");
		return "TestPage";
	}
	
	
}
