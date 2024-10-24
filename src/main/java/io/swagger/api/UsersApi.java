/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.63).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Recommended;
import io.swagger.model.View;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-24T09:52:41.056100650Z[GMT]")
@Validated
public interface UsersApi {

    @Operation(summary = "Delete the recommendation for a film", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Recommendation successfully deleted") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/recommended/{filmID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdProfilesProfileIdRecommendedFilmIDDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "ID of the recommended film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
);


    @Operation(summary = "Get details of a specific recommended film for a profile", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Recommendation details for the film", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Recommended.class))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/recommended/{filmID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Recommended> usersUserIdProfilesProfileIdRecommendedFilmIDGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "ID of the recommended film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
);


    @Operation(summary = "Replace the recommendation for a film", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Recommendation successfully updated") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/recommended/{filmID}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> usersUserIdProfilesProfileIdRecommendedFilmIDPut(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "ID of the recommended film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Recommended body
);


    @Operation(summary = "Get the list of recommended films for a specific profile", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of recommended films for the profile", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Recommended.class)))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/recommended",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Recommended>> usersUserIdProfilesProfileIdRecommendedGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Add a new recommendation for a film to a specific profile", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Recommendation successfully added") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/recommended",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersUserIdProfilesProfileIdRecommendedPost(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Recommended body
);


    @Operation(summary = "Delete the view record for a film", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "View successfully deleted") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/views/{filmID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdProfilesProfileIdViewsFilmIDDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "ID of the film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
);


    @Operation(summary = "Get details of a specific view record for a film", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "View details for the film", content = @Content(mediaType = "application/json", schema = @Schema(implementation = View.class))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/views/{filmID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<View> usersUserIdProfilesProfileIdViewsFilmIDGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "ID of the film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
);


    @Operation(summary = "Replace the view record for a film", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "View successfully updated") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/views/{filmID}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> usersUserIdProfilesProfileIdViewsFilmIDPut(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "ID of the film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody View body
);


    @Operation(summary = "Get the list of views for a specific profile", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of views for the profile", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = View.class)))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/views",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<View>> usersUserIdProfilesProfileIdViewsGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Add a new view record for a specific profile", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "View successfully added") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/views",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersUserIdProfilesProfileIdViewsPost(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody View body
);

}

