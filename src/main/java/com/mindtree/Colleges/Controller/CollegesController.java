package com.mindtree.Colleges.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Colleges.Entity.Colleges;
import com.mindtree.Colleges.Service.CollegesService;
import com.mindtree.Colleges.vo.ResponseTemplate;

@RestController
public class CollegesController {
	@Autowired
	private CollegesService clgServ;
	
	@PostMapping
	public Colleges add(@RequestBody Colleges c) {
		return clgServ.addCollege(c);
	}
	
	@GetMapping
	public List<Colleges> getAll(){
		return clgServ.getAllCollege();
	}
	@GetMapping("/{id}")
	public Colleges getCollege(@PathVariable int id) {
		return clgServ.getCollegeById(id);
	}
	@GetMapping("/all-college-student")
	public List<ResponseTemplate>  listWithStud(){
		return clgServ.listWithStudent();
	}
	@GetMapping("/colleges-with-student/{id}")
	public ResponseTemplate specificCollegeStudents(@PathVariable int id) {
		return clgServ.specificCollegeStudent(id);
	}
}



	


