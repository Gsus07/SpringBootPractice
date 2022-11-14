package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private Integer priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
