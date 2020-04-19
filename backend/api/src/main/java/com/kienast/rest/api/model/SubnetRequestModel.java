package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubnetRequestModel
 */

public class SubnetRequestModel   {
  @JsonProperty("resourcegroupname")
  private String resourcegroupname;

  @JsonProperty("vnetName")
  private String vnetName;

  @JsonProperty("subnetName")
  private String subnetName;

  @JsonProperty("subnetIp")
  private String subnetIp;

  public SubnetRequestModel resourcegroupname(String resourcegroupname) {
    this.resourcegroupname = resourcegroupname;
    return this;
  }

  /**
   * Get resourcegroupname
   * @return resourcegroupname
  */
  @ApiModelProperty(value = "")


  public String getResourcegroupname() {
    return resourcegroupname;
  }

  public void setResourcegroupname(String resourcegroupname) {
    this.resourcegroupname = resourcegroupname;
  }

  public SubnetRequestModel vnetName(String vnetName) {
    this.vnetName = vnetName;
    return this;
  }

  /**
   * Get vnetName
   * @return vnetName
  */
  @ApiModelProperty(value = "")


  public String getVnetName() {
    return vnetName;
  }

  public void setVnetName(String vnetName) {
    this.vnetName = vnetName;
  }

  public SubnetRequestModel subnetName(String subnetName) {
    this.subnetName = subnetName;
    return this;
  }

  /**
   * Get subnetName
   * @return subnetName
  */
  @ApiModelProperty(value = "")


  public String getSubnetName() {
    return subnetName;
  }

  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  public SubnetRequestModel subnetIp(String subnetIp) {
    this.subnetIp = subnetIp;
    return this;
  }

  /**
   * Get subnetIp
   * @return subnetIp
  */
  @ApiModelProperty(value = "")


  public String getSubnetIp() {
    return subnetIp;
  }

  public void setSubnetIp(String subnetIp) {
    this.subnetIp = subnetIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetRequestModel subnetRequest = (SubnetRequestModel) o;
    return Objects.equals(this.resourcegroupname, subnetRequest.resourcegroupname) &&
        Objects.equals(this.vnetName, subnetRequest.vnetName) &&
        Objects.equals(this.subnetName, subnetRequest.subnetName) &&
        Objects.equals(this.subnetIp, subnetRequest.subnetIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcegroupname, vnetName, subnetName, subnetIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetRequestModel {\n");
    
    sb.append("    resourcegroupname: ").append(toIndentedString(resourcegroupname)).append("\n");
    sb.append("    vnetName: ").append(toIndentedString(vnetName)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    subnetIp: ").append(toIndentedString(subnetIp)).append("\n");
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

