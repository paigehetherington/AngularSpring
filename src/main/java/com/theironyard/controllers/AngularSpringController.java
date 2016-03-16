package com.theironyard.controllers;

import com.theironyard.enitities.User;
import com.theironyard.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vajrayogini on 3/16/16.
 */

@RestController
public class AngularSpringController {
    @Autowired
    UserRepository users;

    @RequestMapping(path = "/user", method = RequestMethod.GET) //to get all users
    public List<User> getUsers() {
        return (List<User>) users.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST) //to add user
    public void addUser(@RequestBody User user) {  //take entire request body, parse it and turn it into a user object, substitues json.parse
        users.save(user);

    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.PUT) //to edit user, have to keep id in this
    public void updateUser(@RequestBody User user, @PathVariable("id") int id) { //don't need id, contained within json user object
        users.save(user);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id) { //only need id to delete
        users.delete(id);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)  //to get one user
    public User getUser(@PathVariable("id") int id) {
        return users.findOne(id);
    }


}
