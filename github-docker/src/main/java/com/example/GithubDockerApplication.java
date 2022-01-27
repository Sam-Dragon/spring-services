package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubDockerApplication {

	@GetMapping
	public String method() {
		return "Welcome To Java World Of Miseries..!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubDockerApplication.class, args);
	}

}
