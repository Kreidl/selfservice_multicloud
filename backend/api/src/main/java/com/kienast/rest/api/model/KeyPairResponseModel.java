package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeyPairResponseModel
 */

public class KeyPairResponseModel   {
  @JsonProperty("keypairId")
  private String keypairId;

  public KeyPairResponseModel keypairId(String keypairId) {
    this.keypairId = keypairId;
    return this;
  }

  /**
   * Get keypairId
   * @return keypairId
  */
  @ApiModelProperty(value = "")


  public String getKeypairId() {
    return keypairId;
  }

  public void setKeypairId(String keypairId) {
    this.keypairId = keypairId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPairResponseModel keyPairResponse = (KeyPairResponseModel) o;
    return Objects.equals(this.keypairId, keyPairResponse.keypairId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypairId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPairResponseModel {\n");
    
    sb.append("    keypairId: ").append(toIndentedString(keypairId)).append("\n");
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

