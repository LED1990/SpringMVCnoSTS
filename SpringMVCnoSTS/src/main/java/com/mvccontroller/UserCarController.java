package com.mvccontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.models.*;

@Controller
public class UserCarController {
	private final Logger USlog = LoggerFactory.getLogger(UserCarController.class);
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public ModelAndView addUser(){
		return new ModelAndView("addUser", "command", new UserModel(new CarModel()));
	}
	
	@RequestMapping(value="/addNew", method=RequestMethod.POST)
	public String getFormData(@ModelAttribute("myModel")UserModel userModel,ModelMap model){
		
		USlog.info("recived data: "+userModel.getId()+" "+userModel.getName()+" "+userModel.getUserCarMark()+" "+userModel.getUserCarModel());
		return "result";
	}
	
	/////////////////////////////////JUST TESTS////////////////////////////////////////
	@RequestMapping(value="/testMe", method=RequestMethod.GET)
	public ModelAndView makeTest(){
		return new ModelAndView("testingTest", "user", new TestClass());
	}
	
	@RequestMapping(value="/justTesting", method=RequestMethod.POST)
	public String getTestData(@ModelAttribute("user")TestClass testclass,ModelMap model){
		
		USlog.info("recived data: "+testclass.getId()+" "+testclass.getName());
		return "result";
	}
	/////URI patterns
	@RequestMapping(value="/testpath/{val1}/{val2}", method=RequestMethod.GET)
	public void getPathParam(@PathVariable String val1, @PathVariable Integer val2){
		
		USlog.info("recived values from path: "+val1+" "+val2);
	}
	//param example
	@RequestMapping(value="/testParam", method=RequestMethod.GET)
	public void getPathParam(@RequestParam("param1") int val1,@RequestParam("param2") int val2){
		
		USlog.info("recived values by params: "+val1+" "+val2);
	}
	//response body
	@RequestMapping(value="/testBody", method=RequestMethod.GET)
	@ResponseBody
	public String helloWorld() {
	    return "Hello BODY";
	}
	
	
}
