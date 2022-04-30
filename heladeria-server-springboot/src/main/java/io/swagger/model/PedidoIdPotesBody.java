package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PesoDePote;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PedidoIdPotesBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")


public class PedidoIdPotesBody   {
  @JsonProperty("peso")
  private PesoDePote peso = null;

  @JsonProperty("gustos")
  @Valid
  private List<String> gustos = new ArrayList<String>();

  public PedidoIdPotesBody peso(PesoDePote peso) {
    this.peso = peso;
    return this;
  }

  /**
   * Get peso
   * @return peso
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PesoDePote getPeso() {
    return peso;
  }

  public void setPeso(PesoDePote peso) {
    this.peso = peso;
  }

  public PedidoIdPotesBody gustos(List<String> gustos) {
    this.gustos = gustos;
    return this;
  }

  public PedidoIdPotesBody addGustosItem(String gustosItem) {
    this.gustos.add(gustosItem);
    return this;
  }

  /**
   * los gustos de helado en este pote
   * @return gustos
   **/
  @Schema(example = "[\"ddl\",\"pist\"]", required = true, description = "los gustos de helado en este pote")
      @NotNull

    public List<String> getGustos() {
    return gustos;
  }

  public void setGustos(List<String> gustos) {
    this.gustos = gustos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoIdPotesBody pedidoIdPotesBody = (PedidoIdPotesBody) o;
    return Objects.equals(this.peso, pedidoIdPotesBody.peso) &&
        Objects.equals(this.gustos, pedidoIdPotesBody.gustos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peso, gustos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoIdPotesBody {\n");
    
    sb.append("    peso: ").append(toIndentedString(peso)).append("\n");
    sb.append("    gustos: ").append(toIndentedString(gustos)).append("\n");
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
