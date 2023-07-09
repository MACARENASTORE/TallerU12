package com.hello.hello.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private List<Medico> medicos;

    // Contructor

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String nombre, List<Medico> medicos) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.medicos = medicos;
    }

     // getters and setters

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

   

    
}