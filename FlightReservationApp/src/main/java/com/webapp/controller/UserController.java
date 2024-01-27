package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.entity.User;
import com.webapp.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/")
	public String homePage() {
		return "homePage";
	}
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
	return "login";
	}
	@RequestMapping("/showRegpage")
	public String showRegpage() {
		return "saveReg";
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return "login";
		
		
	}
	
	@RequestMapping("/verifyLogin")
	public String veryfyLogin(@RequestParam("emailid") String emailid,@RequestParam("password")
	String password,ModelMap model) {
		User user=userRepo.findByEmail(emailid);
		if(user!=null) {
			if(user.getEmail().equals(emailid)&&user.getPassword().equals(password)) {
				return "findFlights";
			
			}else {
				model.addAttribute("error","Invalid user/password");
				return "login";
			}
			
		}else {
			model.addAttribute("error","Invalid user/password");
			return "login";
		}
		
	}
	

}
