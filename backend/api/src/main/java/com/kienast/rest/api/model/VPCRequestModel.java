package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPCRequestModel
 */

public class VPCRequestModel   {
  @JsonProperty("ipaddress")
  private String ipaddress;

  @JsonProperty("vpcname")
  private String vpcname;

  public VPCRequestModel ipaddress(String ipaddress) {
    this.ipaddress = ipaddress;
    return this;
  }

  /**
   * Get ipaddress
   * @return ipaddress
  */
  @ApiModelProperty(value = "")


  public String getIpaddress() {
    return ipaddress;
  }

  public void setIpaddress(String ipaddress) {
    this.ipaddress = ipaddress;
  }

  public VPCRequestModel vpcname(String vpcname) {
    this.vpcname = vpcname;
    return this;
  }

  /**
   * Get vpcname
   * @return vpcname
  */
  @ApiModelProperty(value = "")


  public String getVpcname() {
    return vpcname;
  }

  public void setVpcname(String vpcname) {
    this.vpcname = vpcname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCRequestModel vpCRequest = (VPCRequestModel) o;
    return Objects.equals(this.ipaddress, vpCRequest.ipaddress) &&
        Objects.equals(this.vpcname, vpCRequest.vpcname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipaddress, vpcname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCRequestModel {\n");
    
    sb.append("    ipaddress: ").append(toIndentedString(ipaddress)).append("\n");
    sb.append("    vpcname: ").append(toIndentedString(vpcname)).append("\n");
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

