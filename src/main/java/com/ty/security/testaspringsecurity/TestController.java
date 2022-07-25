package com.ty.security.testaspringsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	TestSaveUser saveUser;
	
	@GetMapping("/test")
	public String test() {
		saveUser.saveUser();
		return "Users created";
	}
	
	@GetMapping("/user")
	public String user() {
		return "I am user method";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "I am admin method";
	}
	
	@GetMapping("/merchant")
	public String merchant() {
		return "I am merchant method";
	}
	
}
