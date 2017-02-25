package com.perfume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perfume.entity.UserReg;
import com.perfume.serviceimpl.UserRegServiceImpl;

@Controller
public class UserRegController {
	@Autowired
	UserRegServiceImpl userRegServiceImpl;
	
	@RequestMapping("/userReg")
	public String getUserReg(Model model) {

		model.addAttribute("userReg",new UserReg());
		model.addAttribute("userreglist", userRegServiceImpl.listUsers());
		
		return "RegistrationForm";
	}
	
	@RequestMapping("/adduserreg")
	public String addUserReg(@ModelAttribute("userReg") UserReg userReg) {
		userRegServiceImpl.addUserReg(userReg);;
	
		return "redirect:/userReg";
	}

}
