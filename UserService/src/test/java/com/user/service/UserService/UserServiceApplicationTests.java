package com.user.service.UserService;

import com.user.service.UserService.Entity.Rating;
import com.user.service.UserService.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

    @Autowired
    private RatingService ratingService;
	@Test
	void contextLoads() {
	}

//    @Test
//    void createRating(){
//        Rating rating = Rating.builder()
//                        .rating(10)
//                .userId("").hotelId("").feedback("this is awesome hotel")
//                        .build();
//        Rating savedRating = ratingService.createRating(rating);
//        System.out.println("new Rating created");
//    }
}
