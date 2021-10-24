package org.ee.services;

import java.util.List;

import org.ee.dao.FmkhalfflowRepository;
import org.ee.dao.FmklogRepository;
import org.ee.entities.Fmkhalfflow;
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
public class FmkhalfflowService {
	@Autowired
    private FmkhalfflowRepository fmkhalfflowRepository;
	
	@GetMapping(value="/fmk/fmkhalfflow/list")
	   public List<Fmkhalfflow> getFmkhalfflow(){
		 return fmkhalfflowRepository.findAll();
	 }
	@GetMapping(value="/fmk/fmkhalfflow/show/{id}")
	   public Fmkhalfflow getFmkhalfflow(@PathVariable long id){
		 return fmkhalfflowRepository.getOne(id);
	 }
	
	 @PostMapping(value="/fmk/fmkhalfflow/add")
	 public Fmkhalfflow saveFmkhalfflow(@RequestBody Fmkhalfflow fmkhalfflow) {
		 return fmkhalfflowRepository.save(fmkhalfflow);
	 }
	 @PutMapping(value="/fmk/fmkhalfflow/update")
	 public Fmkhalfflow UpdateFmkhalfflow(@RequestBody Fmkhalfflow fmkhalfflow) {
		 return fmkhalfflowRepository.save(fmkhalfflow);
	 }
	 @DeleteMapping(value="/fmk/fmkhalfflow/delete/{id}")
	 public boolean deleteFmkhalfflow(@PathVariable long id) {
		 fmkhalfflowRepository.deleteById(id);
	 	 return true;
	 }
	 
}