package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * View
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-24T09:52:41.056100650Z[GMT]")


public class View   {
  @JsonProperty("profile")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object profile = null;

  @JsonProperty("filmID")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer filmID = null;

  @JsonProperty("timesOfTheFilm")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer timesOfTheFilm = null;

  @JsonProperty("isFinished")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean isFinished = null;


  public View profile(Object profile) { 

    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   **/
  
  @Schema(description = "")
  
  public Object getProfile() {  
    return profile;
  }



  public void setProfile(Object profile) { 
    this.profile = profile;
  }

  public View filmID(Integer filmID) { 

    this.filmID = filmID;
    return this;
  }

  /**
   * Unique identifier for the viewed film
   * @return filmID
   **/
  
  @Schema(description = "Unique identifier for the viewed film")
  
  public Integer getFilmID() {  
    return filmID;
  }



  public void setFilmID(Integer filmID) { 
    this.filmID = filmID;
  }

  public View timesOfTheFilm(Integer timesOfTheFilm) { 

    this.timesOfTheFilm = timesOfTheFilm;
    return this;
  }

  /**
   * Number of times the film has been viewed
   * @return timesOfTheFilm
   **/
  
  @Schema(description = "Number of times the film has been viewed")
  
  public Integer getTimesOfTheFilm() {  
    return timesOfTheFilm;
  }



  public void setTimesOfTheFilm(Integer timesOfTheFilm) { 
    this.timesOfTheFilm = timesOfTheFilm;
  }

  public View isFinished(Boolean isFinished) { 

    this.isFinished = isFinished;
    return this;
  }

  /**
   * Indicates whether the film has been finished
   * @return isFinished
   **/
  
  @Schema(description = "Indicates whether the film has been finished")
  
  public Boolean isIsFinished() {  
    return isFinished;
  }



  public void setIsFinished(Boolean isFinished) { 
    this.isFinished = isFinished;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    View view = (View) o;
    return Objects.equals(this.profile, view.profile) &&
        Objects.equals(this.filmID, view.filmID) &&
        Objects.equals(this.timesOfTheFilm, view.timesOfTheFilm) &&
        Objects.equals(this.isFinished, view.isFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, filmID, timesOfTheFilm, isFinished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    filmID: ").append(toIndentedString(filmID)).append("\n");
    sb.append("    timesOfTheFilm: ").append(toIndentedString(timesOfTheFilm)).append("\n");
    sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
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
