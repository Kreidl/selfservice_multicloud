package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.ImageResponseEbsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImageResponseBlockDeviceMappingsModel
 */

public class ImageResponseBlockDeviceMappingsModel   {
  @JsonProperty("DeviceName")
  private String deviceName;

  @JsonProperty("Ebs")
  private ImageResponseEbsModel ebs = null;

  public ImageResponseBlockDeviceMappingsModel deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Get deviceName
   * @return deviceName
  */
  @ApiModelProperty(value = "")


  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public ImageResponseBlockDeviceMappingsModel ebs(ImageResponseEbsModel ebs) {
    this.ebs = ebs;
    return this;
  }

  /**
   * Get ebs
   * @return ebs
  */
  @ApiModelProperty(value = "")

  @Valid

  public ImageResponseEbsModel getEbs() {
    return ebs;
  }

  public void setEbs(ImageResponseEbsModel ebs) {
    this.ebs = ebs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageResponseBlockDeviceMappingsModel imageResponseBlockDeviceMappings = (ImageResponseBlockDeviceMappingsModel) o;
    return Objects.equals(this.deviceName, imageResponseBlockDeviceMappings.deviceName) &&
        Objects.equals(this.ebs, imageResponseBlockDeviceMappings.ebs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, ebs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageResponseBlockDeviceMappingsModel {\n");
    
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    ebs: ").append(toIndentedString(ebs)).append("\n");
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

