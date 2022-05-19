package com.heladeriaapilia.api.mapper;

import com.heladeriaapilia.model.Gusto;
import com.heladeriaapilia.model.TipoDeGusto;
import com.heladeriaapilia.repository.GustoData;
import com.heladeriaapilia.repository.GustoData.TipoDeGustoData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GustoMapper {

    public List<Gusto> dataToApi(List<GustoData> gustoDatas) {
        return gustoDatas.stream()
                .map(this::dataToApi)
                .collect(Collectors.toList());
    }

    public Gusto dataToApi(GustoData gustoData) {
        return new Gusto()
                .id(gustoData.getId())
                .name(gustoData.getName())
                .tipo(dataToApi(gustoData.getTipo()));
    }

    public TipoDeGusto dataToApi(TipoDeGustoData tipoData) {
        switch (tipoData) {
            case CHOCOLATES:
                return TipoDeGusto.CHOCOLATES;
            case DULCE_DE_LECHES:
                return TipoDeGusto.DULCE_DE_LECHES;
            case CREMAS:
                return TipoDeGusto.CREMAS;
            case FRUTAS:
                return TipoDeGusto.FRUTAS;
        }
        throw new IllegalArgumentException("Imposible traducir " + tipoData);
    }

    public TipoDeGustoData apiToData(TipoDeGusto tipo) {
        switch (tipo) {
            case CHOCOLATES:
                return TipoDeGustoData.CHOCOLATES;
            case DULCE_DE_LECHES:
                return TipoDeGustoData.DULCE_DE_LECHES;
            case CREMAS:
                return TipoDeGustoData.CREMAS;
            case FRUTAS:
                return TipoDeGustoData.FRUTAS;
        }
        throw new IllegalArgumentException("Imposible traducir " + tipo);
    }

}
