package com.ty.security.testaspringsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestSaveUser {

	
	@Autowired
	private UserRepository repository;
	
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	public User saveUser() {
		User user = new User();
		user.setName("divya");
		user.setEmail("divya@mail.com");
		user.setPassword(passwordEncoder().encode("asdf"));
		user.setRoles("ROLE_USER");
		
		User user1 = new User();
		user1.setName("priya");
		user1.setEmail("priya@mail.com");
		user1.setPassword(passwordEncoder().encode("asdf"));
		user1.setRoles("ROLE_USER,ROLE_ADMIN");
		
		User user2 = new User();
		user2.setName("simran");
		user2.setEmail("simran@mail.com");
		user2.setPassword(passwordEncoder().encode("asdf"));
		user2.setRoles("ROLE_ADMIN");
		
		repository.save(user);
		repository.save(user1);
		return repository.save(user2);
	}
}
