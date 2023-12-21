package com.fiap.diegopinho.movies.infrastructure.controllers;

import java.time.LocalDateTime;

public record CreateMovieRequest(String title, String description, String link, LocalDateTime publication) {

}
