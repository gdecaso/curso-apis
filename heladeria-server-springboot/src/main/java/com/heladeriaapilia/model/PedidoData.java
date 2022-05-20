package com.heladeriaapilia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "pedido")
public class PedidoData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String direccionDeEntrega;

    @OneToMany(mappedBy = "pedido")
    private List<PoteData> potes = new ArrayList<>();

    public PedidoData(Integer id, String direccionDeEntrega) {
        this.id = id;
        this.direccionDeEntrega = direccionDeEntrega;
    }

    public PedidoData() { }

    public Integer getId() {
        return id;
    }

    public String getDireccionDeEntrega() {
        return direccionDeEntrega;
    }

    public void setDireccionDeEntrega(String direccionEntrega) {
        this.direccionDeEntrega = direccionEntrega;
    }

    public List<PoteData> getPotes() {
        return Collections.unmodifiableList(potes);
    }

    public void addPote(PoteData pote) {
        potes.add(pote);
    }

    public void removePote(PoteData pote) {
        potes.remove(pote);
    }

    @Override
    public String toString() {
        return "PedidoData{" +
                "id=" + id +
                ", direccionDeEntrega='" + direccionDeEntrega + '\'' +
                '}';
    }
}
