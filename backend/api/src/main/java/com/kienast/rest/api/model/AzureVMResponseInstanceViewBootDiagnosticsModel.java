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
 * AzureVMResponseInstanceViewBootDiagnosticsModel
 */

public class AzureVMResponseInstanceViewBootDiagnosticsModel   {
  @JsonProperty("console_screenshot_blob_uri")
  private String consoleScreenshotBlobUri;

  @JsonProperty("serial_console_log_blob_uri")
  private String serialConsoleLogBlobUri;

  @JsonProperty("status")
  private StatusesModel status = null;

  public AzureVMResponseInstanceViewBootDiagnosticsModel consoleScreenshotBlobUri(String consoleScreenshotBlobUri) {
    this.consoleScreenshotBlobUri = consoleScreenshotBlobUri;
    return this;
  }

  /**
   * Get consoleScreenshotBlobUri
   * @return consoleScreenshotBlobUri
  */
  @ApiModelProperty(value = "")


  public String getConsoleScreenshotBlobUri() {
    return consoleScreenshotBlobUri;
  }

  public void setConsoleScreenshotBlobUri(String consoleScreenshotBlobUri) {
    this.consoleScreenshotBlobUri = consoleScreenshotBlobUri;
  }

  public AzureVMResponseInstanceViewBootDiagnosticsModel serialConsoleLogBlobUri(String serialConsoleLogBlobUri) {
    this.serialConsoleLogBlobUri = serialConsoleLogBlobUri;
    return this;
  }

  /**
   * Get serialConsoleLogBlobUri
   * @return serialConsoleLogBlobUri
  */
  @ApiModelProperty(value = "")


  public String getSerialConsoleLogBlobUri() {
    return serialConsoleLogBlobUri;
  }

  public void setSerialConsoleLogBlobUri(String serialConsoleLogBlobUri) {
    this.serialConsoleLogBlobUri = serialConsoleLogBlobUri;
  }

  public AzureVMResponseInstanceViewBootDiagnosticsModel status(StatusesModel status) {
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
    AzureVMResponseInstanceViewBootDiagnosticsModel azureVMResponseInstanceViewBootDiagnostics = (AzureVMResponseInstanceViewBootDiagnosticsModel) o;
    return Objects.equals(this.consoleScreenshotBlobUri, azureVMResponseInstanceViewBootDiagnostics.consoleScreenshotBlobUri) &&
        Objects.equals(this.serialConsoleLogBlobUri, azureVMResponseInstanceViewBootDiagnostics.serialConsoleLogBlobUri) &&
        Objects.equals(this.status, azureVMResponseInstanceViewBootDiagnostics.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consoleScreenshotBlobUri, serialConsoleLogBlobUri, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewBootDiagnosticsModel {\n");
    
    sb.append("    consoleScreenshotBlobUri: ").append(toIndentedString(consoleScreenshotBlobUri)).append("\n");
    sb.append("    serialConsoleLogBlobUri: ").append(toIndentedString(serialConsoleLogBlobUri)).append("\n");
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

