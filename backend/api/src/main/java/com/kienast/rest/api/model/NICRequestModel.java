package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NICRequestModel
 */

public class NICRequestModel   {
  @JsonProperty("resourcegroupname")
  private String resourcegroupname;

  @JsonProperty("nicname")
  private String nicname;

  @JsonProperty("ipconfigname")
  private String ipconfigname;

  @JsonProperty("subnetid")
  private String subnetid;

  @JsonProperty("vnetName")
  private String vnetName;

  public NICRequestModel resourcegroupname(String resourcegroupname) {
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

  public NICRequestModel nicname(String nicname) {
    this.nicname = nicname;
    return this;
  }

  /**
   * Get nicname
   * @return nicname
  */
  @ApiModelProperty(value = "")


  public String getNicname() {
    return nicname;
  }

  public void setNicname(String nicname) {
    this.nicname = nicname;
  }

  public NICRequestModel ipconfigname(String ipconfigname) {
    this.ipconfigname = ipconfigname;
    return this;
  }

  /**
   * Get ipconfigname
   * @return ipconfigname
  */
  @ApiModelProperty(value = "")


  public String getIpconfigname() {
    return ipconfigname;
  }

  public void setIpconfigname(String ipconfigname) {
    this.ipconfigname = ipconfigname;
  }

  public NICRequestModel subnetid(String subnetid) {
    this.subnetid = subnetid;
    return this;
  }

  /**
   * Get subnetid
   * @return subnetid
  */
  @ApiModelProperty(value = "")


  public String getSubnetid() {
    return subnetid;
  }

  public void setSubnetid(String subnetid) {
    this.subnetid = subnetid;
  }

  public NICRequestModel vnetName(String vnetName) {
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
    NICRequestModel niCRequest = (NICRequestModel) o;
    return Objects.equals(this.resourcegroupname, niCRequest.resourcegroupname) &&
        Objects.equals(this.nicname, niCRequest.nicname) &&
        Objects.equals(this.ipconfigname, niCRequest.ipconfigname) &&
        Objects.equals(this.subnetid, niCRequest.subnetid) &&
        Objects.equals(this.vnetName, niCRequest.vnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcegroupname, nicname, ipconfigname, subnetid, vnetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NICRequestModel {\n");
    
    sb.append("    resourcegroupname: ").append(toIndentedString(resourcegroupname)).append("\n");
    sb.append("    nicname: ").append(toIndentedString(nicname)).append("\n");
    sb.append("    ipconfigname: ").append(toIndentedString(ipconfigname)).append("\n");
    sb.append("    subnetid: ").append(toIndentedString(subnetid)).append("\n");
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

