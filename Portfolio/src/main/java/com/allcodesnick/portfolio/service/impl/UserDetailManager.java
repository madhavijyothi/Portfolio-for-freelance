package com.allcodesnick.portfolio.service.impl;

import com.allcodesnick.portfolio.model.ApplicationUserDetails;
import com.allcodesnick.portfolio.model.User;
import com.allcodesnick.portfolio.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailManager implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username));
        return user.map(ApplicationUserDetails::new).get();
    }
}
