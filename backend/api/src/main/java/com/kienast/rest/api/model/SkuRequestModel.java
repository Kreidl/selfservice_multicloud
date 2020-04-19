package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SkuRequestModel
 */

public class SkuRequestModel   {
  @JsonProperty("publishername")
  private String publishername;

  @JsonProperty("imagename")
  private String imagename;

  public SkuRequestModel publishername(String publishername) {
    this.publishername = publishername;
    return this;
  }

  /**
   * Get publishername
   * @return publishername
  */
  @ApiModelProperty(value = "")


  public String getPublishername() {
    return publishername;
  }

  public void setPublishername(String publishername) {
    this.publishername = publishername;
  }

  public SkuRequestModel imagename(String imagename) {
    this.imagename = imagename;
    return this;
  }

  /**
   * Get imagename
   * @return imagename
  */
  @ApiModelProperty(value = "")


  public String getImagename() {
    return imagename;
  }

  public void setImagename(String imagename) {
    this.imagename = imagename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuRequestModel skuRequest = (SkuRequestModel) o;
    return Objects.equals(this.publishername, skuRequest.publishername) &&
        Objects.equals(this.imagename, skuRequest.imagename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishername, imagename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuRequestModel {\n");
    
    sb.append("    publishername: ").append(toIndentedString(publishername)).append("\n");
    sb.append("    imagename: ").append(toIndentedString(imagename)).append("\n");
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

