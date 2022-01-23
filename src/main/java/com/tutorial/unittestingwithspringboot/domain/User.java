package com.tutorial.unittestingwithspringboot.domain;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class User {

  private Long id;
  private String userName;
  private String email;
  private LocalDateTime registrationDate;

  public User(String userName, String email) {
    this.userName = userName;
    this.email = email;
  }
}
