package com.rating.RatingService.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user_ratings")
public class Rating {

    @Id
    private String id;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
