package com.fiap.diegopinho.movies.infrastructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.diegopinho.movies.application.usecases.CreateMovieInteractor;
import com.fiap.diegopinho.movies.domain.Movie;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("movies")
public class MovieController {

  private final CreateMovieInteractor createMovieInteractor;
  private final MovieDTOMapper movieDTOMapper;

  public MovieController(CreateMovieInteractor createMovieUseCase,
      MovieDTOMapper userDTOMapper) {
    this.createMovieInteractor = createMovieUseCase;
    this.movieDTOMapper = userDTOMapper;
  }

  @PostMapping
  public CreateMovieResponse createMovie(@RequestBody CreateMovieRequest request) {
    Movie movie = movieDTOMapper.toMovie(request);
    Movie user = createMovieInteractor.createMovie(movie);

    return movieDTOMapper.toResponse(user);
  }

}
