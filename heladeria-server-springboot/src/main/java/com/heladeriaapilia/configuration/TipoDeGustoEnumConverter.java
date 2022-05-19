package com.heladeriaapilia.configuration;

import com.heladeriaapilia.model.TipoDeGusto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TipoDeGustoEnumConverter implements Converter<String, TipoDeGusto> {
    @Override
    public TipoDeGusto convert(String value) {
        return TipoDeGusto.fromValue(value);
    }
}