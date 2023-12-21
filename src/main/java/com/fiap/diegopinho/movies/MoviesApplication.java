package com.fiap.diegopinho.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MoviesApplication.class, args);
			System.out.println("Application started successfully! 🎉");
		} catch (Exception e) {
			System.out.println("Something went wrong.");
			System.out.println(e.getMessage());
		}
	}

}
