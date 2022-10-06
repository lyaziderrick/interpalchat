package com.example.interpal.model;

import javax.persistence.*;

@Entity
@Table(name="USER_ALL")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int Id;
@Column(name="username")
private String Username;
@Column(name="password")
private String password;

    public User(int id, String username, String password) {
        Id = id;
        Username = username;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
