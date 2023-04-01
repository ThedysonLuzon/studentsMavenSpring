package com.spring.jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="programs")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Program {

    @Id
    private int programCode;

    @NotBlank(message = "Program Name Mandatory")
    private String programName;

    @NotBlank(message = "Duration Mandatory")
    private String duration;

    @Min(value = 0,message = "Salary should be greater than zero.")
    private double fee;
}
