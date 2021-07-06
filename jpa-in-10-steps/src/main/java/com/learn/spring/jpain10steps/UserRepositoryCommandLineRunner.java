package com.learn.spring.jpain10steps;

import com.learn.spring.jpain10steps.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("David", "Dev");
        user = userRepository.save(user);

        User user2 = new User("Helena", "Ops");
        userRepository.save(user2);

        User user3 = new User("Marta", "Trainee");
        userRepository.save(user3);

        User user4 = new User("Paula", "Trainee");
        userRepository.save(user4);

        User user5 = new User("Abu", "Senior Dev");
        userRepository.save(user5);

        log.info("*** New user is created with UserRepositoryCommandLineRunner: " + user );

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("*** User with id One found: " + userWithIdOne);

        List<User> allUsers = userRepository.findAll();
        log.info("*** All users found: " + allUsers);
    }
}
