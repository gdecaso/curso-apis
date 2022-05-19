package com.heladeriaapilia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * un pote de helado dentro de un pedido
 */
@Schema(description = "un pote de helado dentro de un pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class Pote   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("peso")
  private PesoDePote peso = null;

  @JsonProperty("gustos")
  @Valid
  private List<PoteGustos> gustos = new ArrayList<PoteGustos>();

  @JsonProperty("_links")
  private PoteLinks1 _links = null;

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

  public Pote gustos(List<PoteGustos> gustos) {
    this.gustos = gustos;
    return this;
  }

  public Pote addGustosItem(PoteGustos gustosItem) {
    this.gustos.add(gustosItem);
    return this;
  }

  /**
   * los gustos de helado en este pote
   * @return gustos
   **/
  @Schema(required = true, description = "los gustos de helado en este pote")
      @NotNull
    @Valid
    public List<PoteGustos> getGustos() {
    return gustos;
  }

  public void setGustos(List<PoteGustos> gustos) {
    this.gustos = gustos;
  }

  public Pote _links(PoteLinks1 _links) {
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
    public PoteLinks1 getLinks() {
    return _links;
  }

  public void setLinks(PoteLinks1 _links) {
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
    Pote pote = (Pote) o;
    return Objects.equals(this.id, pote.id) &&
        Objects.equals(this.peso, pote.peso) &&
        Objects.equals(this.gustos, pote.gustos) &&
        Objects.equals(this._links, pote._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, peso, gustos, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    peso: ").append(toIndentedString(peso)).append("\n");
    sb.append("    gustos: ").append(toIndentedString(gustos)).append("\n");
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
