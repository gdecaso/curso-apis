package com.heladeriaapilia.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.heladeriaapilia.model.GustoData;
import com.heladeriaapilia.model.PedidoData;
import com.heladeriaapilia.model.PoteData;
import com.heladeriaapilia.model.PoteData.PesoDePoteData;
import com.heladeriaapilia.service.GustoService;
import com.heladeriaapilia.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GraphQlMainResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final GustoService gustoService;
    private final PedidoService pedidoService;

    @Autowired
    public GraphQlMainResolver(GustoService gustoService, PedidoService pedidoService) {
        this.gustoService = gustoService;
        this.pedidoService = pedidoService;
    }

    public List<GustoData> getGustos() {
        return gustoService.getGustos();
    }

    public Optional<PedidoData> findPedido(int id) {
        return pedidoService.findPedidoById(id);
    }

    public PoteData agregarPote(int pedidoId, PesoDePoteData peso, List<String> gustoIds) {
        PedidoData pedido = findPedido(pedidoId)
                .orElseThrow(() -> new IllegalArgumentException("No se encuentra el pedido " + pedidoId));
        return pedidoService.addPoteToPedido(pedido, peso, gustoIds);
    }
}
