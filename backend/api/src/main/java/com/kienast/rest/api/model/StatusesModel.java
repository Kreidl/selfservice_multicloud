package com.kienast.rest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusesModel
 */

public class StatusesModel   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("level")
  private String level;

  @JsonProperty("display_status")
  private String displayStatus;

  @JsonProperty("message")
  private String message;

  @JsonProperty("time")
  private OffsetDateTime time;

  public StatusesModel code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public StatusesModel level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @ApiModelProperty(value = "")


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public StatusesModel displayStatus(String displayStatus) {
    this.displayStatus = displayStatus;
    return this;
  }

  /**
   * Get displayStatus
   * @return displayStatus
  */
  @ApiModelProperty(value = "")


  public String getDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(String displayStatus) {
    this.displayStatus = displayStatus;
  }

  public StatusesModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StatusesModel time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusesModel statuses = (StatusesModel) o;
    return Objects.equals(this.code, statuses.code) &&
        Objects.equals(this.level, statuses.level) &&
        Objects.equals(this.displayStatus, statuses.displayStatus) &&
        Objects.equals(this.message, statuses.message) &&
        Objects.equals(this.time, statuses.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, level, displayStatus, message, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusesModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    displayStatus: ").append(toIndentedString(displayStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

