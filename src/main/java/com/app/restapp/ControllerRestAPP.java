package com.app.restapp;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ControllerRestAPP {
	HashMap<String, String> hashmap=new HashMap<>();

@GetMapping("/welcome")
@ResponseBody
public String welcome() {
	return "Hello world";
}
@GetMapping("/login")
//@ResponseBody
public String login() {
	return "login";
}
@PostMapping("/loginvalid")
//@ResponseBody
public String loginvalid(
		@RequestParam("username") String uname,
		@RequestParam("password") String password
		) {
	if(password.equals(hashmap.get(uname))) {
		return "Success";
	}else {
		return "Failed";
	}
}
@PostMapping("/registervalid")
public String registervalid(@RequestParam("username") String uname,
		@RequestParam("password") String password) {
	hashmap.put(uname, password);
	return "login";
}
@GetMapping("/")
public String register() {
	return "Registration";
}
}
