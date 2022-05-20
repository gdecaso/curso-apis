package com.heladeriaapilia.api.mapper;

import com.heladeriaapilia.model.PedidoData;
import com.heladeriaapilia.api.dto.Pedido;
import com.heladeriaapilia.api.dto.PesoDePote;
import com.heladeriaapilia.api.dto.Pote;
import com.heladeriaapilia.api.dto.PoteGustos;
import com.heladeriaapilia.model.PoteData;
import com.heladeriaapilia.model.PoteData.PesoDePoteData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PedidoMapper {

    public Pedido dataToApiPedido(PedidoData pedidoData) {
        return new Pedido()
                .id(pedidoData.getId())
                .direccionEntrega(pedidoData.getDireccionDeEntrega());
    }

    public List<Pedido> dataToApiPedidos(List<PedidoData> pedidoDatas) {
        return pedidoDatas.stream().map(this::dataToApiPedido).collect(Collectors.toList());
    }

    public List<Pote> dataToApiPotes(List<PoteData> poteDatas) {
        return poteDatas.stream()
                .map(this::dataToApiPote)
                .collect(Collectors.toList());
    }

    public Pote dataToApiPote(PoteData poteData) {
        return new Pote()
                .id(poteData.getId())
                .gustos(poteData.getGustos().stream()
                        .map(gusto -> new PoteGustos()
                                .id(gusto))
                        .collect(Collectors.toList()))
                .peso(dataToApiPeso(poteData.getPesoDePote()));
    }

    private PesoDePote dataToApiPeso(PesoDePoteData pesoData) {
        switch (pesoData) {
            case _1000:
                return PesoDePote._1000;
            case _500:
                return PesoDePote._500;
            case _250:
                return PesoDePote._250;
        }
        throw new IllegalArgumentException("Imposible traducir " + pesoData);
    }

    public PesoDePoteData apiToDataPeso(PesoDePote peso) {
        switch (peso) {
            case _1000:
                return PesoDePoteData._1000;
            case _500:
                return PesoDePoteData._500;
            case _250:
                return PesoDePoteData._250;
        }
        throw new IllegalArgumentException("Imposible traducir " + peso);
    }
}
