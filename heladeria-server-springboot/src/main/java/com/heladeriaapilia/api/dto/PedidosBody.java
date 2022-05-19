package com.heladeriaapilia.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PedidosBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class PedidosBody   {
  @JsonProperty("direccion_entrega")
  private String direccionEntrega = null;

  public PedidosBody direccionEntrega(String direccionEntrega) {
    this.direccionEntrega = direccionEntrega;
    return this;
  }

  /**
   * dirección en la que se ha de entregar este pedido
   * @return direccionEntrega
   **/
  @Schema(required = true, description = "dirección en la que se ha de entregar este pedido")
      @NotNull

    public String getDireccionEntrega() {
    return direccionEntrega;
  }

  public void setDireccionEntrega(String direccionEntrega) {
    this.direccionEntrega = direccionEntrega;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidosBody pedidosBody = (PedidosBody) o;
    return Objects.equals(this.direccionEntrega, pedidosBody.direccionEntrega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccionEntrega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidosBody {\n");
    
    sb.append("    direccionEntrega: ").append(toIndentedString(direccionEntrega)).append("\n");
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
