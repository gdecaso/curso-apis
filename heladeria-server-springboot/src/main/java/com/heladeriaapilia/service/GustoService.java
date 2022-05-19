package com.heladeriaapilia.service;

import com.heladeriaapilia.repository.GustoData;
import com.heladeriaapilia.repository.GustoData.TipoDeGustoData;
import com.heladeriaapilia.repository.GustoDataRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class GustoService {
    private final GustoDataRepository gustoRepository;

    public GustoService(GustoDataRepository gustoRepository) {
        this.gustoRepository = gustoRepository;
    }

    public List<GustoData> getGustos() {
        return gustoRepository.findAll();
    }

    public List<GustoData> getGustosByTipo(TipoDeGustoData tipo) {
        return getGustos().stream()
                .filter(gusto -> gusto.getTipo() == tipo)
                .collect(Collectors.toList());
    }

    public Optional<GustoData> getGustoById(String id) {
        return gustoRepository.findById(id);
    }
}
