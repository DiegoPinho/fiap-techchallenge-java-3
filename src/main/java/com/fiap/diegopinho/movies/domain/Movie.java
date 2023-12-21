package com.fiap.diegopinho.movies.domain;

import java.time.LocalDateTime;

public class Movie {
  private String title;
  private String description;
  private String link;
  private LocalDateTime publication;

  public Movie() {
  }

  public Movie(String title, String description, String link, LocalDateTime publication) {
    this.title = title;
    this.description = description;
    this.link = link;
    this.publication = publication;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LocalDateTime getPublication() {
    return publication;
  }

  public void setPublication(LocalDateTime publication) {
    this.publication = publication;
  }

}
