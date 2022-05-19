package com.heladeriaapilia.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * hypermedia links de un pote
 */
@Schema(description = "hypermedia links de un pote")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class PoteLinks1   {
  @JsonProperty("pedido")
  private Link pedido = null;

  @JsonProperty("borrar")
  private Link borrar = null;

  public PoteLinks1 pedido(Link pedido) {
    this.pedido = pedido;
    return this;
  }

  /**
   * Get pedido
   * @return pedido
   **/
  @Schema(description = "")
  
    @Valid
    public Link getPedido() {
    return pedido;
  }

  public void setPedido(Link pedido) {
    this.pedido = pedido;
  }

  public PoteLinks1 borrar(Link borrar) {
    this.borrar = borrar;
    return this;
  }

  /**
   * Get borrar
   * @return borrar
   **/
  @Schema(description = "")
  
    @Valid
    public Link getBorrar() {
    return borrar;
  }

  public void setBorrar(Link borrar) {
    this.borrar = borrar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoteLinks1 poteLinks1 = (PoteLinks1) o;
    return Objects.equals(this.pedido, poteLinks1.pedido) &&
        Objects.equals(this.borrar, poteLinks1.borrar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pedido, borrar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoteLinks1 {\n");
    
    sb.append("    pedido: ").append(toIndentedString(pedido)).append("\n");
    sb.append("    borrar: ").append(toIndentedString(borrar)).append("\n");
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
