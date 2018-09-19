package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinProjectApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(JenkinProjectApplication.class, args);
	
	}
		@GetMapping
		public String  display()
		{
			return "first jenkin project";
		}
	}

