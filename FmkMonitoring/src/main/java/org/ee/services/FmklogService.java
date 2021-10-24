package org.ee.services;

import java.util.List;

import org.ee.dao.FmklogRepository;
import org.ee.entities.Fmklog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FmklogService {

	 @Autowired
	    private FmklogRepository fmklogRepository;

	 @GetMapping(value="/fmk/fmklog/list")
	   public List<Fmklog> getFmklog(){
		 return fmklogRepository.findAll();
	 }
	 
	 
	 @GetMapping(value="/fmk/fmklog/show/{id}")
	   public Fmklog getFmklogs(@PathVariable long id){
		 return fmklogRepository.getOne(id);
	 }
	 	 
	 @DeleteMapping(value="/fmk/Fmklog/delete/{id}")
public boolean deleteFmklog(@PathVariable long id) {
		 fmklogRepository.deleteById(id);
	 return true;
}
	
}
