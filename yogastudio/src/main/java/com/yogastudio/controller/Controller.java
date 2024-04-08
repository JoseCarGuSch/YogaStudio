package com.yogastudio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/home")
public class Controller {
	
	@GetMapping(path = {"/post","Yoga Studio"})
	public String test() { return "index";}
}
