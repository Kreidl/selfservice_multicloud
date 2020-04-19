package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NICResponsePrivateEndpointModel
 */

public class NICResponsePrivateEndpointModel   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("instanceType")
  private String instanceType;

  @JsonProperty("provisioning_state")
  private String provisioningState;

  public NICResponsePrivateEndpointModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NICResponsePrivateEndpointModel instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Get instanceType
   * @return instanceType
  */
  @ApiModelProperty(value = "")


  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public NICResponsePrivateEndpointModel provisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
    return this;
  }

  /**
   * Get provisioningState
   * @return provisioningState
  */
  @ApiModelProperty(value = "")


  public String getProvisioningState() {
    return provisioningState;
  }

  public void setProvisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NICResponsePrivateEndpointModel niCResponsePrivateEndpoint = (NICResponsePrivateEndpointModel) o;
    return Objects.equals(this.name, niCResponsePrivateEndpoint.name) &&
        Objects.equals(this.instanceType, niCResponsePrivateEndpoint.instanceType) &&
        Objects.equals(this.provisioningState, niCResponsePrivateEndpoint.provisioningState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, instanceType, provisioningState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NICResponsePrivateEndpointModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
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

