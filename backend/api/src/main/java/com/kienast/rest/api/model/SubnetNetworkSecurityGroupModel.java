package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.NetworkResponseTagsModel;
import com.kienast.rest.api.model.SubnetNetworkSecurityGroupSecurityRulesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubnetNetworkSecurityGroupModel
 */

public class SubnetNetworkSecurityGroupModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("location")
  private String location;

  @JsonProperty("tags")
  private NetworkResponseTagsModel tags = null;

  @JsonProperty("security_rules")
  @Valid
  private List<SubnetNetworkSecurityGroupSecurityRulesModel> securityRules = null;

  public SubnetNetworkSecurityGroupModel id(String id) {
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

  public SubnetNetworkSecurityGroupModel location(String location) {
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

  public SubnetNetworkSecurityGroupModel tags(NetworkResponseTagsModel tags) {
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

  public SubnetNetworkSecurityGroupModel securityRules(List<SubnetNetworkSecurityGroupSecurityRulesModel> securityRules) {
    this.securityRules = securityRules;
    return this;
  }

  public SubnetNetworkSecurityGroupModel addSecurityRulesItem(SubnetNetworkSecurityGroupSecurityRulesModel securityRulesItem) {
    if (this.securityRules == null) {
      this.securityRules = new ArrayList<SubnetNetworkSecurityGroupSecurityRulesModel>();
    }
    this.securityRules.add(securityRulesItem);
    return this;
  }

  /**
   * Get securityRules
   * @return securityRules
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubnetNetworkSecurityGroupSecurityRulesModel> getSecurityRules() {
    return securityRules;
  }

  public void setSecurityRules(List<SubnetNetworkSecurityGroupSecurityRulesModel> securityRules) {
    this.securityRules = securityRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetNetworkSecurityGroupModel subnetNetworkSecurityGroup = (SubnetNetworkSecurityGroupModel) o;
    return Objects.equals(this.id, subnetNetworkSecurityGroup.id) &&
        Objects.equals(this.location, subnetNetworkSecurityGroup.location) &&
        Objects.equals(this.tags, subnetNetworkSecurityGroup.tags) &&
        Objects.equals(this.securityRules, subnetNetworkSecurityGroup.securityRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, tags, securityRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetNetworkSecurityGroupModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    securityRules: ").append(toIndentedString(securityRules)).append("\n");
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

