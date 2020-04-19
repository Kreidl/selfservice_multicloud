package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VMResponseFullAssociationModel;
import com.kienast.rest.api.model.VMResponseFullAttachmentModel;
import com.kienast.rest.api.model.VMResponseFullGroupsModel;
import com.kienast.rest.api.model.VMResponseFullIpv6AddressesModel;
import com.kienast.rest.api.model.VMResponseFullPrivateIpAddressesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullNetworkInterfacesModel
 */

public class VMResponseFullNetworkInterfacesModel   {
  @JsonProperty("Association")
  private VMResponseFullAssociationModel association = null;

  @JsonProperty("Attachment")
  private VMResponseFullAttachmentModel attachment = null;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Groups")
  @Valid
  private List<VMResponseFullGroupsModel> groups = null;

  @JsonProperty("Ipv6Addresses")
  @Valid
  private List<VMResponseFullIpv6AddressesModel> ipv6Addresses = null;

  @JsonProperty("MacAddress")
  private String macAddress;

  @JsonProperty("NetworkInterfaceId")
  private String networkInterfaceId;

  @JsonProperty("OwnerId")
  private String ownerId;

  @JsonProperty("PrivateDnsName")
  private String privateDnsName;

  @JsonProperty("PrivateIpAddress")
  private String privateIpAddress;

  @JsonProperty("PrivateIpAddresses")
  @Valid
  private List<VMResponseFullPrivateIpAddressesModel> privateIpAddresses = null;

  @JsonProperty("SourceDestCheck")
  private Boolean sourceDestCheck;

  @JsonProperty("Status")
  private String status;

  @JsonProperty("SubnetId")
  private String subnetId;

  @JsonProperty("VpcId")
  private String vpcId;

  @JsonProperty("InterfaceType")
  private String interfaceType;

