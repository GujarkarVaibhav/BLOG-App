package com.blog.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="user_name", nullable = false,length = 100)
    private String name;
    @Column(nullable = false)
    private String email ;
    private String password;
    private String about ;

}
