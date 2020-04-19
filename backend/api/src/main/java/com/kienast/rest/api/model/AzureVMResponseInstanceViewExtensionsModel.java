package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.StatusesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewExtensionsModel
 */

public class AzureVMResponseInstanceViewExtensionsModel   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("type_handler_version")
  private String typeHandlerVersion;

  @JsonProperty("substatuses")
  @Valid
  private List<StatusesModel> substatuses = null;

  @JsonProperty("statuses")
  @Valid
  private List<StatusesModel> statuses = null;

  public AzureVMResponseInstanceViewExtensionsModel name(String name) {
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

  public AzureVMResponseInstanceViewExtensionsModel type(String type) {
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

  public AzureVMResponseInstanceViewExtensionsModel typeHandlerVersion(String typeHandlerVersion) {
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

  public AzureVMResponseInstanceViewExtensionsModel substatuses(List<StatusesModel> substatuses) {
    this.substatuses = substatuses;
    return this;
  }

  public AzureVMResponseInstanceViewExtensionsModel addSubstatusesItem(StatusesModel substatusesItem) {
    if (this.substatuses == null) {
      this.substatuses = new ArrayList<StatusesModel>();
    }
    this.substatuses.add(substatusesItem);
    return this;
  }

  /**
   * Get substatuses
   * @return substatuses
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusesModel> getSubstatuses() {
    return substatuses;
  }

  public void setSubstatuses(List<StatusesModel> substatuses) {
    this.substatuses = substatuses;
  }

  public AzureVMResponseInstanceViewExtensionsModel statuses(List<StatusesModel> statuses) {
    this.statuses = statuses;
    return this;
  }

  public AzureVMResponseInstanceViewExtensionsModel addStatusesItem(StatusesModel statusesItem) {
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
    AzureVMResponseInstanceViewExtensionsModel azureVMResponseInstanceViewExtensions = (AzureVMResponseInstanceViewExtensionsModel) o;
    return Objects.equals(this.name, azureVMResponseInstanceViewExtensions.name) &&
        Objects.equals(this.type, azureVMResponseInstanceViewExtensions.type) &&
        Objects.equals(this.typeHandlerVersion, azureVMResponseInstanceViewExtensions.typeHandlerVersion) &&
        Objects.equals(this.substatuses, azureVMResponseInstanceViewExtensions.substatuses) &&
        Objects.equals(this.statuses, azureVMResponseInstanceViewExtensions.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, typeHandlerVersion, substatuses, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewExtensionsModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeHandlerVersion: ").append(toIndentedString(typeHandlerVersion)).append("\n");
    sb.append("    substatuses: ").append(toIndentedString(substatuses)).append("\n");
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

