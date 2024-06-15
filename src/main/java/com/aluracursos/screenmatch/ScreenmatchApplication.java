package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.service.ConsumirApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var url = "https://www.omdbapi.com/?i=tt3896198&apikey=df10ea04";
		var json = new ConsumirApi().obtenerDatos(url);
		System.out.println(json);
	}
}
