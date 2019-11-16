package com.example.persistingdatareactJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistingdatareactJPA.models.User;
import com.example.persistingdatareactJPA.repositories.UserRepository;

@CrossOrigin(origins="*",allowCredentials="true",allowedHeaders="*")
@RestController
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/api/users")
	public List<User> findAllUsers(@RequestParam(name="username", required=false) String username) {  
		if(username != null) {
	       return userRepository.findUserByUsername(username); 
	   }
	   return (List<User>) userRepository.findAll();
	}

	
	@GetMapping("/api/users/{userId}")
	public User findUserById(@PathVariable("userId") Integer id) {
		return userRepository.findById(id).get();
	}
	
	@PostMapping("/api/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/api/users/{userId}")
	public User updateUser(@PathVariable("userId") int id, @RequestBody User newUser) {
		User user = userRepository.findById(id).get();
		user.set(newUser);
		return userRepository.save(user);
	}
	
	@DeleteMapping("/api/users/{userId}")
	public void deleteUser(@PathVariable("userId") int id) {
		userRepository.deleteById(id);
	}




}
