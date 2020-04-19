package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kienast.rest.api.model.ImageResponseImagesModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImageResponseModel
 */

public class ImageResponseModel   {
  @JsonProperty("images")
  @Valid
  private List<ImageResponseImagesModel> images = null;

  public ImageResponseModel images(List<ImageResponseImagesModel> images) {
    this.images = images;
    return this;
  }

  public ImageResponseModel addImagesItem(ImageResponseImagesModel imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageResponseImagesModel>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ImageResponseImagesModel> getImages() {
    return images;
  }

  public void setImages(List<ImageResponseImagesModel> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageResponseModel imageResponse = (ImageResponseModel) o;
    return Objects.equals(this.images, imageResponse.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageResponseModel {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

