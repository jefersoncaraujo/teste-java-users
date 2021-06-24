package com.javateste.users.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document
public class User {

    @Id
    private String id;
    private String name;
    private String userName;
    private String city;
    private String country;

}
