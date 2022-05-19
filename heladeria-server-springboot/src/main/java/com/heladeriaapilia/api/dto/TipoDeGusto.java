package com.heladeriaapilia.api.dto;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * categoría de gustos de helado
 */
public enum TipoDeGusto {
  CHOCOLATES("chocolates"),
    DULCE_DE_LECHES("dulce de leches"),
    CREMAS("cremas"),
    FRUTAS("frutas");

  private String value;

  TipoDeGusto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TipoDeGusto fromValue(String text) {
    for (TipoDeGusto b : TipoDeGusto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
