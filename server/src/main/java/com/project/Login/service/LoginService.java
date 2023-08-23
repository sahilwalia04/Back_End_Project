package com.project.Login.service;

import com.project.Login.login.Login;
import com.project.Login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
   public List<Login> getAllLogin() {
   List<Login> logins = new ArrayList<>();
  loginRepository.findAll().forEach(logins::add);
  return logins;
   }
  public void addLogin(Login login) { loginRepository.save(login);}
}
