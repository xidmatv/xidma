package com.java.springboot.xidmatv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/accueil")
	public String test() {
		return "je suis en test";
	}

}
