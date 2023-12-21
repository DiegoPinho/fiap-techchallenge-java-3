package com.fiap.diegopinho.movies.infrastructure.controllers;

import java.time.LocalDateTime;

public record CreateMovieResponse(String title, String description, String link, LocalDateTime publication) {

}
