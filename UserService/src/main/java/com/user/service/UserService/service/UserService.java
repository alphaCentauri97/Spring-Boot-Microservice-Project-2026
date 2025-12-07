package com.user.service.UserService.service;


import com.user.service.UserService.Entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);
}
