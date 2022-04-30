package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TipoDeGusto
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
