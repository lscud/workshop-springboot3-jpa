package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //para dizer que é uma classe de um resurso WEB implementado por um controlador Rest
@RequestMapping(value = "/users")    //Nome para o resurso
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria ", "maria@gmail.com", "999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
