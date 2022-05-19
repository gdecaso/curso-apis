package com.heladeriaapilia.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * hypermedia links de un pedido
 */
@Schema(description = "hypermedia links de un pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class PedidoLinks   {
  @JsonProperty("potes")
  private Link potes = null;

  @JsonProperty("pagar")
  private Link pagar = null;

  @JsonProperty("pago")
  private Link pago = null;

  public PedidoLinks potes(Link potes) {
    this.potes = potes;
    return this;
  }

  /**
   * Get potes
   * @return potes
   **/
  @Schema(description = "")
  
    @Valid
    public Link getPotes() {
    return potes;
  }

  public void setPotes(Link potes) {
    this.potes = potes;
  }

  public PedidoLinks pagar(Link pagar) {
    this.pagar = pagar;
    return this;
  }

  /**
   * Get pagar
   * @return pagar
   **/
  @Schema(description = "")
  
    @Valid
    public Link getPagar() {
    return pagar;
  }

  public void setPagar(Link pagar) {
    this.pagar = pagar;
  }

  public PedidoLinks pago(Link pago) {
    this.pago = pago;
    return this;
  }

  /**
   * Get pago
   * @return pago
   **/
  @Schema(description = "")
  
    @Valid
    public Link getPago() {
    return pago;
  }

  public void setPago(Link pago) {
    this.pago = pago;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoLinks pedidoLinks = (PedidoLinks) o;
    return Objects.equals(this.potes, pedidoLinks.potes) &&
        Objects.equals(this.pagar, pedidoLinks.pagar) &&
        Objects.equals(this.pago, pedidoLinks.pago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potes, pagar, pago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoLinks {\n");
    
    sb.append("    potes: ").append(toIndentedString(potes)).append("\n");
    sb.append("    pagar: ").append(toIndentedString(pagar)).append("\n");
    sb.append("    pago: ").append(toIndentedString(pago)).append("\n");
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
