package com.user.service.UserService.external.services;

import com.user.service.UserService.Entity.HotelResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/hotels/{hotelId}")
    HotelResponse getHotel(@PathVariable("hotelId") String hotelId);
}
