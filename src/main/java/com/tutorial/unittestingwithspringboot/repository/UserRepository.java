package com.tutorial.unittestingwithspringboot.repository;

import com.tutorial.unittestingwithspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
