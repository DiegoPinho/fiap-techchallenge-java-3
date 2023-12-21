package com.fiap.diegopinho.movies.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieEntity, Long> {

}
