package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullElasticInferenceAcceleratorAssociationsModel
 */

public class VMResponseFullElasticInferenceAcceleratorAssociationsModel   {
  @JsonProperty("ElasticInferenceAcceleratorArn")
  private String elasticInferenceAcceleratorArn;

  @JsonProperty("ElasticInferenceAcceleratorAssociationId")
  private String elasticInferenceAcceleratorAssociationId;

  @JsonProperty("ElasticInferenceAcceleratorAssociationState")
  private String elasticInferenceAcceleratorAssociationState;

  @JsonProperty("ElasticInferenceAcceleratorAssociationTime")
  private String elasticInferenceAcceleratorAssociationTime;

  public VMResponseFullElasticInferenceAcceleratorAssociationsModel elasticInferenceAcceleratorArn(String elasticInferenceAcceleratorArn) {
    this.elasticInferenceAcceleratorArn = elasticInferenceAcceleratorArn;
    return this;
  }

  /**
   * Get elasticInferenceAcceleratorArn
   * @return elasticInferenceAcceleratorArn
  */
  @ApiModelProperty(value = "")


  public String getElasticInferenceAcceleratorArn() {
    return elasticInferenceAcceleratorArn;
  }

  public void setElasticInferenceAcceleratorArn(String elasticInferenceAcceleratorArn) {
    this.elasticInferenceAcceleratorArn = elasticInferenceAcceleratorArn;
  }

  public VMResponseFullElasticInferenceAcceleratorAssociationsModel elasticInferenceAcceleratorAssociationId(String elasticInferenceAcceleratorAssociationId) {
    this.elasticInferenceAcceleratorAssociationId = elasticInferenceAcceleratorAssociationId;
    return this;
  }

  /**
   * Get elasticInferenceAcceleratorAssociationId
   * @return elasticInferenceAcceleratorAssociationId
  */
  @ApiModelProperty(value = "")


  public String getElasticInferenceAcceleratorAssociationId() {
    return elasticInferenceAcceleratorAssociationId;
  }

  public void setElasticInferenceAcceleratorAssociationId(String elasticInferenceAcceleratorAssociationId) {
    this.elasticInferenceAcceleratorAssociationId = elasticInferenceAcceleratorAssociationId;
  }

  public VMResponseFullElasticInferenceAcceleratorAssociationsModel elasticInferenceAcceleratorAssociationState(String elasticInferenceAcceleratorAssociationState) {
    this.elasticInferenceAcceleratorAssociationState = elasticInferenceAcceleratorAssociationState;
    return this;
  }

  /**
   * Get elasticInferenceAcceleratorAssociationState
   * @return elasticInferenceAcceleratorAssociationState
  */
  @ApiModelProperty(value = "")


  public String getElasticInferenceAcceleratorAssociationState() {
    return elasticInferenceAcceleratorAssociationState;
  }

  public void setElasticInferenceAcceleratorAssociationState(String elasticInferenceAcceleratorAssociationState) {
    this.elasticInferenceAcceleratorAssociationState = elasticInferenceAcceleratorAssociationState;
  }

  public VMResponseFullElasticInferenceAcceleratorAssociationsModel elasticInferenceAcceleratorAssociationTime(String elasticInferenceAcceleratorAssociationTime) {
    this.elasticInferenceAcceleratorAssociationTime = elasticInferenceAcceleratorAssociationTime;
    return this;
  }

  /**
   * Get elasticInferenceAcceleratorAssociationTime
   * @return elasticInferenceAcceleratorAssociationTime
  */
  @ApiModelProperty(value = "")


  public String getElasticInferenceAcceleratorAssociationTime() {
    return elasticInferenceAcceleratorAssociationTime;
  }

  public void setElasticInferenceAcceleratorAssociationTime(String elasticInferenceAcceleratorAssociationTime) {
    this.elasticInferenceAcceleratorAssociationTime = elasticInferenceAcceleratorAssociationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullElasticInferenceAcceleratorAssociationsModel vmResponseFullElasticInferenceAcceleratorAssociations = (VMResponseFullElasticInferenceAcceleratorAssociationsModel) o;
    return Objects.equals(this.elasticInferenceAcceleratorArn, vmResponseFullElasticInferenceAcceleratorAssociations.elasticInferenceAcceleratorArn) &&
        Objects.equals(this.elasticInferenceAcceleratorAssociationId, vmResponseFullElasticInferenceAcceleratorAssociations.elasticInferenceAcceleratorAssociationId) &&
        Objects.equals(this.elasticInferenceAcceleratorAssociationState, vmResponseFullElasticInferenceAcceleratorAssociations.elasticInferenceAcceleratorAssociationState) &&
        Objects.equals(this.elasticInferenceAcceleratorAssociationTime, vmResponseFullElasticInferenceAcceleratorAssociations.elasticInferenceAcceleratorAssociationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticInferenceAcceleratorArn, elasticInferenceAcceleratorAssociationId, elasticInferenceAcceleratorAssociationState, elasticInferenceAcceleratorAssociationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullElasticInferenceAcceleratorAssociationsModel {\n");
    
    sb.append("    elasticInferenceAcceleratorArn: ").append(toIndentedString(elasticInferenceAcceleratorArn)).append("\n");
    sb.append("    elasticInferenceAcceleratorAssociationId: ").append(toIndentedString(elasticInferenceAcceleratorAssociationId)).append("\n");
    sb.append("    elasticInferenceAcceleratorAssociationState: ").append(toIndentedString(elasticInferenceAcceleratorAssociationState)).append("\n");
    sb.append("    elasticInferenceAcceleratorAssociationTime: ").append(toIndentedString(elasticInferenceAcceleratorAssociationTime)).append("\n");
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

