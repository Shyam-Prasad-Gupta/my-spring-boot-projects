package com.shyam.webapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shyam.webapp.model.Alien;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String homeController() {
		System.out.println("Hi, Home");
		return "index";
	}

	@RequestMapping("contact")
	// @ResponseBody
	public ModelAndView contactController(Alien alien, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("contact");

		return mv;
	}
}
