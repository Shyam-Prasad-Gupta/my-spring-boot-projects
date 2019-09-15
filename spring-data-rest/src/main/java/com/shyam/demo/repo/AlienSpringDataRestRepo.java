package com.shyam.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shyam.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienSpringDataRestRepo extends JpaRepository<Alien, Integer> {

}
