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
 * AzureVMResponseInstanceViewDiskEncryptionKeyModel
 */

public class AzureVMResponseInstanceViewDiskEncryptionKeyModel   {
  @JsonProperty("secret_url")
  private String secretUrl;

  @JsonProperty("source_vault")
  private AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel sourceVault = null;

  public AzureVMResponseInstanceViewDiskEncryptionKeyModel secretUrl(String secretUrl) {
    this.secretUrl = secretUrl;
    return this;
  }

  /**
   * Get secretUrl
   * @return secretUrl
  */
  @ApiModelProperty(value = "")


  public String getSecretUrl() {
    return secretUrl;
  }

  public void setSecretUrl(String secretUrl) {
    this.secretUrl = secretUrl;
  }

  public AzureVMResponseInstanceViewDiskEncryptionKeyModel sourceVault(AzureVMResponseInstanceViewDiskEncryptionKeySourceVaultModel sourceVault) {
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
    AzureVMResponseInstanceViewDiskEncryptionKeyModel azureVMResponseInstanceViewDiskEncryptionKey = (AzureVMResponseInstanceViewDiskEncryptionKeyModel) o;
    return Objects.equals(this.secretUrl, azureVMResponseInstanceViewDiskEncryptionKey.secretUrl) &&
        Objects.equals(this.sourceVault, azureVMResponseInstanceViewDiskEncryptionKey.sourceVault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretUrl, sourceVault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewDiskEncryptionKeyModel {\n");
    
    sb.append("    secretUrl: ").append(toIndentedString(secretUrl)).append("\n");
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

