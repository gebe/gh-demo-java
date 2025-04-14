package de.gebe.gh_demo_java;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GhDemoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhDemoJavaApplication.class, args);
	}

	@GetMapping
	public Map<String, String> getEnv() {
		return System.getenv();
	}	
}
