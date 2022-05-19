package com.heladeriaapilia.repository;

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
    private String name;

    @Enumerated
    @Column(nullable = false)
    private TipoDeGustoData tipo;

    public GustoData(String id, String name, TipoDeGustoData tipo) {
        this.id = id;
        this.name = name;
        this.tipo = tipo;
    }

    public GustoData() { }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TipoDeGustoData getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "GustoData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
