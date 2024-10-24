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
 * Recommended
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-24T09:52:41.056100650Z[GMT]")


public class Recommended   {
  @JsonProperty("profile")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object profile = null;

  @JsonProperty("filmID")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer filmID = null;

  @JsonProperty("recommendationType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String recommendationType = null;

  @JsonProperty("viewed")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean viewed = null;


  public Recommended profile(Object profile) { 

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

  public Recommended filmID(Integer filmID) { 

    this.filmID = filmID;
    return this;
  }

  /**
   * Unique identifier for the recommended film
   * @return filmID
   **/
  
  @Schema(description = "Unique identifier for the recommended film")
  
  public Integer getFilmID() {  
    return filmID;
  }



  public void setFilmID(Integer filmID) { 
    this.filmID = filmID;
  }

  public Recommended recommendationType(String recommendationType) { 

    this.recommendationType = recommendationType;
    return this;
  }

  /**
   * Type of recommendation (e.g., \"Trending\", \"Personalized\", \"Editor's Pick\")
   * @return recommendationType
   **/
  
  @Schema(description = "Type of recommendation (e.g., \"Trending\", \"Personalized\", \"Editor's Pick\")")
  
  public String getRecommendationType() {  
    return recommendationType;
  }



  public void setRecommendationType(String recommendationType) { 
    this.recommendationType = recommendationType;
  }

  public Recommended viewed(Boolean viewed) { 

    this.viewed = viewed;
    return this;
  }

  /**
   * Indicates whether the film has already been viewed by the profile
   * @return viewed
   **/
  
  @Schema(description = "Indicates whether the film has already been viewed by the profile")
  
  public Boolean isViewed() {  
    return viewed;
  }



  public void setViewed(Boolean viewed) { 
    this.viewed = viewed;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommended recommended = (Recommended) o;
    return Objects.equals(this.profile, recommended.profile) &&
        Objects.equals(this.filmID, recommended.filmID) &&
        Objects.equals(this.recommendationType, recommended.recommendationType) &&
        Objects.equals(this.viewed, recommended.viewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, filmID, recommendationType, viewed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommended {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    filmID: ").append(toIndentedString(filmID)).append("\n");
    sb.append("    recommendationType: ").append(toIndentedString(recommendationType)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
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
