package com.rating.RatingService.services;

import com.rating.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRating(String userId);

    List<Rating> getRatingbyHotelId(String hotelId);
}
