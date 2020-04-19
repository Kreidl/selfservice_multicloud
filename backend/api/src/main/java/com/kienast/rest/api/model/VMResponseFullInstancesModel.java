package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VMResponseFullBlockDeviceMappingsModel;
import com.kienast.rest.api.model.VMResponseFullCapacityReservationSpecificationModel;
import com.kienast.rest.api.model.VMResponseFullCpuOptionsModel;
import com.kienast.rest.api.model.VMResponseFullElasticGpuAssociationsModel;
import com.kienast.rest.api.model.VMResponseFullElasticInferenceAcceleratorAssociationsModel;
import com.kienast.rest.api.model.VMResponseFullGroupsModel;
import com.kienast.rest.api.model.VMResponseFullHibernationOptionsModel;
import com.kienast.rest.api.model.VMResponseFullIamInstanceProfileModel;
import com.kienast.rest.api.model.VMResponseFullLicensesModel;
import com.kienast.rest.api.model.VMResponseFullMetadataOptionsModel;
import com.kienast.rest.api.model.VMResponseFullMonitoringModel;
import com.kienast.rest.api.model.VMResponseFullNetworkInterfacesModel;
import com.kienast.rest.api.model.VMResponseFullPlacementModel;
import com.kienast.rest.api.model.VMResponseFullProductCodesModel;
import com.kienast.rest.api.model.VMResponseFullStateModel;
import com.kienast.rest.api.model.VMResponseFullStateReasonModel;
import com.kienast.rest.api.model.VPCResponseVpcTagsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullInstancesModel
 */

public class VMResponseFullInstancesModel   {
  @JsonProperty("AmiLaunchIndex")
  private Integer amiLaunchIndex;

  @JsonProperty("ImageId")
  private String imageId;

  @JsonProperty("InstanceId")
  private String instanceId;

  @JsonProperty("InstanceType")
  private String instanceType;

  @JsonProperty("KernelId")
  private String kernelId;

  @JsonProperty("KeyName")
  private String keyName;

  @JsonProperty("LaunchTime")
  private String launchTime;

  @JsonProperty("Monitoring")
  private VMResponseFullMonitoringModel monitoring = null;

  @JsonProperty("Placement")
  private VMResponseFullPlacementModel placement = null;

  @JsonProperty("Platform")
  private String platform;

  @JsonProperty("PrivateDnsName")
  private String privateDnsName;

  @JsonProperty("PrivateIpAddress")
  private String privateIpAddress;

  @JsonProperty("ProductCodes")
  @Valid
  private List<VMResponseFullProductCodesModel> productCodes = null;

  @JsonProperty("PublicDnsName")
  private String publicDnsName;

  @JsonProperty("PublicIpAddress")
  private String publicIpAddress;

  @JsonProperty("RamdiskId")
  private String ramdiskId;

  @JsonProperty("State")
  private VMResponseFullStateModel state = null;

  @JsonProperty("StateTransitionReason")
  private String stateTransitionReason;

  @JsonProperty("SubnetId")
  private String subnetId;

  @JsonProperty("VpcId")
  private String vpcId;

  @JsonProperty("Architecture")
  private String architecture;

  @JsonProperty("BlockDeviceMappings")
  @Valid
  private List<VMResponseFullBlockDeviceMappingsModel> blockDeviceMappings = null;

  @JsonProperty("ClientToken")
  private String clientToken;

  @JsonProperty("EbsOptimized")
  private Boolean ebsOptimized;

  @JsonProperty("EnaSupport")
  private Boolean enaSupport;

  @JsonProperty("Hypervisor")
  private String hypervisor;

  @JsonProperty("IamInstanceProfile")
  private VMResponseFullIamInstanceProfileModel iamInstanceProfile = null;

  @JsonProperty("InstanceLifecycle")
  private String instanceLifecycle;

  @JsonProperty("ElasticGpuAssociations")
  @Valid
  private List<VMResponseFullElasticGpuAssociationsModel> elasticGpuAssociations = null;

  @JsonProperty("ElasticInferenceAcceleratorAssociations")
  @Valid
  private List<VMResponseFullElasticInferenceAcceleratorAssociationsModel> elasticInferenceAcceleratorAssociations = null;

