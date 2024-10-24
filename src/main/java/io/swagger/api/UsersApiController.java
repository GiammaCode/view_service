package io.swagger.api;

import io.swagger.model.Recommended;
import io.swagger.model.View;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-24T09:52:41.056100650Z[GMT]")
@RestController
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> usersUserIdProfilesProfileIdRecommendedFilmIDDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.PATH, description = "ID of the recommended film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Recommended> usersUserIdProfilesProfileIdRecommendedFilmIDGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.PATH, description = "ID of the recommended film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Recommended>(objectMapper.readValue("{\n  \"profile\" : { },\n  \"filmID\" : 0,\n  \"viewed\" : true,\n  \"recommendationType\" : \"recommendationType\"\n}", Recommended.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Recommended>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Recommended>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> usersUserIdProfilesProfileIdRecommendedFilmIDPut(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.PATH, description = "ID of the recommended film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Recommended body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Recommended>> usersUserIdProfilesProfileIdRecommendedGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Recommended>>(objectMapper.readValue("[ {\n  \"profile\" : { },\n  \"filmID\" : 0,\n  \"viewed\" : true,\n  \"recommendationType\" : \"recommendationType\"\n}, {\n  \"profile\" : { },\n  \"filmID\" : 0,\n  \"viewed\" : true,\n  \"recommendationType\" : \"recommendationType\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Recommended>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Recommended>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> usersUserIdProfilesProfileIdRecommendedPost(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Recommended body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> usersUserIdProfilesProfileIdViewsFilmIDDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.PATH, description = "ID of the film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<View> usersUserIdProfilesProfileIdViewsFilmIDGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.PATH, description = "ID of the film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<View>(objectMapper.readValue("{\n  \"profile\" : { },\n  \"filmID\" : 0,\n  \"timesOfTheFilm\" : 6,\n  \"isFinished\" : true\n}", View.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<View>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<View>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> usersUserIdProfilesProfileIdViewsFilmIDPut(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.PATH, description = "ID of the film", required=true, schema=@Schema()) @PathVariable("filmID") Integer filmID
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody View body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<View>> usersUserIdProfilesProfileIdViewsGet(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<View>>(objectMapper.readValue("[ {\n  \"profile\" : { },\n  \"filmID\" : 0,\n  \"timesOfTheFilm\" : 6,\n  \"isFinished\" : true\n}, {\n  \"profile\" : { },\n  \"filmID\" : 0,\n  \"timesOfTheFilm\" : 6,\n  \"isFinished\" : true\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<View>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<View>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> usersUserIdProfilesProfileIdViewsPost(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "ID of the profile", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody View body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
