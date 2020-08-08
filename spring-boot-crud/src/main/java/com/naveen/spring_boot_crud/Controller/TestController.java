package com.naveen.spring_boot_crud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/name")
	public String getName() {

		return "Naveen";
	}

}
