package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.InstanceTypeResponsePricingModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstanceTypeResponseTypesModel
 */

public class InstanceTypeResponseTypesModel   {
  @JsonProperty("ebs_iops")
  private Integer ebsIops;

  @JsonProperty("instance_type")
  private String instanceType;

  @JsonProperty("memory")
  private BigDecimal memory;

  @JsonProperty("network_performance")
  private String networkPerformance;

  @JsonProperty("pretty_name")
  private String prettyName;

  @JsonProperty("vCPU")
  private Integer vCPU;

  @JsonProperty("pricing")
  private InstanceTypeResponsePricingModel pricing = null;

  public InstanceTypeResponseTypesModel ebsIops(Integer ebsIops) {
    this.ebsIops = ebsIops;
    return this;
  }

  /**
   * Get ebsIops
   * @return ebsIops
  */
  @ApiModelProperty(value = "")


  public Integer getEbsIops() {
    return ebsIops;
  }

  public void setEbsIops(Integer ebsIops) {
    this.ebsIops = ebsIops;
  }

  public InstanceTypeResponseTypesModel instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Get instanceType
   * @return instanceType
  */
  @ApiModelProperty(value = "")


  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public InstanceTypeResponseTypesModel memory(BigDecimal memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMemory() {
    return memory;
  }

  public void setMemory(BigDecimal memory) {
    this.memory = memory;
  }

  public InstanceTypeResponseTypesModel networkPerformance(String networkPerformance) {
    this.networkPerformance = networkPerformance;
    return this;
  }

  /**
   * Get networkPerformance
   * @return networkPerformance
  */
  @ApiModelProperty(value = "")


  public String getNetworkPerformance() {
    return networkPerformance;
  }

  public void setNetworkPerformance(String networkPerformance) {
    this.networkPerformance = networkPerformance;
  }

  public InstanceTypeResponseTypesModel prettyName(String prettyName) {
    this.prettyName = prettyName;
    return this;
  }

  /**
   * Get prettyName
   * @return prettyName
  */
  @ApiModelProperty(value = "")


  public String getPrettyName() {
    return prettyName;
  }

  public void setPrettyName(String prettyName) {
    this.prettyName = prettyName;
  }

  public InstanceTypeResponseTypesModel vCPU(Integer vCPU) {
    this.vCPU = vCPU;
    return this;
  }

  /**
   * Get vCPU
   * @return vCPU
  */
  @ApiModelProperty(value = "")


  public Integer getVCPU() {
    return vCPU;
  }

  public void setVCPU(Integer vCPU) {
    this.vCPU = vCPU;
  }

  public InstanceTypeResponseTypesModel pricing(InstanceTypeResponsePricingModel pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  */
  @ApiModelProperty(value = "")

  @Valid

  public InstanceTypeResponsePricingModel getPricing() {
    return pricing;
  }

  public void setPricing(InstanceTypeResponsePricingModel pricing) {
    this.pricing = pricing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTypeResponseTypesModel instanceTypeResponseTypes = (InstanceTypeResponseTypesModel) o;
    return Objects.equals(this.ebsIops, instanceTypeResponseTypes.ebsIops) &&
        Objects.equals(this.instanceType, instanceTypeResponseTypes.instanceType) &&
        Objects.equals(this.memory, instanceTypeResponseTypes.memory) &&
        Objects.equals(this.networkPerformance, instanceTypeResponseTypes.networkPerformance) &&
        Objects.equals(this.prettyName, instanceTypeResponseTypes.prettyName) &&
        Objects.equals(this.vCPU, instanceTypeResponseTypes.vCPU) &&
        Objects.equals(this.pricing, instanceTypeResponseTypes.pricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebsIops, instanceType, memory, networkPerformance, prettyName, vCPU, pricing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTypeResponseTypesModel {\n");
    
    sb.append("    ebsIops: ").append(toIndentedString(ebsIops)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    networkPerformance: ").append(toIndentedString(networkPerformance)).append("\n");
    sb.append("    prettyName: ").append(toIndentedString(prettyName)).append("\n");
    sb.append("    vCPU: ").append(toIndentedString(vCPU)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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

