package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel
 */

public class VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel   {
  @JsonProperty("CapacityReservationId")
  private String capacityReservationId;

  public VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel capacityReservationId(String capacityReservationId) {
    this.capacityReservationId = capacityReservationId;
    return this;
  }

  /**
   * Get capacityReservationId
   * @return capacityReservationId
  */
  @ApiModelProperty(value = "")


  public String getCapacityReservationId() {
    return capacityReservationId;
  }

  public void setCapacityReservationId(String capacityReservationId) {
    this.capacityReservationId = capacityReservationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel vmResponseFullCapacityReservationSpecificationCapacityReservationTarget = (VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel) o;
    return Objects.equals(this.capacityReservationId, vmResponseFullCapacityReservationSpecificationCapacityReservationTarget.capacityReservationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityReservationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullCapacityReservationSpecificationCapacityReservationTargetModel {\n");
    
    sb.append("    capacityReservationId: ").append(toIndentedString(capacityReservationId)).append("\n");
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

