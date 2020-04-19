package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMRequestModel
 */

public class AzureVMRequestModel   {
  @JsonProperty("resourcegroupname")
  private String resourcegroupname;

  @JsonProperty("vmname")
  private String vmname;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("vmsize")
  private String vmsize;

  @JsonProperty("publishername")
  private String publishername;

  @JsonProperty("offername")
  private String offername;

  @JsonProperty("skuname")
  private String skuname;

  @JsonProperty("version")
  private String version;

  @JsonProperty("nicid")
  private String nicid;

  public AzureVMRequestModel resourcegroupname(String resourcegroupname) {
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

  public AzureVMRequestModel vmname(String vmname) {
    this.vmname = vmname;
    return this;
  }

  /**
   * Get vmname
   * @return vmname
  */
  @ApiModelProperty(value = "")


  public String getVmname() {
    return vmname;
  }

  public void setVmname(String vmname) {
    this.vmname = vmname;
  }

  public AzureVMRequestModel username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AzureVMRequestModel password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AzureVMRequestModel vmsize(String vmsize) {
    this.vmsize = vmsize;
    return this;
  }

  /**
   * Get vmsize
   * @return vmsize
  */
  @ApiModelProperty(value = "")


  public String getVmsize() {
    return vmsize;
  }

  public void setVmsize(String vmsize) {
    this.vmsize = vmsize;
  }

  public AzureVMRequestModel publishername(String publishername) {
    this.publishername = publishername;
    return this;
  }

  /**
   * Get publishername
   * @return publishername
  */
  @ApiModelProperty(value = "")


  public String getPublishername() {
    return publishername;
  }

  public void setPublishername(String publishername) {
    this.publishername = publishername;
  }

  public AzureVMRequestModel offername(String offername) {
    this.offername = offername;
    return this;
  }

  /**
   * Get offername
   * @return offername
  */
  @ApiModelProperty(value = "")


  public String getOffername() {
    return offername;
  }

  public void setOffername(String offername) {
    this.offername = offername;
  }

  public AzureVMRequestModel skuname(String skuname) {
    this.skuname = skuname;
    return this;
  }

  /**
   * Get skuname
   * @return skuname
  */
  @ApiModelProperty(value = "")


  public String getSkuname() {
    return skuname;
  }

  public void setSkuname(String skuname) {
    this.skuname = skuname;
  }

  public AzureVMRequestModel version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public AzureVMRequestModel nicid(String nicid) {
    this.nicid = nicid;
    return this;
  }

  /**
   * Get nicid
   * @return nicid
  */
  @ApiModelProperty(value = "")


  public String getNicid() {
    return nicid;
  }

  public void setNicid(String nicid) {
    this.nicid = nicid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMRequestModel azureVMRequest = (AzureVMRequestModel) o;
    return Objects.equals(this.resourcegroupname, azureVMRequest.resourcegroupname) &&
        Objects.equals(this.vmname, azureVMRequest.vmname) &&
        Objects.equals(this.username, azureVMRequest.username) &&
        Objects.equals(this.password, azureVMRequest.password) &&
        Objects.equals(this.vmsize, azureVMRequest.vmsize) &&
        Objects.equals(this.publishername, azureVMRequest.publishername) &&
        Objects.equals(this.offername, azureVMRequest.offername) &&
        Objects.equals(this.skuname, azureVMRequest.skuname) &&
        Objects.equals(this.version, azureVMRequest.version) &&
        Objects.equals(this.nicid, azureVMRequest.nicid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcegroupname, vmname, username, password, vmsize, publishername, offername, skuname, version, nicid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMRequestModel {\n");
    
    sb.append("    resourcegroupname: ").append(toIndentedString(resourcegroupname)).append("\n");
    sb.append("    vmname: ").append(toIndentedString(vmname)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    vmsize: ").append(toIndentedString(vmsize)).append("\n");
    sb.append("    publishername: ").append(toIndentedString(publishername)).append("\n");
    sb.append("    offername: ").append(toIndentedString(offername)).append("\n");
    sb.append("    skuname: ").append(toIndentedString(skuname)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    nicid: ").append(toIndentedString(nicid)).append("\n");
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

