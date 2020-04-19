package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullIpRangesModel
 */

public class SecurityGroupResponseFullIpRangesModel   {
  @JsonProperty("CidrIp")
  private String cidrIp;

  @JsonProperty("Description")
  private String description;

  public SecurityGroupResponseFullIpRangesModel cidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
    return this;
  }

  /**
   * Get cidrIp
   * @return cidrIp
  */
  @ApiModelProperty(value = "")


  public String getCidrIp() {
    return cidrIp;
  }

  public void setCidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
  }

  public SecurityGroupResponseFullIpRangesModel description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupResponseFullIpRangesModel securityGroupResponseFullIpRanges = (SecurityGroupResponseFullIpRangesModel) o;
    return Objects.equals(this.cidrIp, securityGroupResponseFullIpRanges.cidrIp) &&
        Objects.equals(this.description, securityGroupResponseFullIpRanges.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrIp, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullIpRangesModel {\n");
    
    sb.append("    cidrIp: ").append(toIndentedString(cidrIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

