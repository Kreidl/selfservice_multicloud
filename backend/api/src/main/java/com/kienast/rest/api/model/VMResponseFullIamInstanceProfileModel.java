package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullIamInstanceProfileModel
 */

public class VMResponseFullIamInstanceProfileModel   {
  @JsonProperty("Arn")
  private String arn;

  @JsonProperty("Id")
  private String id;

  public VMResponseFullIamInstanceProfileModel arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @ApiModelProperty(value = "")


  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public VMResponseFullIamInstanceProfileModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullIamInstanceProfileModel vmResponseFullIamInstanceProfile = (VMResponseFullIamInstanceProfileModel) o;
    return Objects.equals(this.arn, vmResponseFullIamInstanceProfile.arn) &&
        Objects.equals(this.id, vmResponseFullIamInstanceProfile.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullIamInstanceProfileModel {\n");
    
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

