package com.project.Login.controller;

import com.project.Login.login.Login;
import com.project.Login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
@Autowired
private LoginService loginService;
@RequestMapping(method = RequestMethod.GET, value = "/logins")
public List<Login> getAllLogins() { return loginService.getAllLogin();}
@RequestMapping(method = RequestMethod.POST,value = "/logins")
    public Login addLogin(@RequestBody Login login) {
loginService.addLogin(login);
return login;
}
}

