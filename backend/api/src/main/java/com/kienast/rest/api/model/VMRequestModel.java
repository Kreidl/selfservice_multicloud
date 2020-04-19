package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMRequestModel
 */

public class VMRequestModel   {
  @JsonProperty("imageId")
  private String imageId;

  @JsonProperty("instanceType")
  private String instanceType;

  @JsonProperty("keyName")
  private String keyName;

  @JsonProperty("securityGroups")
  @Valid
  private List<String> securityGroups = null;

  @JsonProperty("vmname")
  private String vmname;

  public VMRequestModel imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  */
  @ApiModelProperty(value = "")


  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public VMRequestModel instanceType(String instanceType) {
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

  public VMRequestModel keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Get keyName
   * @return keyName
  */
  @ApiModelProperty(value = "")


  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public VMRequestModel securityGroups(List<String> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public VMRequestModel addSecurityGroupsItem(String securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<String>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

  /**
   * Get securityGroups
   * @return securityGroups
  */
  @ApiModelProperty(value = "")


  public List<String> getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List<String> securityGroups) {
    this.securityGroups = securityGroups;
  }

  public VMRequestModel vmname(String vmname) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMRequestModel vmRequest = (VMRequestModel) o;
    return Objects.equals(this.imageId, vmRequest.imageId) &&
        Objects.equals(this.instanceType, vmRequest.instanceType) &&
        Objects.equals(this.keyName, vmRequest.keyName) &&
        Objects.equals(this.securityGroups, vmRequest.securityGroups) &&
        Objects.equals(this.vmname, vmRequest.vmname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, instanceType, keyName, securityGroups, vmname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMRequestModel {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    vmname: ").append(toIndentedString(vmname)).append("\n");
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

