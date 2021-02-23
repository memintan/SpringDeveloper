package com.cybertek.bootstrap;

import com.cybertek.entity.User;
import com.cybertek.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataGeneration implements CommandLineRunner {


    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DataGeneration(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        //Delete All
        this.userRepository.deleteAll();

        //Create users
        User employee = new User("mehmet","mehmet123","USER","");
        User admin = new User("admin", "admin123", "ADMIN", "ACCESS_TEST1, ACCESS_TEST1");
        User amnager = new User("manager", "manager123", "MANAGER", "ACCESS_TEST1");

        List<User> user = Arrays.asList(employee,admin,amnager);

        userRepository.saveAll(user);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
