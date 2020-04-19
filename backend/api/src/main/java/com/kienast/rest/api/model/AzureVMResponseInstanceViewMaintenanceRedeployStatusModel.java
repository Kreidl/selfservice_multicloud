package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewMaintenanceRedeployStatusModel
 */

public class AzureVMResponseInstanceViewMaintenanceRedeployStatusModel   {
  @JsonProperty("is_customer_initiated_maintenance_allowed")
  private Boolean isCustomerInitiatedMaintenanceAllowed;

  @JsonProperty("pre_maintenance_window_start_time")
  private OffsetDateTime preMaintenanceWindowStartTime;

  @JsonProperty("pre_maintenance_window_end_time")
  private OffsetDateTime preMaintenanceWindowEndTime;

  @JsonProperty("maintenance_window_start_time")
  private OffsetDateTime maintenanceWindowStartTime;

  @JsonProperty("maintenance_window_end_time")
  private OffsetDateTime maintenanceWindowEndTime;

  @JsonProperty("last_operation_result_code")
  private String lastOperationResultCode;

  @JsonProperty("last_operation_message")
  private String lastOperationMessage;

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel isCustomerInitiatedMaintenanceAllowed(Boolean isCustomerInitiatedMaintenanceAllowed) {
    this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
    return this;
  }

  /**
   * Get isCustomerInitiatedMaintenanceAllowed
   * @return isCustomerInitiatedMaintenanceAllowed
  */
  @ApiModelProperty(value = "")


  public Boolean getIsCustomerInitiatedMaintenanceAllowed() {
    return isCustomerInitiatedMaintenanceAllowed;
  }

  public void setIsCustomerInitiatedMaintenanceAllowed(Boolean isCustomerInitiatedMaintenanceAllowed) {
    this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
  }

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel preMaintenanceWindowStartTime(OffsetDateTime preMaintenanceWindowStartTime) {
    this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
    return this;
  }

  /**
   * Get preMaintenanceWindowStartTime
   * @return preMaintenanceWindowStartTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPreMaintenanceWindowStartTime() {
    return preMaintenanceWindowStartTime;
  }

  public void setPreMaintenanceWindowStartTime(OffsetDateTime preMaintenanceWindowStartTime) {
    this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
  }

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel preMaintenanceWindowEndTime(OffsetDateTime preMaintenanceWindowEndTime) {
    this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
    return this;
  }

  /**
   * Get preMaintenanceWindowEndTime
   * @return preMaintenanceWindowEndTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPreMaintenanceWindowEndTime() {
    return preMaintenanceWindowEndTime;
  }

  public void setPreMaintenanceWindowEndTime(OffsetDateTime preMaintenanceWindowEndTime) {
    this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
  }

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel maintenanceWindowStartTime(OffsetDateTime maintenanceWindowStartTime) {
    this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    return this;
  }

  /**
   * Get maintenanceWindowStartTime
   * @return maintenanceWindowStartTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getMaintenanceWindowStartTime() {
    return maintenanceWindowStartTime;
  }

  public void setMaintenanceWindowStartTime(OffsetDateTime maintenanceWindowStartTime) {
    this.maintenanceWindowStartTime = maintenanceWindowStartTime;
  }

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel maintenanceWindowEndTime(OffsetDateTime maintenanceWindowEndTime) {
    this.maintenanceWindowEndTime = maintenanceWindowEndTime;
    return this;
  }

  /**
   * Get maintenanceWindowEndTime
   * @return maintenanceWindowEndTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getMaintenanceWindowEndTime() {
    return maintenanceWindowEndTime;
  }

  public void setMaintenanceWindowEndTime(OffsetDateTime maintenanceWindowEndTime) {
    this.maintenanceWindowEndTime = maintenanceWindowEndTime;
  }

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel lastOperationResultCode(String lastOperationResultCode) {
    this.lastOperationResultCode = lastOperationResultCode;
    return this;
  }

  /**
   * Get lastOperationResultCode
   * @return lastOperationResultCode
  */
  @ApiModelProperty(value = "")


  public String getLastOperationResultCode() {
    return lastOperationResultCode;
  }

  public void setLastOperationResultCode(String lastOperationResultCode) {
    this.lastOperationResultCode = lastOperationResultCode;
  }

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel lastOperationMessage(String lastOperationMessage) {
    this.lastOperationMessage = lastOperationMessage;
    return this;
  }

  /**
   * Get lastOperationMessage
   * @return lastOperationMessage
  */
  @ApiModelProperty(value = "")


  public String getLastOperationMessage() {
    return lastOperationMessage;
  }

  public void setLastOperationMessage(String lastOperationMessage) {
    this.lastOperationMessage = lastOperationMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVMResponseInstanceViewMaintenanceRedeployStatusModel azureVMResponseInstanceViewMaintenanceRedeployStatus = (AzureVMResponseInstanceViewMaintenanceRedeployStatusModel) o;
    return Objects.equals(this.isCustomerInitiatedMaintenanceAllowed, azureVMResponseInstanceViewMaintenanceRedeployStatus.isCustomerInitiatedMaintenanceAllowed) &&
        Objects.equals(this.preMaintenanceWindowStartTime, azureVMResponseInstanceViewMaintenanceRedeployStatus.preMaintenanceWindowStartTime) &&
        Objects.equals(this.preMaintenanceWindowEndTime, azureVMResponseInstanceViewMaintenanceRedeployStatus.preMaintenanceWindowEndTime) &&
        Objects.equals(this.maintenanceWindowStartTime, azureVMResponseInstanceViewMaintenanceRedeployStatus.maintenanceWindowStartTime) &&
        Objects.equals(this.maintenanceWindowEndTime, azureVMResponseInstanceViewMaintenanceRedeployStatus.maintenanceWindowEndTime) &&
        Objects.equals(this.lastOperationResultCode, azureVMResponseInstanceViewMaintenanceRedeployStatus.lastOperationResultCode) &&
        Objects.equals(this.lastOperationMessage, azureVMResponseInstanceViewMaintenanceRedeployStatus.lastOperationMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCustomerInitiatedMaintenanceAllowed, preMaintenanceWindowStartTime, preMaintenanceWindowEndTime, maintenanceWindowStartTime, maintenanceWindowEndTime, lastOperationResultCode, lastOperationMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewMaintenanceRedeployStatusModel {\n");
    
    sb.append("    isCustomerInitiatedMaintenanceAllowed: ").append(toIndentedString(isCustomerInitiatedMaintenanceAllowed)).append("\n");
    sb.append("    preMaintenanceWindowStartTime: ").append(toIndentedString(preMaintenanceWindowStartTime)).append("\n");
    sb.append("    preMaintenanceWindowEndTime: ").append(toIndentedString(preMaintenanceWindowEndTime)).append("\n");
    sb.append("    maintenanceWindowStartTime: ").append(toIndentedString(maintenanceWindowStartTime)).append("\n");
    sb.append("    maintenanceWindowEndTime: ").append(toIndentedString(maintenanceWindowEndTime)).append("\n");
    sb.append("    lastOperationResultCode: ").append(toIndentedString(lastOperationResultCode)).append("\n");
    sb.append("    lastOperationMessage: ").append(toIndentedString(lastOperationMessage)).append("\n");
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

