package com.heladeriaapilia.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * PoteGustos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class PoteGustos   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("_links")
  private PoteLinks _links = null;

  public PoteGustos id(String id) {
    this.id = id;
    return this;
  }

  /**
   * el id del gusto de helado en este pote
   * @return id
   **/
  @Schema(example = "ddl", description = "el id del gusto de helado en este pote")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PoteGustos _links(PoteLinks _links) {
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
    public PoteLinks getLinks() {
    return _links;
  }

  public void setLinks(PoteLinks _links) {
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
    PoteGustos poteGustos = (PoteGustos) o;
    return Objects.equals(this.id, poteGustos.id) &&
        Objects.equals(this._links, poteGustos._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoteGustos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
