package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * un pedido de helados
 */
@Schema(description = "un pedido de helados")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")


public class Pedido   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("direccion_entrega")
  private String direccionEntrega = null;

  public Pedido id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * identificador de este pedido
   * @return id
   **/
  @Schema(example = "22", required = true, description = "identificador de este pedido")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Pedido direccionEntrega(String direccionEntrega) {
    this.direccionEntrega = direccionEntrega;
    return this;
  }

  /**
   * dirección en la que se ha de entregar este pedido
   * @return direccionEntrega
   **/
  @Schema(example = "Lavalleja 244 4C, CABA", required = true, description = "dirección en la que se ha de entregar este pedido")
      @NotNull

    public String getDireccionEntrega() {
    return direccionEntrega;
  }

  public void setDireccionEntrega(String direccionEntrega) {
    this.direccionEntrega = direccionEntrega;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pedido pedido = (Pedido) o;
    return Objects.equals(this.id, pedido.id) &&
        Objects.equals(this.direccionEntrega, pedido.direccionEntrega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, direccionEntrega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pedido {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direccionEntrega: ").append(toIndentedString(direccionEntrega)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
