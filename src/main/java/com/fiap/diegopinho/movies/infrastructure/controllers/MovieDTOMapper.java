package com.fiap.diegopinho.movies.infrastructure.controllers;

import com.fiap.diegopinho.movies.domain.Movie;

public class MovieDTOMapper {
  CreateMovieResponse toResponse(Movie movie) {
    return new CreateMovieResponse(movie.getTitle(), movie.getDescription(), movie.getLink(), movie.getPublication());
  }

  public Movie toMovie(CreateMovieRequest request) {
    return new Movie(request.title(), request.description(), request.link(), request.publication());
  }
}
