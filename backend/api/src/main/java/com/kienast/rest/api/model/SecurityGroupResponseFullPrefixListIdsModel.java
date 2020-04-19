package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupResponseFullPrefixListIdsModel
 */

public class SecurityGroupResponseFullPrefixListIdsModel   {
  @JsonProperty("Description")
  private String description;

  @JsonProperty("PrefixListId")
  private String prefixListId;

  public SecurityGroupResponseFullPrefixListIdsModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityGroupResponseFullPrefixListIdsModel prefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
    return this;
  }

  /**
   * Get prefixListId
   * @return prefixListId
  */
  @ApiModelProperty(value = "")


  public String getPrefixListId() {
    return prefixListId;
  }

  public void setPrefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupResponseFullPrefixListIdsModel securityGroupResponseFullPrefixListIds = (SecurityGroupResponseFullPrefixListIdsModel) o;
    return Objects.equals(this.description, securityGroupResponseFullPrefixListIds.description) &&
        Objects.equals(this.prefixListId, securityGroupResponseFullPrefixListIds.prefixListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, prefixListId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupResponseFullPrefixListIdsModel {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    prefixListId: ").append(toIndentedString(prefixListId)).append("\n");
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

