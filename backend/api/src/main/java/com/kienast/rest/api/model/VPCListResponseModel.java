package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VPCListResponseVpcsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPCListResponseModel
 */

public class VPCListResponseModel   {
  @JsonProperty("vpcs")
  @Valid
  private List<VPCListResponseVpcsModel> vpcs = null;

  public VPCListResponseModel vpcs(List<VPCListResponseVpcsModel> vpcs) {
    this.vpcs = vpcs;
    return this;
  }

  public VPCListResponseModel addVpcsItem(VPCListResponseVpcsModel vpcsItem) {
    if (this.vpcs == null) {
      this.vpcs = new ArrayList<VPCListResponseVpcsModel>();
    }
    this.vpcs.add(vpcsItem);
    return this;
  }

  /**
   * Get vpcs
   * @return vpcs
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCListResponseVpcsModel> getVpcs() {
    return vpcs;
  }

  public void setVpcs(List<VPCListResponseVpcsModel> vpcs) {
    this.vpcs = vpcs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCListResponseModel vpCListResponse = (VPCListResponseModel) o;
    return Objects.equals(this.vpcs, vpCListResponse.vpcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCListResponseModel {\n");
    
    sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
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

