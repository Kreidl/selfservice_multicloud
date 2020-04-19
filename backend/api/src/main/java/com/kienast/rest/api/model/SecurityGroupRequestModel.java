package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.SecurityGroupRequestAuthorizeConfigurationModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupRequestModel
 */

public class SecurityGroupRequestModel   {
  @JsonProperty("groupName")
  private String groupName;

  @JsonProperty("groupDescription")
  private String groupDescription;

  @JsonProperty("vpcId")
  private String vpcId;

  @JsonProperty("authorizeConfiguration")
  @Valid
  private List<SecurityGroupRequestAuthorizeConfigurationModel> authorizeConfiguration = null;

  public SecurityGroupRequestModel groupName(String groupName) {
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

  public SecurityGroupRequestModel groupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
    return this;
  }

  /**
   * Get groupDescription
   * @return groupDescription
  */
  @ApiModelProperty(value = "")


  public String getGroupDescription() {
    return groupDescription;
  }

  public void setGroupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
  }

  public SecurityGroupRequestModel vpcId(String vpcId) {
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

  public SecurityGroupRequestModel authorizeConfiguration(List<SecurityGroupRequestAuthorizeConfigurationModel> authorizeConfiguration) {
    this.authorizeConfiguration = authorizeConfiguration;
    return this;
  }

  public SecurityGroupRequestModel addAuthorizeConfigurationItem(SecurityGroupRequestAuthorizeConfigurationModel authorizeConfigurationItem) {
    if (this.authorizeConfiguration == null) {
      this.authorizeConfiguration = new ArrayList<SecurityGroupRequestAuthorizeConfigurationModel>();
    }
    this.authorizeConfiguration.add(authorizeConfigurationItem);
    return this;
  }

  /**
   * Get authorizeConfiguration
   * @return authorizeConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupRequestAuthorizeConfigurationModel> getAuthorizeConfiguration() {
    return authorizeConfiguration;
  }

  public void setAuthorizeConfiguration(List<SecurityGroupRequestAuthorizeConfigurationModel> authorizeConfiguration) {
    this.authorizeConfiguration = authorizeConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupRequestModel securityGroupRequest = (SecurityGroupRequestModel) o;
    return Objects.equals(this.groupName, securityGroupRequest.groupName) &&
        Objects.equals(this.groupDescription, securityGroupRequest.groupDescription) &&
        Objects.equals(this.vpcId, securityGroupRequest.vpcId) &&
        Objects.equals(this.authorizeConfiguration, securityGroupRequest.authorizeConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, groupDescription, vpcId, authorizeConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupRequestModel {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupDescription: ").append(toIndentedString(groupDescription)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    authorizeConfiguration: ").append(toIndentedString(authorizeConfiguration)).append("\n");
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

