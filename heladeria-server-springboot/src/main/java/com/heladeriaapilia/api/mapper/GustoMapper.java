package com.heladeriaapilia.api.mapper;

import com.heladeriaapilia.api.dto.Gusto;
import com.heladeriaapilia.api.dto.TipoDeGusto;
import com.heladeriaapilia.model.GustoData;
import com.heladeriaapilia.model.GustoData.TipoDeGustoData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GustoMapper {

    public List<Gusto> dataToApiGustos(List<GustoData> gustoDatas) {
        return gustoDatas.stream()
                .map(this::dataToApiGusto)
                .collect(Collectors.toList());
    }

    public Gusto dataToApiGusto(GustoData gustoData) {
        return new Gusto()
                .id(gustoData.getId())
                .name(gustoData.getName())
                .tipo(dataToApiTipo(gustoData.getTipo()));
    }

    public TipoDeGusto dataToApiTipo(TipoDeGustoData tipoData) {
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

    public TipoDeGustoData apiToDataTipo(TipoDeGusto tipo) {
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
