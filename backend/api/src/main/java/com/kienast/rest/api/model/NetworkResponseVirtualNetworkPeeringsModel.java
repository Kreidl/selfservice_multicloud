package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel;
import com.kienast.rest.api.model.NetworkResponseAddressSpaceModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NetworkResponseVirtualNetworkPeeringsModel
 */

public class NetworkResponseVirtualNetworkPeeringsModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("allow_virtual_network_access")
  private Boolean allowVirtualNetworkAccess;

  @JsonProperty("allow_forwarded_traffic")
  private Boolean allowForwardedTraffic;

  @JsonProperty("allow_gateway_transit")
  private Boolean allowGatewayTransit;

  @JsonProperty("use_remote_gateways")
  private Boolean useRemoteGateways;

  @JsonProperty("remote_virtual_network")
  private AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel remoteVirtualNetwork = null;

  @JsonProperty("remote_address_space")
  private NetworkResponseAddressSpaceModel remoteAddressSpace = null;

  @JsonProperty("peering_state")
  private String peeringState;

  @JsonProperty("name")
  private String name;

  public NetworkResponseVirtualNetworkPeeringsModel id(String id) {
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

  public NetworkResponseVirtualNetworkPeeringsModel allowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
    this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
    return this;
  }

  /**
   * Get allowVirtualNetworkAccess
   * @return allowVirtualNetworkAccess
  */
  @ApiModelProperty(value = "")


  public Boolean getAllowVirtualNetworkAccess() {
    return allowVirtualNetworkAccess;
  }

  public void setAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
    this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
  }

  public NetworkResponseVirtualNetworkPeeringsModel allowForwardedTraffic(Boolean allowForwardedTraffic) {
    this.allowForwardedTraffic = allowForwardedTraffic;
    return this;
  }

  /**
   * Get allowForwardedTraffic
   * @return allowForwardedTraffic
  */
  @ApiModelProperty(value = "")


  public Boolean getAllowForwardedTraffic() {
    return allowForwardedTraffic;
  }

  public void setAllowForwardedTraffic(Boolean allowForwardedTraffic) {
    this.allowForwardedTraffic = allowForwardedTraffic;
  }

  public NetworkResponseVirtualNetworkPeeringsModel allowGatewayTransit(Boolean allowGatewayTransit) {
    this.allowGatewayTransit = allowGatewayTransit;
    return this;
  }

  /**
   * Get allowGatewayTransit
   * @return allowGatewayTransit
  */
  @ApiModelProperty(value = "")


  public Boolean getAllowGatewayTransit() {
    return allowGatewayTransit;
  }

  public void setAllowGatewayTransit(Boolean allowGatewayTransit) {
    this.allowGatewayTransit = allowGatewayTransit;
  }

  public NetworkResponseVirtualNetworkPeeringsModel useRemoteGateways(Boolean useRemoteGateways) {
    this.useRemoteGateways = useRemoteGateways;
    return this;
  }

  /**
   * Get useRemoteGateways
   * @return useRemoteGateways
  */
  @ApiModelProperty(value = "")


  public Boolean getUseRemoteGateways() {
    return useRemoteGateways;
  }

  public void setUseRemoteGateways(Boolean useRemoteGateways) {
    this.useRemoteGateways = useRemoteGateways;
  }

  public NetworkResponseVirtualNetworkPeeringsModel remoteVirtualNetwork(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel remoteVirtualNetwork) {
    this.remoteVirtualNetwork = remoteVirtualNetwork;
    return this;
  }

  /**
   * Get remoteVirtualNetwork
   * @return remoteVirtualNetwork
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel getRemoteVirtualNetwork() {
    return remoteVirtualNetwork;
  }

  public void setRemoteVirtualNetwork(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel remoteVirtualNetwork) {
    this.remoteVirtualNetwork = remoteVirtualNetwork;
  }

  public NetworkResponseVirtualNetworkPeeringsModel remoteAddressSpace(NetworkResponseAddressSpaceModel remoteAddressSpace) {
    this.remoteAddressSpace = remoteAddressSpace;
    return this;
  }

  /**
   * Get remoteAddressSpace
   * @return remoteAddressSpace
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkResponseAddressSpaceModel getRemoteAddressSpace() {
    return remoteAddressSpace;
  }

  public void setRemoteAddressSpace(NetworkResponseAddressSpaceModel remoteAddressSpace) {
    this.remoteAddressSpace = remoteAddressSpace;
  }

  public NetworkResponseVirtualNetworkPeeringsModel peeringState(String peeringState) {
    this.peeringState = peeringState;
    return this;
  }

  /**
   * Get peeringState
   * @return peeringState
  */
  @ApiModelProperty(value = "")


  public String getPeeringState() {
    return peeringState;
  }

  public void setPeeringState(String peeringState) {
    this.peeringState = peeringState;
  }

  public NetworkResponseVirtualNetworkPeeringsModel name(String name) {
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
    NetworkResponseVirtualNetworkPeeringsModel networkResponseVirtualNetworkPeerings = (NetworkResponseVirtualNetworkPeeringsModel) o;
    return Objects.equals(this.id, networkResponseVirtualNetworkPeerings.id) &&
        Objects.equals(this.allowVirtualNetworkAccess, networkResponseVirtualNetworkPeerings.allowVirtualNetworkAccess) &&
        Objects.equals(this.allowForwardedTraffic, networkResponseVirtualNetworkPeerings.allowForwardedTraffic) &&
        Objects.equals(this.allowGatewayTransit, networkResponseVirtualNetworkPeerings.allowGatewayTransit) &&
        Objects.equals(this.useRemoteGateways, networkResponseVirtualNetworkPeerings.useRemoteGateways) &&
        Objects.equals(this.remoteVirtualNetwork, networkResponseVirtualNetworkPeerings.remoteVirtualNetwork) &&
        Objects.equals(this.remoteAddressSpace, networkResponseVirtualNetworkPeerings.remoteAddressSpace) &&
        Objects.equals(this.peeringState, networkResponseVirtualNetworkPeerings.peeringState) &&
        Objects.equals(this.name, networkResponseVirtualNetworkPeerings.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, allowVirtualNetworkAccess, allowForwardedTraffic, allowGatewayTransit, useRemoteGateways, remoteVirtualNetwork, remoteAddressSpace, peeringState, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkResponseVirtualNetworkPeeringsModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    allowVirtualNetworkAccess: ").append(toIndentedString(allowVirtualNetworkAccess)).append("\n");
    sb.append("    allowForwardedTraffic: ").append(toIndentedString(allowForwardedTraffic)).append("\n");
    sb.append("    allowGatewayTransit: ").append(toIndentedString(allowGatewayTransit)).append("\n");
    sb.append("    useRemoteGateways: ").append(toIndentedString(useRemoteGateways)).append("\n");
    sb.append("    remoteVirtualNetwork: ").append(toIndentedString(remoteVirtualNetwork)).append("\n");
    sb.append("    remoteAddressSpace: ").append(toIndentedString(remoteAddressSpace)).append("\n");
    sb.append("    peeringState: ").append(toIndentedString(peeringState)).append("\n");
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

