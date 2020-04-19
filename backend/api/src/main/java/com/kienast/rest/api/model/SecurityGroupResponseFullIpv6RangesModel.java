package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullIpv6RangesModel
 */

public class SecurityGroupResponseFullIpv6RangesModel   {
  @JsonProperty("CidrIpv6")
  private String cidrIpv6;

  @JsonProperty("Description")
  private String description;

  public SecurityGroupResponseFullIpv6RangesModel cidrIpv6(String cidrIpv6) {
    this.cidrIpv6 = cidrIpv6;
    return this;
  }

  /**
   * Get cidrIpv6
   * @return cidrIpv6
  */
  @ApiModelProperty(value = "")


  public String getCidrIpv6() {
    return cidrIpv6;
  }

  public void setCidrIpv6(String cidrIpv6) {
    this.cidrIpv6 = cidrIpv6;
  }

  public SecurityGroupResponseFullIpv6RangesModel description(String description) {
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
    SecurityGroupResponseFullIpv6RangesModel securityGroupResponseFullIpv6Ranges = (SecurityGroupResponseFullIpv6RangesModel) o;
    return Objects.equals(this.cidrIpv6, securityGroupResponseFullIpv6Ranges.cidrIpv6) &&
        Objects.equals(this.description, securityGroupResponseFullIpv6Ranges.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrIpv6, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullIpv6RangesModel {\n");
    
    sb.append("    cidrIpv6: ").append(toIndentedString(cidrIpv6)).append("\n");
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

