package com.example.demo.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static Logger log = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/")
	public String index() {
		log.debug("lets do something awesome");
		log.trace("but this is shown only when things go real crazy ");
		return "Greetings from Spring Boot!";
	}

}
