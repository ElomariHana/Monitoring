package org.ee.services;

import java.util.List;

import org.ee.dao.FmkflowRepository;
import org.ee.entities.Domaine;
import org.ee.entities.Fmkflow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class FmkflowService {
	@Autowired
	private FmkflowRepository fmkflowRepository;
	
	@GetMapping(value="/fmk/fmkflows/list")
	   public List<Fmkflow> getFmkflow(){
		 return fmkflowRepository.findAll();
	 }
	
	@GetMapping(value="/fmk/fmkflows/show/{flowid}")
	   public Fmkflow getFmkflow(@PathVariable long flowid){
		 return fmkflowRepository.getOne(flowid);
	 }
	
	
	@PutMapping(value="/fmk/fmkflows/update")
	 public Fmkflow UpdateFmkflow(@RequestBody Fmkflow fmkflow) {
		 return fmkflowRepository.save(fmkflow);
	 }
	@DeleteMapping(value="/fmk/fmkflow/delete/{flowid}")
	 public boolean deleteFmkflow(@PathVariable long flowid) {
		fmkflowRepository.deleteById(flowid);
		 return true;
	 }
	 
	
}