package com.example.TP6;

import entities.Compte;
import entities.TypeCompte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import repositories.CompteRepository;

import java.util.Date;

@SpringBootApplication
public class Tp6Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp6Application.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository cmt_rep){
		return args -> {
			cmt_rep.save(new Compte(null, 30.0, new Date(), TypeCompte.EPARGNE));
			cmt_rep.save(new Compte(null, 70.0, new Date(), TypeCompte.COURANT));
			cmt_rep.save(new Compte(null, 58.0, new Date(), TypeCompte.EPARGNE));
			cmt_rep.findAll().forEach(c ->{
				System.out.println(c);
			});
		};
	}

}