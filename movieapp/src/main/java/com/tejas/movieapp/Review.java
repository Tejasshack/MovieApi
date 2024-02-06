// Review.java
package com.tejas.movieapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews") // MongoDB collection name
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    // Constructor for creating a review with body, created, and updated timestamps
    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }
}

