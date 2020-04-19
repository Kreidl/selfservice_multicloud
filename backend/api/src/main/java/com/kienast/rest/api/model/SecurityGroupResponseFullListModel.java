package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.SecurityGroupResponseFullModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullListModel
 */

public class SecurityGroupResponseFullListModel   {
  @JsonProperty("groups")
  @Valid
  private List<SecurityGroupResponseFullModel> groups = null;

  public SecurityGroupResponseFullListModel groups(List<SecurityGroupResponseFullModel> groups) {
    this.groups = groups;
    return this;
  }

  public SecurityGroupResponseFullListModel addGroupsItem(SecurityGroupResponseFullModel groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<SecurityGroupResponseFullModel>();
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

  public List<SecurityGroupResponseFullModel> getGroups() {
    return groups;
  }

  public void setGroups(List<SecurityGroupResponseFullModel> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupResponseFullListModel securityGroupResponseFullList = (SecurityGroupResponseFullListModel) o;
    return Objects.equals(this.groups, securityGroupResponseFullList.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullListModel {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

