package com.allcodesnick.portfolio.controller;

import com.allcodesnick.portfolio.model.User;
import com.allcodesnick.portfolio.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class LoginController {

    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUserAccount")
    public User createUserAccount(@RequestBody User user){
        return userService.createUserAccount(user);
    }

    // Redirect Method
    @GetMapping("/other-hello-world")
    public ModelAndView hello(){
        return new ModelAndView("redirect:/");
    }

}
