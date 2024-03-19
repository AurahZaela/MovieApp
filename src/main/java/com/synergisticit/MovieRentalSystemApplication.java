package com.synergisticit;

import com.synergisticit.domain.Movie;
import com.synergisticit.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MovieRentalSystemApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =SpringApplication.run(MovieRentalSystemApplication.class, args);

	MovieService movieService = (MovieService)context.getBean("movieService");

//		Movie m1 = new Movie(1, "Your Name","Drama","Pretty Good", 100);
//		movieService.save(m1);
//
//		Movie m2 = new Movie(2, "Princess Mononoke", "Drama","Amazing", 10000);
//		movieService.save(m2);

	}




}
