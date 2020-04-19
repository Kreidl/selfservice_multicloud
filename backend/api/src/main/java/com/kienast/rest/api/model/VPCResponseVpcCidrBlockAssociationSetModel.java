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
 * VPCResponseVpcCidrBlockAssociationSetModel
 */

public class VPCResponseVpcCidrBlockAssociationSetModel   {
  @JsonProperty("AssociationId")
  private String associationId;

  @JsonProperty("CidrBlock")
  private String cidrBlock;

  @JsonProperty("CidrBlockState")
  private VPCResponseVpcIpv6CidrBlockStateModel cidrBlockState = null;

  public VPCResponseVpcCidrBlockAssociationSetModel associationId(String associationId) {
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

  public VPCResponseVpcCidrBlockAssociationSetModel cidrBlock(String cidrBlock) {
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

  public VPCResponseVpcCidrBlockAssociationSetModel cidrBlockState(VPCResponseVpcIpv6CidrBlockStateModel cidrBlockState) {
    this.cidrBlockState = cidrBlockState;
    return this;
  }

  /**
   * Get cidrBlockState
   * @return cidrBlockState
  */
  @ApiModelProperty(value = "")

  @Valid

  public VPCResponseVpcIpv6CidrBlockStateModel getCidrBlockState() {
    return cidrBlockState;
  }

  public void setCidrBlockState(VPCResponseVpcIpv6CidrBlockStateModel cidrBlockState) {
    this.cidrBlockState = cidrBlockState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCResponseVpcCidrBlockAssociationSetModel vpCResponseVpcCidrBlockAssociationSet = (VPCResponseVpcCidrBlockAssociationSetModel) o;
    return Objects.equals(this.associationId, vpCResponseVpcCidrBlockAssociationSet.associationId) &&
        Objects.equals(this.cidrBlock, vpCResponseVpcCidrBlockAssociationSet.cidrBlock) &&
        Objects.equals(this.cidrBlockState, vpCResponseVpcCidrBlockAssociationSet.cidrBlockState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationId, cidrBlock, cidrBlockState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCResponseVpcCidrBlockAssociationSetModel {\n");
    
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    cidrBlockState: ").append(toIndentedString(cidrBlockState)).append("\n");
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

