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
 * AzureInstanceTypeResponseModel
 */

public class AzureInstanceTypeResponseModel   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("number_of_cores")
  private BigDecimal numberOfCores;

  @JsonProperty("os_disk_size_in_mb")
  private BigDecimal osDiskSizeInMb;

  @JsonProperty("resource_disk_size_in_mb")
  private BigDecimal resourceDiskSizeInMb;

  @JsonProperty("memory_in_mb")
  private BigDecimal memoryInMb;

  @JsonProperty("max_data_disk_count")
  private BigDecimal maxDataDiskCount;

  public AzureInstanceTypeResponseModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AzureInstanceTypeResponseModel numberOfCores(BigDecimal numberOfCores) {
    this.numberOfCores = numberOfCores;
    return this;
  }

  /**
   * Get numberOfCores
   * @return numberOfCores
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getNumberOfCores() {
    return numberOfCores;
  }

  public void setNumberOfCores(BigDecimal numberOfCores) {
    this.numberOfCores = numberOfCores;
  }

  public AzureInstanceTypeResponseModel osDiskSizeInMb(BigDecimal osDiskSizeInMb) {
    this.osDiskSizeInMb = osDiskSizeInMb;
    return this;
  }

  /**
   * Get osDiskSizeInMb
   * @return osDiskSizeInMb
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOsDiskSizeInMb() {
    return osDiskSizeInMb;
  }

  public void setOsDiskSizeInMb(BigDecimal osDiskSizeInMb) {
    this.osDiskSizeInMb = osDiskSizeInMb;
  }

  public AzureInstanceTypeResponseModel resourceDiskSizeInMb(BigDecimal resourceDiskSizeInMb) {
    this.resourceDiskSizeInMb = resourceDiskSizeInMb;
    return this;
  }

  /**
   * Get resourceDiskSizeInMb
   * @return resourceDiskSizeInMb
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getResourceDiskSizeInMb() {
    return resourceDiskSizeInMb;
  }

  public void setResourceDiskSizeInMb(BigDecimal resourceDiskSizeInMb) {
    this.resourceDiskSizeInMb = resourceDiskSizeInMb;
  }

  public AzureInstanceTypeResponseModel memoryInMb(BigDecimal memoryInMb) {
    this.memoryInMb = memoryInMb;
    return this;
  }

  /**
   * Get memoryInMb
   * @return memoryInMb
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMemoryInMb() {
    return memoryInMb;
  }

  public void setMemoryInMb(BigDecimal memoryInMb) {
    this.memoryInMb = memoryInMb;
  }

  public AzureInstanceTypeResponseModel maxDataDiskCount(BigDecimal maxDataDiskCount) {
    this.maxDataDiskCount = maxDataDiskCount;
    return this;
  }

  /**
   * Get maxDataDiskCount
   * @return maxDataDiskCount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMaxDataDiskCount() {
    return maxDataDiskCount;
  }

  public void setMaxDataDiskCount(BigDecimal maxDataDiskCount) {
    this.maxDataDiskCount = maxDataDiskCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureInstanceTypeResponseModel azureInstanceTypeResponse = (AzureInstanceTypeResponseModel) o;
    return Objects.equals(this.name, azureInstanceTypeResponse.name) &&
        Objects.equals(this.numberOfCores, azureInstanceTypeResponse.numberOfCores) &&
        Objects.equals(this.osDiskSizeInMb, azureInstanceTypeResponse.osDiskSizeInMb) &&
        Objects.equals(this.resourceDiskSizeInMb, azureInstanceTypeResponse.resourceDiskSizeInMb) &&
        Objects.equals(this.memoryInMb, azureInstanceTypeResponse.memoryInMb) &&
        Objects.equals(this.maxDataDiskCount, azureInstanceTypeResponse.maxDataDiskCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, numberOfCores, osDiskSizeInMb, resourceDiskSizeInMb, memoryInMb, maxDataDiskCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureInstanceTypeResponseModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfCores: ").append(toIndentedString(numberOfCores)).append("\n");
    sb.append("    osDiskSizeInMb: ").append(toIndentedString(osDiskSizeInMb)).append("\n");
    sb.append("    resourceDiskSizeInMb: ").append(toIndentedString(resourceDiskSizeInMb)).append("\n");
    sb.append("    memoryInMb: ").append(toIndentedString(memoryInMb)).append("\n");
    sb.append("    maxDataDiskCount: ").append(toIndentedString(maxDataDiskCount)).append("\n");
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

