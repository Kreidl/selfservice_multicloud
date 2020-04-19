package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubnetNetworkSecurityGroupSecurityRulesModel
 */

public class SubnetNetworkSecurityGroupSecurityRulesModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("protocol")
  private String protocol;

  @JsonProperty("source_port_range")
  private String sourcePortRange;

  @JsonProperty("destination_port_range")
  private String destinationPortRange;

  @JsonProperty("source_address_prefix")
  private String sourceAddressPrefix;

  @JsonProperty("source_address_prefixes")
  @Valid
  private List<String> sourceAddressPrefixes = null;

  @JsonProperty("source_application_security_groups")
  @Valid
  private List<SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel> sourceApplicationSecurityGroups = null;

  @JsonProperty("destination_address_prefix")
  private String destinationAddressPrefix;

  @JsonProperty("destination_address_prefixes")
  @Valid
  private List<String> destinationAddressPrefixes = null;

  @JsonProperty("destination_application_security_groups")
  @Valid
  private List<String> destinationApplicationSecurityGroups = null;

  @JsonProperty("source_port_ranges")
  @Valid
  private List<String> sourcePortRanges = null;

  @JsonProperty("destination_port_ranges")
  @Valid
  private List<String> destinationPortRanges = null;

  @JsonProperty("access")
  private String access;

  @JsonProperty("priority")
  private BigDecimal priority;

  @JsonProperty("direction")
  private String direction;

  @JsonProperty("name")
  private String name;

  public SubnetNetworkSecurityGroupSecurityRulesModel id(String id) {
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

  public SubnetNetworkSecurityGroupSecurityRulesModel description(String description) {
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

  public SubnetNetworkSecurityGroupSecurityRulesModel protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  */
  @ApiModelProperty(value = "")


  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel sourcePortRange(String sourcePortRange) {
    this.sourcePortRange = sourcePortRange;
    return this;
  }

  /**
   * Get sourcePortRange
   * @return sourcePortRange
  */
  @ApiModelProperty(value = "")


  public String getSourcePortRange() {
    return sourcePortRange;
  }

  public void setSourcePortRange(String sourcePortRange) {
    this.sourcePortRange = sourcePortRange;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel destinationPortRange(String destinationPortRange) {
    this.destinationPortRange = destinationPortRange;
    return this;
  }

  /**
   * Get destinationPortRange
   * @return destinationPortRange
  */
  @ApiModelProperty(value = "")


  public String getDestinationPortRange() {
    return destinationPortRange;
  }

  public void setDestinationPortRange(String destinationPortRange) {
    this.destinationPortRange = destinationPortRange;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel sourceAddressPrefix(String sourceAddressPrefix) {
    this.sourceAddressPrefix = sourceAddressPrefix;
    return this;
  }

  /**
   * Get sourceAddressPrefix
   * @return sourceAddressPrefix
  */
  @ApiModelProperty(value = "")


  public String getSourceAddressPrefix() {
    return sourceAddressPrefix;
  }

  public void setSourceAddressPrefix(String sourceAddressPrefix) {
    this.sourceAddressPrefix = sourceAddressPrefix;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel sourceAddressPrefixes(List<String> sourceAddressPrefixes) {
    this.sourceAddressPrefixes = sourceAddressPrefixes;
    return this;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel addSourceAddressPrefixesItem(String sourceAddressPrefixesItem) {
    if (this.sourceAddressPrefixes == null) {
      this.sourceAddressPrefixes = new ArrayList<String>();
    }
    this.sourceAddressPrefixes.add(sourceAddressPrefixesItem);
    return this;
  }

  /**
   * Get sourceAddressPrefixes
   * @return sourceAddressPrefixes
  */
  @ApiModelProperty(value = "")


  public List<String> getSourceAddressPrefixes() {
    return sourceAddressPrefixes;
  }

  public void setSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
    this.sourceAddressPrefixes = sourceAddressPrefixes;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel sourceApplicationSecurityGroups(List<SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel> sourceApplicationSecurityGroups) {
    this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
    return this;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel addSourceApplicationSecurityGroupsItem(SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel sourceApplicationSecurityGroupsItem) {
    if (this.sourceApplicationSecurityGroups == null) {
      this.sourceApplicationSecurityGroups = new ArrayList<SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel>();
    }
    this.sourceApplicationSecurityGroups.add(sourceApplicationSecurityGroupsItem);
    return this;
  }

  /**
   * Get sourceApplicationSecurityGroups
   * @return sourceApplicationSecurityGroups
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel> getSourceApplicationSecurityGroups() {
    return sourceApplicationSecurityGroups;
  }

  public void setSourceApplicationSecurityGroups(List<SubnetNetworkSecurityGroupSourceApplicationSecurityGroupsModel> sourceApplicationSecurityGroups) {
    this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel destinationAddressPrefix(String destinationAddressPrefix) {
    this.destinationAddressPrefix = destinationAddressPrefix;
    return this;
  }

  /**
   * Get destinationAddressPrefix
   * @return destinationAddressPrefix
  */
  @ApiModelProperty(value = "")


  public String getDestinationAddressPrefix() {
    return destinationAddressPrefix;
  }

  public void setDestinationAddressPrefix(String destinationAddressPrefix) {
    this.destinationAddressPrefix = destinationAddressPrefix;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel destinationAddressPrefixes(List<String> destinationAddressPrefixes) {
    this.destinationAddressPrefixes = destinationAddressPrefixes;
    return this;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel addDestinationAddressPrefixesItem(String destinationAddressPrefixesItem) {
    if (this.destinationAddressPrefixes == null) {
      this.destinationAddressPrefixes = new ArrayList<String>();
    }
    this.destinationAddressPrefixes.add(destinationAddressPrefixesItem);
    return this;
  }

  /**
   * Get destinationAddressPrefixes
   * @return destinationAddressPrefixes
  */
  @ApiModelProperty(value = "")


  public List<String> getDestinationAddressPrefixes() {
    return destinationAddressPrefixes;
  }

  public void setDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
    this.destinationAddressPrefixes = destinationAddressPrefixes;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel destinationApplicationSecurityGroups(List<String> destinationApplicationSecurityGroups) {
    this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
    return this;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel addDestinationApplicationSecurityGroupsItem(String destinationApplicationSecurityGroupsItem) {
    if (this.destinationApplicationSecurityGroups == null) {
      this.destinationApplicationSecurityGroups = new ArrayList<String>();
    }
    this.destinationApplicationSecurityGroups.add(destinationApplicationSecurityGroupsItem);
    return this;
  }

  /**
   * Get destinationApplicationSecurityGroups
   * @return destinationApplicationSecurityGroups
  */
  @ApiModelProperty(value = "")


  public List<String> getDestinationApplicationSecurityGroups() {
    return destinationApplicationSecurityGroups;
  }

  public void setDestinationApplicationSecurityGroups(List<String> destinationApplicationSecurityGroups) {
    this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel sourcePortRanges(List<String> sourcePortRanges) {
    this.sourcePortRanges = sourcePortRanges;
    return this;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel addSourcePortRangesItem(String sourcePortRangesItem) {
    if (this.sourcePortRanges == null) {
      this.sourcePortRanges = new ArrayList<String>();
    }
    this.sourcePortRanges.add(sourcePortRangesItem);
    return this;
  }

  /**
   * Get sourcePortRanges
   * @return sourcePortRanges
  */
  @ApiModelProperty(value = "")


  public List<String> getSourcePortRanges() {
    return sourcePortRanges;
  }

  public void setSourcePortRanges(List<String> sourcePortRanges) {
    this.sourcePortRanges = sourcePortRanges;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel destinationPortRanges(List<String> destinationPortRanges) {
    this.destinationPortRanges = destinationPortRanges;
    return this;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel addDestinationPortRangesItem(String destinationPortRangesItem) {
    if (this.destinationPortRanges == null) {
      this.destinationPortRanges = new ArrayList<String>();
    }
    this.destinationPortRanges.add(destinationPortRangesItem);
    return this;
  }

  /**
   * Get destinationPortRanges
   * @return destinationPortRanges
  */
  @ApiModelProperty(value = "")


  public List<String> getDestinationPortRanges() {
    return destinationPortRanges;
  }

  public void setDestinationPortRanges(List<String> destinationPortRanges) {
    this.destinationPortRanges = destinationPortRanges;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel access(String access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @ApiModelProperty(value = "")


  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @ApiModelProperty(value = "")


  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public SubnetNetworkSecurityGroupSecurityRulesModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetNetworkSecurityGroupSecurityRulesModel subnetNetworkSecurityGroupSecurityRules = (SubnetNetworkSecurityGroupSecurityRulesModel) o;
    return Objects.equals(this.id, subnetNetworkSecurityGroupSecurityRules.id) &&
        Objects.equals(this.description, subnetNetworkSecurityGroupSecurityRules.description) &&
        Objects.equals(this.protocol, subnetNetworkSecurityGroupSecurityRules.protocol) &&
        Objects.equals(this.sourcePortRange, subnetNetworkSecurityGroupSecurityRules.sourcePortRange) &&
        Objects.equals(this.destinationPortRange, subnetNetworkSecurityGroupSecurityRules.destinationPortRange) &&
        Objects.equals(this.sourceAddressPrefix, subnetNetworkSecurityGroupSecurityRules.sourceAddressPrefix) &&
        Objects.equals(this.sourceAddressPrefixes, subnetNetworkSecurityGroupSecurityRules.sourceAddressPrefixes) &&
        Objects.equals(this.sourceApplicationSecurityGroups, subnetNetworkSecurityGroupSecurityRules.sourceApplicationSecurityGroups) &&
        Objects.equals(this.destinationAddressPrefix, subnetNetworkSecurityGroupSecurityRules.destinationAddressPrefix) &&
        Objects.equals(this.destinationAddressPrefixes, subnetNetworkSecurityGroupSecurityRules.destinationAddressPrefixes) &&
        Objects.equals(this.destinationApplicationSecurityGroups, subnetNetworkSecurityGroupSecurityRules.destinationApplicationSecurityGroups) &&
        Objects.equals(this.sourcePortRanges, subnetNetworkSecurityGroupSecurityRules.sourcePortRanges) &&
        Objects.equals(this.destinationPortRanges, subnetNetworkSecurityGroupSecurityRules.destinationPortRanges) &&
        Objects.equals(this.access, subnetNetworkSecurityGroupSecurityRules.access) &&
        Objects.equals(this.priority, subnetNetworkSecurityGroupSecurityRules.priority) &&
        Objects.equals(this.direction, subnetNetworkSecurityGroupSecurityRules.direction) &&
        Objects.equals(this.name, subnetNetworkSecurityGroupSecurityRules.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, protocol, sourcePortRange, destinationPortRange, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroups, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroups, sourcePortRanges, destinationPortRanges, access, priority, direction, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetNetworkSecurityGroupSecurityRulesModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sourcePortRange: ").append(toIndentedString(sourcePortRange)).append("\n");
    sb.append("    destinationPortRange: ").append(toIndentedString(destinationPortRange)).append("\n");
    sb.append("    sourceAddressPrefix: ").append(toIndentedString(sourceAddressPrefix)).append("\n");
    sb.append("    sourceAddressPrefixes: ").append(toIndentedString(sourceAddressPrefixes)).append("\n");
    sb.append("    sourceApplicationSecurityGroups: ").append(toIndentedString(sourceApplicationSecurityGroups)).append("\n");
    sb.append("    destinationAddressPrefix: ").append(toIndentedString(destinationAddressPrefix)).append("\n");
    sb.append("    destinationAddressPrefixes: ").append(toIndentedString(destinationAddressPrefixes)).append("\n");
    sb.append("    destinationApplicationSecurityGroups: ").append(toIndentedString(destinationApplicationSecurityGroups)).append("\n");
    sb.append("    sourcePortRanges: ").append(toIndentedString(sourcePortRanges)).append("\n");
    sb.append("    destinationPortRanges: ").append(toIndentedString(destinationPortRanges)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

