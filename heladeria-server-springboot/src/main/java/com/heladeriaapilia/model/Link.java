package com.heladeriaapilia.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * un link usado para hypermedia
 */
@Schema(description = "un link usado para hypermedia")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")


public class Link   {
  @JsonProperty("href")
  private String href = null;

  /**
   * el verbo a usar en el link
   */
  public enum VerbEnum {
    GET("GET"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE");

    private String value;

    VerbEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerbEnum fromValue(String text) {
      for (VerbEnum b : VerbEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("verb")
  private VerbEnum verb = null;

  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * la URI del link
   * @return href
   **/
  @Schema(example = "http://foo.com/bar", description = "la URI del link")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link verb(VerbEnum verb) {
    this.verb = verb;
    return this;
  }

  /**
   * el verbo a usar en el link
   * @return verb
   **/
  @Schema(example = "GET", description = "el verbo a usar en el link")
  
    public VerbEnum getVerb() {
    return verb;
  }

  public void setVerb(VerbEnum verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.verb, link.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, verb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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
