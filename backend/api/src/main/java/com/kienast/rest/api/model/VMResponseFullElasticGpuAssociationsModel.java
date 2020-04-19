package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullElasticGpuAssociationsModel
 */

public class VMResponseFullElasticGpuAssociationsModel   {
  @JsonProperty("ElasticGpuId")
  private String elasticGpuId;

  @JsonProperty("ElasticGpuAssociationId")
  private String elasticGpuAssociationId;

  @JsonProperty("ElasticGpuAssociationState")
  private String elasticGpuAssociationState;

  @JsonProperty("ElasticGpuAssociationTime")
  private String elasticGpuAssociationTime;

  public VMResponseFullElasticGpuAssociationsModel elasticGpuId(String elasticGpuId) {
    this.elasticGpuId = elasticGpuId;
    return this;
  }

  /**
   * Get elasticGpuId
   * @return elasticGpuId
  */
  @ApiModelProperty(value = "")


  public String getElasticGpuId() {
    return elasticGpuId;
  }

  public void setElasticGpuId(String elasticGpuId) {
    this.elasticGpuId = elasticGpuId;
  }

  public VMResponseFullElasticGpuAssociationsModel elasticGpuAssociationId(String elasticGpuAssociationId) {
    this.elasticGpuAssociationId = elasticGpuAssociationId;
    return this;
  }

  /**
   * Get elasticGpuAssociationId
   * @return elasticGpuAssociationId
  */
  @ApiModelProperty(value = "")


  public String getElasticGpuAssociationId() {
    return elasticGpuAssociationId;
  }

  public void setElasticGpuAssociationId(String elasticGpuAssociationId) {
    this.elasticGpuAssociationId = elasticGpuAssociationId;
  }

  public VMResponseFullElasticGpuAssociationsModel elasticGpuAssociationState(String elasticGpuAssociationState) {
    this.elasticGpuAssociationState = elasticGpuAssociationState;
    return this;
  }

  /**
   * Get elasticGpuAssociationState
   * @return elasticGpuAssociationState
  */
  @ApiModelProperty(value = "")


  public String getElasticGpuAssociationState() {
    return elasticGpuAssociationState;
  }

  public void setElasticGpuAssociationState(String elasticGpuAssociationState) {
    this.elasticGpuAssociationState = elasticGpuAssociationState;
  }

  public VMResponseFullElasticGpuAssociationsModel elasticGpuAssociationTime(String elasticGpuAssociationTime) {
    this.elasticGpuAssociationTime = elasticGpuAssociationTime;
    return this;
  }

  /**
   * Get elasticGpuAssociationTime
   * @return elasticGpuAssociationTime
  */
  @ApiModelProperty(value = "")


  public String getElasticGpuAssociationTime() {
    return elasticGpuAssociationTime;
  }

  public void setElasticGpuAssociationTime(String elasticGpuAssociationTime) {
    this.elasticGpuAssociationTime = elasticGpuAssociationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullElasticGpuAssociationsModel vmResponseFullElasticGpuAssociations = (VMResponseFullElasticGpuAssociationsModel) o;
    return Objects.equals(this.elasticGpuId, vmResponseFullElasticGpuAssociations.elasticGpuId) &&
        Objects.equals(this.elasticGpuAssociationId, vmResponseFullElasticGpuAssociations.elasticGpuAssociationId) &&
        Objects.equals(this.elasticGpuAssociationState, vmResponseFullElasticGpuAssociations.elasticGpuAssociationState) &&
        Objects.equals(this.elasticGpuAssociationTime, vmResponseFullElasticGpuAssociations.elasticGpuAssociationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticGpuId, elasticGpuAssociationId, elasticGpuAssociationState, elasticGpuAssociationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullElasticGpuAssociationsModel {\n");
    
    sb.append("    elasticGpuId: ").append(toIndentedString(elasticGpuId)).append("\n");
    sb.append("    elasticGpuAssociationId: ").append(toIndentedString(elasticGpuAssociationId)).append("\n");
    sb.append("    elasticGpuAssociationState: ").append(toIndentedString(elasticGpuAssociationState)).append("\n");
    sb.append("    elasticGpuAssociationTime: ").append(toIndentedString(elasticGpuAssociationTime)).append("\n");
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

