package com.heladeriaapilia.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * un pedido de helados
 */
@Schema(description = "un pedido de helados")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class Pedido   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("direccion_entrega")
  private String direccionEntrega = null;

  @JsonProperty("_links")
  private PedidoLinks _links = null;

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

  public Pedido _links(PedidoLinks _links) {
    this._links = _links;
    return this;
  }

  /**
   * Get _links
   * @return _links
   **/
  @Schema(description = "")
  
    @Valid
  @JsonIgnore
    public PedidoLinks getLinks() {
    return _links;
  }

  public void setLinks(PedidoLinks _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pedido pedido = (Pedido) o;
    return Objects.equals(this.id, pedido.id) &&
        Objects.equals(this.direccionEntrega, pedido.direccionEntrega) &&
        Objects.equals(this._links, pedido._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, direccionEntrega, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pedido {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direccionEntrega: ").append(toIndentedString(direccionEntrega)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
