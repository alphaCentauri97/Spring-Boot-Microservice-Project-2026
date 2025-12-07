package com.user.service.UserService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

    private String id;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
    private HotelResponse hotel;

}