  @JsonProperty("NetworkInterfaces")
  @Valid
  private List<VMResponseFullNetworkInterfacesModel> networkInterfaces = null;

  @JsonProperty("OutpostArn")
  private String outpostArn;

  @JsonProperty("RootDeviceName")
  private String rootDeviceName;

  @JsonProperty("RootDeviceType")
  private String rootDeviceType;

  @JsonProperty("SecurityGroups")
  @Valid
  private List<VMResponseFullGroupsModel> securityGroups = null;

  @JsonProperty("SourceDestCheck")
  private Boolean sourceDestCheck;

  @JsonProperty("SpotInstanceRequestId")
  private String spotInstanceRequestId;

  @JsonProperty("SriovNetSupport")
  private String sriovNetSupport;

  @JsonProperty("StateReason")
  private VMResponseFullStateReasonModel stateReason = null;

  @JsonProperty("Tags")
  @Valid
  private List<VPCResponseVpcTagsModel> tags = null;

  @JsonProperty("VirtualizationType")
  private String virtualizationType;

  @JsonProperty("CpuOptions")
  private VMResponseFullCpuOptionsModel cpuOptions = null;

  @JsonProperty("CapacityReservationId")
  private String capacityReservationId;

  @JsonProperty("CapacityReservationSpecification")
  private VMResponseFullCapacityReservationSpecificationModel capacityReservationSpecification = null;

  @JsonProperty("HibernationOptions")
  private VMResponseFullHibernationOptionsModel hibernationOptions = null;

  @JsonProperty("Licenses")
  @Valid
  private List<VMResponseFullLicensesModel> licenses = null;

  @JsonProperty("MetadataOptions")
  private VMResponseFullMetadataOptionsModel metadataOptions = null;

  public VMResponseFullInstancesModel amiLaunchIndex(Integer amiLaunchIndex) {
    this.amiLaunchIndex = amiLaunchIndex;
    return this;
  }

  /**
   * Get amiLaunchIndex
   * @return amiLaunchIndex
  */
  @ApiModelProperty(value = "")


  public Integer getAmiLaunchIndex() {
    return amiLaunchIndex;
  }

  public void setAmiLaunchIndex(Integer amiLaunchIndex) {
    this.amiLaunchIndex = amiLaunchIndex;
  }

  public VMResponseFullInstancesModel imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  */
  @ApiModelProperty(value = "")


  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public VMResponseFullInstancesModel instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId
   * @return instanceId
  */
  @ApiModelProperty(value = "")


  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public VMResponseFullInstancesModel instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Get instanceType
   * @return instanceType
  */
  @ApiModelProperty(value = "")


  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public VMResponseFullInstancesModel kernelId(String kernelId) {
    this.kernelId = kernelId;
    return this;
  }

  /**
   * Get kernelId
   * @return kernelId
  */
  @ApiModelProperty(value = "")


  public String getKernelId() {
    return kernelId;
  }

  public void setKernelId(String kernelId) {
    this.kernelId = kernelId;
  }

  public VMResponseFullInstancesModel keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Get keyName
   * @return keyName
  */
  @ApiModelProperty(value = "")


  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public VMResponseFullInstancesModel launchTime(String launchTime) {
    this.launchTime = launchTime;
    return this;
  }

  /**
   * Get launchTime
   * @return launchTime
  */
  @ApiModelProperty(value = "")


  public String getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(String launchTime) {
    this.launchTime = launchTime;
  }

  public VMResponseFullInstancesModel monitoring(VMResponseFullMonitoringModel monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  /**
   * Get monitoring
   * @return monitoring
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullMonitoringModel getMonitoring() {
    return monitoring;
  }

  public void setMonitoring(VMResponseFullMonitoringModel monitoring) {
    this.monitoring = monitoring;
  }

  public VMResponseFullInstancesModel placement(VMResponseFullPlacementModel placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Get placement
   * @return placement
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullPlacementModel getPlacement() {
    return placement;
  }

  public void setPlacement(VMResponseFullPlacementModel placement) {
    this.placement = placement;
  }

  public VMResponseFullInstancesModel platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @ApiModelProperty(value = "")


  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public VMResponseFullInstancesModel privateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
    return this;
  }

  /**
   * Get privateDnsName
   * @return privateDnsName
  */
  @ApiModelProperty(value = "")


  public String getPrivateDnsName() {
    return privateDnsName;
  }

  public void setPrivateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
  }

