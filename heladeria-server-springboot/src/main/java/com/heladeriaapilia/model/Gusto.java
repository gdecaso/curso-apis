package com.heladeriaapilia.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * un gusto de helado
 */
@Schema(description = "un gusto de helado")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class Gusto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tipo")
  private TipoDeGusto tipo = null;

  public Gusto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * nombre corto que identifica este gusto
   * @return id
   **/
  @Schema(example = "ddl", required = true, description = "nombre corto que identifica este gusto")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Gusto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * nombre legible por humanos para este gusto
   * @return name
   **/
  @Schema(example = "Dulce de leche", required = true, description = "nombre legible por humanos para este gusto")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gusto tipo(TipoDeGusto tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TipoDeGusto getTipo() {
    return tipo;
  }

  public void setTipo(TipoDeGusto tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gusto gusto = (Gusto) o;
    return Objects.equals(this.id, gusto.id) &&
        Objects.equals(this.name, gusto.name) &&
        Objects.equals(this.tipo, gusto.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gusto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
