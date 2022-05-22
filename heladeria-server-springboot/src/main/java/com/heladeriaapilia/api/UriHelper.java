package com.heladeriaapilia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;

@Component
public class UriHelper {

    private final HttpServletRequest request;

    @Autowired
    public UriHelper(HttpServletRequest request) {
        this.request = request;
    }

    public URI baseUri(String suffix) {
        try {
            return new URI(baseUriStr(suffix));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public URI baseUri() {
        return baseUri("");
    }

    public String baseUriStr(String suffix) {
        return String.format("%s://%s:%d%s%s",
                request.getScheme(),
                request.getLocalName(),
                request.getLocalPort(),
                request.getContextPath(),
                suffix);
    }

    public String baseUriStr() {
        return baseUriStr("");
    }
}
