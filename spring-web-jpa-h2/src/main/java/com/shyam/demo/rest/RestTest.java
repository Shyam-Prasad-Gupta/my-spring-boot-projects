package com.shyam.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.demo.dao.AlienRestRepo;
import com.shyam.demo.model.Alien;

@RestController
public class RestTest {
	@Autowired
	AlienRestRepo alienRepo;

	@GetMapping("/aliens")
	private List<Alien> getAliens() {
		return alienRepo.findAll();
	}

	// If we want to both xml and json response then we just need to includ jackson
	// for both xml and json
	@GetMapping(path = "/alien/{aid}"/* , produces= {"application/xml", "application/json"} */)
	private Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
		return alienRepo.findById(aid);
	}

	// if we want to consume only json data then we can specify there
	@PostMapping(path = "/alien", consumes = { "application/json" })
	private Alien saveAlien(
			/* adding this request body annotation just to support the raw body or data */@RequestBody Alien alien) {
		return alienRepo.save(alien);
	}

	@DeleteMapping("/alien/{aid}")
	private Alien deleteAlien(@PathVariable("aid") int aid) {

		Alien a = alienRepo.getOne(aid);
		Alien na = new Alien(a.getAid(), a.getAname(), a.getLang());
		if (a != null && a.getAid() > 0) {
			alienRepo.delete(a);
		}
		return na;
	}

	@PutMapping("/alien/{aid}")
	private Alien updaeAlien(@PathVariable("aid") int aid, @RequestBody Alien alien) {

		Alien a = alienRepo.getOne(alien.getAid());
		if (a != null && a.getAid() > 0) {
			alienRepo.save(alien);
		}
		return alien;
	}
}
