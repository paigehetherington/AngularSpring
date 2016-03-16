package com.theironyard.services;

import com.theironyard.enitities.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vajrayogini on 3/16/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
