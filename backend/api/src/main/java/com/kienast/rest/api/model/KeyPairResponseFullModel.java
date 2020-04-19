package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.VPCResponseVpcTagsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeyPairResponseFullModel
 */

public class KeyPairResponseFullModel   {
  @JsonProperty("KeyPairId")
  private String keyPairId;

  @JsonProperty("KeyFingerprint")
  private String keyFingerprint;

  @JsonProperty("KeyName")
  private String keyName;

  @JsonProperty("Tags")
  @Valid
  private List<VPCResponseVpcTagsModel> tags = null;

  public KeyPairResponseFullModel keyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
    return this;
  }

  /**
   * Get keyPairId
   * @return keyPairId
  */
  @ApiModelProperty(value = "")


  public String getKeyPairId() {
    return keyPairId;
  }

  public void setKeyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
  }

  public KeyPairResponseFullModel keyFingerprint(String keyFingerprint) {
    this.keyFingerprint = keyFingerprint;
    return this;
  }

  /**
   * Get keyFingerprint
   * @return keyFingerprint
  */
  @ApiModelProperty(value = "")


  public String getKeyFingerprint() {
    return keyFingerprint;
  }

  public void setKeyFingerprint(String keyFingerprint) {
    this.keyFingerprint = keyFingerprint;
  }

  public KeyPairResponseFullModel keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Get keyName
   * @return keyName
  */
  @ApiModelProperty(value = "")


  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public KeyPairResponseFullModel tags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
    return this;
  }

  public KeyPairResponseFullModel addTagsItem(VPCResponseVpcTagsModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<VPCResponseVpcTagsModel>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VPCResponseVpcTagsModel> getTags() {
    return tags;
  }

  public void setTags(List<VPCResponseVpcTagsModel> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPairResponseFullModel keyPairResponseFull = (KeyPairResponseFullModel) o;
    return Objects.equals(this.keyPairId, keyPairResponseFull.keyPairId) &&
        Objects.equals(this.keyFingerprint, keyPairResponseFull.keyFingerprint) &&
        Objects.equals(this.keyName, keyPairResponseFull.keyName) &&
        Objects.equals(this.tags, keyPairResponseFull.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyPairId, keyFingerprint, keyName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPairResponseFullModel {\n");
    
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyFingerprint: ").append(toIndentedString(keyFingerprint)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

