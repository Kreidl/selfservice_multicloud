package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewEncryptionSettingsModel;
import com.kienast.rest.api.model.StatusesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewDisksModel
 */

public class AzureVMResponseInstanceViewDisksModel   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("encryption_settings")
  @Valid
  private List<AzureVMResponseInstanceViewEncryptionSettingsModel> encryptionSettings = null;

  @JsonProperty("statuses")
  @Valid
  private List<StatusesModel> statuses = null;

  public AzureVMResponseInstanceViewDisksModel name(String name) {
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

  public AzureVMResponseInstanceViewDisksModel encryptionSettings(List<AzureVMResponseInstanceViewEncryptionSettingsModel> encryptionSettings) {
    this.encryptionSettings = encryptionSettings;
    return this;
  }

  public AzureVMResponseInstanceViewDisksModel addEncryptionSettingsItem(AzureVMResponseInstanceViewEncryptionSettingsModel encryptionSettingsItem) {
    if (this.encryptionSettings == null) {
      this.encryptionSettings = new ArrayList<AzureVMResponseInstanceViewEncryptionSettingsModel>();
    }
    this.encryptionSettings.add(encryptionSettingsItem);
    return this;
  }

  /**
   * Get encryptionSettings
   * @return encryptionSettings
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AzureVMResponseInstanceViewEncryptionSettingsModel> getEncryptionSettings() {
    return encryptionSettings;
  }

  public void setEncryptionSettings(List<AzureVMResponseInstanceViewEncryptionSettingsModel> encryptionSettings) {
    this.encryptionSettings = encryptionSettings;
  }

  public AzureVMResponseInstanceViewDisksModel statuses(List<StatusesModel> statuses) {
    this.statuses = statuses;
    return this;
  }

  public AzureVMResponseInstanceViewDisksModel addStatusesItem(StatusesModel statusesItem) {
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
    AzureVMResponseInstanceViewDisksModel azureVMResponseInstanceViewDisks = (AzureVMResponseInstanceViewDisksModel) o;
    return Objects.equals(this.name, azureVMResponseInstanceViewDisks.name) &&
        Objects.equals(this.encryptionSettings, azureVMResponseInstanceViewDisks.encryptionSettings) &&
        Objects.equals(this.statuses, azureVMResponseInstanceViewDisks.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, encryptionSettings, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewDisksModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    encryptionSettings: ").append(toIndentedString(encryptionSettings)).append("\n");
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

