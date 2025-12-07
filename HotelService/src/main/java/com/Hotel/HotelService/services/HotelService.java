package com.Hotel.HotelService.services;

import com.Hotel.HotelService.Entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel get(String id);
}
