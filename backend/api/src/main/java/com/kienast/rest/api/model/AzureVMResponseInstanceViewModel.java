package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewBootDiagnosticsModel;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewDisksModel;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewExtensionsModel;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewMaintenanceRedeployStatusModel;
import com.kienast.rest.api.model.AzureVMResponseInstanceViewVmAgentModel;
import com.kienast.rest.api.model.StatusesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AzureVMResponseInstanceViewModel
 */

public class AzureVMResponseInstanceViewModel   {
  @JsonProperty("platform_update_domain")
  private BigDecimal platformUpdateDomain;

  @JsonProperty("platform_fault_domain")
  private BigDecimal platformFaultDomain;

  @JsonProperty("computer_name")
  private String computerName;

  @JsonProperty("os_name")
  private String osName;

  @JsonProperty("os_version")
  private String osVersion;

  @JsonProperty("hyper_vgeneration")
  private String hyperVgeneration;

  @JsonProperty("rdp_thumb_print")
  private String rdpThumbPrint;

  @JsonProperty("vm_agent")
  private AzureVMResponseInstanceViewVmAgentModel vmAgent = null;

  @JsonProperty("maintenance_redeploy_status")
  private AzureVMResponseInstanceViewMaintenanceRedeployStatusModel maintenanceRedeployStatus = null;

  @JsonProperty("disks")
  @Valid
  private List<AzureVMResponseInstanceViewDisksModel> disks = null;

  @JsonProperty("extensions")
  @Valid
  private List<AzureVMResponseInstanceViewExtensionsModel> extensions = null;

  @JsonProperty("boot_diagnostics")
  private AzureVMResponseInstanceViewBootDiagnosticsModel bootDiagnostics = null;

  @JsonProperty("statuses")
  @Valid
  private List<StatusesModel> statuses = null;

  public AzureVMResponseInstanceViewModel platformUpdateDomain(BigDecimal platformUpdateDomain) {
    this.platformUpdateDomain = platformUpdateDomain;
    return this;
  }

  /**
   * Get platformUpdateDomain
   * @return platformUpdateDomain
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPlatformUpdateDomain() {
    return platformUpdateDomain;
  }

  public void setPlatformUpdateDomain(BigDecimal platformUpdateDomain) {
    this.platformUpdateDomain = platformUpdateDomain;
  }

  public AzureVMResponseInstanceViewModel platformFaultDomain(BigDecimal platformFaultDomain) {
    this.platformFaultDomain = platformFaultDomain;
    return this;
  }

  /**
   * Get platformFaultDomain
   * @return platformFaultDomain
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPlatformFaultDomain() {
    return platformFaultDomain;
  }

  public void setPlatformFaultDomain(BigDecimal platformFaultDomain) {
    this.platformFaultDomain = platformFaultDomain;
  }

  public AzureVMResponseInstanceViewModel computerName(String computerName) {
    this.computerName = computerName;
    return this;
  }

  /**
   * Get computerName
   * @return computerName
  */
  @ApiModelProperty(value = "")


