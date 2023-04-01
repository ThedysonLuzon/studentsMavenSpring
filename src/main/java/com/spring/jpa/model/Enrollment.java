package com.spring.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Enrollment {

    @Id
    private int applicationNo;

    @OneToOne
    private Student student;
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }

    @OneToOne
    private Program program;
    public Program getProgram(){
        return program;
    }
    public void setProgram(Program program){
        this.program = program;
    }

    private String startDate;

    private double amountPaid;

    private String status;


}
