package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeyPairRequestModel
 */

public class KeyPairRequestModel   {
  @JsonProperty("keypair")
  private String keypair;

  public KeyPairRequestModel keypair(String keypair) {
    this.keypair = keypair;
    return this;
  }

  /**
   * Get keypair
   * @return keypair
  */
  @ApiModelProperty(value = "")


  public String getKeypair() {
    return keypair;
  }

  public void setKeypair(String keypair) {
    this.keypair = keypair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPairRequestModel keyPairRequest = (KeyPairRequestModel) o;
    return Objects.equals(this.keypair, keyPairRequest.keypair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPairRequestModel {\n");
    
    sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
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

