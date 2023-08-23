package com.project.Login.repository;

import com.project.Login.login.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login,String> {
}
