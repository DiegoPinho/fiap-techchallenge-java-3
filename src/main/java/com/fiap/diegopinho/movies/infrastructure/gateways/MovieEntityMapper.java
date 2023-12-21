package com.fiap.diegopinho.movies.infrastructure.gateways;

import com.fiap.diegopinho.movies.domain.Movie;
import com.fiap.diegopinho.movies.infrastructure.persistence.MovieEntity;

public class MovieEntityMapper {

  MovieEntity toEntity(Movie movie) {
    return new MovieEntity(movie.getTitle(), movie.getDescription(), movie.getLink(), movie.getPublication());
  }

  Movie toDomainObj(MovieEntity movieEntity) {
    return new Movie(movieEntity.getTitle(), movieEntity.getDescription(), movieEntity.getLink(),
        movieEntity.getPublication());
  }

}
