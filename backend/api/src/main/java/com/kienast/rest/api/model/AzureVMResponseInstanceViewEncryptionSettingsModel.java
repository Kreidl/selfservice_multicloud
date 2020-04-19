package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDiskEncryptionKeyModel;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewKeyEncryptionKeyModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewEncryptionSettingsModel
 */

public class AzureVMResponseInstanceViewEncryptionSettingsModel   {
  @JsonProperty("disk_encryption_key")
  private AzureVMResponseInstanceViewDiskEncryptionKeyModel diskEncryptionKey = null;

  @JsonProperty("key_encryption_key")
  private AzureVMResponseInstanceViewKeyEncryptionKeyModel keyEncryptionKey = null;

  @JsonProperty("enabled")
  private Boolean enabled;

  public AzureVMResponseInstanceViewEncryptionSettingsModel diskEncryptionKey(AzureVMResponseInstanceViewDiskEncryptionKeyModel diskEncryptionKey) {
    this.diskEncryptionKey = diskEncryptionKey;
    return this;
  }

  /**
   * Get diskEncryptionKey
   * @return diskEncryptionKey
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewDiskEncryptionKeyModel getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  public void setDiskEncryptionKey(AzureVMResponseInstanceViewDiskEncryptionKeyModel diskEncryptionKey) {
    this.diskEncryptionKey = diskEncryptionKey;
  }

  public AzureVMResponseInstanceViewEncryptionSettingsModel keyEncryptionKey(AzureVMResponseInstanceViewKeyEncryptionKeyModel keyEncryptionKey) {
    this.keyEncryptionKey = keyEncryptionKey;
    return this;
  }

  /**
   * Get keyEncryptionKey
   * @return keyEncryptionKey
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewKeyEncryptionKeyModel getKeyEncryptionKey() {
    return keyEncryptionKey;
  }

  public void setKeyEncryptionKey(AzureVMResponseInstanceViewKeyEncryptionKeyModel keyEncryptionKey) {
    this.keyEncryptionKey = keyEncryptionKey;
  }

  public AzureVMResponseInstanceViewEncryptionSettingsModel enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  @ApiModelProperty(value = "")


  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMResponseInstanceViewEncryptionSettingsModel azureVMResponseInstanceViewEncryptionSettings = (AzureVMResponseInstanceViewEncryptionSettingsModel) o;
    return Objects.equals(this.diskEncryptionKey, azureVMResponseInstanceViewEncryptionSettings.diskEncryptionKey) &&
        Objects.equals(this.keyEncryptionKey, azureVMResponseInstanceViewEncryptionSettings.keyEncryptionKey) &&
        Objects.equals(this.enabled, azureVMResponseInstanceViewEncryptionSettings.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskEncryptionKey, keyEncryptionKey, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewEncryptionSettingsModel {\n");
    
    sb.append("    diskEncryptionKey: ").append(toIndentedString(diskEncryptionKey)).append("\n");
    sb.append("    keyEncryptionKey: ").append(toIndentedString(keyEncryptionKey)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

