package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.SecurityGroupResponseFullIpPermissionsModel;
import com.kienast.rest.api.model.VPCResponseVpcTagsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullModel
 */

public class SecurityGroupResponseFullModel   {
  @JsonProperty("Description")
  private String description;

  @JsonProperty("GroupName")
  private String groupName;

  @JsonProperty("IpPermissions")
  @Valid
  private List<SecurityGroupResponseFullIpPermissionsModel> ipPermissions = null;

  @JsonProperty("OwnerId")
  private String ownerId;

  @JsonProperty("GroupId")
  private String groupId;

  @JsonProperty("IpPermissionsEgress")
  @Valid
  private List<SecurityGroupResponseFullIpPermissionsModel> ipPermissionsEgress = null;

  @JsonProperty("Tags")
  @Valid
  private List<VPCResponseVpcTagsModel> tags = null;

  @JsonProperty("VpcId")
  private String vpcId;

  public SecurityGroupResponseFullModel description(String description) {
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

  public SecurityGroupResponseFullModel groupName(String groupName) {
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

  public SecurityGroupResponseFullModel ipPermissions(List<SecurityGroupResponseFullIpPermissionsModel> ipPermissions) {
    this.ipPermissions = ipPermissions;
    return this;
  }

  public SecurityGroupResponseFullModel addIpPermissionsItem(SecurityGroupResponseFullIpPermissionsModel ipPermissionsItem) {
    if (this.ipPermissions == null) {
      this.ipPermissions = new ArrayList<SecurityGroupResponseFullIpPermissionsModel>();
    }
    this.ipPermissions.add(ipPermissionsItem);
    return this;
  }

  /**
   * Get ipPermissions
   * @return ipPermissions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupResponseFullIpPermissionsModel> getIpPermissions() {
    return ipPermissions;
  }

  public void setIpPermissions(List<SecurityGroupResponseFullIpPermissionsModel> ipPermissions) {
    this.ipPermissions = ipPermissions;
  }

  public SecurityGroupResponseFullModel ownerId(String ownerId) {
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

  public SecurityGroupResponseFullModel groupId(String groupId) {
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

  public SecurityGroupResponseFullModel ipPermissionsEgress(List<SecurityGroupResponseFullIpPermissionsModel> ipPermissionsEgress) {
    this.ipPermissionsEgress = ipPermissionsEgress;
    return this;
  }

  public SecurityGroupResponseFullModel addIpPermissionsEgressItem(SecurityGroupResponseFullIpPermissionsModel ipPermissionsEgressItem) {
    if (this.ipPermissionsEgress == null) {
      this.ipPermissionsEgress = new ArrayList<SecurityGroupResponseFullIpPermissionsModel>();
    }
    this.ipPermissionsEgress.add(ipPermissionsEgressItem);
    return this;
  }

  /**
   * Get ipPermissionsEgress
   * @return ipPermissionsEgress
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupResponseFullIpPermissionsModel> getIpPermissionsEgress() {
    return ipPermissionsEgress;
  }

  public void setIpPermissionsEgress(List<SecurityGroupResponseFullIpPermissionsModel> ipPermissionsEgress) {
    this.ipPermissionsEgress = ipPermissionsEgress;
  }

  public SecurityGroupResponseFullModel tags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityGroupResponseFullModel addTagsItem(VPCResponseVpcTagsModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<VPCResponseVpcTagsModel>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCResponseVpcTagsModel> getTags() {
    return tags;
  }

  public void setTags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
  }

  public SecurityGroupResponseFullModel vpcId(String vpcId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupResponseFullModel securityGroupResponseFull = (SecurityGroupResponseFullModel) o;
    return Objects.equals(this.description, securityGroupResponseFull.description) &&
        Objects.equals(this.groupName, securityGroupResponseFull.groupName) &&
        Objects.equals(this.ipPermissions, securityGroupResponseFull.ipPermissions) &&
        Objects.equals(this.ownerId, securityGroupResponseFull.ownerId) &&
        Objects.equals(this.groupId, securityGroupResponseFull.groupId) &&
        Objects.equals(this.ipPermissionsEgress, securityGroupResponseFull.ipPermissionsEgress) &&
        Objects.equals(this.tags, securityGroupResponseFull.tags) &&
        Objects.equals(this.vpcId, securityGroupResponseFull.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groupName, ipPermissions, ownerId, groupId, ipPermissionsEgress, tags, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullModel {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    ipPermissions: ").append(toIndentedString(ipPermissions)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    ipPermissionsEgress: ").append(toIndentedString(ipPermissionsEgress)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

