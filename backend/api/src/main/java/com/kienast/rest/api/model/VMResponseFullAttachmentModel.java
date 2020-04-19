package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullAttachmentModel
 */

public class VMResponseFullAttachmentModel   {
  @JsonProperty("AttachTime")
  private String attachTime;

  @JsonProperty("AttachmentId")
  private String attachmentId;

  @JsonProperty("DeleteOnTermination")
  private Boolean deleteOnTermination;

  @JsonProperty("DeviceIndex")
  private Integer deviceIndex;

  @JsonProperty("Status")
  private String status;

  public VMResponseFullAttachmentModel attachTime(String attachTime) {
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

  public VMResponseFullAttachmentModel attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * Get attachmentId
   * @return attachmentId
  */
  @ApiModelProperty(value = "")


  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public VMResponseFullAttachmentModel deleteOnTermination(Boolean deleteOnTermination) {
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

  public VMResponseFullAttachmentModel deviceIndex(Integer deviceIndex) {
    this.deviceIndex = deviceIndex;
    return this;
  }

  /**
   * Get deviceIndex
   * @return deviceIndex
  */
  @ApiModelProperty(value = "")


  public Integer getDeviceIndex() {
    return deviceIndex;
  }

  public void setDeviceIndex(Integer deviceIndex) {
    this.deviceIndex = deviceIndex;
  }

  public VMResponseFullAttachmentModel status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullAttachmentModel vmResponseFullAttachment = (VMResponseFullAttachmentModel) o;
    return Objects.equals(this.attachTime, vmResponseFullAttachment.attachTime) &&
        Objects.equals(this.attachmentId, vmResponseFullAttachment.attachmentId) &&
        Objects.equals(this.deleteOnTermination, vmResponseFullAttachment.deleteOnTermination) &&
        Objects.equals(this.deviceIndex, vmResponseFullAttachment.deviceIndex) &&
        Objects.equals(this.status, vmResponseFullAttachment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachTime, attachmentId, deleteOnTermination, deviceIndex, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullAttachmentModel {\n");
    
    sb.append("    attachTime: ").append(toIndentedString(attachTime)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
    sb.append("    deviceIndex: ").append(toIndentedString(deviceIndex)).append("\n");
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

