package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservedPricingModel
 */

public class ReservedPricingModel   {
  @JsonProperty("yrTerm1Convertible.allUpfront")
  private BigDecimal yrTerm1ConvertibleAllUpfront;

  @JsonProperty("yrTerm1Convertible.noUpfront")
  private BigDecimal yrTerm1ConvertibleNoUpfront;

  @JsonProperty("yrTerm1Convertible.partialUpfront")
  private BigDecimal yrTerm1ConvertiblePartialUpfront;

  @JsonProperty("yrTerm1Standard.allUpfront")
  private BigDecimal yrTerm1StandardAllUpfront;

  @JsonProperty("yrTerm1Standard.noUpfront")
  private BigDecimal yrTerm1StandardNoUpfront;

  @JsonProperty("yrTerm1Standard.partialUpfront")
  private BigDecimal yrTerm1StandardPartialUpfront;

  @JsonProperty("yrTerm3Convertible.allUpfront")
  private BigDecimal yrTerm3ConvertibleAllUpfront;

  @JsonProperty("yrTerm3Convertible.noUpfront")
  private BigDecimal yrTerm3ConvertibleNoUpfront;

  @JsonProperty("yrTerm3Convertible.partialUpfront")
  private BigDecimal yrTerm3ConvertiblePartialUpfront;

  @JsonProperty("yrTerm3Standard.allUpfront")
  private BigDecimal yrTerm3StandardAllUpfront;

  @JsonProperty("yrTerm3Standard.noUpfront")
  private BigDecimal yrTerm3StandardNoUpfront;

  @JsonProperty("yrTerm3Standard.partialUpfront")
  private BigDecimal yrTerm3StandardPartialUpfront;

  public ReservedPricingModel yrTerm1ConvertibleAllUpfront(BigDecimal yrTerm1ConvertibleAllUpfront) {
    this.yrTerm1ConvertibleAllUpfront = yrTerm1ConvertibleAllUpfront;
    return this;
  }

