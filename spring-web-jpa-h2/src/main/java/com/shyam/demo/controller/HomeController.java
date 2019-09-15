package com.shyam.demo.controller;

import java.util.List;

import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shyam.demo.dao.AlienRepo;
import com.shyam.demo.model.Alien;

@Controller
public class HomeController {

	@Autowired
	private AlienRepo alienRepo;

	@RequestMapping("/")
	private ModelAndView homeController() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;

	}

	@RequestMapping("/saveAlien")
	private ModelAndView saveAlienController(Alien alien) {

		ModelAndView mv = new ModelAndView();
		if (alien != null && alien.getAid() > 0) {
			mv.addObject("alien", alien);
			mv.setViewName("alienProfile");
			alienRepo.save(alien);
		}
		return mv;
	}

	@RequestMapping("/getAlienById")
	private ModelAndView getAlien(int aid) {
		ModelAndView mv = new ModelAndView("alienProfile");
		mv.addObject("alien", alienRepo.findById(aid).orElse(new Alien()));
		return mv;
	}

	@RequestMapping("/updateAlien")
	private ModelAndView editAlien(Alien alien) {
		ModelAndView mv = new ModelAndView();
		if (alien.getAid() > 0) {
			alienRepo.save(alien);
		}
		mv.addObject("alien", alien);
		mv.setViewName("alienProfile");
		return mv;
	}
	
	@RequestMapping("/getAlienByTech")
	private void getAlientByTech(String lang) {
		
		List<Alien> aliens = alienRepo.findByLang(lang);
		System.out.println(aliens);
		System.out.println(alienRepo.findByAidGreaterThan(1));
		System.out.println(alienRepo.findByTechSortedByName(lang));
		
	}
}
