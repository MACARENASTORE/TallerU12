package com.hello.hello.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Paciente {
    @Id
    private int cedula;

    private String nombre;
    private String apellido;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fechaNacimiento;

    private String telefono;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;

    //Constructor

    public Paciente() {
    }

    public Paciente(int cedula, String nombre, String apellido, java.util.Date fechaNacimiento, String telefono, List<Cita> citas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.citas = citas;
    }

    // getters and setters

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    

    
    

    
}