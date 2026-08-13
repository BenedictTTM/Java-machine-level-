package com.example.demo.config;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
                User user1 = new User();
                user1.setName("Alice Johnson");
                user1.setEmail("alice@example.com");
    
                User user2 = new User();
                user2.setName("Bob Smith");
                user2.setEmail("bob@example.com");

                userRepository.save(user1);
                userRepository.save(user2);

                System.out.println(">>> Sample users successfully inserted into the database! <<<");
            } else {
                System.out.println(">>> Database already contains users. Skipping initial insert. <<<");
            }
        };
    }
}
