package com.thesay.course.resources;

import com.thesay.course.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L,"Alan", "alan@example", "96991981326", "alan1234" );
        return ResponseEntity.ok().body(u);
    }
}
