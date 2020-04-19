package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.SecurityGroupResponseFullIpRangesModel;
import com.kienast.rest.api.model.SecurityGroupResponseFullIpv6RangesModel;
import com.kienast.rest.api.model.SecurityGroupResponseFullPrefixListIdsModel;
import com.kienast.rest.api.model.SecurityGroupResponseFullUserIdGroupPairsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullIpPermissionsModel
 */

public class SecurityGroupResponseFullIpPermissionsModel   {
  @JsonProperty("FromPort")
  private Integer fromPort;

  @JsonProperty("IpProtocol")
  private String ipProtocol;

  @JsonProperty("IpRanges")
  @Valid
  private List<SecurityGroupResponseFullIpRangesModel> ipRanges = null;

  @JsonProperty("Ipv6Ranges")
  @Valid
  private List<SecurityGroupResponseFullIpv6RangesModel> ipv6Ranges = null;

  @JsonProperty("PrefixListIds")
  @Valid
  private List<SecurityGroupResponseFullPrefixListIdsModel> prefixListIds = null;

  @JsonProperty("ToPort")
  private Integer toPort;

  @JsonProperty("UserIdGroupPairs")
  @Valid
  private List<SecurityGroupResponseFullUserIdGroupPairsModel> userIdGroupPairs = null;

  public SecurityGroupResponseFullIpPermissionsModel fromPort(Integer fromPort) {
    this.fromPort = fromPort;
    return this;
  }

  /**
   * Get fromPort
   * @return fromPort
  */
  @ApiModelProperty(value = "")


  public Integer getFromPort() {
    return fromPort;
  }

  public void setFromPort(Integer fromPort) {
    this.fromPort = fromPort;
  }

  public SecurityGroupResponseFullIpPermissionsModel ipProtocol(String ipProtocol) {
    this.ipProtocol = ipProtocol;
    return this;
  }

  /**
   * Get ipProtocol
   * @return ipProtocol
  */
  @ApiModelProperty(value = "")


  public String getIpProtocol() {
    return ipProtocol;
  }

  public void setIpProtocol(String ipProtocol) {
    this.ipProtocol = ipProtocol;
  }

  public SecurityGroupResponseFullIpPermissionsModel ipRanges(List<SecurityGroupResponseFullIpRangesModel> ipRanges) {
    this.ipRanges = ipRanges;
    return this;
  }

  public SecurityGroupResponseFullIpPermissionsModel addIpRangesItem(SecurityGroupResponseFullIpRangesModel ipRangesItem) {
    if (this.ipRanges == null) {
      this.ipRanges = new ArrayList<SecurityGroupResponseFullIpRangesModel>();
    }
    this.ipRanges.add(ipRangesItem);
    return this;
  }

