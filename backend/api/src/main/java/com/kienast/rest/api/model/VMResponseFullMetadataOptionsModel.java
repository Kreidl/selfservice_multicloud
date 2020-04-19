package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullMetadataOptionsModel
 */

public class VMResponseFullMetadataOptionsModel   {
  @JsonProperty("State")
  private String state;

  @JsonProperty("HttpTokens")
  private String httpTokens;

  @JsonProperty("HttpPutResponseHopLimit")
  private Integer httpPutResponseHopLimit;

  @JsonProperty("HttpEndpoint")
  private String httpEndpoint;

  public VMResponseFullMetadataOptionsModel state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public VMResponseFullMetadataOptionsModel httpTokens(String httpTokens) {
    this.httpTokens = httpTokens;
    return this;
  }

  /**
   * Get httpTokens
   * @return httpTokens
  */
  @ApiModelProperty(value = "")


  public String getHttpTokens() {
    return httpTokens;
  }

  public void setHttpTokens(String httpTokens) {
    this.httpTokens = httpTokens;
  }

  public VMResponseFullMetadataOptionsModel httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
    this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    return this;
  }

  /**
   * Get httpPutResponseHopLimit
   * @return httpPutResponseHopLimit
  */
  @ApiModelProperty(value = "")


  public Integer getHttpPutResponseHopLimit() {
    return httpPutResponseHopLimit;
  }

  public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
    this.httpPutResponseHopLimit = httpPutResponseHopLimit;
  }

  public VMResponseFullMetadataOptionsModel httpEndpoint(String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
    return this;
  }

  /**
   * Get httpEndpoint
   * @return httpEndpoint
  */
  @ApiModelProperty(value = "")


  public String getHttpEndpoint() {
    return httpEndpoint;
  }

  public void setHttpEndpoint(String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullMetadataOptionsModel vmResponseFullMetadataOptions = (VMResponseFullMetadataOptionsModel) o;
    return Objects.equals(this.state, vmResponseFullMetadataOptions.state) &&
        Objects.equals(this.httpTokens, vmResponseFullMetadataOptions.httpTokens) &&
        Objects.equals(this.httpPutResponseHopLimit, vmResponseFullMetadataOptions.httpPutResponseHopLimit) &&
        Objects.equals(this.httpEndpoint, vmResponseFullMetadataOptions.httpEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, httpTokens, httpPutResponseHopLimit, httpEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullMetadataOptionsModel {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    httpTokens: ").append(toIndentedString(httpTokens)).append("\n");
    sb.append("    httpPutResponseHopLimit: ").append(toIndentedString(httpPutResponseHopLimit)).append("\n");
    sb.append("    httpEndpoint: ").append(toIndentedString(httpEndpoint)).append("\n");
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

