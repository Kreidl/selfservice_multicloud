package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewVmAgentExtensionHandlersModel;
import com.kienast.rest.api.model.StatusesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewVmAgentModel
 */

public class AzureVMResponseInstanceViewVmAgentModel   {
  @JsonProperty("vm_agent_version")
  private String vmAgentVersion;

  @JsonProperty("extension_handlers")
  @Valid
  private List<AzureVMResponseInstanceViewVmAgentExtensionHandlersModel> extensionHandlers = null;

  @JsonProperty("statuses")
  @Valid
  private List<StatusesModel> statuses = null;

  public AzureVMResponseInstanceViewVmAgentModel vmAgentVersion(String vmAgentVersion) {
    this.vmAgentVersion = vmAgentVersion;
    return this;
  }

  /**
   * Get vmAgentVersion
   * @return vmAgentVersion
  */
  @ApiModelProperty(value = "")


  public String getVmAgentVersion() {
    return vmAgentVersion;
  }

  public void setVmAgentVersion(String vmAgentVersion) {
    this.vmAgentVersion = vmAgentVersion;
  }

  public AzureVMResponseInstanceViewVmAgentModel extensionHandlers(List<AzureVMResponseInstanceViewVmAgentExtensionHandlersModel> extensionHandlers) {
    this.extensionHandlers = extensionHandlers;
    return this;
  }

  public AzureVMResponseInstanceViewVmAgentModel addExtensionHandlersItem(AzureVMResponseInstanceViewVmAgentExtensionHandlersModel extensionHandlersItem) {
    if (this.extensionHandlers == null) {
      this.extensionHandlers = new ArrayList<AzureVMResponseInstanceViewVmAgentExtensionHandlersModel>();
    }
    this.extensionHandlers.add(extensionHandlersItem);
    return this;
  }

  /**
   * Get extensionHandlers
   * @return extensionHandlers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AzureVMResponseInstanceViewVmAgentExtensionHandlersModel> getExtensionHandlers() {
    return extensionHandlers;
  }

  public void setExtensionHandlers(List<AzureVMResponseInstanceViewVmAgentExtensionHandlersModel> extensionHandlers) {
    this.extensionHandlers = extensionHandlers;
  }

  public AzureVMResponseInstanceViewVmAgentModel statuses(List<StatusesModel> statuses) {
    this.statuses = statuses;
    return this;
  }

  public AzureVMResponseInstanceViewVmAgentModel addStatusesItem(StatusesModel statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<StatusesModel>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusesModel> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusesModel> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMResponseInstanceViewVmAgentModel azureVMResponseInstanceViewVmAgent = (AzureVMResponseInstanceViewVmAgentModel) o;
    return Objects.equals(this.vmAgentVersion, azureVMResponseInstanceViewVmAgent.vmAgentVersion) &&
        Objects.equals(this.extensionHandlers, azureVMResponseInstanceViewVmAgent.extensionHandlers) &&
        Objects.equals(this.statuses, azureVMResponseInstanceViewVmAgent.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmAgentVersion, extensionHandlers, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewVmAgentModel {\n");
    
    sb.append("    vmAgentVersion: ").append(toIndentedString(vmAgentVersion)).append("\n");
    sb.append("    extensionHandlers: ").append(toIndentedString(extensionHandlers)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

