package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "account")
public class Account {



    @Id
    @Column(name = "username")
    private String userName;


    @Column(name = "password")
    private String passWord;

    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }


    public Account(){
        super();
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    @Override
    public String toString() {
        return "Account{" +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }


}
