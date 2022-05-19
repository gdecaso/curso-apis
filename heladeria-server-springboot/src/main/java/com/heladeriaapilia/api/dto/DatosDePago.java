package com.heladeriaapilia.api.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * los datos necesarios para iniciar el pago de un pedido
 */
@Schema(description = "los datos necesarios para iniciar el pago de un pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoDePago", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = DatosDePagoBilleteraVirtual.class, name = "DatosDePagoBilleteraVirtual"),
        @JsonSubTypes.Type(value = DatosDePagoTarjeta.class, name = "DatosDePagoTarjeta"),
})


public class DatosDePago   {
  @JsonTypeId
  private String tipoDePago = null;

  public DatosDePago tipoDePago(String tipoDePago) {
    this.tipoDePago = tipoDePago;
    return this;
  }

  /**
   * se usa para determinar el tipo de pago a usar
   * @return tipoDePago
   **/
  @Schema(required = true, description = "se usa para determinar el tipo de pago a usar")
      @NotNull

    public String getTipoDePago() {
    return tipoDePago;
  }

  public void setTipoDePago(String tipoDePago) {
    this.tipoDePago = tipoDePago;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosDePago datosDePago = (DatosDePago) o;
    return Objects.equals(this.tipoDePago, datosDePago.tipoDePago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDePago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosDePago {\n");
    
    sb.append("    tipoDePago: ").append(toIndentedString(tipoDePago)).append("\n");
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
