package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullCpuOptionsModel
 */

public class VMResponseFullCpuOptionsModel   {
  @JsonProperty("CoreCount")
  private Integer coreCount;

  @JsonProperty("ThreadsPerCore")
  private Integer threadsPerCore;

  public VMResponseFullCpuOptionsModel coreCount(Integer coreCount) {
    this.coreCount = coreCount;
    return this;
  }

  /**
   * Get coreCount
   * @return coreCount
  */
  @ApiModelProperty(value = "")


  public Integer getCoreCount() {
    return coreCount;
  }

  public void setCoreCount(Integer coreCount) {
    this.coreCount = coreCount;
  }

  public VMResponseFullCpuOptionsModel threadsPerCore(Integer threadsPerCore) {
    this.threadsPerCore = threadsPerCore;
    return this;
  }

  /**
   * Get threadsPerCore
   * @return threadsPerCore
  */
  @ApiModelProperty(value = "")


  public Integer getThreadsPerCore() {
    return threadsPerCore;
  }

  public void setThreadsPerCore(Integer threadsPerCore) {
    this.threadsPerCore = threadsPerCore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullCpuOptionsModel vmResponseFullCpuOptions = (VMResponseFullCpuOptionsModel) o;
    return Objects.equals(this.coreCount, vmResponseFullCpuOptions.coreCount) &&
        Objects.equals(this.threadsPerCore, vmResponseFullCpuOptions.threadsPerCore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreCount, threadsPerCore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullCpuOptionsModel {\n");
    
    sb.append("    coreCount: ").append(toIndentedString(coreCount)).append("\n");
    sb.append("    threadsPerCore: ").append(toIndentedString(threadsPerCore)).append("\n");
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

