package com.chida.devOps0.service;

import com.chida.devOps0.model.Login;
import com.chida.devOps0.model.User;

public interface UserService {
  String register(User user);
  User validateUser(Login login);
}
