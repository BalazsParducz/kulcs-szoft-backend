package com.miniuser.restapi.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class MiniUser {

    @Id
    @GeneratedValue
    private int userId;

    @Column( unique = true )
    private String username;

    @NotNull
    @Column( unique = true )
    private String email;


    public MiniUser() { }


    public MiniUser(String username, @NotNull String email) {
        this.username = username;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
