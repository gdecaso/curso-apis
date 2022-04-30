package io.swagger.configuration;

import io.swagger.model.TipoDeGusto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TipoDeGustoEnumConverter implements Converter<String, TipoDeGusto> {
    @Override
    public TipoDeGusto convert(String value) {
        return TipoDeGusto.fromValue(value);
    }
}