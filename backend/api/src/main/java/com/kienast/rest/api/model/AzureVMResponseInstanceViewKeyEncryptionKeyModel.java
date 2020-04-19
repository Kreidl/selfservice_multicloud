package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewKeyEncryptionKeyModel
 */

public class AzureVMResponseInstanceViewKeyEncryptionKeyModel   {
  @JsonProperty("key_url")
  private String keyUrl;

  @JsonProperty("source_vault")
  private AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel sourceVault = null;

  public AzureVMResponseInstanceViewKeyEncryptionKeyModel keyUrl(String keyUrl) {
    this.keyUrl = keyUrl;
    return this;
  }

  /**
   * Get keyUrl
   * @return keyUrl
  */
  @ApiModelProperty(value = "")


  public String getKeyUrl() {
    return keyUrl;
  }

  public void setKeyUrl(String keyUrl) {
    this.keyUrl = keyUrl;
  }

  public AzureVMResponseInstanceViewKeyEncryptionKeyModel sourceVault(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel sourceVault) {
    this.sourceVault = sourceVault;
    return this;
  }

  /**
   * Get sourceVault
   * @return sourceVault
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel getSourceVault() {
    return sourceVault;
  }

  public void setSourceVault(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel sourceVault) {
    this.sourceVault = sourceVault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMResponseInstanceViewKeyEncryptionKeyModel azureVMResponseInstanceViewKeyEncryptionKey = (AzureVMResponseInstanceViewKeyEncryptionKeyModel) o;
    return Objects.equals(this.keyUrl, azureVMResponseInstanceViewKeyEncryptionKey.keyUrl) &&
        Objects.equals(this.sourceVault, azureVMResponseInstanceViewKeyEncryptionKey.sourceVault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyUrl, sourceVault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewKeyEncryptionKeyModel {\n");
    
    sb.append("    keyUrl: ").append(toIndentedString(keyUrl)).append("\n");
    sb.append("    sourceVault: ").append(toIndentedString(sourceVault)).append("\n");
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

