package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.NetworkResponseTagsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel
 */

public class SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("location")
  private String location;

  @JsonProperty("tags")
  private NetworkResponseTagsModel tags = null;

  public SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel tags(NetworkResponseTagsModel tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkResponseTagsModel getTags() {
    return tags;
  }

  public void setTags(NetworkResponseTagsModel tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel subnetNetworkSecurityGroupSourceApplicationSecurityGroups = (SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel) o;
    return Objects.equals(this.id, subnetNetworkSecurityGroupSourceApplicationSecurityGroups.id) &&
        Objects.equals(this.location, subnetNetworkSecurityGroupSourceApplicationSecurityGroups.location) &&
        Objects.equals(this.tags, subnetNetworkSecurityGroupSourceApplicationSecurityGroups.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

