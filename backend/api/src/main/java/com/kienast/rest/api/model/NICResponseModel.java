package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel;
import com.kienast.rest.api.model.NICResponsePrivateEndpointModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NICResponseModel
 */

public class NICResponseModel   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("virtual_machine")
  private AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel virtualMachine = null;

  @JsonProperty("private_endpoint")
  private NICResponsePrivateEndpointModel privateEndpoint = null;

  @JsonProperty("hosted_workloads")
  @Valid
  private List<String> hostedWorkloads = null;

  public NICResponseModel name(String name) {
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

  public NICResponseModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NICResponseModel virtualMachine(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel virtualMachine) {
    this.virtualMachine = virtualMachine;
    return this;
  }

  /**
   * Get virtualMachine
   * @return virtualMachine
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel getVirtualMachine() {
    return virtualMachine;
  }

  public void setVirtualMachine(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel virtualMachine) {
    this.virtualMachine = virtualMachine;
  }

  public NICResponseModel privateEndpoint(NICResponsePrivateEndpointModel privateEndpoint) {
    this.privateEndpoint = privateEndpoint;
    return this;
  }

  /**
   * Get privateEndpoint
   * @return privateEndpoint
  */
  @ApiModelProperty(value = "")

  @Valid

  public NICResponsePrivateEndpointModel getPrivateEndpoint() {
    return privateEndpoint;
  }

  public void setPrivateEndpoint(NICResponsePrivateEndpointModel privateEndpoint) {
    this.privateEndpoint = privateEndpoint;
  }

  public NICResponseModel hostedWorkloads(List<String> hostedWorkloads) {
    this.hostedWorkloads = hostedWorkloads;
    return this;
  }

  public NICResponseModel addHostedWorkloadsItem(String hostedWorkloadsItem) {
    if (this.hostedWorkloads == null) {
      this.hostedWorkloads = new ArrayList<String>();
    }
    this.hostedWorkloads.add(hostedWorkloadsItem);
    return this;
  }

  /**
   * Get hostedWorkloads
   * @return hostedWorkloads
  */
  @ApiModelProperty(value = "")


  public List<String> getHostedWorkloads() {
    return hostedWorkloads;
  }

  public void setHostedWorkloads(List<String> hostedWorkloads) {
    this.hostedWorkloads = hostedWorkloads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NICResponseModel niCResponse = (NICResponseModel) o;
    return Objects.equals(this.name, niCResponse.name) &&
        Objects.equals(this.type, niCResponse.type) &&
        Objects.equals(this.virtualMachine, niCResponse.virtualMachine) &&
        Objects.equals(this.privateEndpoint, niCResponse.privateEndpoint) &&
        Objects.equals(this.hostedWorkloads, niCResponse.hostedWorkloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, virtualMachine, privateEndpoint, hostedWorkloads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NICResponseModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    virtualMachine: ").append(toIndentedString(virtualMachine)).append("\n");
    sb.append("    privateEndpoint: ").append(toIndentedString(privateEndpoint)).append("\n");
    sb.append("    hostedWorkloads: ").append(toIndentedString(hostedWorkloads)).append("\n");
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

