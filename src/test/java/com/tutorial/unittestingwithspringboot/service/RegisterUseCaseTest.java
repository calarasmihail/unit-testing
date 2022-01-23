package com.tutorial.unittestingwithspringboot.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.tutorial.unittestingwithspringboot.UserAssert;
import com.tutorial.unittestingwithspringboot.domain.User;
import com.tutorial.unittestingwithspringboot.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RegisterUseCaseTest {

  @Mock
  private UserRepository userRepository;

  @InjectMocks
  private RegisterUseCase registerUseCase;

  @Test
  void registerUser() {
    User user = new User("user1", "user1@gmail.com");

    when(userRepository.save(any(User.class))).then(returnsFirstArg());

    User savedUser = registerUseCase.registerUser(user);

    assertThat(savedUser.getRegistrationDate()).isNotNull();
    UserAssert.assertThat(savedUser).hasRegistrationDate();
  }
}