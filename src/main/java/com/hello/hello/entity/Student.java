package com.hello.hello.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private LocalDate dateOfBirth;

    //Constructor
    public Student(){

    }

    //Constructor
    public Student(Long id, String name, String email, LocalDate dateOfBirth){        
        this.id=id;
        this.name=name;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    //Métodos de acceso
    //getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    //setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
}
