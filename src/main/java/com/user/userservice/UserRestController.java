package com.user.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private UsersRepository usersRepository;

    @Autowired
    public UserRestController(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<User> getAllusers(){
        return usersRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") Long id){
        return usersRepository.findFirstById(id);
    }

    @PostMapping("/add")
    public List<User> addUser(@RequestBody User user){

        if(null == user.getLogin() || null == user.getPassword()){
            return usersRepository.findAll();
        }
        else {
            usersRepository.save(user);
        }

        return usersRepository.findAll();
    }



}
