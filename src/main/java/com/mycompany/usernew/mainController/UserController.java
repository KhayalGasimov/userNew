package com.mycompany.usernew.mainController;

import com.mycompany.usernew.Model.User;
import com.mycompany.usernew.implementations.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {
@Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping (value = "saveUser")
    public User saveUser(@RequestBody User user){
        userServiceImpl.saveUser(user);
        return user;
    }
    @GetMapping (value = "getAllusers")
    public List<User> findAllUser(){
        return userServiceImpl.findAllUsers();
    }
    @PutMapping(value = "updateUser")
    public User updateUser(@RequestBody User user){
        return userServiceImpl.updateUser(user);
    }
    @DeleteMapping("deleteUser")
    public String deleteUser (@RequestParam int id){
        userServiceImpl.deleteUser(id);
        return"User deleted";
    }
}
