package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.InstanceTypeResponseTypesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstanceTypeResponseModel
 */

public class InstanceTypeResponseModel   {
  @JsonProperty("types")
  @Valid
  private List<InstanceTypeResponseTypesModel> types = null;

  public InstanceTypeResponseModel types(List<InstanceTypeResponseTypesModel> types) {
    this.types = types;
    return this;
  }

  public InstanceTypeResponseModel addTypesItem(InstanceTypeResponseTypesModel typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<InstanceTypeResponseTypesModel>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InstanceTypeResponseTypesModel> getTypes() {
    return types;
  }

  public void setTypes(List<InstanceTypeResponseTypesModel> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTypeResponseModel instanceTypeResponse = (InstanceTypeResponseModel) o;
    return Objects.equals(this.types, instanceTypeResponse.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTypeResponseModel {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

