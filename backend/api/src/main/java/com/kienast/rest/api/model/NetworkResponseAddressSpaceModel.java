package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NetworkResponseAddressSpaceModel
 */

public class NetworkResponseAddressSpaceModel   {
  @JsonProperty("address_prefixes")
  @Valid
  private List<String> addressPrefixes = null;

  public NetworkResponseAddressSpaceModel addressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
    return this;
  }

  public NetworkResponseAddressSpaceModel addAddressPrefixesItem(String addressPrefixesItem) {
    if (this.addressPrefixes == null) {
      this.addressPrefixes = new ArrayList<String>();
    }
    this.addressPrefixes.add(addressPrefixesItem);
    return this;
  }

  /**
   * Get addressPrefixes
   * @return addressPrefixes
  */
  @ApiModelProperty(value = "")


  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }

  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkResponseAddressSpaceModel networkResponseAddressSpace = (NetworkResponseAddressSpaceModel) o;
    return Objects.equals(this.addressPrefixes, networkResponseAddressSpace.addressPrefixes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrefixes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkResponseAddressSpaceModel {\n");
    
    sb.append("    addressPrefixes: ").append(toIndentedString(addressPrefixes)).append("\n");
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

