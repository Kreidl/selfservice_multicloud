package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferRequestModel
 */

public class OfferRequestModel   {
  @JsonProperty("publishername")
  private String publishername;

  public OfferRequestModel publishername(String publishername) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRequestModel offerRequest = (OfferRequestModel) o;
    return Objects.equals(this.publishername, offerRequest.publishername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRequestModel {\n");
    
    sb.append("    publishername: ").append(toIndentedString(publishername)).append("\n");
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

