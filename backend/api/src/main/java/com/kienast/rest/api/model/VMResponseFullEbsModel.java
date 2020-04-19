package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullEbsModel
 */

public class VMResponseFullEbsModel   {
  @JsonProperty("AttachTime")
  private String attachTime;

  @JsonProperty("DeleteOnTermination")
  private Boolean deleteOnTermination;

  @JsonProperty("Status")
  private String status;

  @JsonProperty("VolumeId")
  private String volumeId;

  public VMResponseFullEbsModel attachTime(String attachTime) {
    this.attachTime = attachTime;
    return this;
  }

  /**
   * Get attachTime
   * @return attachTime
  */
  @ApiModelProperty(value = "")


  public String getAttachTime() {
    return attachTime;
  }

  public void setAttachTime(String attachTime) {
    this.attachTime = attachTime;
  }

  public VMResponseFullEbsModel deleteOnTermination(Boolean deleteOnTermination) {
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

  public VMResponseFullEbsModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VMResponseFullEbsModel volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * Get volumeId
   * @return volumeId
  */
  @ApiModelProperty(value = "")


  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullEbsModel vmResponseFullEbs = (VMResponseFullEbsModel) o;
    return Objects.equals(this.attachTime, vmResponseFullEbs.attachTime) &&
        Objects.equals(this.deleteOnTermination, vmResponseFullEbs.deleteOnTermination) &&
        Objects.equals(this.status, vmResponseFullEbs.status) &&
        Objects.equals(this.volumeId, vmResponseFullEbs.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachTime, deleteOnTermination, status, volumeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullEbsModel {\n");
    
    sb.append("    attachTime: ").append(toIndentedString(attachTime)).append("\n");
    sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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

