package com.tutorial.unittestingwithspringboot.service;

import com.tutorial.unittestingwithspringboot.domain.User;
import com.tutorial.unittestingwithspringboot.repository.UserRepository;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUseCase {

  private final UserRepository userRepository;

  public User registerUser(User user) {
    user.setRegistrationDate(LocalDateTime.now());
    var savedUser = userRepository.save(user);
    return savedUser;
  }

}
