package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VMResponseFullLicensesModel
 */

public class VMResponseFullLicensesModel   {
  @JsonProperty("LicenseConfigurationArn")
  private String licenseConfigurationArn;

  public VMResponseFullLicensesModel licenseConfigurationArn(String licenseConfigurationArn) {
    this.licenseConfigurationArn = licenseConfigurationArn;
    return this;
  }

  /**
   * Get licenseConfigurationArn
   * @return licenseConfigurationArn
  */
  @ApiModelProperty(value = "")


  public String getLicenseConfigurationArn() {
    return licenseConfigurationArn;
  }

  public void setLicenseConfigurationArn(String licenseConfigurationArn) {
    this.licenseConfigurationArn = licenseConfigurationArn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMResponseFullLicensesModel vmResponseFullLicenses = (VMResponseFullLicensesModel) o;
    return Objects.equals(this.licenseConfigurationArn, vmResponseFullLicenses.licenseConfigurationArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseConfigurationArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMResponseFullLicensesModel {\n");
    
    sb.append("    licenseConfigurationArn: ").append(toIndentedString(licenseConfigurationArn)).append("\n");
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

