package com.hello.hello.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tarjetaProfesional;

    private String nombre;
    private String apellido;
    private String consultorio;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "idEspecialidad")
    private Especialidad especialidad;

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    //constructor

    public Medico() {
    }

    public Medico(int tarjetaProfesional, String nombre, String apellido, String consultorio, String correo, Especialidad especialidad, List<Cita> citas) {
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.correo = correo;
        this.especialidad = especialidad;
        this.citas = citas;
    }

    // getters and setters

    public int getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public String getCorreo() {
        return correo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setTarjetaProfesional(int tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    

    

    
}