  public String getComputerName() {
    return computerName;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  public AzureVMResponseInstanceViewModel osName(String osName) {
    this.osName = osName;
    return this;
  }

  /**
   * Get osName
   * @return osName
  */
  @ApiModelProperty(value = "")


  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public AzureVMResponseInstanceViewModel osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Get osVersion
   * @return osVersion
  */
  @ApiModelProperty(value = "")


  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public AzureVMResponseInstanceViewModel hyperVgeneration(String hyperVgeneration) {
    this.hyperVgeneration = hyperVgeneration;
    return this;
  }

  /**
   * Get hyperVgeneration
   * @return hyperVgeneration
  */
  @ApiModelProperty(value = "")


  public String getHyperVgeneration() {
    return hyperVgeneration;
  }

  public void setHyperVgeneration(String hyperVgeneration) {
    this.hyperVgeneration = hyperVgeneration;
  }

  public AzureVMResponseInstanceViewModel rdpThumbPrint(String rdpThumbPrint) {
    this.rdpThumbPrint = rdpThumbPrint;
    return this;
  }

  /**
   * Get rdpThumbPrint
   * @return rdpThumbPrint
  */
  @ApiModelProperty(value = "")


  public String getRdpThumbPrint() {
    return rdpThumbPrint;
  }

  public void setRdpThumbPrint(String rdpThumbPrint) {
    this.rdpThumbPrint = rdpThumbPrint;
  }

  public AzureVMResponseInstanceViewModel vmAgent(AzureVMResponseInstanceViewVmAgentModel vmAgent) {
    this.vmAgent = vmAgent;
    return this;
  }

  /**
   * Get vmAgent
   * @return vmAgent
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewVmAgentModel getVmAgent() {
    return vmAgent;
  }

  public void setVmAgent(AzureVMResponseInstanceViewVmAgentModel vmAgent) {
    this.vmAgent = vmAgent;
  }

  public AzureVMResponseInstanceViewModel maintenanceRedeployStatus(AzureVMResponseInstanceViewMaintenanceRedeployStatusModel maintenanceRedeployStatus) {
    this.maintenanceRedeployStatus = maintenanceRedeployStatus;
    return this;
  }

  /**
   * Get maintenanceRedeployStatus
   * @return maintenanceRedeployStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewMaintenanceRedeployStatusModel getMaintenanceRedeployStatus() {
    return maintenanceRedeployStatus;
  }

  public void setMaintenanceRedeployStatus(AzureVMResponseInstanceViewMaintenanceRedeployStatusModel maintenanceRedeployStatus) {
    this.maintenanceRedeployStatus = maintenanceRedeployStatus;
  }

  public AzureVMResponseInstanceViewModel disks(List<AzureVMResponseInstanceViewDisksModel> disks) {
    this.disks = disks;
    return this;
  }

  public AzureVMResponseInstanceViewModel addDisksItem(AzureVMResponseInstanceViewDisksModel disksItem) {
    if (this.disks == null) {
      this.disks = new ArrayList<AzureVMResponseInstanceViewDisksModel>();
    }
    this.disks.add(disksItem);
    return this;
  }

  /**
   * Get disks
   * @return disks
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AzureVMResponseInstanceViewDisksModel> getDisks() {
    return disks;
  }

  public void setDisks(List<AzureVMResponseInstanceViewDisksModel> disks) {
    this.disks = disks;
  }

  public AzureVMResponseInstanceViewModel extensions(List<AzureVMResponseInstanceViewExtensionsModel> extensions) {
    this.extensions = extensions;
    return this;
  }

  public AzureVMResponseInstanceViewModel addExtensionsItem(AzureVMResponseInstanceViewExtensionsModel extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<AzureVMResponseInstanceViewExtensionsModel>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * Get extensions
   * @return extensions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AzureVMResponseInstanceViewExtensionsModel> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<AzureVMResponseInstanceViewExtensionsModel> extensions) {
    this.extensions = extensions;
  }

  public AzureVMResponseInstanceViewModel bootDiagnostics(AzureVMResponseInstanceViewBootDiagnosticsModel bootDiagnostics) {
    this.bootDiagnostics = bootDiagnostics;
    return this;
  }

  /**
   * Get bootDiagnostics
   * @return bootDiagnostics
  */
  @ApiModelProperty(value = "")

  @Valid

  public AzureVMResponseInstanceViewBootDiagnosticsModel getBootDiagnostics() {
    return bootDiagnostics;
  }

  public void setBootDiagnostics(AzureVMResponseInstanceViewBootDiagnosticsModel bootDiagnostics) {
    this.bootDiagnostics = bootDiagnostics;
  }

  public AzureVMResponseInstanceViewModel statuses(List<StatusesModel> statuses) {
    this.statuses = statuses;
    return this;
  }

  public AzureVMResponseInstanceViewModel addStatusesItem(StatusesModel statusesItem) {
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
    AzureVMResponseInstanceViewModel azureVMResponseInstanceView = (AzureVMResponseInstanceViewModel) o;
    return Objects.equals(this.platformUpdateDomain, azureVMResponseInstanceView.platformUpdateDomain) &&
        Objects.equals(this.platformFaultDomain, azureVMResponseInstanceView.platformFaultDomain) &&
        Objects.equals(this.computerName, azureVMResponseInstanceView.computerName) &&
        Objects.equals(this.osName, azureVMResponseInstanceView.osName) &&
        Objects.equals(this.osVersion, azureVMResponseInstanceView.osVersion) &&
        Objects.equals(this.hyperVgeneration, azureVMResponseInstanceView.hyperVgeneration) &&
        Objects.equals(this.rdpThumbPrint, azureVMResponseInstanceView.rdpThumbPrint) &&
        Objects.equals(this.vmAgent, azureVMResponseInstanceView.vmAgent) &&
        Objects.equals(this.maintenanceRedeployStatus, azureVMResponseInstanceView.maintenanceRedeployStatus) &&
        Objects.equals(this.disks, azureVMResponseInstanceView.disks) &&
        Objects.equals(this.extensions, azureVMResponseInstanceView.extensions) &&
        Objects.equals(this.bootDiagnostics, azureVMResponseInstanceView.bootDiagnostics) &&
        Objects.equals(this.statuses, azureVMResponseInstanceView.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformUpdateDomain, platformFaultDomain, computerName, osName, osVersion, hyperVgeneration, rdpThumbPrint, vmAgent, maintenanceRedeployStatus, disks, extensions, bootDiagnostics, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVMResponseInstanceViewModel {\n");
    
    sb.append("    platformUpdateDomain: ").append(toIndentedString(platformUpdateDomain)).append("\n");
    sb.append("    platformFaultDomain: ").append(toIndentedString(platformFaultDomain)).append("\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    hyperVgeneration: ").append(toIndentedString(hyperVgeneration)).append("\n");
    sb.append("    rdpThumbPrint: ").append(toIndentedString(rdpThumbPrint)).append("\n");
    sb.append("    vmAgent: ").append(toIndentedString(vmAgent)).append("\n");
    sb.append("    maintenanceRedeployStatus: ").append(toIndentedString(maintenanceRedeployStatus)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    bootDiagnostics: ").append(toIndentedString(bootDiagnostics)).append("\n");
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

