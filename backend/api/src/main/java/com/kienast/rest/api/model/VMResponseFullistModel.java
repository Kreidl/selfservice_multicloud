package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VMResponseFullModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullistModel
 */

public class VMResponseFullistModel   {
  @JsonProperty("instances")
  @Valid
  private List<VMResponseFullModel> instances = null;

  public VMResponseFullistModel instances(List<VMResponseFullModel> instances) {
    this.instances = instances;
    return this;
  }

  public VMResponseFullistModel addInstancesItem(VMResponseFullModel instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<VMResponseFullModel>();
    }
    this.instances.add(instancesItem);
    return this;
  }

  /**
   * Get instances
   * @return instances
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VMResponseFullModel> getInstances() {
    return instances;
  }

  public void setInstances(List<VMResponseFullModel> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullistModel vmResponseFullist = (VMResponseFullistModel) o;
    return Objects.equals(this.instances, vmResponseFullist.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullistModel {\n");
    
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

