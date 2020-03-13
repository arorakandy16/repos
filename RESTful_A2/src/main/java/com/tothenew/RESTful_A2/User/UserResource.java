package com.tothenew.RESTful_A2.User;

//import jdk.internal.loader.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    //GET   /users
    //retrieveallUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    //GET   /users/{id}
    //retrieveallUsers(int id)
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("id-"+ id);

        //
//        Resource<User> resource = new Resource<User>(user);

        return user;
    }

    //input - details of user
    //output - CREATED & Return the created URI
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.save(user);
        //CREATED
        //  /user/{id}      savedUser.getID()
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }
    @DeleteMapping("/users/{id}")
    public User removeUser(@PathVariable int id) {
        User user=service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("id-"+id);
        return service.remove(id);
    }
}
