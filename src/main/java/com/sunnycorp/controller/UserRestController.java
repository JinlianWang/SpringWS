package com.sunnycorp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunnycorp.error.RestException;
import com.sunnycorp.model.User;
import com.sunnycorp.repository.UserRepository;

@RestController 
@RequestMapping("/rest")
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users", method=RequestMethod.POST) 
	public void save(@RequestBody User user) {
		userRepository.save(user); 
	}
	
	@RequestMapping(value = "/users", method=RequestMethod.GET) 
	public List<User> list() {
		return userRepository.findAll(); 
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET) public User get(@PathVariable("id") int id) 
	{
		User user = userRepository.find(id); if (user == null) {
			throw new RestException(1, "User not found!",
					"User with id: " + id + " not found in the system");
		}
		return user;
	}

	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody User user) {
		userRepository.update(id, user); 
	}

	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE) 
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		userRepository.delete(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK); 
	}
}
