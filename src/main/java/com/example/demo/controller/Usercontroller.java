package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

 private final UserService userService;

 @Autowired
 public UserController(UserService userService) {
  this.userService = userService;
 }

 @PostMapping
 public ResponseEntity<User> register(@RequestBody User user) {
  return ResponseEntity.ok(userService.register(user));
 }

 @GetMapping
 public ResponseEntity<List<User>> getAllUsers() {
  return ResponseEntity.ok(userService.getAllUsers());
 }

 @GetMapping("/{id}")
 public ResponseEntity<User> getUser(@PathVariable Long id) {
  return ResponseEntity.ok(userService.getUserById(id));
 }

 @PutMapping("/{id}")
 public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
  return ResponseEntity.ok(userService.updateUser(id, userDetails));
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<String> deleteUser(@PathVariable Long id) {
  userService.deleteUser(id);
  return ResponseEntity.ok("User deleted successfully");
 }
}
