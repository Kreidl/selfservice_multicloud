package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullCapacityReservationSpecificationModel
 */

public class VMResponseFullCapacityReservationSpecificationModel   {
  @JsonProperty("CapacityReservationPreference")
  private String capacityReservationPreference;

  @JsonProperty("CapacityReservationTarget")
  private VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel capacityReservationTarget = null;

  public VMResponseFullCapacityReservationSpecificationModel capacityReservationPreference(String capacityReservationPreference) {
    this.capacityReservationPreference = capacityReservationPreference;
    return this;
  }

  /**
   * Get capacityReservationPreference
   * @return capacityReservationPreference
  */
  @ApiModelProperty(value = "")


  public String getCapacityReservationPreference() {
    return capacityReservationPreference;
  }

  public void setCapacityReservationPreference(String capacityReservationPreference) {
    this.capacityReservationPreference = capacityReservationPreference;
  }

  public VMResponseFullCapacityReservationSpecificationModel capacityReservationTarget(VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel capacityReservationTarget) {
    this.capacityReservationTarget = capacityReservationTarget;
    return this;
  }

  /**
   * Get capacityReservationTarget
   * @return capacityReservationTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel getCapacityReservationTarget() {
    return capacityReservationTarget;
  }

  public void setCapacityReservationTarget(VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel capacityReservationTarget) {
    this.capacityReservationTarget = capacityReservationTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullCapacityReservationSpecificationModel vmResponseFullCapacityReservationSpecification = (VMResponseFullCapacityReservationSpecificationModel) o;
    return Objects.equals(this.capacityReservationPreference, vmResponseFullCapacityReservationSpecification.capacityReservationPreference) &&
        Objects.equals(this.capacityReservationTarget, vmResponseFullCapacityReservationSpecification.capacityReservationTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityReservationPreference, capacityReservationTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullCapacityReservationSpecificationModel {\n");
    
    sb.append("    capacityReservationPreference: ").append(toIndentedString(capacityReservationPreference)).append("\n");
    sb.append("    capacityReservationTarget: ").append(toIndentedString(capacityReservationTarget)).append("\n");
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

