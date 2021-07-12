package com.example.restfulwebservices.user;

import com.example.restfulwebservices.user.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        List users = userDaoService.findAll();
        if (users == null) {
            throw new UserNotFoundException("There are no users in the list!");
        }
        return users;
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = userDaoService.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id -" + id);
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> retrieveUser(@RequestBody User user) {
        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return  ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = userDaoService.deleteById(id);

        if (user==null) {
            throw new UserNotFoundException("id - " + id);
        }
    }
}
