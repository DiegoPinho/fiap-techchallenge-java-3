package com.fiap.diegopinho.movies.infrastructure.persistence;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table("movies")
public class MovieEntity {

  @Id
  private Long id;
  private String title;
  private String description;
  private String link;
  @JsonFormat(pattern = "dd-MM-yyyy")
  private LocalDateTime publication;

  public MovieEntity() {

  }

  public MovieEntity(String title, String description, String link, LocalDateTime publication) {
    this.title = title;
    this.description = description;
    this.link = link;
    this.publication = publication;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
