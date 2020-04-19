package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.KeyPairResponseFullModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeyPairResponseFullListModel
 */

public class KeyPairResponseFullListModel   {
  @JsonProperty("keypairs")
  @Valid
  private List<KeyPairResponseFullModel> keypairs = null;

  public KeyPairResponseFullListModel keypairs(List<KeyPairResponseFullModel> keypairs) {
    this.keypairs = keypairs;
    return this;
  }

  public KeyPairResponseFullListModel addKeypairsItem(KeyPairResponseFullModel keypairsItem) {
    if (this.keypairs == null) {
      this.keypairs = new ArrayList<KeyPairResponseFullModel>();
    }
    this.keypairs.add(keypairsItem);
    return this;
  }

  /**
   * Get keypairs
   * @return keypairs
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<KeyPairResponseFullModel> getKeypairs() {
    return keypairs;
  }

  public void setKeypairs(List<KeyPairResponseFullModel> keypairs) {
    this.keypairs = keypairs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPairResponseFullListModel keyPairResponseFullList = (KeyPairResponseFullListModel) o;
    return Objects.equals(this.keypairs, keyPairResponseFullList.keypairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPairResponseFullListModel {\n");
    
    sb.append("    keypairs: ").append(toIndentedString(keypairs)).append("\n");
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

