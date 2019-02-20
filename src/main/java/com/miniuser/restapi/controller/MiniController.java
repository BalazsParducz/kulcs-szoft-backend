package com.miniuser.restapi.controller;

import com.miniuser.restapi.model.MiniUser;
import com.miniuser.restapi.repository.MiniUserRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class MiniController {

    private MiniUserRepo userRepo;

    public MiniController(MiniUserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/allUsers")
    public Collection<MiniUser> getAllUsers() {
        return userRepo.findAll().stream().collect(Collectors.toList());
    }
}
