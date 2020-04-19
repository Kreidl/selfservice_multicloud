package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPCResponseVpcIpv6CidrBlockStateModel
 */

public class VPCResponseVpcIpv6CidrBlockStateModel   {
  @JsonProperty("State")
  private String state;

  @JsonProperty("StatusMessage")
  private String statusMessage;

  public VPCResponseVpcIpv6CidrBlockStateModel state(String state) {
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

  public VPCResponseVpcIpv6CidrBlockStateModel statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
  */
  @ApiModelProperty(value = "")


  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCResponseVpcIpv6CidrBlockStateModel vpCResponseVpcIpv6CidrBlockState = (VPCResponseVpcIpv6CidrBlockStateModel) o;
    return Objects.equals(this.state, vpCResponseVpcIpv6CidrBlockState.state) &&
        Objects.equals(this.statusMessage, vpCResponseVpcIpv6CidrBlockState.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCResponseVpcIpv6CidrBlockStateModel {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

