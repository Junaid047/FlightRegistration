package com.junaid.flightRegistration.filghtRegistration.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/showReg")
	public String showRegistration()	{
		return "registerUser";
	}
}
