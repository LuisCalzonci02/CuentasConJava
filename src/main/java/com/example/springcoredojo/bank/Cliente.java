package com.example.springcoredojo.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("cliente-config.properties")
public class Cliente {

    @Value("${banco.nombre}")
    private String nombre;
    @Value("${banco.apellido}")
    private String apellido;
    @Value("${banco.edad}")
    private int edad;
    @Value("${banco.sucursal}")
    private String surcursal;



    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", surcursal='" + surcursal + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSurcursal() {
        return surcursal;
    }

    public void setSurcursal(String surcursal) {
        this.surcursal = surcursal;
    }
}

