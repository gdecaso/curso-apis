package com.heladeriaapilia.api.mapper;

import com.heladeriaapilia.repository.PedidoData;
import com.heladeriaapilia.model.Pedido;
import com.heladeriaapilia.model.PesoDePote;
import com.heladeriaapilia.model.Pote;
import com.heladeriaapilia.model.PoteGustos;
import com.heladeriaapilia.repository.PoteData;
import com.heladeriaapilia.repository.PoteData.PesoDePoteData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PedidoMapper {

    public Pedido dataToApi(PedidoData pedidoData) {
        return new Pedido()
                .id(pedidoData.getId())
                .direccionEntrega(pedidoData.getDireccionDeEntrega());
    }

    public List<Pote> dataToApi(List<PoteData> poteDatas) {
        return poteDatas.stream()
                .map(this::dataToApi)
                .collect(Collectors.toList());
    }

    public Pote dataToApi(PoteData poteData) {
        return new Pote()
                .id(poteData.getId())
                .gustos(poteData.getGustos().stream()
                        .map(gusto -> new PoteGustos()
                                .id(gusto))
                        .collect(Collectors.toList()))
                .peso(dataToApi(poteData.getPesoDePote()));
    }

    private PesoDePote dataToApi(PesoDePoteData pesoData) {
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

    public PesoDePoteData apiToData(PesoDePote peso) {
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
