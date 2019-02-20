package com.miniuser.restapi;

import com.miniuser.restapi.model.MiniUser;
import com.miniuser.restapi.repository.MiniUserRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class MiniRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniRestApplication.class, args);
    }


    @Bean
    ApplicationRunner init(MiniUserRepo repository) {
        return args -> {
            Stream.of("Karcsi", "Tercsi", "Kata", "Klára").forEach(name -> {
                MiniUser user = new MiniUser();
                user.setUsername(name);
                user.setEmail(user.getUsername() + "@keysoft.hu");
                repository.save(user);
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
