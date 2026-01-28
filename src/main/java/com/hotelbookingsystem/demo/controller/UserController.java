package com.hotelbookingsystem.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.hotelbookingsystem.demo.model.User;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
    
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id) {
        System.out.println("Fetching user with ID: " + id);
        return users.stream()
                    .filter(user -> user.getId().equals(id))
                    .findFirst()
                    .orElse(null);  
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.set(i, updatedUser);
                return "User updated successfully";
            }
        }
        return "User not found";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id) {
        users.removeIf(user -> user.getId().equals(id));
        return "User deleted successfully";
    }
}