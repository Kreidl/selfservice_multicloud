package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullPlacementModel
 */

public class VMResponseFullPlacementModel   {
  @JsonProperty("AvailabilityZone")
  private String availabilityZone;

  @JsonProperty("Affinity")
  private String affinity;

  @JsonProperty("GroupName")
  private String groupName;

  @JsonProperty("PartitionNumber")
  private Integer partitionNumber;

  @JsonProperty("HostId")
  private String hostId;

  @JsonProperty("Tenancy")
  private String tenancy;

  @JsonProperty("SpreadDomain")
  private String spreadDomain;

  @JsonProperty("HostResourceGroupArn")
  private String hostResourceGroupArn;

  public VMResponseFullPlacementModel availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * Get availabilityZone
   * @return availabilityZone
  */
  @ApiModelProperty(value = "")


  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  public VMResponseFullPlacementModel affinity(String affinity) {
    this.affinity = affinity;
    return this;
  }

  /**
   * Get affinity
   * @return affinity
  */
  @ApiModelProperty(value = "")


  public String getAffinity() {
    return affinity;
  }

  public void setAffinity(String affinity) {
    this.affinity = affinity;
  }

  public VMResponseFullPlacementModel groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  */
  @ApiModelProperty(value = "")


  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public VMResponseFullPlacementModel partitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
    return this;
  }

  /**
   * Get partitionNumber
   * @return partitionNumber
  */
  @ApiModelProperty(value = "")


  public Integer getPartitionNumber() {
    return partitionNumber;
  }

  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }

  public VMResponseFullPlacementModel hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * Get hostId
   * @return hostId
  */
  @ApiModelProperty(value = "")


  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public VMResponseFullPlacementModel tenancy(String tenancy) {
    this.tenancy = tenancy;
    return this;
  }

  /**
   * Get tenancy
   * @return tenancy
  */
  @ApiModelProperty(value = "")


  public String getTenancy() {
    return tenancy;
  }

  public void setTenancy(String tenancy) {
    this.tenancy = tenancy;
  }

  public VMResponseFullPlacementModel spreadDomain(String spreadDomain) {
    this.spreadDomain = spreadDomain;
    return this;
  }

  /**
   * Get spreadDomain
   * @return spreadDomain
  */
  @ApiModelProperty(value = "")


  public String getSpreadDomain() {
    return spreadDomain;
  }

  public void setSpreadDomain(String spreadDomain) {
    this.spreadDomain = spreadDomain;
  }

  public VMResponseFullPlacementModel hostResourceGroupArn(String hostResourceGroupArn) {
    this.hostResourceGroupArn = hostResourceGroupArn;
    return this;
  }

  /**
   * Get hostResourceGroupArn
   * @return hostResourceGroupArn
  */
  @ApiModelProperty(value = "")


  public String getHostResourceGroupArn() {
    return hostResourceGroupArn;
  }

  public void setHostResourceGroupArn(String hostResourceGroupArn) {
    this.hostResourceGroupArn = hostResourceGroupArn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullPlacementModel vmResponseFullPlacement = (VMResponseFullPlacementModel) o;
    return Objects.equals(this.availabilityZone, vmResponseFullPlacement.availabilityZone) &&
        Objects.equals(this.affinity, vmResponseFullPlacement.affinity) &&
        Objects.equals(this.groupName, vmResponseFullPlacement.groupName) &&
        Objects.equals(this.partitionNumber, vmResponseFullPlacement.partitionNumber) &&
        Objects.equals(this.hostId, vmResponseFullPlacement.hostId) &&
        Objects.equals(this.tenancy, vmResponseFullPlacement.tenancy) &&
        Objects.equals(this.spreadDomain, vmResponseFullPlacement.spreadDomain) &&
        Objects.equals(this.hostResourceGroupArn, vmResponseFullPlacement.hostResourceGroupArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, affinity, groupName, partitionNumber, hostId, tenancy, spreadDomain, hostResourceGroupArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullPlacementModel {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
    sb.append("    spreadDomain: ").append(toIndentedString(spreadDomain)).append("\n");
    sb.append("    hostResourceGroupArn: ").append(toIndentedString(hostResourceGroupArn)).append("\n");
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

