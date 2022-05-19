package com.heladeriaapilia.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * datos de pago cuando se usa una billetera virtual
 */
@Schema(description = "datos de pago cuando se usa una billetera virtual")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class DatosDePagoBilleteraVirtual extends DatosDePago  {
  @JsonProperty("alias")
  private String alias = null;

  public DatosDePagoBilleteraVirtual alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * nombre de usuario o alias de la billetera a utilizar
   * @return alias
   **/
  @Schema(example = "mi.cuenta.billetera", required = true, description = "nombre de usuario o alias de la billetera a utilizar")
      @NotNull

    public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosDePagoBilleteraVirtual datosDePagoBilleteraVirtual = (DatosDePagoBilleteraVirtual) o;
    return Objects.equals(this.alias, datosDePagoBilleteraVirtual.alias) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosDePagoBilleteraVirtual {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
