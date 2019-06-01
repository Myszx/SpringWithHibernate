package com.user.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/all")
    public List<User> getAllusers(){
        return usersRepository.findAll();
    }

    @GetMapping("/all/{id}")
    public User getUserById(@PathVariable(value = "id") Long id){
        return usersRepository.findFirstByIdById(id);
    }

}
