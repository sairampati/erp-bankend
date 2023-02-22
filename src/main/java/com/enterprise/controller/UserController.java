package com.enterprise.controller;

import com.enterprise.model.Users;
import com.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Users saveUsers(@RequestBody Users users)
    {
        //System.out.println("fghnm");
        return userService.save(users);
    }

    @PostMapping("/addUsers")
    public List<Users> saveUsers(@RequestBody List<Users> users)
    {
        return userService.saveAll(users);
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/getUserById/{userId}")
    public Users getUerById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }


    @PutMapping("/update")
    public Users updateUsers(@RequestBody Users users){
        return userService.updateUsers(users);
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return userService.deleteUserById(userId);
    }
}
