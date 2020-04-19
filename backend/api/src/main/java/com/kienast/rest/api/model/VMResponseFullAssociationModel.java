package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullAssociationModel
 */

public class VMResponseFullAssociationModel   {
  @JsonProperty("IpOwnerId")
  private String ipOwnerId;

  @JsonProperty("PublicDnsName")
  private String publicDnsName;

  @JsonProperty("PublicIp")
  private String publicIp;

  public VMResponseFullAssociationModel ipOwnerId(String ipOwnerId) {
    this.ipOwnerId = ipOwnerId;
    return this;
  }

  /**
   * Get ipOwnerId
   * @return ipOwnerId
  */
  @ApiModelProperty(value = "")


  public String getIpOwnerId() {
    return ipOwnerId;
  }

  public void setIpOwnerId(String ipOwnerId) {
    this.ipOwnerId = ipOwnerId;
  }

  public VMResponseFullAssociationModel publicDnsName(String publicDnsName) {
    this.publicDnsName = publicDnsName;
    return this;
  }

  /**
   * Get publicDnsName
   * @return publicDnsName
  */
  @ApiModelProperty(value = "")


  public String getPublicDnsName() {
    return publicDnsName;
  }

  public void setPublicDnsName(String publicDnsName) {
    this.publicDnsName = publicDnsName;
  }

  public VMResponseFullAssociationModel publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

  /**
   * Get publicIp
   * @return publicIp
  */
  @ApiModelProperty(value = "")


  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullAssociationModel vmResponseFullAssociation = (VMResponseFullAssociationModel) o;
    return Objects.equals(this.ipOwnerId, vmResponseFullAssociation.ipOwnerId) &&
        Objects.equals(this.publicDnsName, vmResponseFullAssociation.publicDnsName) &&
        Objects.equals(this.publicIp, vmResponseFullAssociation.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipOwnerId, publicDnsName, publicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullAssociationModel {\n");
    
    sb.append("    ipOwnerId: ").append(toIndentedString(ipOwnerId)).append("\n");
    sb.append("    publicDnsName: ").append(toIndentedString(publicDnsName)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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

