package com.fiap.diegopinho.movies.configuration;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.reactivestreams.client.MongoClient;

@Configuration
public class MongoConfiguration {
  @Autowired
  private MongoClient mongoClient;

  @Bean
  public boolean checkMongoDBConnection() {
    try {
      mongoClient.getDatabase("admin").runCommand(Document.parse("{ping:1}"));
      System.out.println("MongoDB connection was successful.");
      return true;
    } catch (Exception e) {
      System.err.println("Error connecting to MongoDB: " + e.getMessage());
      return false;
    }
  }
}
