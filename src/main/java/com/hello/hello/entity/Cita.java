package com.hello.hello.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fecha;

    @ManyToOne
    @JoinColumn(name = "pacienteCedula")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medicoTarjetaProfesional")
    private Medico medico;

    //Contrcutor

    public Cita() {
    }

    public Cita(int idCita, java.util.Date fecha, Paciente paciente, Medico medico) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

     // getters and setters

     

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

   

}