package com.procesos.inventario.controller;

import com.procesos.inventario.model.User;
import com.procesos.inventario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("users")

    public User create(@RequestBody User user){
        return userService.creareUser(user);
    }

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("users/{id}")
    public User update(@RequestBody User user, Long id){
        return userService.updateUser(user , id);
    }

    @DeleteMapping("users/{id}")
    public Boolean delete(@PathVariable Long id){
        return userService.deleteUserById(id);
    }

}
