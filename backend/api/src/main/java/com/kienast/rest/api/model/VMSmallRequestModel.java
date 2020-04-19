package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMSmallRequestModel
 */

public class VMSmallRequestModel   {
  @JsonProperty("resourcegroupname")
  private String resourcegroupname;

  @JsonProperty("vmname")
  private String vmname;

  public VMSmallRequestModel resourcegroupname(String resourcegroupname) {
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

  public VMSmallRequestModel vmname(String vmname) {
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
    VMSmallRequestModel vmSmallRequest = (VMSmallRequestModel) o;
    return Objects.equals(this.resourcegroupname, vmSmallRequest.resourcegroupname) &&
        Objects.equals(this.vmname, vmSmallRequest.vmname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcegroupname, vmname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMSmallRequestModel {\n");
    
    sb.append("    resourcegroupname: ").append(toIndentedString(resourcegroupname)).append("\n");
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

