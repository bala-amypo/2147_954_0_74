package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
 User register(User user);
 List<User> getAllUsers();
 User getUserById(Long id);
 User updateUser(Long id, User userDetails);
 void deleteUser(Long id);
}
