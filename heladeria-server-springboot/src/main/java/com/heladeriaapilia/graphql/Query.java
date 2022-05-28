package com.heladeriaapilia.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.heladeriaapilia.model.GustoData;
import com.heladeriaapilia.model.PedidoData;
import com.heladeriaapilia.service.GustoService;
import com.heladeriaapilia.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private final GustoService gustoService;
    private final PedidoService pedidoService;

    @Autowired
    public Query(GustoService gustoService, PedidoService pedidoService) {
        this.gustoService = gustoService;
        this.pedidoService = pedidoService;
    }

    public List<GustoData> getGustos() {
        return gustoService.getGustos();
    }

    public Optional<PedidoData> findPedido(int id) {
        return pedidoService.findPedidoById(id);
    }
}
