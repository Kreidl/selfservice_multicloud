package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VPCResponseVpcCidrBlockAssociationSetModel;
import com.kienast.rest.api.model.VPCResponseVpcIpv6CidrBlockAssociationSetModel;
import com.kienast.rest.api.model.VPCResponseVpcTagsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPCResponseVpcModel
 */

public class VPCResponseVpcModel   {
  @JsonProperty("CidrBlock")
  private String cidrBlock;

  @JsonProperty("DhcpOptionsId")
  private String dhcpOptionsId;

  @JsonProperty("State")
  private String state;

  @JsonProperty("VpcId")
  private String vpcId;

  @JsonProperty("OwnerId")
  private String ownerId;

  @JsonProperty("InstanceTenancy")
  private String instanceTenancy;

  @JsonProperty("Ipv6CidrBlockAssociationSet")
  @Valid
  private List<VPCResponseVpcIpv6CidrBlockAssociationSetModel> ipv6CidrBlockAssociationSet = null;

  @JsonProperty("CidrBlockAssociationSet")
  @Valid
  private List<VPCResponseVpcCidrBlockAssociationSetModel> cidrBlockAssociationSet = null;

  @JsonProperty("IsDefault")
  private Boolean isDefault;

  @JsonProperty("Tags")
  @Valid
  private List<VPCResponseVpcTagsModel> tags = null;

  public VPCResponseVpcModel cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

  /**
   * Get cidrBlock
   * @return cidrBlock
  */
  @ApiModelProperty(value = "")


  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public VPCResponseVpcModel dhcpOptionsId(String dhcpOptionsId) {
    this.dhcpOptionsId = dhcpOptionsId;
    return this;
  }

  /**
   * Get dhcpOptionsId
   * @return dhcpOptionsId
  */
  @ApiModelProperty(value = "")


  public String getDhcpOptionsId() {
    return dhcpOptionsId;
  }

  public void setDhcpOptionsId(String dhcpOptionsId) {
    this.dhcpOptionsId = dhcpOptionsId;
  }

  public VPCResponseVpcModel state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public VPCResponseVpcModel vpcId(String vpcId) {
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

  public VPCResponseVpcModel ownerId(String ownerId) {
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

  public VPCResponseVpcModel instanceTenancy(String instanceTenancy) {
    this.instanceTenancy = instanceTenancy;
    return this;
  }

  /**
   * Get instanceTenancy
   * @return instanceTenancy
  */
  @ApiModelProperty(value = "")


  public String getInstanceTenancy() {
    return instanceTenancy;
  }

  public void setInstanceTenancy(String instanceTenancy) {
    this.instanceTenancy = instanceTenancy;
  }

  public VPCResponseVpcModel ipv6CidrBlockAssociationSet(List<VPCResponseVpcIpv6CidrBlockAssociationSetModel> ipv6CidrBlockAssociationSet) {
    this.ipv6CidrBlockAssociationSet = ipv6CidrBlockAssociationSet;
    return this;
  }

  public VPCResponseVpcModel addIpv6CidrBlockAssociationSetItem(VPCResponseVpcIpv6CidrBlockAssociationSetModel ipv6CidrBlockAssociationSetItem) {
    if (this.ipv6CidrBlockAssociationSet == null) {
      this.ipv6CidrBlockAssociationSet = new ArrayList<VPCResponseVpcIpv6CidrBlockAssociationSetModel>();
    }
    this.ipv6CidrBlockAssociationSet.add(ipv6CidrBlockAssociationSetItem);
    return this;
  }

  /**
   * Get ipv6CidrBlockAssociationSet
   * @return ipv6CidrBlockAssociationSet
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCResponseVpcIpv6CidrBlockAssociationSetModel> getIpv6CidrBlockAssociationSet() {
    return ipv6CidrBlockAssociationSet;
  }

  public void setIpv6CidrBlockAssociationSet(List<VPCResponseVpcIpv6CidrBlockAssociationSetModel> ipv6CidrBlockAssociationSet) {
    this.ipv6CidrBlockAssociationSet = ipv6CidrBlockAssociationSet;
  }

  public VPCResponseVpcModel cidrBlockAssociationSet(List<VPCResponseVpcCidrBlockAssociationSetModel> cidrBlockAssociationSet) {
    this.cidrBlockAssociationSet = cidrBlockAssociationSet;
    return this;
  }

  public VPCResponseVpcModel addCidrBlockAssociationSetItem(VPCResponseVpcCidrBlockAssociationSetModel cidrBlockAssociationSetItem) {
    if (this.cidrBlockAssociationSet == null) {
      this.cidrBlockAssociationSet = new ArrayList<VPCResponseVpcCidrBlockAssociationSetModel>();
    }
    this.cidrBlockAssociationSet.add(cidrBlockAssociationSetItem);
    return this;
  }

  /**
   * Get cidrBlockAssociationSet
   * @return cidrBlockAssociationSet
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCResponseVpcCidrBlockAssociationSetModel> getCidrBlockAssociationSet() {
    return cidrBlockAssociationSet;
  }

  public void setCidrBlockAssociationSet(List<VPCResponseVpcCidrBlockAssociationSetModel> cidrBlockAssociationSet) {
    this.cidrBlockAssociationSet = cidrBlockAssociationSet;
  }

  public VPCResponseVpcModel isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
  */
  @ApiModelProperty(value = "")


  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public VPCResponseVpcModel tags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
    return this;
  }

  public VPCResponseVpcModel addTagsItem(VPCResponseVpcTagsModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<VPCResponseVpcTagsModel>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCResponseVpcTagsModel> getTags() {
    return tags;
  }

  public void setTags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCResponseVpcModel vpCResponseVpc = (VPCResponseVpcModel) o;
    return Objects.equals(this.cidrBlock, vpCResponseVpc.cidrBlock) &&
        Objects.equals(this.dhcpOptionsId, vpCResponseVpc.dhcpOptionsId) &&
        Objects.equals(this.state, vpCResponseVpc.state) &&
        Objects.equals(this.vpcId, vpCResponseVpc.vpcId) &&
        Objects.equals(this.ownerId, vpCResponseVpc.ownerId) &&
        Objects.equals(this.instanceTenancy, vpCResponseVpc.instanceTenancy) &&
        Objects.equals(this.ipv6CidrBlockAssociationSet, vpCResponseVpc.ipv6CidrBlockAssociationSet) &&
        Objects.equals(this.cidrBlockAssociationSet, vpCResponseVpc.cidrBlockAssociationSet) &&
        Objects.equals(this.isDefault, vpCResponseVpc.isDefault) &&
        Objects.equals(this.tags, vpCResponseVpc.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, dhcpOptionsId, state, vpcId, ownerId, instanceTenancy, ipv6CidrBlockAssociationSet, cidrBlockAssociationSet, isDefault, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCResponseVpcModel {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    dhcpOptionsId: ").append(toIndentedString(dhcpOptionsId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    instanceTenancy: ").append(toIndentedString(instanceTenancy)).append("\n");
    sb.append("    ipv6CidrBlockAssociationSet: ").append(toIndentedString(ipv6CidrBlockAssociationSet)).append("\n");
    sb.append("    cidrBlockAssociationSet: ").append(toIndentedString(cidrBlockAssociationSet)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

