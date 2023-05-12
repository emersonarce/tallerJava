package com.unac.projecsJava.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String identificacion;
    @Column(length = 80)
    private String nombre;
    @Column(length = 80)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date fechaDeCumpleaño;

    public Cliente() {
    }

    public Cliente(Long id, String identificacion, String nombre, String email, Date fechaDeCumpleaño) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.email = email;
        this.fechaDeCumpleaño = fechaDeCumpleaño;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaDeCumpleaño() {
        return fechaDeCumpleaño;
    }

    public void setFechaDeCumpleaño(Date fechaDeCumpleaño) {
        this.fechaDeCumpleaño = fechaDeCumpleaño;
    }
}
