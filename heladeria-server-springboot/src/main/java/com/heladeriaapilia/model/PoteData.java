package com.heladeriaapilia.model;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "pote")
public class PoteData {

    public enum PesoDePoteData {
        _1000,
        _500,
        _250,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated
    @Column(nullable = false)
    private PesoDePoteData peso;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> gustos;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private PedidoData pedido;

    public PoteData(Integer id, PesoDePoteData peso, List<String> gustos, PedidoData pedido) {
        this.id = id;
        this.peso = peso;
        this.gustos = gustos;
        this.pedido = pedido;
    }

    public PoteData() { }

    public Integer getId() {
        return id;
    }

    public PesoDePoteData getPeso() {
        return peso;
    }

    public List<String> getGustos() {
        return gustos;
    }

    public PedidoData getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        return "PoteData{" +
                "id=" + id +
                ", peso=" + peso +
                ", gustos=" + gustos +
                ", pedido=" + pedido.getId() +
                '}';
    }
}
