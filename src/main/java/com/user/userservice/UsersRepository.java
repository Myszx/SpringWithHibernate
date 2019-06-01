package com.user.userservice;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {

    User findFirstByIdById(Long id);

}
