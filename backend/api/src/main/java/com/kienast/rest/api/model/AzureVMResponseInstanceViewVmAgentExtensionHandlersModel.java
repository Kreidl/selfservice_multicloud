package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.StatusesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewVmAgentExtensionHandlersModel
 */

public class AzureVMResponseInstanceViewVmAgentExtensionHandlersModel   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("type_handler_version")
  private String typeHandlerVersion;

  @JsonProperty("status")
  private StatusesModel status = null;

  public AzureVMResponseInstanceViewVmAgentExtensionHandlersModel type(String type) {
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

  public AzureVMResponseInstanceViewVmAgentExtensionHandlersModel typeHandlerVersion(String typeHandlerVersion) {
    this.typeHandlerVersion = typeHandlerVersion;
    return this;
  }

  /**
   * Get typeHandlerVersion
   * @return typeHandlerVersion
  */
  @ApiModelProperty(value = "")


  public String getTypeHandlerVersion() {
    return typeHandlerVersion;
  }

  public void setTypeHandlerVersion(String typeHandlerVersion) {
    this.typeHandlerVersion = typeHandlerVersion;
  }

  public AzureVMResponseInstanceViewVmAgentExtensionHandlersModel status(StatusesModel status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusesModel getStatus() {
    return status;
  }

  public void setStatus(StatusesModel status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMResponseInstanceViewVmAgentExtensionHandlersModel azureVMResponseInstanceViewVmAgentExtensionHandlers = (AzureVMResponseInstanceViewVmAgentExtensionHandlersModel) o;
    return Objects.equals(this.type, azureVMResponseInstanceViewVmAgentExtensionHandlers.type) &&
        Objects.equals(this.typeHandlerVersion, azureVMResponseInstanceViewVmAgentExtensionHandlers.typeHandlerVersion) &&
        Objects.equals(this.status, azureVMResponseInstanceViewVmAgentExtensionHandlers.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, typeHandlerVersion, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewVmAgentExtensionHandlersModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeHandlerVersion: ").append(toIndentedString(typeHandlerVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

