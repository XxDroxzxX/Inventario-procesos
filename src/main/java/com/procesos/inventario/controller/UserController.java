package com.procesos.inventario.controller;

import com.procesos.inventario.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Long id){
        User user = new User(id, "Pepito","Perez","calle 20","pepito@gmail.com","3202361952","123456789","1007539487");
        return user;
    }

}
