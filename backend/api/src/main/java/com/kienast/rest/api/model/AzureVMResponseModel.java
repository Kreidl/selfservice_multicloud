package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseModel
 */

public class AzureVMResponseModel   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("provisioning_state")
  private String provisioningState;

  @JsonProperty("instance_view")
  private AzureVMResponseInstanceViewModel instanceView = null;

  @JsonProperty("vm_id")
  private String vmId;

  public AzureVMResponseModel id(String id) {
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

  public AzureVMResponseModel name(String name) {
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

  public AzureVMResponseModel type(String type) {
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

  public AzureVMResponseModel provisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
    return this;
  }

  /**
   * Get provisioningState
   * @return provisioningState
  */
  @ApiModelProperty(value = "")


  public String getProvisioningState() {
    return provisioningState;
  }

  public void setProvisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
  }

  public AzureVMResponseModel instanceView(AzureVMResponseInstanceViewModel instanceView) {
    this.instanceView = instanceView;
    return this;
  }

  /**
   * Get instanceView
   * @return instanceView
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewModel getInstanceView() {
    return instanceView;
  }

  public void setInstanceView(AzureVMResponseInstanceViewModel instanceView) {
    this.instanceView = instanceView;
  }

  public AzureVMResponseModel vmId(String vmId) {
    this.vmId = vmId;
    return this;
  }

  /**
   * Get vmId
   * @return vmId
  */
  @ApiModelProperty(value = "")


  public String getVmId() {
    return vmId;
  }

  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMResponseModel azureVMResponse = (AzureVMResponseModel) o;
    return Objects.equals(this.id, azureVMResponse.id) &&
        Objects.equals(this.name, azureVMResponse.name) &&
        Objects.equals(this.type, azureVMResponse.type) &&
        Objects.equals(this.provisioningState, azureVMResponse.provisioningState) &&
        Objects.equals(this.instanceView, azureVMResponse.instanceView) &&
        Objects.equals(this.vmId, azureVMResponse.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, provisioningState, instanceView, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
    sb.append("    instanceView: ").append(toIndentedString(instanceView)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

