package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel;
import com.kienast.rest.api.model.NetworkResponseAddressSpaceModel;
import com.kienast.rest.api.model.NetworkResponseBgpCommunitiesModel;
import com.kienast.rest.api.model.NetworkResponseDhcpOptionsModel;
import com.kienast.rest.api.model.NetworkResponseTagsModel;
import com.kienast.rest.api.model.NetworkResponseVirtualNetworkPeeringsModel;
import com.kienast.rest.api.model.SubnetModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NetworkResponseModel
 */

public class NetworkResponseModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("location")
  private String location;

  @JsonProperty("tags")
  private NetworkResponseTagsModel tags = null;

  @JsonProperty("address_space")
  private NetworkResponseAddressSpaceModel addressSpace = null;

  @JsonProperty("dhcp_options")
  private NetworkResponseDhcpOptionsModel dhcpOptions = null;

  @JsonProperty("subnets")
  @Valid
  private List<SubnetModel> subnets = null;

  @JsonProperty("virtual_network_peerings")
  @Valid
  private List<NetworkResponseVirtualNetworkPeeringsModel> virtualNetworkPeerings = null;

  @JsonProperty("enable_ddos_protection")
  private Boolean enableDdosProtection;

  @JsonProperty("enable_vm_protection")
  private Boolean enableVmProtection;

  @JsonProperty("ddos_protection_plan")
  private AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel ddosProtectionPlan = null;

  @JsonProperty("bgp_communities")
  private NetworkResponseBgpCommunitiesModel bgpCommunities = null;

  public NetworkResponseModel id(String id) {
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

  public NetworkResponseModel location(String location) {
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

  public NetworkResponseModel tags(NetworkResponseTagsModel tags) {
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

  public NetworkResponseModel addressSpace(NetworkResponseAddressSpaceModel addressSpace) {
    this.addressSpace = addressSpace;
    return this;
  }

  /**
   * Get addressSpace
   * @return addressSpace
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkResponseAddressSpaceModel getAddressSpace() {
    return addressSpace;
  }

  public void setAddressSpace(NetworkResponseAddressSpaceModel addressSpace) {
    this.addressSpace = addressSpace;
  }

  public NetworkResponseModel dhcpOptions(NetworkResponseDhcpOptionsModel dhcpOptions) {
    this.dhcpOptions = dhcpOptions;
    return this;
  }

  /**
   * Get dhcpOptions
   * @return dhcpOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkResponseDhcpOptionsModel getDhcpOptions() {
    return dhcpOptions;
  }

  public void setDhcpOptions(NetworkResponseDhcpOptionsModel dhcpOptions) {
    this.dhcpOptions = dhcpOptions;
  }

  public NetworkResponseModel subnets(List<SubnetModel> subnets) {
    this.subnets = subnets;
    return this;
  }

  public NetworkResponseModel addSubnetsItem(SubnetModel subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<SubnetModel>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

  /**
   * Get subnets
   * @return subnets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubnetModel> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<SubnetModel> subnets) {
    this.subnets = subnets;
  }

  public NetworkResponseModel virtualNetworkPeerings(List<NetworkResponseVirtualNetworkPeeringsModel> virtualNetworkPeerings) {
    this.virtualNetworkPeerings = virtualNetworkPeerings;
    return this;
  }

  public NetworkResponseModel addVirtualNetworkPeeringsItem(NetworkResponseVirtualNetworkPeeringsModel virtualNetworkPeeringsItem) {
    if (this.virtualNetworkPeerings == null) {
      this.virtualNetworkPeerings = new ArrayList<NetworkResponseVirtualNetworkPeeringsModel>();
    }
    this.virtualNetworkPeerings.add(virtualNetworkPeeringsItem);
    return this;
  }

  /**
   * Get virtualNetworkPeerings
   * @return virtualNetworkPeerings
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<NetworkResponseVirtualNetworkPeeringsModel> getVirtualNetworkPeerings() {
    return virtualNetworkPeerings;
  }

  public void setVirtualNetworkPeerings(List<NetworkResponseVirtualNetworkPeeringsModel> virtualNetworkPeerings) {
    this.virtualNetworkPeerings = virtualNetworkPeerings;
  }

  public NetworkResponseModel enableDdosProtection(Boolean enableDdosProtection) {
    this.enableDdosProtection = enableDdosProtection;
    return this;
  }

  /**
   * Get enableDdosProtection
   * @return enableDdosProtection
  */
  @ApiModelProperty(value = "")


  public Boolean getEnableDdosProtection() {
    return enableDdosProtection;
  }

  public void setEnableDdosProtection(Boolean enableDdosProtection) {
    this.enableDdosProtection = enableDdosProtection;
  }

  public NetworkResponseModel enableVmProtection(Boolean enableVmProtection) {
    this.enableVmProtection = enableVmProtection;
    return this;
  }

  /**
   * Get enableVmProtection
   * @return enableVmProtection
  */
  @ApiModelProperty(value = "")


  public Boolean getEnableVmProtection() {
    return enableVmProtection;
  }

  public void setEnableVmProtection(Boolean enableVmProtection) {
    this.enableVmProtection = enableVmProtection;
  }

  public NetworkResponseModel ddosProtectionPlan(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel ddosProtectionPlan) {
    this.ddosProtectionPlan = ddosProtectionPlan;
    return this;
  }

  /**
   * Get ddosProtectionPlan
   * @return ddosProtectionPlan
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel getDdosProtectionPlan() {
    return ddosProtectionPlan;
  }

  public void setDdosProtectionPlan(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel ddosProtectionPlan) {
    this.ddosProtectionPlan = ddosProtectionPlan;
  }

  public NetworkResponseModel bgpCommunities(NetworkResponseBgpCommunitiesModel bgpCommunities) {
    this.bgpCommunities = bgpCommunities;
    return this;
  }

  /**
   * Get bgpCommunities
   * @return bgpCommunities
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkResponseBgpCommunitiesModel getBgpCommunities() {
    return bgpCommunities;
  }

  public void setBgpCommunities(NetworkResponseBgpCommunitiesModel bgpCommunities) {
    this.bgpCommunities = bgpCommunities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkResponseModel networkResponse = (NetworkResponseModel) o;
    return Objects.equals(this.id, networkResponse.id) &&
        Objects.equals(this.location, networkResponse.location) &&
        Objects.equals(this.tags, networkResponse.tags) &&
        Objects.equals(this.addressSpace, networkResponse.addressSpace) &&
        Objects.equals(this.dhcpOptions, networkResponse.dhcpOptions) &&
        Objects.equals(this.subnets, networkResponse.subnets) &&
        Objects.equals(this.virtualNetworkPeerings, networkResponse.virtualNetworkPeerings) &&
        Objects.equals(this.enableDdosProtection, networkResponse.enableDdosProtection) &&
        Objects.equals(this.enableVmProtection, networkResponse.enableVmProtection) &&
        Objects.equals(this.ddosProtectionPlan, networkResponse.ddosProtectionPlan) &&
        Objects.equals(this.bgpCommunities, networkResponse.bgpCommunities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, tags, addressSpace, dhcpOptions, subnets, virtualNetworkPeerings, enableDdosProtection, enableVmProtection, ddosProtectionPlan, bgpCommunities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkResponseModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    addressSpace: ").append(toIndentedString(addressSpace)).append("\n");
    sb.append("    dhcpOptions: ").append(toIndentedString(dhcpOptions)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    virtualNetworkPeerings: ").append(toIndentedString(virtualNetworkPeerings)).append("\n");
    sb.append("    enableDdosProtection: ").append(toIndentedString(enableDdosProtection)).append("\n");
    sb.append("    enableVmProtection: ").append(toIndentedString(enableVmProtection)).append("\n");
    sb.append("    ddosProtectionPlan: ").append(toIndentedString(ddosProtectionPlan)).append("\n");
    sb.append("    bgpCommunities: ").append(toIndentedString(bgpCommunities)).append("\n");
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

