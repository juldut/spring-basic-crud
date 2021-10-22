package com.baeldung.crud.repository;
import org.springframework.data.repository.CrudRepository;

import com.baeldung.crud.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {

}
