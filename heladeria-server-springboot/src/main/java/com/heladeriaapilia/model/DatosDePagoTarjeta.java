package com.heladeriaapilia.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * datos de pago cuando se usa tarjeta de crédito
 */
@Schema(description = "datos de pago cuando se usa tarjeta de crédito")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class DatosDePagoTarjeta extends DatosDePago  {
  @JsonProperty("numerosTarjeta")
  private String numerosTarjeta = null;

  @JsonProperty("vencimientoTarjetaMes")
  private BigDecimal vencimientoTarjetaMes = null;

  @JsonProperty("vencimientoTarjetaAnio")
  private BigDecimal vencimientoTarjetaAnio = null;

  public DatosDePagoTarjeta numerosTarjeta(String numerosTarjeta) {
    this.numerosTarjeta = numerosTarjeta;
    return this;
  }

  /**
   * los 15 o 16 números de la tarjeta de crédito
   * @return numerosTarjeta
   **/
  @Schema(example = "1234567812345678", required = true, description = "los 15 o 16 números de la tarjeta de crédito")
      @NotNull

    public String getNumerosTarjeta() {
    return numerosTarjeta;
  }

  public void setNumerosTarjeta(String numerosTarjeta) {
    this.numerosTarjeta = numerosTarjeta;
  }

  public DatosDePagoTarjeta vencimientoTarjetaMes(BigDecimal vencimientoTarjetaMes) {
    this.vencimientoTarjetaMes = vencimientoTarjetaMes;
    return this;
  }

  /**
   * el mes del vencimiento de la tarjeta de crédito
   * minimum: 1
   * maximum: 6
   * @return vencimientoTarjetaMes
   **/
  @Schema(example = "4", required = true, description = "el mes del vencimiento de la tarjeta de crédito")
      @NotNull

    @Valid
  @DecimalMin("1") @DecimalMax("6")   public BigDecimal getVencimientoTarjetaMes() {
    return vencimientoTarjetaMes;
  }

  public void setVencimientoTarjetaMes(BigDecimal vencimientoTarjetaMes) {
    this.vencimientoTarjetaMes = vencimientoTarjetaMes;
  }

  public DatosDePagoTarjeta vencimientoTarjetaAnio(BigDecimal vencimientoTarjetaAnio) {
    this.vencimientoTarjetaAnio = vencimientoTarjetaAnio;
    return this;
  }

  /**
   * el año de vencimiento de la tarjeta expresado en dos dígitos
   * minimum: 0
   * maximum: 99
   * @return vencimientoTarjetaAnio
   **/
  @Schema(example = "24", required = true, description = "el año de vencimiento de la tarjeta expresado en dos dígitos")
      @NotNull

    @Valid
  @DecimalMin("0") @DecimalMax("99")   public BigDecimal getVencimientoTarjetaAnio() {
    return vencimientoTarjetaAnio;
  }

  public void setVencimientoTarjetaAnio(BigDecimal vencimientoTarjetaAnio) {
    this.vencimientoTarjetaAnio = vencimientoTarjetaAnio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosDePagoTarjeta datosDePagoTarjeta = (DatosDePagoTarjeta) o;
    return Objects.equals(this.numerosTarjeta, datosDePagoTarjeta.numerosTarjeta) &&
        Objects.equals(this.vencimientoTarjetaMes, datosDePagoTarjeta.vencimientoTarjetaMes) &&
        Objects.equals(this.vencimientoTarjetaAnio, datosDePagoTarjeta.vencimientoTarjetaAnio) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numerosTarjeta, vencimientoTarjetaMes, vencimientoTarjetaAnio, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosDePagoTarjeta {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    numerosTarjeta: ").append(toIndentedString(numerosTarjeta)).append("\n");
    sb.append("    vencimientoTarjetaMes: ").append(toIndentedString(vencimientoTarjetaMes)).append("\n");
    sb.append("    vencimientoTarjetaAnio: ").append(toIndentedString(vencimientoTarjetaAnio)).append("\n");
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
