package com.heladeriaapilia.api.dto;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * peso de un pote de helado en gramos
 */
public enum PesoDePote {
  _1000("1000"),
    _500("500"),
    _250("250");

  private String value;

  PesoDePote(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PesoDePote fromValue(String text) {
    for (PesoDePote b : PesoDePote.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
