package com.heladeriaapilia.api.mapper;

import com.heladeriaapilia.api.GustosApiController;
import com.heladeriaapilia.api.PedidosApiController;
import com.heladeriaapilia.api.UriHelper;
import com.heladeriaapilia.api.dto.Link;
import com.heladeriaapilia.api.dto.Link.VerbEnum;
import com.heladeriaapilia.api.dto.Pedido;
import com.heladeriaapilia.api.dto.PedidoLinks;
import com.heladeriaapilia.api.dto.PesoDePote;
import com.heladeriaapilia.api.dto.Pote;
import com.heladeriaapilia.api.dto.PoteGustos;
import com.heladeriaapilia.api.dto.PoteLinks;
import com.heladeriaapilia.api.dto.PoteLinks1;
import com.heladeriaapilia.model.PedidoData;
import com.heladeriaapilia.model.PoteData;
import com.heladeriaapilia.model.PoteData.PesoDePoteData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PedidoMapper {

    private final UriHelper uriHelper;

    @Autowired
    public PedidoMapper(UriHelper uriHelper) {
        this.uriHelper = uriHelper;
    }

    public Pedido dataToApiPedido(PedidoData pedidoData) {
        String self = getPedidoUriStr(pedidoData);
        return new Pedido()
                .id(pedidoData.getId())
                .direccionEntrega(pedidoData.getDireccionDeEntrega())
                ._links(new PedidoLinks()
                        .pagar(link(VerbEnum.POST, self + "/pagar"))
                        .pago(link(VerbEnum.GET, self + "/pago"))
                        .potes(link(VerbEnum.GET, self + "/potes")));
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
        String pedidoUriStr = getPedidoUriStr(poteData.getPedido());
        return new Pote()
                .id(poteData.getId())
                .gustos(poteData.getGustos().stream()
                        .map(gusto -> new PoteGustos()
                                .id(gusto)
                                ._links(new PoteLinks()
                                        .self(link(VerbEnum.GET, uriHelper.baseUriStr(GustosApiController.GUSTO_RESOURCE_PATH + "/" + gusto)))))
                        .collect(Collectors.toList()))
                .peso(dataToApiPeso(poteData.getPesoDePote()))
                ._links(new PoteLinks1()
                        .pedido(link(VerbEnum.GET, pedidoUriStr))
                        .borrar(link(VerbEnum.DELETE, pedidoUriStr + PedidosApiController.POTE_RESOURCE_PATH + "/" + poteData.getId()))
                );
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

    private Link link(VerbEnum verb, String uri) {
        return new Link()
                .verb(verb)
                .href(uri);
    }

    private String getPedidoUriStr(PedidoData poteData) {
        return uriHelper.baseUriStr(PedidosApiController.PEDIDO_RESOURCE_PATH + "/" + poteData.getId());
    }
}
