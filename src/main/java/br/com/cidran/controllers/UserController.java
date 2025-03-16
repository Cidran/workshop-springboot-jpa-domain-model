package br.com.cidran.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cidran.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	//Mock user
	private User mock = new User(1L, "Fulano", "fulano@gmail.com", "(99)99999-9999", "123456");
	
	@GetMapping()
	public ResponseEntity<User> findAll() {
		return ResponseEntity.ok().body(mock);
	}
}
