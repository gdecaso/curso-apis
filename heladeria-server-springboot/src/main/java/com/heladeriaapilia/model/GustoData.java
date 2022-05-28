package com.heladeriaapilia.model;

import javax.persistence.*;

@Entity
@Table(name = "gusto")
public class GustoData {

    public enum TipoDeGustoData {
        CHOCOLATES,
        DULCE_DE_LECHES,
        CREMAS,
        FRUTAS,
    }

    @Id
    private String id;

    @Column(nullable = false)
    private String nombre;

    @Enumerated
    @Column(nullable = false)
    private TipoDeGustoData tipo;

    public GustoData(String id, String nombre, TipoDeGustoData tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public GustoData() { }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDeGustoData getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "GustoData{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
