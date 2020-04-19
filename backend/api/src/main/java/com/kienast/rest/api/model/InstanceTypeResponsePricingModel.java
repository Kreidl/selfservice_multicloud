package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.InstanceTypeResponsePricingEucentral1Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstanceTypeResponsePricingModel
 */

public class InstanceTypeResponsePricingModel   {
  @JsonProperty("eu-central-1")
  private InstanceTypeResponsePricingEucentral1Model euCentral1 = null;

  public InstanceTypeResponsePricingModel euCentral1(InstanceTypeResponsePricingEucentral1Model euCentral1) {
    this.euCentral1 = euCentral1;
    return this;
  }

  /**
   * Get euCentral1
   * @return euCentral1
  */
  @ApiModelProperty(value = "")

  @Valid

  public InstanceTypeResponsePricingEucentral1Model getEuCentral1() {
    return euCentral1;
  }

  public void setEuCentral1(InstanceTypeResponsePricingEucentral1Model euCentral1) {
    this.euCentral1 = euCentral1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTypeResponsePricingModel instanceTypeResponsePricing = (InstanceTypeResponsePricingModel) o;
    return Objects.equals(this.euCentral1, instanceTypeResponsePricing.euCentral1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(euCentral1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTypeResponsePricingModel {\n");
    
    sb.append("    euCentral1: ").append(toIndentedString(euCentral1)).append("\n");
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

