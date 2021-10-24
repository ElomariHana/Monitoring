package org.ee.services;

import java.util.List;
import java.util.Vector;

import org.ee.dao.UserRepository;
import org.ee.entities.Domaine;
import org.ee.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/fmk/users",method=RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	@RequestMapping(value="/fmk/users/show/{id}",method=RequestMethod.GET)
	   public User getUser(@PathVariable long id){
		 return userRepository.getOne(id);
	 }
	 
	 @PostMapping(value="/fmk/users/add")
	 public User saveUser(@RequestBody User user) {
		 return userRepository.save(user);
	 }
	 @PutMapping(value="/fmk/users/update")
	 public User UpdateUser(@RequestBody User user) {
		 return userRepository.save(user);
	 }
	 @DeleteMapping(value="/fmk/users/delete/{id}")
	 public boolean deleteUser(@PathVariable long id) {
		 userRepository.deleteById(id);
		 return true;
	 }
}
