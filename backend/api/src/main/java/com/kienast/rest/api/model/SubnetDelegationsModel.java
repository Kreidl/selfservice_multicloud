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
 * SubnetDelegationsModel
 */

public class SubnetDelegationsModel   {
  @JsonProperty("actions")
  @Valid
  private List<String> actions = null;

  @JsonProperty("provisioning_state")
  private String provisioningState;

  @JsonProperty("etag")
  private String etag;

  public SubnetDelegationsModel actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public SubnetDelegationsModel addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
  */
  @ApiModelProperty(value = "")


  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public SubnetDelegationsModel provisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
    return this;
  }

  /**
   * Get provisioningState
   * @return provisioningState
  */
  @ApiModelProperty(value = "")


  public String getProvisioningState() {
    return provisioningState;
  }

  public void setProvisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
  }

  public SubnetDelegationsModel etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Get etag
   * @return etag
  */
  @ApiModelProperty(value = "")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetDelegationsModel subnetDelegations = (SubnetDelegationsModel) o;
    return Objects.equals(this.actions, subnetDelegations.actions) &&
        Objects.equals(this.provisioningState, subnetDelegations.provisioningState) &&
        Objects.equals(this.etag, subnetDelegations.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, provisioningState, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetDelegationsModel {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

