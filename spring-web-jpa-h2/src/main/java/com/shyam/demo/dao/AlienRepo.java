package com.shyam.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shyam.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

	List<Alien> findByLang(String tech);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where lang=?1 order by aname")
	List<Alien> findByTechSortedByName(String lang);

}
