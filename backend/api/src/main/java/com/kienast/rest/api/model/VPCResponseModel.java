package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VPCResponseVpcModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPCResponseModel
 */

public class VPCResponseModel   {
  @JsonProperty("Vpc")
  private VPCResponseVpcModel vpc = null;

  public VPCResponseModel vpc(VPCResponseVpcModel vpc) {
    this.vpc = vpc;
    return this;
  }

  /**
   * Get vpc
   * @return vpc
  */
  @ApiModelProperty(value = "")

  @Valid

  public VPCResponseVpcModel getVpc() {
    return vpc;
  }

  public void setVpc(VPCResponseVpcModel vpc) {
    this.vpc = vpc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCResponseModel vpCResponse = (VPCResponseModel) o;
    return Objects.equals(this.vpc, vpCResponse.vpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCResponseModel {\n");
    
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

