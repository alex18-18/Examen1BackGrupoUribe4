package com.example.demoEXAMEN;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EntidadEmpleado {
    @Id
    private String cedula;
    private String nombre;
    private String cargo;

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}