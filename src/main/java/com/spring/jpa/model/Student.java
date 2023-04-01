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

    @NotBlank(message = "User Name is mandatory.")
    private String userName;

    @NotBlank(message = "Password is mandatory.")
    private String password;

    @NotBlank(message = "First Name is mandatory.")
    private String firstname;

    @NotBlank(message = "Last Name is mandatory.")
    private String lastname;

    @NotBlank(message = "Address is mandatory.")
    private String address;

    @NotBlank(message = "City is mandatory.")
    private String city;

    @NotBlank(message = "Postal Code is mandatory.")
    private String postalCode;

}

