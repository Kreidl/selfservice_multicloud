package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel;
import com.kienast.rest.api.model.SubnetDelegationsModel;
import com.kienast.rest.api.model.SubnetNetworkSecurityGroupModel;
import com.kienast.rest.api.model.SubnetRouteTableModel;
import com.kienast.rest.api.model.SubnetServiceEndpointPoliciesModel;
import com.kienast.rest.api.model.SubnetServiceEndpointsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubnetModel
 */

public class SubnetModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("address_prefix")
  private String addressPrefix;

  @JsonProperty("address_prefixes")
  @Valid
  private List<String> addressPrefixes = null;

  @JsonProperty("network_security_group")
  private SubnetNetworkSecurityGroupModel networkSecurityGroup = null;

  @JsonProperty("route_table")
  private SubnetRouteTableModel routeTable = null;

  @JsonProperty("nat_gateway")
  private AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel natGateway = null;

  @JsonProperty("service_endpoints")
  @Valid
  private List<SubnetServiceEndpointsModel> serviceEndpoints = null;

  @JsonProperty("service_endpoint_policies")
  @Valid
  private List<SubnetServiceEndpointPoliciesModel> serviceEndpointPolicies = null;

  @JsonProperty("delegations")
  @Valid
  private List<SubnetDelegationsModel> delegations = null;

  @JsonProperty("private_endpoint_network_policies")
  private String privateEndpointNetworkPolicies;

  @JsonProperty("private_link_service_network_policies")
  private String privateLinkServiceNetworkPolicies;

  @JsonProperty("name")
  private String name;

  public SubnetModel id(String id) {
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

  public SubnetModel addressPrefix(String addressPrefix) {
    this.addressPrefix = addressPrefix;
    return this;
  }

  /**
   * Get addressPrefix
   * @return addressPrefix
  */
  @ApiModelProperty(value = "")


  public String getAddressPrefix() {
    return addressPrefix;
  }

  public void setAddressPrefix(String addressPrefix) {
    this.addressPrefix = addressPrefix;
  }

  public SubnetModel addressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
    return this;
  }

  public SubnetModel addAddressPrefixesItem(String addressPrefixesItem) {
    if (this.addressPrefixes == null) {
      this.addressPrefixes = new ArrayList<String>();
    }
    this.addressPrefixes.add(addressPrefixesItem);
    return this;
  }

  /**
   * Get addressPrefixes
   * @return addressPrefixes
  */
  @ApiModelProperty(value = "")


  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }

  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }

  public SubnetModel networkSecurityGroup(SubnetNetworkSecurityGroupModel networkSecurityGroup) {
    this.networkSecurityGroup = networkSecurityGroup;
    return this;
  }

  /**
   * Get networkSecurityGroup
   * @return networkSecurityGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubnetNetworkSecurityGroupModel getNetworkSecurityGroup() {
    return networkSecurityGroup;
  }

  public void setNetworkSecurityGroup(SubnetNetworkSecurityGroupModel networkSecurityGroup) {
    this.networkSecurityGroup = networkSecurityGroup;
  }

  public SubnetModel routeTable(SubnetRouteTableModel routeTable) {
    this.routeTable = routeTable;
    return this;
  }

  /**
   * Get routeTable
   * @return routeTable
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubnetRouteTableModel getRouteTable() {
    return routeTable;
  }

  public void setRouteTable(SubnetRouteTableModel routeTable) {
    this.routeTable = routeTable;
  }

  public SubnetModel natGateway(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel natGateway) {
    this.natGateway = natGateway;
    return this;
  }

  /**
   * Get natGateway
   * @return natGateway
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel getNatGateway() {
    return natGateway;
  }

  public void setNatGateway(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel natGateway) {
    this.natGateway = natGateway;
  }

  public SubnetModel serviceEndpoints(List<SubnetServiceEndpointsModel> serviceEndpoints) {
    this.serviceEndpoints = serviceEndpoints;
    return this;
  }

  public SubnetModel addServiceEndpointsItem(SubnetServiceEndpointsModel serviceEndpointsItem) {
    if (this.serviceEndpoints == null) {
      this.serviceEndpoints = new ArrayList<SubnetServiceEndpointsModel>();
    }
    this.serviceEndpoints.add(serviceEndpointsItem);
    return this;
  }

  /**
   * Get serviceEndpoints
   * @return serviceEndpoints
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubnetServiceEndpointsModel> getServiceEndpoints() {
    return serviceEndpoints;
  }

  public void setServiceEndpoints(List<SubnetServiceEndpointsModel> serviceEndpoints) {
    this.serviceEndpoints = serviceEndpoints;
  }

  public SubnetModel serviceEndpointPolicies(List<SubnetServiceEndpointPoliciesModel> serviceEndpointPolicies) {
    this.serviceEndpointPolicies = serviceEndpointPolicies;
    return this;
  }

  public SubnetModel addServiceEndpointPoliciesItem(SubnetServiceEndpointPoliciesModel serviceEndpointPoliciesItem) {
    if (this.serviceEndpointPolicies == null) {
      this.serviceEndpointPolicies = new ArrayList<SubnetServiceEndpointPoliciesModel>();
    }
    this.serviceEndpointPolicies.add(serviceEndpointPoliciesItem);
    return this;
  }

  /**
   * Get serviceEndpointPolicies
   * @return serviceEndpointPolicies
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubnetServiceEndpointPoliciesModel> getServiceEndpointPolicies() {
    return serviceEndpointPolicies;
  }

  public void setServiceEndpointPolicies(List<SubnetServiceEndpointPoliciesModel> serviceEndpointPolicies) {
    this.serviceEndpointPolicies = serviceEndpointPolicies;
  }

  public SubnetModel delegations(List<SubnetDelegationsModel> delegations) {
    this.delegations = delegations;
    return this;
  }

  public SubnetModel addDelegationsItem(SubnetDelegationsModel delegationsItem) {
    if (this.delegations == null) {
      this.delegations = new ArrayList<SubnetDelegationsModel>();
    }
    this.delegations.add(delegationsItem);
    return this;
  }

  /**
   * Get delegations
   * @return delegations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubnetDelegationsModel> getDelegations() {
    return delegations;
  }

  public void setDelegations(List<SubnetDelegationsModel> delegations) {
    this.delegations = delegations;
  }

  public SubnetModel privateEndpointNetworkPolicies(String privateEndpointNetworkPolicies) {
    this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
    return this;
  }

  /**
   * Get privateEndpointNetworkPolicies
   * @return privateEndpointNetworkPolicies
  */
  @ApiModelProperty(value = "")


  public String getPrivateEndpointNetworkPolicies() {
    return privateEndpointNetworkPolicies;
  }

  public void setPrivateEndpointNetworkPolicies(String privateEndpointNetworkPolicies) {
    this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
  }

  public SubnetModel privateLinkServiceNetworkPolicies(String privateLinkServiceNetworkPolicies) {
    this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
    return this;
  }

  /**
   * Get privateLinkServiceNetworkPolicies
   * @return privateLinkServiceNetworkPolicies
  */
  @ApiModelProperty(value = "")


  public String getPrivateLinkServiceNetworkPolicies() {
    return privateLinkServiceNetworkPolicies;
  }

  public void setPrivateLinkServiceNetworkPolicies(String privateLinkServiceNetworkPolicies) {
    this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
  }

  public SubnetModel name(String name) {
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
    SubnetModel subnet = (SubnetModel) o;
    return Objects.equals(this.id, subnet.id) &&
        Objects.equals(this.addressPrefix, subnet.addressPrefix) &&
        Objects.equals(this.addressPrefixes, subnet.addressPrefixes) &&
        Objects.equals(this.networkSecurityGroup, subnet.networkSecurityGroup) &&
        Objects.equals(this.routeTable, subnet.routeTable) &&
        Objects.equals(this.natGateway, subnet.natGateway) &&
        Objects.equals(this.serviceEndpoints, subnet.serviceEndpoints) &&
        Objects.equals(this.serviceEndpointPolicies, subnet.serviceEndpointPolicies) &&
        Objects.equals(this.delegations, subnet.delegations) &&
        Objects.equals(this.privateEndpointNetworkPolicies, subnet.privateEndpointNetworkPolicies) &&
        Objects.equals(this.privateLinkServiceNetworkPolicies, subnet.privateLinkServiceNetworkPolicies) &&
        Objects.equals(this.name, subnet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressPrefix, addressPrefixes, networkSecurityGroup, routeTable, natGateway, serviceEndpoints, serviceEndpointPolicies, delegations, privateEndpointNetworkPolicies, privateLinkServiceNetworkPolicies, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressPrefix: ").append(toIndentedString(addressPrefix)).append("\n");
    sb.append("    addressPrefixes: ").append(toIndentedString(addressPrefixes)).append("\n");
    sb.append("    networkSecurityGroup: ").append(toIndentedString(networkSecurityGroup)).append("\n");
    sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
    sb.append("    natGateway: ").append(toIndentedString(natGateway)).append("\n");
    sb.append("    serviceEndpoints: ").append(toIndentedString(serviceEndpoints)).append("\n");
    sb.append("    serviceEndpointPolicies: ").append(toIndentedString(serviceEndpointPolicies)).append("\n");
    sb.append("    delegations: ").append(toIndentedString(delegations)).append("\n");
    sb.append("    privateEndpointNetworkPolicies: ").append(toIndentedString(privateEndpointNetworkPolicies)).append("\n");
    sb.append("    privateLinkServiceNetworkPolicies: ").append(toIndentedString(privateLinkServiceNetworkPolicies)).append("\n");
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

