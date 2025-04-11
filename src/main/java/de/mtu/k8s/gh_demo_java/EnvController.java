package de.mtu.k8s.gh_demo_java;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

	@GetMapping
	public Map<String, String> getEnv() {
		return System.getenv();
	}

}
