package com.example.seccion6;

public class Platos {

    public String titulo;
    public String descripcion;
    public double precio;

    public Platos(String titulo ,String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo ;
    }
}
