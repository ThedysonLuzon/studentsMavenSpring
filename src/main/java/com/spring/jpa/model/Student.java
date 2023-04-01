package com.spring.jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="students")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    private int id;

    private String userName;

    private String password;

    private String firstname;

    private String lastname;

    private String address;

    private String city;

    private String postalCode;

}

