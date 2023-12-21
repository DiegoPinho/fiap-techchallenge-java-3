package com.fiap.diegopinho.movies.application.gateways;

import com.fiap.diegopinho.movies.domain.Movie;

public interface MovieGateway {
  Movie createMovie(Movie movie);
}
