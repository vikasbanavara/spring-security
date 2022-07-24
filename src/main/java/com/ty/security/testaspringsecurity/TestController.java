package com.ty.security.testaspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

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
