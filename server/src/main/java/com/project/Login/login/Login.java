package com.project.Login.login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="logins")

public class Login {
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Id
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="repassword")
    private String repassword;

    public Login() {
    }

    public Login(String firstname, String lastname,String email,String password,String repassword) {
        this.firstname = firstname;
        this.lastname=lastname;
        this.email=email;
        this.password=password;
        this.repassword=repassword;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}