  public VMResponseFullNetworkInterfacesModel association(VMResponseFullAssociationModel association) {
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

  public VMResponseFullNetworkInterfacesModel attachment(VMResponseFullAttachmentModel attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullAttachmentModel getAttachment() {
    return attachment;
  }

  public void setAttachment(VMResponseFullAttachmentModel attachment) {
    this.attachment = attachment;
  }

  public VMResponseFullNetworkInterfacesModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VMResponseFullNetworkInterfacesModel groups(List<VMResponseFullGroupsModel> groups) {
    this.groups = groups;
    return this;
  }

  public VMResponseFullNetworkInterfacesModel addGroupsItem(VMResponseFullGroupsModel groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<VMResponseFullGroupsModel>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullGroupsModel> getGroups() {
    return groups;
  }

  public void setGroups(List<VMResponseFullGroupsModel> groups) {
    this.groups = groups;
  }

  public VMResponseFullNetworkInterfacesModel ipv6Addresses(List<VMResponseFullIpv6AddressesModel> ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
    return this;
  }

  public VMResponseFullNetworkInterfacesModel addIpv6AddressesItem(VMResponseFullIpv6AddressesModel ipv6AddressesItem) {
    if (this.ipv6Addresses == null) {
      this.ipv6Addresses = new ArrayList<VMResponseFullIpv6AddressesModel>();
    }
    this.ipv6Addresses.add(ipv6AddressesItem);
    return this;
  }

  /**
   * Get ipv6Addresses
   * @return ipv6Addresses
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullIpv6AddressesModel> getIpv6Addresses() {
    return ipv6Addresses;
  }

  public void setIpv6Addresses(List<VMResponseFullIpv6AddressesModel> ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
  }

  public VMResponseFullNetworkInterfacesModel macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Get macAddress
   * @return macAddress
  */
  @ApiModelProperty(value = "")


  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public VMResponseFullNetworkInterfacesModel networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

  /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  */
  @ApiModelProperty(value = "")


  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public VMResponseFullNetworkInterfacesModel ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @ApiModelProperty(value = "")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public VMResponseFullNetworkInterfacesModel privateDnsName(String privateDnsName) {
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

  public VMResponseFullNetworkInterfacesModel privateIpAddress(String privateIpAddress) {
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

  public VMResponseFullNetworkInterfacesModel privateIpAddresses(List<VMResponseFullPrivateIpAddressesModel> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
    return this;
  }

  public VMResponseFullNetworkInterfacesModel addPrivateIpAddressesItem(VMResponseFullPrivateIpAddressesModel privateIpAddressesItem) {
    if (this.privateIpAddresses == null) {
      this.privateIpAddresses = new ArrayList<VMResponseFullPrivateIpAddressesModel>();
    }
    this.privateIpAddresses.add(privateIpAddressesItem);
    return this;
  }

  /**
   * Get privateIpAddresses
   * @return privateIpAddresses
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullPrivateIpAddressesModel> getPrivateIpAddresses() {
    return privateIpAddresses;
  }

  public void setPrivateIpAddresses(List<VMResponseFullPrivateIpAddressesModel> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
  }

  public VMResponseFullNetworkInterfacesModel sourceDestCheck(Boolean sourceDestCheck) {
    this.sourceDestCheck = sourceDestCheck;
    return this;
  }

  /**
   * Get sourceDestCheck
   * @return sourceDestCheck
  */
  @ApiModelProperty(value = "")


  public Boolean getSourceDestCheck() {
    return sourceDestCheck;
  }

  public void setSourceDestCheck(Boolean sourceDestCheck) {
    this.sourceDestCheck = sourceDestCheck;
  }

  public VMResponseFullNetworkInterfacesModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VMResponseFullNetworkInterfacesModel subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  /**
   * Get subnetId
   * @return subnetId
  */
  @ApiModelProperty(value = "")


  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public VMResponseFullNetworkInterfacesModel vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
  */
  @ApiModelProperty(value = "")


  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public VMResponseFullNetworkInterfacesModel interfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }

  /**
   * Get interfaceType
   * @return interfaceType
  */
  @ApiModelProperty(value = "")


  public String getInterfaceType() {
    return interfaceType;
  }

  public void setInterfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullNetworkInterfacesModel vmResponseFullNetworkInterfaces = (VMResponseFullNetworkInterfacesModel) o;
    return Objects.equals(this.association, vmResponseFullNetworkInterfaces.association) &&
        Objects.equals(this.attachment, vmResponseFullNetworkInterfaces.attachment) &&
        Objects.equals(this.description, vmResponseFullNetworkInterfaces.description) &&
        Objects.equals(this.groups, vmResponseFullNetworkInterfaces.groups) &&
        Objects.equals(this.ipv6Addresses, vmResponseFullNetworkInterfaces.ipv6Addresses) &&
        Objects.equals(this.macAddress, vmResponseFullNetworkInterfaces.macAddress) &&
        Objects.equals(this.networkInterfaceId, vmResponseFullNetworkInterfaces.networkInterfaceId) &&
        Objects.equals(this.ownerId, vmResponseFullNetworkInterfaces.ownerId) &&
        Objects.equals(this.privateDnsName, vmResponseFullNetworkInterfaces.privateDnsName) &&
        Objects.equals(this.privateIpAddress, vmResponseFullNetworkInterfaces.privateIpAddress) &&
        Objects.equals(this.privateIpAddresses, vmResponseFullNetworkInterfaces.privateIpAddresses) &&
        Objects.equals(this.sourceDestCheck, vmResponseFullNetworkInterfaces.sourceDestCheck) &&
        Objects.equals(this.status, vmResponseFullNetworkInterfaces.status) &&
        Objects.equals(this.subnetId, vmResponseFullNetworkInterfaces.subnetId) &&
        Objects.equals(this.vpcId, vmResponseFullNetworkInterfaces.vpcId) &&
        Objects.equals(this.interfaceType, vmResponseFullNetworkInterfaces.interfaceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(association, attachment, description, groups, ipv6Addresses, macAddress, networkInterfaceId, ownerId, privateDnsName, privateIpAddress, privateIpAddresses, sourceDestCheck, status, subnetId, vpcId, interfaceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullNetworkInterfacesModel {\n");
    
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    ipv6Addresses: ").append(toIndentedString(ipv6Addresses)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
    sb.append("    privateIpAddresses: ").append(toIndentedString(privateIpAddresses)).append("\n");
    sb.append("    sourceDestCheck: ").append(toIndentedString(sourceDestCheck)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
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

