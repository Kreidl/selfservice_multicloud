package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullProductCodesModel
 */

public class VMResponseFullProductCodesModel   {
  @JsonProperty("ProductCodeId")
  private String productCodeId;

  @JsonProperty("ProductCodeType")
  private String productCodeType;

  public VMResponseFullProductCodesModel productCodeId(String productCodeId) {
    this.productCodeId = productCodeId;
    return this;
  }

  /**
   * Get productCodeId
   * @return productCodeId
  */
  @ApiModelProperty(value = "")


  public String getProductCodeId() {
    return productCodeId;
  }

  public void setProductCodeId(String productCodeId) {
    this.productCodeId = productCodeId;
  }

  public VMResponseFullProductCodesModel productCodeType(String productCodeType) {
    this.productCodeType = productCodeType;
    return this;
  }

  /**
   * Get productCodeType
   * @return productCodeType
  */
  @ApiModelProperty(value = "")


  public String getProductCodeType() {
    return productCodeType;
  }

  public void setProductCodeType(String productCodeType) {
    this.productCodeType = productCodeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullProductCodesModel vmResponseFullProductCodes = (VMResponseFullProductCodesModel) o;
    return Objects.equals(this.productCodeId, vmResponseFullProductCodes.productCodeId) &&
        Objects.equals(this.productCodeType, vmResponseFullProductCodes.productCodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCodeId, productCodeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullProductCodesModel {\n");
    
    sb.append("    productCodeId: ").append(toIndentedString(productCodeId)).append("\n");
    sb.append("    productCodeType: ").append(toIndentedString(productCodeType)).append("\n");
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

