package com.fiap.diegopinho.movies.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fiap.diegopinho.movies.application.gateways.MovieGateway;
import com.fiap.diegopinho.movies.application.usecases.CreateMovieInteractor;
import com.fiap.diegopinho.movies.infrastructure.controllers.MovieDTOMapper;
import com.fiap.diegopinho.movies.infrastructure.gateways.MovieEntityMapper;
import com.fiap.diegopinho.movies.infrastructure.gateways.MovieRepositoryGateway;
import com.fiap.diegopinho.movies.infrastructure.persistence.MovieRepository;

@Configuration
public class MovieConfiguration {

  @Bean
  CreateMovieInteractor createMovieCase(MovieGateway movieGateway) {
    return new CreateMovieInteractor(movieGateway);
  }

  @Bean
  MovieGateway movieGateway(MovieRepository movieRepository, MovieEntityMapper movieEntityMapper) {
    return new MovieRepositoryGateway(movieRepository, movieEntityMapper);
  }

  @Bean
  MovieEntityMapper movieEntityMapper() {
    return new MovieEntityMapper();
  }

  @Bean
  MovieDTOMapper userDTOMapper() {
    return new MovieDTOMapper();
  }

}
