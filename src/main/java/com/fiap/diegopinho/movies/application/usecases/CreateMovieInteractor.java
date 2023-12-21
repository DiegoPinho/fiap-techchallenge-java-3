package com.fiap.diegopinho.movies.application.usecases;

import com.fiap.diegopinho.movies.application.gateways.MovieGateway;
import com.fiap.diegopinho.movies.domain.Movie;

public class CreateMovieInteractor {
  private final MovieGateway movieGateway;

  public CreateMovieInteractor(MovieGateway movieGateway) {
    this.movieGateway = movieGateway;
  }

  public Movie createMovie(Movie movie) {
    return movieGateway.createMovie(movie);
  }

}
