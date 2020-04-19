package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.ReservedPricingModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OSPricingModel
 */

public class OSPricingModel   {
  @JsonProperty("ondemand")
  private BigDecimal ondemand;

  @JsonProperty("reserved")
  private ReservedPricingModel reserved = null;

  public OSPricingModel ondemand(BigDecimal ondemand) {
    this.ondemand = ondemand;
    return this;
  }

  /**
   * Get ondemand
   * @return ondemand
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOndemand() {
    return ondemand;
  }

  public void setOndemand(BigDecimal ondemand) {
    this.ondemand = ondemand;
  }

  public OSPricingModel reserved(ReservedPricingModel reserved) {
    this.reserved = reserved;
    return this;
  }

  /**
   * Get reserved
   * @return reserved
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservedPricingModel getReserved() {
    return reserved;
  }

  public void setReserved(ReservedPricingModel reserved) {
    this.reserved = reserved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSPricingModel osPricing = (OSPricingModel) o;
    return Objects.equals(this.ondemand, osPricing.ondemand) &&
        Objects.equals(this.reserved, osPricing.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ondemand, reserved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSPricingModel {\n");
    
    sb.append("    ondemand: ").append(toIndentedString(ondemand)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