  /**
   * Get ipRanges
   * @return ipRanges
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupResponseFullIpRangesModel> getIpRanges() {
    return ipRanges;
  }

  public void setIpRanges(List<SecurityGroupResponseFullIpRangesModel> ipRanges) {
    this.ipRanges = ipRanges;
  }

  public SecurityGroupResponseFullIpPermissionsModel ipv6Ranges(List<SecurityGroupResponseFullIpv6RangesModel> ipv6Ranges) {
    this.ipv6Ranges = ipv6Ranges;
    return this;
  }

  public SecurityGroupResponseFullIpPermissionsModel addIpv6RangesItem(SecurityGroupResponseFullIpv6RangesModel ipv6RangesItem) {
    if (this.ipv6Ranges == null) {
      this.ipv6Ranges = new ArrayList<SecurityGroupResponseFullIpv6RangesModel>();
    }
    this.ipv6Ranges.add(ipv6RangesItem);
    return this;
  }

  /**
   * Get ipv6Ranges
   * @return ipv6Ranges
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupResponseFullIpv6RangesModel> getIpv6Ranges() {
    return ipv6Ranges;
  }

  public void setIpv6Ranges(List<SecurityGroupResponseFullIpv6RangesModel> ipv6Ranges) {
    this.ipv6Ranges = ipv6Ranges;
  }

  public SecurityGroupResponseFullIpPermissionsModel prefixListIds(List<SecurityGroupResponseFullPrefixListIdsModel> prefixListIds) {
    this.prefixListIds = prefixListIds;
    return this;
  }

  public SecurityGroupResponseFullIpPermissionsModel addPrefixListIdsItem(SecurityGroupResponseFullPrefixListIdsModel prefixListIdsItem) {
    if (this.prefixListIds == null) {
      this.prefixListIds = new ArrayList<SecurityGroupResponseFullPrefixListIdsModel>();
    }
    this.prefixListIds.add(prefixListIdsItem);
    return this;
  }

  /**
   * Get prefixListIds
   * @return prefixListIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupResponseFullPrefixListIdsModel> getPrefixListIds() {
    return prefixListIds;
  }

  public void setPrefixListIds(List<SecurityGroupResponseFullPrefixListIdsModel> prefixListIds) {
    this.prefixListIds = prefixListIds;
  }

  public SecurityGroupResponseFullIpPermissionsModel toPort(Integer toPort) {
    this.toPort = toPort;
    return this;
  }

  /**
   * Get toPort
   * @return toPort
  */
  @ApiModelProperty(value = "")


  public Integer getToPort() {
    return toPort;
  }

  public void setToPort(Integer toPort) {
    this.toPort = toPort;
  }

  public SecurityGroupResponseFullIpPermissionsModel userIdGroupPairs(List<SecurityGroupResponseFullUserIdGroupPairsModel> userIdGroupPairs) {
    this.userIdGroupPairs = userIdGroupPairs;
    return this;
  }

  public SecurityGroupResponseFullIpPermissionsModel addUserIdGroupPairsItem(SecurityGroupResponseFullUserIdGroupPairsModel userIdGroupPairsItem) {
    if (this.userIdGroupPairs == null) {
      this.userIdGroupPairs = new ArrayList<SecurityGroupResponseFullUserIdGroupPairsModel>();
    }
    this.userIdGroupPairs.add(userIdGroupPairsItem);
    return this;
  }

  /**
   * Get userIdGroupPairs
   * @return userIdGroupPairs
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityGroupResponseFullUserIdGroupPairsModel> getUserIdGroupPairs() {
    return userIdGroupPairs;
  }

  public void setUserIdGroupPairs(List<SecurityGroupResponseFullUserIdGroupPairsModel> userIdGroupPairs) {
    this.userIdGroupPairs = userIdGroupPairs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupResponseFullIpPermissionsModel securityGroupResponseFullIpPermissions = (SecurityGroupResponseFullIpPermissionsModel) o;
    return Objects.equals(this.fromPort, securityGroupResponseFullIpPermissions.fromPort) &&
        Objects.equals(this.ipProtocol, securityGroupResponseFullIpPermissions.ipProtocol) &&
        Objects.equals(this.ipRanges, securityGroupResponseFullIpPermissions.ipRanges) &&
        Objects.equals(this.ipv6Ranges, securityGroupResponseFullIpPermissions.ipv6Ranges) &&
        Objects.equals(this.prefixListIds, securityGroupResponseFullIpPermissions.prefixListIds) &&
        Objects.equals(this.toPort, securityGroupResponseFullIpPermissions.toPort) &&
        Objects.equals(this.userIdGroupPairs, securityGroupResponseFullIpPermissions.userIdGroupPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromPort, ipProtocol, ipRanges, ipv6Ranges, prefixListIds, toPort, userIdGroupPairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullIpPermissionsModel {\n");
    
    sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
    sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
    sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
    sb.append("    ipv6Ranges: ").append(toIndentedString(ipv6Ranges)).append("\n");
    sb.append("    prefixListIds: ").append(toIndentedString(prefixListIds)).append("\n");
    sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
    sb.append("    userIdGroupPairs: ").append(toIndentedString(userIdGroupPairs)).append("\n");
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

