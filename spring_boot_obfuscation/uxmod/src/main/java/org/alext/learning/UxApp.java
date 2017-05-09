package org.alext.learning;

import org.alext.learning.model.User;
import org.alext.learning.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class UxApp {
    public static void main(String[] args) {
        SpringApplication.run(UxApp.class, args);
    }

    @Bean
    CommandLineRunner dummy(UserRepository repo) {
        return args -> Stream.of("Alex", "Dmitry", "Jon", "Paul", "Maria", "Eva").forEach(name -> {
            User user = new User();
            user.setName(name);
            user.setEmail(name + "@dummy.com");
            repo.save(user);
        });
    }

}
