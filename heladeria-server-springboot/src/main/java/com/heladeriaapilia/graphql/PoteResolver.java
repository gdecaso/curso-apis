package com.heladeriaapilia.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.heladeriaapilia.model.GustoData;
import com.heladeriaapilia.model.PoteData;
import com.heladeriaapilia.service.GustoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PoteResolver implements GraphQLResolver<PoteData> {

    private final GustoService gustoService;

    @Autowired
    public PoteResolver(GustoService gustoService) {
        this.gustoService = gustoService;
    }

    public List<GustoData> getGustos(PoteData pote) {
        return pote.getGustos().stream()
                .map(gustoId ->
                        gustoService.getGustoById(gustoId).orElseThrow(() -> new IllegalStateException("Gusto inexistente en pedido " + gustoId)))
                .collect(Collectors.toList());
    }
}
