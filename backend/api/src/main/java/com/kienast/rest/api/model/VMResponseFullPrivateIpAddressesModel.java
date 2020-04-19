package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VMResponseFullAssociationModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullPrivateIpAddressesModel
 */

public class VMResponseFullPrivateIpAddressesModel   {
  @JsonProperty("Association")
  private VMResponseFullAssociationModel association = null;

  @JsonProperty("Primary")
  private Boolean primary;

  @JsonProperty("PrivateDnsName")
  private String privateDnsName;

  @JsonProperty("PrivateIpAddress")
  private String privateIpAddress;

  public VMResponseFullPrivateIpAddressesModel association(VMResponseFullAssociationModel association) {
    this.association = association;
    return this;
  }

  /**
   * Get association
   * @return association
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullAssociationModel getAssociation() {
    return association;
  }

  public void setAssociation(VMResponseFullAssociationModel association) {
    this.association = association;
  }

  public VMResponseFullPrivateIpAddressesModel primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Get primary
   * @return primary
  */
  @ApiModelProperty(value = "")


  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public VMResponseFullPrivateIpAddressesModel privateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
    return this;
  }

  /**
   * Get privateDnsName
   * @return privateDnsName
  */
  @ApiModelProperty(value = "")


  public String getPrivateDnsName() {
    return privateDnsName;
  }

  public void setPrivateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
  }

  public VMResponseFullPrivateIpAddressesModel privateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

  /**
   * Get privateIpAddress
   * @return privateIpAddress
  */
  @ApiModelProperty(value = "")


  public String getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullPrivateIpAddressesModel vmResponseFullPrivateIpAddresses = (VMResponseFullPrivateIpAddressesModel) o;
    return Objects.equals(this.association, vmResponseFullPrivateIpAddresses.association) &&
        Objects.equals(this.primary, vmResponseFullPrivateIpAddresses.primary) &&
        Objects.equals(this.privateDnsName, vmResponseFullPrivateIpAddresses.privateDnsName) &&
        Objects.equals(this.privateIpAddress, vmResponseFullPrivateIpAddresses.privateIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(association, primary, privateDnsName, privateIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullPrivateIpAddressesModel {\n");
    
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
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

