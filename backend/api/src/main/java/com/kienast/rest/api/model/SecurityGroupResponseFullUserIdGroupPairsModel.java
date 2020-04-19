package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullUserIdGroupPairsModel
 */

public class SecurityGroupResponseFullUserIdGroupPairsModel   {
  @JsonProperty("Description")
  private String description;

  @JsonProperty("GroupId")
  private String groupId;

  @JsonProperty("GroupName")
  private String groupName;

  @JsonProperty("PeeringStatus")
  private String peeringStatus;

  @JsonProperty("UserId")
  private String userId;

  @JsonProperty("VpcId")
  private String vpcId;

  @JsonProperty("VpcPeeringConnectionId")
  private String vpcPeeringConnectionId;

  public SecurityGroupResponseFullUserIdGroupPairsModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityGroupResponseFullUserIdGroupPairsModel groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  @ApiModelProperty(value = "")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public SecurityGroupResponseFullUserIdGroupPairsModel groupName(String groupName) {
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

  public SecurityGroupResponseFullUserIdGroupPairsModel peeringStatus(String peeringStatus) {
    this.peeringStatus = peeringStatus;
    return this;
  }

  /**
   * Get peeringStatus
   * @return peeringStatus
  */
  @ApiModelProperty(value = "")


  public String getPeeringStatus() {
    return peeringStatus;
  }

  public void setPeeringStatus(String peeringStatus) {
    this.peeringStatus = peeringStatus;
  }

  public SecurityGroupResponseFullUserIdGroupPairsModel userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SecurityGroupResponseFullUserIdGroupPairsModel vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
  */
  @ApiModelProperty(value = "")


  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public SecurityGroupResponseFullUserIdGroupPairsModel vpcPeeringConnectionId(String vpcPeeringConnectionId) {
    this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    return this;
  }

  /**
   * Get vpcPeeringConnectionId
   * @return vpcPeeringConnectionId
  */
  @ApiModelProperty(value = "")


  public String getVpcPeeringConnectionId() {
    return vpcPeeringConnectionId;
  }

  public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
    this.vpcPeeringConnectionId = vpcPeeringConnectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupResponseFullUserIdGroupPairsModel securityGroupResponseFullUserIdGroupPairs = (SecurityGroupResponseFullUserIdGroupPairsModel) o;
    return Objects.equals(this.description, securityGroupResponseFullUserIdGroupPairs.description) &&
        Objects.equals(this.groupId, securityGroupResponseFullUserIdGroupPairs.groupId) &&
        Objects.equals(this.groupName, securityGroupResponseFullUserIdGroupPairs.groupName) &&
        Objects.equals(this.peeringStatus, securityGroupResponseFullUserIdGroupPairs.peeringStatus) &&
        Objects.equals(this.userId, securityGroupResponseFullUserIdGroupPairs.userId) &&
        Objects.equals(this.vpcId, securityGroupResponseFullUserIdGroupPairs.vpcId) &&
        Objects.equals(this.vpcPeeringConnectionId, securityGroupResponseFullUserIdGroupPairs.vpcPeeringConnectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groupId, groupName, peeringStatus, userId, vpcId, vpcPeeringConnectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullUserIdGroupPairsModel {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    peeringStatus: ").append(toIndentedString(peeringStatus)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcPeeringConnectionId: ").append(toIndentedString(vpcPeeringConnectionId)).append("\n");
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

