package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.OSPricingModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstanceTypeResponsePricingEucentral1Model
 */

public class InstanceTypeResponsePricingEucentral1Model   {
  @JsonProperty("linux")
  private OSPricingModel linux = null;

  @JsonProperty("mswin")
  private OSPricingModel mswin = null;

  public InstanceTypeResponsePricingEucentral1Model linux(OSPricingModel linux) {
    this.linux = linux;
    return this;
  }

  /**
   * Get linux
   * @return linux
  */
  @ApiModelProperty(value = "")

  @Valid

  public OSPricingModel getLinux() {
    return linux;
  }

  public void setLinux(OSPricingModel linux) {
    this.linux = linux;
  }

  public InstanceTypeResponsePricingEucentral1Model mswin(OSPricingModel mswin) {
    this.mswin = mswin;
    return this;
  }

  /**
   * Get mswin
   * @return mswin
  */
  @ApiModelProperty(value = "")

  @Valid

  public OSPricingModel getMswin() {
    return mswin;
  }

  public void setMswin(OSPricingModel mswin) {
    this.mswin = mswin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTypeResponsePricingEucentral1Model instanceTypeResponsePricingEucentral1 = (InstanceTypeResponsePricingEucentral1Model) o;
    return Objects.equals(this.linux, instanceTypeResponsePricingEucentral1.linux) &&
        Objects.equals(this.mswin, instanceTypeResponsePricingEucentral1.mswin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linux, mswin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTypeResponsePricingEucentral1Model {\n");
    
    sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
    sb.append("    mswin: ").append(toIndentedString(mswin)).append("\n");
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

