package com.allcodesnick.portfolio.service.impl;

import com.allcodesnick.portfolio.model.User;
import com.allcodesnick.portfolio.repository.UserRepository;
import com.allcodesnick.portfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public User createUserAccount(User user){
        User newUserAccount = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()));
        return userRepository.save(newUserAccount);
    }

}
