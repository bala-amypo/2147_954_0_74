package com.example.demo.service;

import com.example.demo.entity.Userentity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
 User register(User user);
 List<User> getAllUsers();
 User getUserById(Long id);
 User updateUser(Long id, User userDetails);
 void deleteUser(Long id);
}
