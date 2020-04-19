package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubnetRouteTableModel
 */

public class SubnetRouteTableModel   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("provisioning_state")
  private String provisioningState;

  @JsonProperty("etag")
  private String etag;

  public SubnetRouteTableModel name(String name) {
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

  public SubnetRouteTableModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SubnetRouteTableModel provisioningState(String provisioningState) {
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

  public SubnetRouteTableModel etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Get etag
   * @return etag
  */
  @ApiModelProperty(value = "")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetRouteTableModel subnetRouteTable = (SubnetRouteTableModel) o;
    return Objects.equals(this.name, subnetRouteTable.name) &&
        Objects.equals(this.type, subnetRouteTable.type) &&
        Objects.equals(this.provisioningState, subnetRouteTable.provisioningState) &&
        Objects.equals(this.etag, subnetRouteTable.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, provisioningState, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetRouteTableModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