  public VMResponseFullInstancesModel privateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

  /**
   * Get privateIpAddress
   * @return privateIpAddress
  */
  @ApiModelProperty(value = "")


  public String getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }

  public VMResponseFullInstancesModel productCodes(List<VMResponseFullProductCodesModel> productCodes) {
    this.productCodes = productCodes;
    return this;
  }

  public VMResponseFullInstancesModel addProductCodesItem(VMResponseFullProductCodesModel productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<VMResponseFullProductCodesModel>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

  /**
   * Get productCodes
   * @return productCodes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullProductCodesModel> getProductCodes() {
    return productCodes;
  }

  public void setProductCodes(List<VMResponseFullProductCodesModel> productCodes) {
    this.productCodes = productCodes;
  }

  public VMResponseFullInstancesModel publicDnsName(String publicDnsName) {
    this.publicDnsName = publicDnsName;
    return this;
  }

  /**
   * Get publicDnsName
   * @return publicDnsName
  */
  @ApiModelProperty(value = "")


  public String getPublicDnsName() {
    return publicDnsName;
  }

  public void setPublicDnsName(String publicDnsName) {
    this.publicDnsName = publicDnsName;
  }

  public VMResponseFullInstancesModel publicIpAddress(String publicIpAddress) {
    this.publicIpAddress = publicIpAddress;
    return this;
  }

  /**
   * Get publicIpAddress
   * @return publicIpAddress
  */
  @ApiModelProperty(value = "")


  public String getPublicIpAddress() {
    return publicIpAddress;
  }

  public void setPublicIpAddress(String publicIpAddress) {
    this.publicIpAddress = publicIpAddress;
  }

  public VMResponseFullInstancesModel ramdiskId(String ramdiskId) {
    this.ramdiskId = ramdiskId;
    return this;
  }

  /**
   * Get ramdiskId
   * @return ramdiskId
  */
  @ApiModelProperty(value = "")


  public String getRamdiskId() {
    return ramdiskId;
  }

  public void setRamdiskId(String ramdiskId) {
    this.ramdiskId = ramdiskId;
  }

  public VMResponseFullInstancesModel state(VMResponseFullStateModel state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullStateModel getState() {
    return state;
  }

  public void setState(VMResponseFullStateModel state) {
    this.state = state;
  }

  public VMResponseFullInstancesModel stateTransitionReason(String stateTransitionReason) {
    this.stateTransitionReason = stateTransitionReason;
    return this;
  }

  /**
   * Get stateTransitionReason
   * @return stateTransitionReason
  */
  @ApiModelProperty(value = "")


  public String getStateTransitionReason() {
    return stateTransitionReason;
  }

  public void setStateTransitionReason(String stateTransitionReason) {
    this.stateTransitionReason = stateTransitionReason;
  }

  public VMResponseFullInstancesModel subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  /**
   * Get subnetId
   * @return subnetId
  */
  @ApiModelProperty(value = "")


  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public VMResponseFullInstancesModel vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
  */
  @ApiModelProperty(value = "")


  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public VMResponseFullInstancesModel architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
  */
  @ApiModelProperty(value = "")


  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public VMResponseFullInstancesModel blockDeviceMappings(List<VMResponseFullBlockDeviceMappingsModel> blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
    return this;
  }

  public VMResponseFullInstancesModel addBlockDeviceMappingsItem(VMResponseFullBlockDeviceMappingsModel blockDeviceMappingsItem) {
    if (this.blockDeviceMappings == null) {
      this.blockDeviceMappings = new ArrayList<VMResponseFullBlockDeviceMappingsModel>();
    }
    this.blockDeviceMappings.add(blockDeviceMappingsItem);
    return this;
  }

  /**
   * Get blockDeviceMappings
   * @return blockDeviceMappings
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullBlockDeviceMappingsModel> getBlockDeviceMappings() {
    return blockDeviceMappings;
  }

  public void setBlockDeviceMappings(List<VMResponseFullBlockDeviceMappingsModel> blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
  }

  public VMResponseFullInstancesModel clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * Get clientToken
   * @return clientToken
  */
  @ApiModelProperty(value = "")


  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public VMResponseFullInstancesModel ebsOptimized(Boolean ebsOptimized) {
    this.ebsOptimized = ebsOptimized;
    return this;
  }

  /**
   * Get ebsOptimized
   * @return ebsOptimized
  */
  @ApiModelProperty(value = "")


  public Boolean getEbsOptimized() {
    return ebsOptimized;
  }

  public void setEbsOptimized(Boolean ebsOptimized) {
    this.ebsOptimized = ebsOptimized;
  }

  public VMResponseFullInstancesModel enaSupport(Boolean enaSupport) {
    this.enaSupport = enaSupport;
    return this;
  }

  /**
   * Get enaSupport
   * @return enaSupport
  */
  @ApiModelProperty(value = "")


  public Boolean getEnaSupport() {
    return enaSupport;
  }

  public void setEnaSupport(Boolean enaSupport) {
    this.enaSupport = enaSupport;
  }

  public VMResponseFullInstancesModel hypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
    return this;
  }

  /**
   * Get hypervisor
   * @return hypervisor
  */
  @ApiModelProperty(value = "")


  public String getHypervisor() {
    return hypervisor;
  }

  public void setHypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
  }

  public VMResponseFullInstancesModel iamInstanceProfile(VMResponseFullIamInstanceProfileModel iamInstanceProfile) {
    this.iamInstanceProfile = iamInstanceProfile;
    return this;
  }

  /**
   * Get iamInstanceProfile
   * @return iamInstanceProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullIamInstanceProfileModel getIamInstanceProfile() {
    return iamInstanceProfile;
  }

  public void setIamInstanceProfile(VMResponseFullIamInstanceProfileModel iamInstanceProfile) {
    this.iamInstanceProfile = iamInstanceProfile;
  }

  public VMResponseFullInstancesModel instanceLifecycle(String instanceLifecycle) {
    this.instanceLifecycle = instanceLifecycle;
    return this;
  }

  /**
   * Get instanceLifecycle
   * @return instanceLifecycle
  */
  @ApiModelProperty(value = "")


  public String getInstanceLifecycle() {
    return instanceLifecycle;
  }

  public void setInstanceLifecycle(String instanceLifecycle) {
    this.instanceLifecycle = instanceLifecycle;
  }

  public VMResponseFullInstancesModel elasticGpuAssociations(List<VMResponseFullElasticGpuAssociationsModel> elasticGpuAssociations) {
    this.elasticGpuAssociations = elasticGpuAssociations;
    return this;
  }

  public VMResponseFullInstancesModel addElasticGpuAssociationsItem(VMResponseFullElasticGpuAssociationsModel elasticGpuAssociationsItem) {
    if (this.elasticGpuAssociations == null) {
      this.elasticGpuAssociations = new ArrayList<VMResponseFullElasticGpuAssociationsModel>();
    }
    this.elasticGpuAssociations.add(elasticGpuAssociationsItem);
    return this;
  }

  /**
   * Get elasticGpuAssociations
   * @return elasticGpuAssociations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullElasticGpuAssociationsModel> getElasticGpuAssociations() {
    return elasticGpuAssociations;
  }

  public void setElasticGpuAssociations(List<VMResponseFullElasticGpuAssociationsModel> elasticGpuAssociations) {
    this.elasticGpuAssociations = elasticGpuAssociations;
  }

  public VMResponseFullInstancesModel elasticInferenceAcceleratorAssociations(List<VMResponseFullElasticInferenceAcceleratorAssociationsModel> elasticInferenceAcceleratorAssociations) {
    this.elasticInferenceAcceleratorAssociations = elasticInferenceAcceleratorAssociations;
    return this;
  }

  public VMResponseFullInstancesModel addElasticInferenceAcceleratorAssociationsItem(VMResponseFullElasticInferenceAcceleratorAssociationsModel elasticInferenceAcceleratorAssociationsItem) {
    if (this.elasticInferenceAcceleratorAssociations == null) {
      this.elasticInferenceAcceleratorAssociations = new ArrayList<VMResponseFullElasticInferenceAcceleratorAssociationsModel>();
    }
    this.elasticInferenceAcceleratorAssociations.add(elasticInferenceAcceleratorAssociationsItem);
    return this;
  }

  /**
   * Get elasticInferenceAcceleratorAssociations
   * @return elasticInferenceAcceleratorAssociations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullElasticInferenceAcceleratorAssociationsModel> getElasticInferenceAcceleratorAssociations() {
    return elasticInferenceAcceleratorAssociations;
  }

  public void setElasticInferenceAcceleratorAssociations(List<VMResponseFullElasticInferenceAcceleratorAssociationsModel> elasticInferenceAcceleratorAssociations) {
    this.elasticInferenceAcceleratorAssociations = elasticInferenceAcceleratorAssociations;
  }

  public VMResponseFullInstancesModel networkInterfaces(List<VMResponseFullNetworkInterfacesModel> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  public VMResponseFullInstancesModel addNetworkInterfacesItem(VMResponseFullNetworkInterfacesModel networkInterfacesItem) {
    if (this.networkInterfaces == null) {
      this.networkInterfaces = new ArrayList<VMResponseFullNetworkInterfacesModel>();
    }
    this.networkInterfaces.add(networkInterfacesItem);
    return this;
  }

  /**
   * Get networkInterfaces
   * @return networkInterfaces
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullNetworkInterfacesModel> getNetworkInterfaces() {
    return networkInterfaces;
  }

  public void setNetworkInterfaces(List<VMResponseFullNetworkInterfacesModel> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
  }

  public VMResponseFullInstancesModel outpostArn(String outpostArn) {
    this.outpostArn = outpostArn;
    return this;
  }

  /**
   * Get outpostArn
   * @return outpostArn
  */
  @ApiModelProperty(value = "")


  public String getOutpostArn() {
    return outpostArn;
  }

  public void setOutpostArn(String outpostArn) {
    this.outpostArn = outpostArn;
  }

  public VMResponseFullInstancesModel rootDeviceName(String rootDeviceName) {
    this.rootDeviceName = rootDeviceName;
    return this;
  }

  /**
   * Get rootDeviceName
   * @return rootDeviceName
  */
  @ApiModelProperty(value = "")


  public String getRootDeviceName() {
    return rootDeviceName;
  }

  public void setRootDeviceName(String rootDeviceName) {
    this.rootDeviceName = rootDeviceName;
  }

  public VMResponseFullInstancesModel rootDeviceType(String rootDeviceType) {
    this.rootDeviceType = rootDeviceType;
    return this;
  }

  /**
   * Get rootDeviceType
   * @return rootDeviceType
  */
  @ApiModelProperty(value = "")


  public String getRootDeviceType() {
    return rootDeviceType;
  }

  public void setRootDeviceType(String rootDeviceType) {
    this.rootDeviceType = rootDeviceType;
  }

  public VMResponseFullInstancesModel securityGroups(List<VMResponseFullGroupsModel> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public VMResponseFullInstancesModel addSecurityGroupsItem(VMResponseFullGroupsModel securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<VMResponseFullGroupsModel>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

  /**
   * Get securityGroups
   * @return securityGroups
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullGroupsModel> getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List<VMResponseFullGroupsModel> securityGroups) {
    this.securityGroups = securityGroups;
  }

  public VMResponseFullInstancesModel sourceDestCheck(Boolean sourceDestCheck) {
    this.sourceDestCheck = sourceDestCheck;
    return this;
  }

  /**
   * Get sourceDestCheck
   * @return sourceDestCheck
  */
  @ApiModelProperty(value = "")


  public Boolean getSourceDestCheck() {
    return sourceDestCheck;
  }

  public void setSourceDestCheck(Boolean sourceDestCheck) {
    this.sourceDestCheck = sourceDestCheck;
  }

  public VMResponseFullInstancesModel spotInstanceRequestId(String spotInstanceRequestId) {
    this.spotInstanceRequestId = spotInstanceRequestId;
    return this;
  }

  /**
   * Get spotInstanceRequestId
   * @return spotInstanceRequestId
  */
  @ApiModelProperty(value = "")


  public String getSpotInstanceRequestId() {
    return spotInstanceRequestId;
  }

  public void setSpotInstanceRequestId(String spotInstanceRequestId) {
    this.spotInstanceRequestId = spotInstanceRequestId;
  }

  public VMResponseFullInstancesModel sriovNetSupport(String sriovNetSupport) {
    this.sriovNetSupport = sriovNetSupport;
    return this;
  }

  /**
   * Get sriovNetSupport
   * @return sriovNetSupport
  */
  @ApiModelProperty(value = "")


  public String getSriovNetSupport() {
    return sriovNetSupport;
  }

  public void setSriovNetSupport(String sriovNetSupport) {
    this.sriovNetSupport = sriovNetSupport;
  }

  public VMResponseFullInstancesModel stateReason(VMResponseFullStateReasonModel stateReason) {
    this.stateReason = stateReason;
    return this;
  }

  /**
   * Get stateReason
   * @return stateReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullStateReasonModel getStateReason() {
    return stateReason;
  }

  public void setStateReason(VMResponseFullStateReasonModel stateReason) {
    this.stateReason = stateReason;
  }

  public VMResponseFullInstancesModel tags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
    return this;
  }

  public VMResponseFullInstancesModel addTagsItem(VPCResponseVpcTagsModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<VPCResponseVpcTagsModel>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCResponseVpcTagsModel> getTags() {
    return tags;
  }

  public void setTags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
  }

  public VMResponseFullInstancesModel virtualizationType(String virtualizationType) {
    this.virtualizationType = virtualizationType;
    return this;
  }

  /**
   * Get virtualizationType
   * @return virtualizationType
  */
  @ApiModelProperty(value = "")


  public String getVirtualizationType() {
    return virtualizationType;
  }

  public void setVirtualizationType(String virtualizationType) {
    this.virtualizationType = virtualizationType;
  }

  public VMResponseFullInstancesModel cpuOptions(VMResponseFullCpuOptionsModel cpuOptions) {
    this.cpuOptions = cpuOptions;
    return this;
  }

  /**
   * Get cpuOptions
   * @return cpuOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullCpuOptionsModel getCpuOptions() {
    return cpuOptions;
  }

  public void setCpuOptions(VMResponseFullCpuOptionsModel cpuOptions) {
    this.cpuOptions = cpuOptions;
  }

  public VMResponseFullInstancesModel capacityReservationId(String capacityReservationId) {
    this.capacityReservationId = capacityReservationId;
    return this;
  }

  /**
   * Get capacityReservationId
   * @return capacityReservationId
  */
  @ApiModelProperty(value = "")


  public String getCapacityReservationId() {
    return capacityReservationId;
  }

  public void setCapacityReservationId(String capacityReservationId) {
    this.capacityReservationId = capacityReservationId;
  }

  public VMResponseFullInstancesModel capacityReservationSpecification(VMResponseFullCapacityReservationSpecificationModel capacityReservationSpecification) {
    this.capacityReservationSpecification = capacityReservationSpecification;
    return this;
  }

  /**
   * Get capacityReservationSpecification
   * @return capacityReservationSpecification
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullCapacityReservationSpecificationModel getCapacityReservationSpecification() {
    return capacityReservationSpecification;
  }

  public void setCapacityReservationSpecification(VMResponseFullCapacityReservationSpecificationModel capacityReservationSpecification) {
    this.capacityReservationSpecification = capacityReservationSpecification;
  }

  public VMResponseFullInstancesModel hibernationOptions(VMResponseFullHibernationOptionsModel hibernationOptions) {
    this.hibernationOptions = hibernationOptions;
    return this;
  }

  /**
   * Get hibernationOptions
   * @return hibernationOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullHibernationOptionsModel getHibernationOptions() {
    return hibernationOptions;
  }

  public void setHibernationOptions(VMResponseFullHibernationOptionsModel hibernationOptions) {
    this.hibernationOptions = hibernationOptions;
  }

  public VMResponseFullInstancesModel licenses(List<VMResponseFullLicensesModel> licenses) {
    this.licenses = licenses;
    return this;
  }

  public VMResponseFullInstancesModel addLicensesItem(VMResponseFullLicensesModel licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<VMResponseFullLicensesModel>();
    }
    this.licenses.add(licensesItem);
    return this;
  }

  /**
   * Get licenses
   * @return licenses
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullLicensesModel> getLicenses() {
    return licenses;
  }

  public void setLicenses(List<VMResponseFullLicensesModel> licenses) {
    this.licenses = licenses;
  }

  public VMResponseFullInstancesModel metadataOptions(VMResponseFullMetadataOptionsModel metadataOptions) {
    this.metadataOptions = metadataOptions;
    return this;
  }

  /**
   * Get metadataOptions
   * @return metadataOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public VMResponseFullMetadataOptionsModel getMetadataOptions() {
    return metadataOptions;
  }

  public void setMetadataOptions(VMResponseFullMetadataOptionsModel metadataOptions) {
    this.metadataOptions = metadataOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullInstancesModel vmResponseFullInstances = (VMResponseFullInstancesModel) o;
    return Objects.equals(this.amiLaunchIndex, vmResponseFullInstances.amiLaunchIndex) &&
        Objects.equals(this.imageId, vmResponseFullInstances.imageId) &&
        Objects.equals(this.instanceId, vmResponseFullInstances.instanceId) &&
        Objects.equals(this.instanceType, vmResponseFullInstances.instanceType) &&
        Objects.equals(this.kernelId, vmResponseFullInstances.kernelId) &&
        Objects.equals(this.keyName, vmResponseFullInstances.keyName) &&
        Objects.equals(this.launchTime, vmResponseFullInstances.launchTime) &&
        Objects.equals(this.monitoring, vmResponseFullInstances.monitoring) &&
        Objects.equals(this.placement, vmResponseFullInstances.placement) &&
        Objects.equals(this.platform, vmResponseFullInstances.platform) &&
        Objects.equals(this.privateDnsName, vmResponseFullInstances.privateDnsName) &&
        Objects.equals(this.privateIpAddress, vmResponseFullInstances.privateIpAddress) &&
        Objects.equals(this.productCodes, vmResponseFullInstances.productCodes) &&
        Objects.equals(this.publicDnsName, vmResponseFullInstances.publicDnsName) &&
        Objects.equals(this.publicIpAddress, vmResponseFullInstances.publicIpAddress) &&
        Objects.equals(this.ramdiskId, vmResponseFullInstances.ramdiskId) &&
        Objects.equals(this.state, vmResponseFullInstances.state) &&
        Objects.equals(this.stateTransitionReason, vmResponseFullInstances.stateTransitionReason) &&
        Objects.equals(this.subnetId, vmResponseFullInstances.subnetId) &&
        Objects.equals(this.vpcId, vmResponseFullInstances.vpcId) &&
        Objects.equals(this.architecture, vmResponseFullInstances.architecture) &&
        Objects.equals(this.blockDeviceMappings, vmResponseFullInstances.blockDeviceMappings) &&
        Objects.equals(this.clientToken, vmResponseFullInstances.clientToken) &&
        Objects.equals(this.ebsOptimized, vmResponseFullInstances.ebsOptimized) &&
        Objects.equals(this.enaSupport, vmResponseFullInstances.enaSupport) &&
        Objects.equals(this.hypervisor, vmResponseFullInstances.hypervisor) &&
        Objects.equals(this.iamInstanceProfile, vmResponseFullInstances.iamInstanceProfile) &&
        Objects.equals(this.instanceLifecycle, vmResponseFullInstances.instanceLifecycle) &&
        Objects.equals(this.elasticGpuAssociations, vmResponseFullInstances.elasticGpuAssociations) &&
        Objects.equals(this.elasticInferenceAcceleratorAssociations, vmResponseFullInstances.elasticInferenceAcceleratorAssociations) &&
        Objects.equals(this.networkInterfaces, vmResponseFullInstances.networkInterfaces) &&
        Objects.equals(this.outpostArn, vmResponseFullInstances.outpostArn) &&
        Objects.equals(this.rootDeviceName, vmResponseFullInstances.rootDeviceName) &&
        Objects.equals(this.rootDeviceType, vmResponseFullInstances.rootDeviceType) &&
        Objects.equals(this.securityGroups, vmResponseFullInstances.securityGroups) &&
        Objects.equals(this.sourceDestCheck, vmResponseFullInstances.sourceDestCheck) &&
        Objects.equals(this.spotInstanceRequestId, vmResponseFullInstances.spotInstanceRequestId) &&
        Objects.equals(this.sriovNetSupport, vmResponseFullInstances.sriovNetSupport) &&
        Objects.equals(this.stateReason, vmResponseFullInstances.stateReason) &&
        Objects.equals(this.tags, vmResponseFullInstances.tags) &&
        Objects.equals(this.virtualizationType, vmResponseFullInstances.virtualizationType) &&
        Objects.equals(this.cpuOptions, vmResponseFullInstances.cpuOptions) &&
        Objects.equals(this.capacityReservationId, vmResponseFullInstances.capacityReservationId) &&
        Objects.equals(this.capacityReservationSpecification, vmResponseFullInstances.capacityReservationSpecification) &&
        Objects.equals(this.hibernationOptions, vmResponseFullInstances.hibernationOptions) &&
        Objects.equals(this.licenses, vmResponseFullInstances.licenses) &&
        Objects.equals(this.metadataOptions, vmResponseFullInstances.metadataOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amiLaunchIndex, imageId, instanceId, instanceType, kernelId, keyName, launchTime, monitoring, placement, platform, privateDnsName, privateIpAddress, productCodes, publicDnsName, publicIpAddress, ramdiskId, state, stateTransitionReason, subnetId, vpcId, architecture, blockDeviceMappings, clientToken, ebsOptimized, enaSupport, hypervisor, iamInstanceProfile, instanceLifecycle, elasticGpuAssociations, elasticInferenceAcceleratorAssociations, networkInterfaces, outpostArn, rootDeviceName, rootDeviceType, securityGroups, sourceDestCheck, spotInstanceRequestId, sriovNetSupport, stateReason, tags, virtualizationType, cpuOptions, capacityReservationId, capacityReservationSpecification, hibernationOptions, licenses, metadataOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullInstancesModel {\n");
    
    sb.append("    amiLaunchIndex: ").append(toIndentedString(amiLaunchIndex)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    kernelId: ").append(toIndentedString(kernelId)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
    sb.append("    publicDnsName: ").append(toIndentedString(publicDnsName)).append("\n");
    sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
    sb.append("    ramdiskId: ").append(toIndentedString(ramdiskId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateTransitionReason: ").append(toIndentedString(stateTransitionReason)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    blockDeviceMappings: ").append(toIndentedString(blockDeviceMappings)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    ebsOptimized: ").append(toIndentedString(ebsOptimized)).append("\n");
    sb.append("    enaSupport: ").append(toIndentedString(enaSupport)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    iamInstanceProfile: ").append(toIndentedString(iamInstanceProfile)).append("\n");
    sb.append("    instanceLifecycle: ").append(toIndentedString(instanceLifecycle)).append("\n");
    sb.append("    elasticGpuAssociations: ").append(toIndentedString(elasticGpuAssociations)).append("\n");
    sb.append("    elasticInferenceAcceleratorAssociations: ").append(toIndentedString(elasticInferenceAcceleratorAssociations)).append("\n");
    sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
    sb.append("    outpostArn: ").append(toIndentedString(outpostArn)).append("\n");
    sb.append("    rootDeviceName: ").append(toIndentedString(rootDeviceName)).append("\n");
    sb.append("    rootDeviceType: ").append(toIndentedString(rootDeviceType)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    sourceDestCheck: ").append(toIndentedString(sourceDestCheck)).append("\n");
    sb.append("    spotInstanceRequestId: ").append(toIndentedString(spotInstanceRequestId)).append("\n");
    sb.append("    sriovNetSupport: ").append(toIndentedString(sriovNetSupport)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    virtualizationType: ").append(toIndentedString(virtualizationType)).append("\n");
    sb.append("    cpuOptions: ").append(toIndentedString(cpuOptions)).append("\n");
    sb.append("    capacityReservationId: ").append(toIndentedString(capacityReservationId)).append("\n");
    sb.append("    capacityReservationSpecification: ").append(toIndentedString(capacityReservationSpecification)).append("\n");
    sb.append("    hibernationOptions: ").append(toIndentedString(hibernationOptions)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    metadataOptions: ").append(toIndentedString(metadataOptions)).append("\n");
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

