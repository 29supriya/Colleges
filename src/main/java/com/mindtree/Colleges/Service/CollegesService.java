package com.mindtree.Colleges.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindtree.Colleges.Entity.Colleges;
import com.mindtree.Colleges.Repository.CollegesRepository;
import com.mindtree.Colleges.vo.ResponseTemplate;
import com.mindtree.Colleges.vo.Students;

@Service
public class CollegesService {
	@Autowired
	private CollegesRepository clgRepo;
	@Autowired
	private RestTemplate restTemp;
	
	public Colleges addCollege(Colleges c) {
		return clgRepo.save(c);
	}

	public List<Colleges> getAllCollege(){
		return clgRepo.findAll();
	}
	public Colleges getCollegeById(int clgId) {
		Colleges c=clgRepo.findById(clgId).get();
		if(c!=null) {
			return c;
		}
		return null;
	}
	public List<ResponseTemplate> listWithStudent()
    {
      List<ResponseTemplate> list=new ArrayList<ResponseTemplate>();
      List<Colleges> allclg=this.getAllCollege();
      Iterator<Colleges> i=allclg.iterator();
      while(i.hasNext()) {
    	  Colleges c=i.next();
    	  ResponseEntity<Students[]> resp=restTemp.getForEntity("http://STUDENTS-SERVICE/students/students-with-ascname/"+c.getClgId(),Students[].class);
          Students[] students=resp.getBody();
          List<Students> s=Arrays.asList(students);
          ResponseTemplate rt=new ResponseTemplate();
          rt.setCollege(c);
          rt.setStudents(s);
          list.add(rt);
      }
      return list;
    }
	public ResponseTemplate specificCollegeStudent(int clgId) {
		Colleges c=this.getCollegeById(clgId);
		ResponseEntity<Students[]>resp=restTemp.getForEntity("http://STUDENTS-SERVICE/students/students-with-desc-age/"+c.getClgId(),Students[].class);
		Students[] students=resp.getBody();
		List<Students> s=Arrays.asList(students);
		ResponseTemplate rt=new ResponseTemplate();
		rt.setCollege(c);
		rt.setStudents(s);
		return rt;
	}
}



	


