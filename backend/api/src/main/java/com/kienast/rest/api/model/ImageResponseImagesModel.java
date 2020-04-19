package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.ImageResponseBlockDeviceMappingsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImageResponseImagesModel
 */

public class ImageResponseImagesModel   {
  @JsonProperty("Architecture")
  private String architecture;

  @JsonProperty("BlockDeviceMappings")
  @Valid
  private List<ImageResponseBlockDeviceMappingsModel> blockDeviceMappings = null;

  @JsonProperty("CreationDate")
  private OffsetDateTime creationDate;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Hypervisor")
  private String hypervisor;

  @JsonProperty("ImageId")
  private String imageId;

  @JsonProperty("ImageLocation")
  private String imageLocation;

  @JsonProperty("ImageOwnerAlias")
  private String imageOwnerAlias;

  @JsonProperty("ImageType")
  private String imageType;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("OwnerId")
  private String ownerId;

  @JsonProperty("Public")
  private Boolean _public;

  @JsonProperty("RootDeviceType")
  private String rootDeviceType;

  @JsonProperty("State")
  private String state;

  @JsonProperty("VirtualizationType")
  private String virtualizationType;

  public ImageResponseImagesModel architecture(String architecture) {
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

  public ImageResponseImagesModel blockDeviceMappings(List<ImageResponseBlockDeviceMappingsModel> blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
    return this;
  }

  public ImageResponseImagesModel addBlockDeviceMappingsItem(ImageResponseBlockDeviceMappingsModel blockDeviceMappingsItem) {
    if (this.blockDeviceMappings == null) {
      this.blockDeviceMappings = new ArrayList<ImageResponseBlockDeviceMappingsModel>();
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

  public List<ImageResponseBlockDeviceMappingsModel> getBlockDeviceMappings() {
    return blockDeviceMappings;
  }

  public void setBlockDeviceMappings(List<ImageResponseBlockDeviceMappingsModel> blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
  }

  public ImageResponseImagesModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ImageResponseImagesModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ImageResponseImagesModel hypervisor(String hypervisor) {
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

  public ImageResponseImagesModel imageId(String imageId) {
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

  public ImageResponseImagesModel imageLocation(String imageLocation) {
    this.imageLocation = imageLocation;
    return this;
  }

  /**
   * Get imageLocation
   * @return imageLocation
  */
  @ApiModelProperty(value = "")


  public String getImageLocation() {
    return imageLocation;
  }

  public void setImageLocation(String imageLocation) {
    this.imageLocation = imageLocation;
  }

  public ImageResponseImagesModel imageOwnerAlias(String imageOwnerAlias) {
    this.imageOwnerAlias = imageOwnerAlias;
    return this;
  }

  /**
   * Get imageOwnerAlias
   * @return imageOwnerAlias
  */
  @ApiModelProperty(value = "")


  public String getImageOwnerAlias() {
    return imageOwnerAlias;
  }

  public void setImageOwnerAlias(String imageOwnerAlias) {
    this.imageOwnerAlias = imageOwnerAlias;
  }

  public ImageResponseImagesModel imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   * @return imageType
  */
  @ApiModelProperty(value = "")


  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public ImageResponseImagesModel name(String name) {
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

  public ImageResponseImagesModel ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @ApiModelProperty(value = "")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public ImageResponseImagesModel _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
  */
  @ApiModelProperty(value = "")


  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public ImageResponseImagesModel rootDeviceType(String rootDeviceType) {
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

  public ImageResponseImagesModel state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ImageResponseImagesModel virtualizationType(String virtualizationType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageResponseImagesModel imageResponseImages = (ImageResponseImagesModel) o;
    return Objects.equals(this.architecture, imageResponseImages.architecture) &&
        Objects.equals(this.blockDeviceMappings, imageResponseImages.blockDeviceMappings) &&
        Objects.equals(this.creationDate, imageResponseImages.creationDate) &&
        Objects.equals(this.description, imageResponseImages.description) &&
        Objects.equals(this.hypervisor, imageResponseImages.hypervisor) &&
        Objects.equals(this.imageId, imageResponseImages.imageId) &&
        Objects.equals(this.imageLocation, imageResponseImages.imageLocation) &&
        Objects.equals(this.imageOwnerAlias, imageResponseImages.imageOwnerAlias) &&
        Objects.equals(this.imageType, imageResponseImages.imageType) &&
        Objects.equals(this.name, imageResponseImages.name) &&
        Objects.equals(this.ownerId, imageResponseImages.ownerId) &&
        Objects.equals(this._public, imageResponseImages._public) &&
        Objects.equals(this.rootDeviceType, imageResponseImages.rootDeviceType) &&
        Objects.equals(this.state, imageResponseImages.state) &&
        Objects.equals(this.virtualizationType, imageResponseImages.virtualizationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, blockDeviceMappings, creationDate, description, hypervisor, imageId, imageLocation, imageOwnerAlias, imageType, name, ownerId, _public, rootDeviceType, state, virtualizationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageResponseImagesModel {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    blockDeviceMappings: ").append(toIndentedString(blockDeviceMappings)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
    sb.append("    imageOwnerAlias: ").append(toIndentedString(imageOwnerAlias)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    rootDeviceType: ").append(toIndentedString(rootDeviceType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    virtualizationType: ").append(toIndentedString(virtualizationType)).append("\n");
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