  /**
   * Get yrTerm1ConvertibleAllUpfront
   * @return yrTerm1ConvertibleAllUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm1ConvertibleAllUpfront() {
    return yrTerm1ConvertibleAllUpfront;
  }

  public void setYrTerm1ConvertibleAllUpfront(BigDecimal yrTerm1ConvertibleAllUpfront) {
    this.yrTerm1ConvertibleAllUpfront = yrTerm1ConvertibleAllUpfront;
  }

  public ReservedPricingModel yrTerm1ConvertibleNoUpfront(BigDecimal yrTerm1ConvertibleNoUpfront) {
    this.yrTerm1ConvertibleNoUpfront = yrTerm1ConvertibleNoUpfront;
    return this;
  }

  /**
   * Get yrTerm1ConvertibleNoUpfront
   * @return yrTerm1ConvertibleNoUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm1ConvertibleNoUpfront() {
    return yrTerm1ConvertibleNoUpfront;
  }

  public void setYrTerm1ConvertibleNoUpfront(BigDecimal yrTerm1ConvertibleNoUpfront) {
    this.yrTerm1ConvertibleNoUpfront = yrTerm1ConvertibleNoUpfront;
  }

  public ReservedPricingModel yrTerm1ConvertiblePartialUpfront(BigDecimal yrTerm1ConvertiblePartialUpfront) {
    this.yrTerm1ConvertiblePartialUpfront = yrTerm1ConvertiblePartialUpfront;
    return this;
  }

  /**
   * Get yrTerm1ConvertiblePartialUpfront
   * @return yrTerm1ConvertiblePartialUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm1ConvertiblePartialUpfront() {
    return yrTerm1ConvertiblePartialUpfront;
  }

  public void setYrTerm1ConvertiblePartialUpfront(BigDecimal yrTerm1ConvertiblePartialUpfront) {
    this.yrTerm1ConvertiblePartialUpfront = yrTerm1ConvertiblePartialUpfront;
  }

  public ReservedPricingModel yrTerm1StandardAllUpfront(BigDecimal yrTerm1StandardAllUpfront) {
    this.yrTerm1StandardAllUpfront = yrTerm1StandardAllUpfront;
    return this;
  }

  /**
   * Get yrTerm1StandardAllUpfront
   * @return yrTerm1StandardAllUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm1StandardAllUpfront() {
    return yrTerm1StandardAllUpfront;
  }

  public void setYrTerm1StandardAllUpfront(BigDecimal yrTerm1StandardAllUpfront) {
    this.yrTerm1StandardAllUpfront = yrTerm1StandardAllUpfront;
  }

  public ReservedPricingModel yrTerm1StandardNoUpfront(BigDecimal yrTerm1StandardNoUpfront) {
    this.yrTerm1StandardNoUpfront = yrTerm1StandardNoUpfront;
    return this;
  }

  /**
   * Get yrTerm1StandardNoUpfront
   * @return yrTerm1StandardNoUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm1StandardNoUpfront() {
    return yrTerm1StandardNoUpfront;
  }

  public void setYrTerm1StandardNoUpfront(BigDecimal yrTerm1StandardNoUpfront) {
    this.yrTerm1StandardNoUpfront = yrTerm1StandardNoUpfront;
  }

  public ReservedPricingModel yrTerm1StandardPartialUpfront(BigDecimal yrTerm1StandardPartialUpfront) {
    this.yrTerm1StandardPartialUpfront = yrTerm1StandardPartialUpfront;
    return this;
  }

  /**
   * Get yrTerm1StandardPartialUpfront
   * @return yrTerm1StandardPartialUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm1StandardPartialUpfront() {
    return yrTerm1StandardPartialUpfront;
  }

  public void setYrTerm1StandardPartialUpfront(BigDecimal yrTerm1StandardPartialUpfront) {
    this.yrTerm1StandardPartialUpfront = yrTerm1StandardPartialUpfront;
  }

  public ReservedPricingModel yrTerm3ConvertibleAllUpfront(BigDecimal yrTerm3ConvertibleAllUpfront) {
    this.yrTerm3ConvertibleAllUpfront = yrTerm3ConvertibleAllUpfront;
    return this;
  }

  /**
   * Get yrTerm3ConvertibleAllUpfront
   * @return yrTerm3ConvertibleAllUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm3ConvertibleAllUpfront() {
    return yrTerm3ConvertibleAllUpfront;
  }

  public void setYrTerm3ConvertibleAllUpfront(BigDecimal yrTerm3ConvertibleAllUpfront) {
    this.yrTerm3ConvertibleAllUpfront = yrTerm3ConvertibleAllUpfront;
  }

  public ReservedPricingModel yrTerm3ConvertibleNoUpfront(BigDecimal yrTerm3ConvertibleNoUpfront) {
    this.yrTerm3ConvertibleNoUpfront = yrTerm3ConvertibleNoUpfront;
    return this;
  }

  /**
   * Get yrTerm3ConvertibleNoUpfront
   * @return yrTerm3ConvertibleNoUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm3ConvertibleNoUpfront() {
    return yrTerm3ConvertibleNoUpfront;
  }

  public void setYrTerm3ConvertibleNoUpfront(BigDecimal yrTerm3ConvertibleNoUpfront) {
    this.yrTerm3ConvertibleNoUpfront = yrTerm3ConvertibleNoUpfront;
  }

  public ReservedPricingModel yrTerm3ConvertiblePartialUpfront(BigDecimal yrTerm3ConvertiblePartialUpfront) {
    this.yrTerm3ConvertiblePartialUpfront = yrTerm3ConvertiblePartialUpfront;
    return this;
  }

  /**
   * Get yrTerm3ConvertiblePartialUpfront
   * @return yrTerm3ConvertiblePartialUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm3ConvertiblePartialUpfront() {
    return yrTerm3ConvertiblePartialUpfront;
  }

  public void setYrTerm3ConvertiblePartialUpfront(BigDecimal yrTerm3ConvertiblePartialUpfront) {
    this.yrTerm3ConvertiblePartialUpfront = yrTerm3ConvertiblePartialUpfront;
  }

  public ReservedPricingModel yrTerm3StandardAllUpfront(BigDecimal yrTerm3StandardAllUpfront) {
    this.yrTerm3StandardAllUpfront = yrTerm3StandardAllUpfront;
    return this;
  }

  /**
   * Get yrTerm3StandardAllUpfront
   * @return yrTerm3StandardAllUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm3StandardAllUpfront() {
    return yrTerm3StandardAllUpfront;
  }

  public void setYrTerm3StandardAllUpfront(BigDecimal yrTerm3StandardAllUpfront) {
    this.yrTerm3StandardAllUpfront = yrTerm3StandardAllUpfront;
  }

  public ReservedPricingModel yrTerm3StandardNoUpfront(BigDecimal yrTerm3StandardNoUpfront) {
    this.yrTerm3StandardNoUpfront = yrTerm3StandardNoUpfront;
    return this;
  }

  /**
   * Get yrTerm3StandardNoUpfront
   * @return yrTerm3StandardNoUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm3StandardNoUpfront() {
    return yrTerm3StandardNoUpfront;
  }

  public void setYrTerm3StandardNoUpfront(BigDecimal yrTerm3StandardNoUpfront) {
    this.yrTerm3StandardNoUpfront = yrTerm3StandardNoUpfront;
  }

  public ReservedPricingModel yrTerm3StandardPartialUpfront(BigDecimal yrTerm3StandardPartialUpfront) {
    this.yrTerm3StandardPartialUpfront = yrTerm3StandardPartialUpfront;
    return this;
  }

  /**
   * Get yrTerm3StandardPartialUpfront
   * @return yrTerm3StandardPartialUpfront
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYrTerm3StandardPartialUpfront() {
    return yrTerm3StandardPartialUpfront;
  }

  public void setYrTerm3StandardPartialUpfront(BigDecimal yrTerm3StandardPartialUpfront) {
    this.yrTerm3StandardPartialUpfront = yrTerm3StandardPartialUpfront;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedPricingModel reservedPricing = (ReservedPricingModel) o;
    return Objects.equals(this.yrTerm1ConvertibleAllUpfront, reservedPricing.yrTerm1ConvertibleAllUpfront) &&
        Objects.equals(this.yrTerm1ConvertibleNoUpfront, reservedPricing.yrTerm1ConvertibleNoUpfront) &&
        Objects.equals(this.yrTerm1ConvertiblePartialUpfront, reservedPricing.yrTerm1ConvertiblePartialUpfront) &&
        Objects.equals(this.yrTerm1StandardAllUpfront, reservedPricing.yrTerm1StandardAllUpfront) &&
        Objects.equals(this.yrTerm1StandardNoUpfront, reservedPricing.yrTerm1StandardNoUpfront) &&
        Objects.equals(this.yrTerm1StandardPartialUpfront, reservedPricing.yrTerm1StandardPartialUpfront) &&
        Objects.equals(this.yrTerm3ConvertibleAllUpfront, reservedPricing.yrTerm3ConvertibleAllUpfront) &&
        Objects.equals(this.yrTerm3ConvertibleNoUpfront, reservedPricing.yrTerm3ConvertibleNoUpfront) &&
        Objects.equals(this.yrTerm3ConvertiblePartialUpfront, reservedPricing.yrTerm3ConvertiblePartialUpfront) &&
        Objects.equals(this.yrTerm3StandardAllUpfront, reservedPricing.yrTerm3StandardAllUpfront) &&
        Objects.equals(this.yrTerm3StandardNoUpfront, reservedPricing.yrTerm3StandardNoUpfront) &&
        Objects.equals(this.yrTerm3StandardPartialUpfront, reservedPricing.yrTerm3StandardPartialUpfront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yrTerm1ConvertibleAllUpfront, yrTerm1ConvertibleNoUpfront, yrTerm1ConvertiblePartialUpfront, yrTerm1StandardAllUpfront, yrTerm1StandardNoUpfront, yrTerm1StandardPartialUpfront, yrTerm3ConvertibleAllUpfront, yrTerm3ConvertibleNoUpfront, yrTerm3ConvertiblePartialUpfront, yrTerm3StandardAllUpfront, yrTerm3StandardNoUpfront, yrTerm3StandardPartialUpfront);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedPricingModel {\n");
    
    sb.append("    yrTerm1ConvertibleAllUpfront: ").append(toIndentedString(yrTerm1ConvertibleAllUpfront)).append("\n");
    sb.append("    yrTerm1ConvertibleNoUpfront: ").append(toIndentedString(yrTerm1ConvertibleNoUpfront)).append("\n");
    sb.append("    yrTerm1ConvertiblePartialUpfront: ").append(toIndentedString(yrTerm1ConvertiblePartialUpfront)).append("\n");
    sb.append("    yrTerm1StandardAllUpfront: ").append(toIndentedString(yrTerm1StandardAllUpfront)).append("\n");
    sb.append("    yrTerm1StandardNoUpfront: ").append(toIndentedString(yrTerm1StandardNoUpfront)).append("\n");
    sb.append("    yrTerm1StandardPartialUpfront: ").append(toIndentedString(yrTerm1StandardPartialUpfront)).append("\n");
    sb.append("    yrTerm3ConvertibleAllUpfront: ").append(toIndentedString(yrTerm3ConvertibleAllUpfront)).append("\n");
    sb.append("    yrTerm3ConvertibleNoUpfront: ").append(toIndentedString(yrTerm3ConvertibleNoUpfront)).append("\n");
    sb.append("    yrTerm3ConvertiblePartialUpfront: ").append(toIndentedString(yrTerm3ConvertiblePartialUpfront)).append("\n");
    sb.append("    yrTerm3StandardAllUpfront: ").append(toIndentedString(yrTerm3StandardAllUpfront)).append("\n");
    sb.append("    yrTerm3StandardNoUpfront: ").append(toIndentedString(yrTerm3StandardNoUpfront)).append("\n");
    sb.append("    yrTerm3StandardPartialUpfront: ").append(toIndentedString(yrTerm3StandardPartialUpfront)).append("\n");
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

