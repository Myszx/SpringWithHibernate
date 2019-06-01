package com.user.userservice;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<User, Long> {

    User findFirstByIdById(Long id);

    List<User> findAll();

}
