package com.cozzo.ecommerce.backend.infrastructure.rest;

import com.cozzo.ecommerce.backend.application.UserService;
import com.cozzo.ecommerce.backend.domain.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
//https://localhost:8085/api/v1/users
public class UserController {
    private final UserService userService;
    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    //https://localhost:8085/api/v1/users/1
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
}
