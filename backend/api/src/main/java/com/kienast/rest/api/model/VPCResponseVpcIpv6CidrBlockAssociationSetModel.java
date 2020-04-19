package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VPCResponseVpcIpv6CidrBlockStateModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPCResponseVpcIpv6CidrBlockAssociationSetModel
 */

public class VPCResponseVpcIpv6CidrBlockAssociationSetModel   {
  @JsonProperty("AssociationId")
  private String associationId;

  @JsonProperty("Ipv6CidrBlock")
  private String ipv6CidrBlock;

  @JsonProperty("Ipv6CidrBlockState")
  private VPCResponseVpcIpv6CidrBlockStateModel ipv6CidrBlockState = null;

  @JsonProperty("NetworkBorderGroup")
  private String networkBorderGroup;

  @JsonProperty("Ipv6Pool")
  private String ipv6Pool;

  public VPCResponseVpcIpv6CidrBlockAssociationSetModel associationId(String associationId) {
    this.associationId = associationId;
    return this;
  }

  /**
   * Get associationId
   * @return associationId
  */
  @ApiModelProperty(value = "")


  public String getAssociationId() {
    return associationId;
  }

  public void setAssociationId(String associationId) {
    this.associationId = associationId;
  }

  public VPCResponseVpcIpv6CidrBlockAssociationSetModel ipv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

  /**
   * Get ipv6CidrBlock
   * @return ipv6CidrBlock
  */
  @ApiModelProperty(value = "")


  public String getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }

  public void setIpv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }

  public VPCResponseVpcIpv6CidrBlockAssociationSetModel ipv6CidrBlockState(VPCResponseVpcIpv6CidrBlockStateModel ipv6CidrBlockState) {
    this.ipv6CidrBlockState = ipv6CidrBlockState;
    return this;
  }

  /**
   * Get ipv6CidrBlockState
   * @return ipv6CidrBlockState
  */
  @ApiModelProperty(value = "")

  @Valid

  public VPCResponseVpcIpv6CidrBlockStateModel getIpv6CidrBlockState() {
    return ipv6CidrBlockState;
  }

  public void setIpv6CidrBlockState(VPCResponseVpcIpv6CidrBlockStateModel ipv6CidrBlockState) {
    this.ipv6CidrBlockState = ipv6CidrBlockState;
  }

  public VPCResponseVpcIpv6CidrBlockAssociationSetModel networkBorderGroup(String networkBorderGroup) {
    this.networkBorderGroup = networkBorderGroup;
    return this;
  }

  /**
   * Get networkBorderGroup
   * @return networkBorderGroup
  */
  @ApiModelProperty(value = "")


  public String getNetworkBorderGroup() {
    return networkBorderGroup;
  }

  public void setNetworkBorderGroup(String networkBorderGroup) {
    this.networkBorderGroup = networkBorderGroup;
  }

  public VPCResponseVpcIpv6CidrBlockAssociationSetModel ipv6Pool(String ipv6Pool) {
    this.ipv6Pool = ipv6Pool;
    return this;
  }

  /**
   * Get ipv6Pool
   * @return ipv6Pool
  */
  @ApiModelProperty(value = "")


  public String getIpv6Pool() {
    return ipv6Pool;
  }

  public void setIpv6Pool(String ipv6Pool) {
    this.ipv6Pool = ipv6Pool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCResponseVpcIpv6CidrBlockAssociationSetModel vpCResponseVpcIpv6CidrBlockAssociationSet = (VPCResponseVpcIpv6CidrBlockAssociationSetModel) o;
    return Objects.equals(this.associationId, vpCResponseVpcIpv6CidrBlockAssociationSet.associationId) &&
        Objects.equals(this.ipv6CidrBlock, vpCResponseVpcIpv6CidrBlockAssociationSet.ipv6CidrBlock) &&
        Objects.equals(this.ipv6CidrBlockState, vpCResponseVpcIpv6CidrBlockAssociationSet.ipv6CidrBlockState) &&
        Objects.equals(this.networkBorderGroup, vpCResponseVpcIpv6CidrBlockAssociationSet.networkBorderGroup) &&
        Objects.equals(this.ipv6Pool, vpCResponseVpcIpv6CidrBlockAssociationSet.ipv6Pool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationId, ipv6CidrBlock, ipv6CidrBlockState, networkBorderGroup, ipv6Pool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCResponseVpcIpv6CidrBlockAssociationSetModel {\n");
    
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");
    sb.append("    ipv6CidrBlockState: ").append(toIndentedString(ipv6CidrBlockState)).append("\n");
    sb.append("    networkBorderGroup: ").append(toIndentedString(networkBorderGroup)).append("\n");
    sb.append("    ipv6Pool: ").append(toIndentedString(ipv6Pool)).append("\n");
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

