package com.mindtree.Colleges.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Colleges.Entity.Colleges;

@Repository
public interface CollegesRepository extends JpaRepository<Colleges, Integer>{
	

}
