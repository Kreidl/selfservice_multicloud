package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImageResponseEbsModel
 */

public class ImageResponseEbsModel   {
  @JsonProperty("DeleteOnTermination")
  private Boolean deleteOnTermination;

  @JsonProperty("Encrypted")
  private Boolean encrypted;

  @JsonProperty("SnapshotId")
  private String snapshotId;

  @JsonProperty("VolumeSize")
  private Integer volumeSize;

  @JsonProperty("VolumeType")
  private String volumeType;

  public ImageResponseEbsModel deleteOnTermination(Boolean deleteOnTermination) {
    this.deleteOnTermination = deleteOnTermination;
    return this;
  }

  /**
   * Get deleteOnTermination
   * @return deleteOnTermination
  */
  @ApiModelProperty(value = "")


  public Boolean getDeleteOnTermination() {
    return deleteOnTermination;
  }

  public void setDeleteOnTermination(Boolean deleteOnTermination) {
    this.deleteOnTermination = deleteOnTermination;
  }

  public ImageResponseEbsModel encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

  /**
   * Get encrypted
   * @return encrypted
  */
  @ApiModelProperty(value = "")


  public Boolean getEncrypted() {
    return encrypted;
  }

  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }

  public ImageResponseEbsModel snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * Get snapshotId
   * @return snapshotId
  */
  @ApiModelProperty(value = "")


  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public ImageResponseEbsModel volumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
    return this;
  }

  /**
   * Get volumeSize
   * @return volumeSize
  */
  @ApiModelProperty(value = "")


  public Integer getVolumeSize() {
    return volumeSize;
  }

  public void setVolumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
  }

  public ImageResponseEbsModel volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  /**
   * Get volumeType
   * @return volumeType
  */
  @ApiModelProperty(value = "")


  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageResponseEbsModel imageResponseEbs = (ImageResponseEbsModel) o;
    return Objects.equals(this.deleteOnTermination, imageResponseEbs.deleteOnTermination) &&
        Objects.equals(this.encrypted, imageResponseEbs.encrypted) &&
        Objects.equals(this.snapshotId, imageResponseEbs.snapshotId) &&
        Objects.equals(this.volumeSize, imageResponseEbs.volumeSize) &&
        Objects.equals(this.volumeType, imageResponseEbs.volumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOnTermination, encrypted, snapshotId, volumeSize, volumeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageResponseEbsModel {\n");
    
    sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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

