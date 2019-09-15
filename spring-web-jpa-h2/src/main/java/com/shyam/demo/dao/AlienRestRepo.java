package com.shyam.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shyam.demo.model.Alien;

public interface AlienRestRepo extends JpaRepository<Alien, Integer>{
	
	@Query("from Alien where lang=?1 order by aname")
	List<Alien> findByTechSortedByName(String lang);

}
