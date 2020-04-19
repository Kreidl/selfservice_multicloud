package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NetworkResponseDhcpOptionsModel
 */

public class NetworkResponseDhcpOptionsModel   {
  @JsonProperty("dns_servers")
  @Valid
  private List<String> dnsServers = null;

  public NetworkResponseDhcpOptionsModel dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public NetworkResponseDhcpOptionsModel addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<String>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

  /**
   * Get dnsServers
   * @return dnsServers
  */
  @ApiModelProperty(value = "")


  public List<String> getDnsServers() {
    return dnsServers;
  }

  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkResponseDhcpOptionsModel networkResponseDhcpOptions = (NetworkResponseDhcpOptionsModel) o;
    return Objects.equals(this.dnsServers, networkResponseDhcpOptions.dnsServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkResponseDhcpOptionsModel {\n");
    
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
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

