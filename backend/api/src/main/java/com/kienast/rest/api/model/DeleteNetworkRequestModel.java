package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeleteNetworkRequestModel
 */

public class DeleteNetworkRequestModel   {
  @JsonProperty("resourcegroupname")
  private String resourcegroupname;

  @JsonProperty("vnetName")
  private String vnetName;

  public DeleteNetworkRequestModel resourcegroupname(String resourcegroupname) {
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

  public DeleteNetworkRequestModel vnetName(String vnetName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteNetworkRequestModel deleteNetworkRequest = (DeleteNetworkRequestModel) o;
    return Objects.equals(this.resourcegroupname, deleteNetworkRequest.resourcegroupname) &&
        Objects.equals(this.vnetName, deleteNetworkRequest.vnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcegroupname, vnetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteNetworkRequestModel {\n");
    
    sb.append("    resourcegroupname: ").append(toIndentedString(resourcegroupname)).append("\n");
    sb.append("    vnetName: ").append(toIndentedString(vnetName)).append("\n");
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

