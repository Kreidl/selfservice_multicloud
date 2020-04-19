package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupRequestAuthorizeConfigurationModel
 */

public class SecurityGroupRequestAuthorizeConfigurationModel   {
  @JsonProperty("port")
  private Integer port;

  @JsonProperty("ipaddress")
  private String ipaddress;

  @JsonProperty("protocol")
  private String protocol;

  public SecurityGroupRequestAuthorizeConfigurationModel port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
  */
  @ApiModelProperty(value = "")


  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public SecurityGroupRequestAuthorizeConfigurationModel ipaddress(String ipaddress) {
    this.ipaddress = ipaddress;
    return this;
  }

  /**
   * Get ipaddress
   * @return ipaddress
  */
  @ApiModelProperty(value = "")


  public String getIpaddress() {
    return ipaddress;
  }

  public void setIpaddress(String ipaddress) {
    this.ipaddress = ipaddress;
  }

  public SecurityGroupRequestAuthorizeConfigurationModel protocol(String protocol) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupRequestAuthorizeConfigurationModel securityGroupRequestAuthorizeConfiguration = (SecurityGroupRequestAuthorizeConfigurationModel) o;
    return Objects.equals(this.port, securityGroupRequestAuthorizeConfiguration.port) &&
        Objects.equals(this.ipaddress, securityGroupRequestAuthorizeConfiguration.ipaddress) &&
        Objects.equals(this.protocol, securityGroupRequestAuthorizeConfiguration.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, ipaddress, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupRequestAuthorizeConfigurationModel {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ipaddress: ").append(toIndentedString(ipaddress)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

