package com.fiap.diegopinho.movies.infrastructure.gateways;

import com.fiap.diegopinho.movies.application.gateways.MovieGateway;
import com.fiap.diegopinho.movies.domain.Movie;
import com.fiap.diegopinho.movies.infrastructure.persistence.MovieEntity;
import com.fiap.diegopinho.movies.infrastructure.persistence.MovieRepository;

public class MovieRepositoryGateway implements MovieGateway {
  private final MovieRepository movieRepository;
  private final MovieEntityMapper movieEntityMapper;

  public MovieRepositoryGateway(MovieRepository movieRepository, MovieEntityMapper movieEntityMapper) {
    this.movieRepository = movieRepository;
    this.movieEntityMapper = movieEntityMapper;
  }

  @Override
  public Movie createMovie(Movie movie) {
    MovieEntity movieEntity = movieEntityMapper.toEntity(movie);
    MovieEntity savedEntity = movieRepository.save(movieEntity);

    return movieEntityMapper.toDomainObj(savedEntity);
  }

}
