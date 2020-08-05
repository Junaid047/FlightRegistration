package com.junaid.flightRegistration.filghtRegistration.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.junaid.flightRegistration.filghtRegistration.Entities.User;
import com.junaid.flightRegistration.filghtRegistration.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showRegistration()	{
		return "registerUser";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage()	{
		return "login";
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user)	{
		userRepository.save(user);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginToApplication(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap model)	{
		User user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password))	{
			return "findFlights";
		}
		else {
			model.addAttribute("msg","Invalid credentials, please enter valid credentials");
		}
		return "login";
	}
}
