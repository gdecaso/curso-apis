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
 * un pote de helado dentro de un pedido
 */
@Schema(description = "un pote de helado dentro de un pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")


public class Pote   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("peso")
  private PesoDePote peso = null;

  @JsonProperty("gustos")
  @Valid
  private List<String> gustos = new ArrayList<String>();

  public Pote id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * identificador de este pote dentro del pedido
   * @return id
   **/
  @Schema(example = "1", required = true, description = "identificador de este pote dentro del pedido")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Pote peso(PesoDePote peso) {
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

  public Pote gustos(List<String> gustos) {
    this.gustos = gustos;
    return this;
  }

  public Pote addGustosItem(String gustosItem) {
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
    Pote pote = (Pote) o;
    return Objects.equals(this.id, pote.id) &&
        Objects.equals(this.peso, pote.peso) &&
        Objects.equals(this.gustos, pote.gustos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, peso, gustos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
