package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.controller;


import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity.Account;
import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.model.AccRequest;
import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("/register")
    public Account registerUser(@RequestBody AccRequest request){
        return userService.createAccount(request);
    }


//    @GetMapping("/{username}")
//    public Account loginUser(@PathVariable String username){
//        return userService.checkLogin(username);
//    }



}
