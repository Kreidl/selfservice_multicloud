package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VMResponseFullGroupsModel;
import com.kienast.rest.api.model.VMResponseFullInstancesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullModel
 */

public class VMResponseFullModel   {
  @JsonProperty("Groups")
  @Valid
  private List<VMResponseFullGroupsModel> groups = null;

  @JsonProperty("Instances")
  @Valid
  private List<VMResponseFullInstancesModel> instances = null;

  @JsonProperty("OwnerId")
  private String ownerId;

  @JsonProperty("RequesterId")
  private String requesterId;

  @JsonProperty("ReservationId")
  private String reservationId;

  public VMResponseFullModel groups(List<VMResponseFullGroupsModel> groups) {
    this.groups = groups;
    return this;
  }

  public VMResponseFullModel addGroupsItem(VMResponseFullGroupsModel groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<VMResponseFullGroupsModel>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullGroupsModel> getGroups() {
    return groups;
  }

  public void setGroups(List<VMResponseFullGroupsModel> groups) {
    this.groups = groups;
  }

  public VMResponseFullModel instances(List<VMResponseFullInstancesModel> instances) {
    this.instances = instances;
    return this;
  }

  public VMResponseFullModel addInstancesItem(VMResponseFullInstancesModel instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<VMResponseFullInstancesModel>();
    }
    this.instances.add(instancesItem);
    return this;
  }

  /**
   * Get instances
   * @return instances
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullInstancesModel> getInstances() {
    return instances;
  }

  public void setInstances(List<VMResponseFullInstancesModel> instances) {
    this.instances = instances;
  }

  public VMResponseFullModel ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @ApiModelProperty(value = "")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public VMResponseFullModel requesterId(String requesterId) {
    this.requesterId = requesterId;
    return this;
  }

  /**
   * Get requesterId
   * @return requesterId
  */
  @ApiModelProperty(value = "")


  public String getRequesterId() {
    return requesterId;
  }

  public void setRequesterId(String requesterId) {
    this.requesterId = requesterId;
  }

  public VMResponseFullModel reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Get reservationId
   * @return reservationId
  */
  @ApiModelProperty(value = "")


  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullModel vmResponseFull = (VMResponseFullModel) o;
    return Objects.equals(this.groups, vmResponseFull.groups) &&
        Objects.equals(this.instances, vmResponseFull.instances) &&
        Objects.equals(this.ownerId, vmResponseFull.ownerId) &&
        Objects.equals(this.requesterId, vmResponseFull.requesterId) &&
        Objects.equals(this.reservationId, vmResponseFull.reservationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, instances, ownerId, requesterId, reservationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullModel {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    requesterId: ").append(toIndentedString(requesterId)).append("\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
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

