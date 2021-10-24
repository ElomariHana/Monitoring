package org.ee.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import org.ee.entities.Domaine;
import org.ee.dao.DomainRepository;
@RestController

public class DomaineService {
	
	 @Autowired
	    private DomainRepository domainRepository;

	 @GetMapping(value="/fmk/domaines/list")
	   public List<Domaine> getDomaine(){
		 return domainRepository.findAll();
	 }
	 
	 
	 @GetMapping(value="/fmk/domaines/show/{idDomaine}")
	   public Domaine getDomaines(@PathVariable long idDomaine){
		 return domainRepository.getOne(idDomaine);
	 }

	
	 @PostMapping(value="/fmk/domaines/add")
	 public Domaine saveDomaine(@RequestBody Domaine domaine) {
		 return domainRepository.save(domaine);
	 }
	 
	 
	 @PutMapping(value="/fmk/domaines/update")
	 public Domaine UpdateDomaine(@RequestBody Domaine domaine) {
		 return domainRepository.save(domaine);
	 }
	 
	 
	 @DeleteMapping(value="/fmk/domaines/delete/{idDomaine}")
 public boolean deleteDomaine(@PathVariable long idDomaine) {
	 domainRepository.deleteById(idDomaine);
	 return true;
 }
}
