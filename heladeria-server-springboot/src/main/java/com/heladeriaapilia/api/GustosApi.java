/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.heladeriaapilia.api;

import com.heladeriaapilia.api.dto.Gusto;
import com.heladeriaapilia.api.dto.TipoDeGusto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T17:06:40.309Z[GMT]")
@Validated
public interface GustosApi {

    @Operation(summary = "", description = "Ver un gusto particular", tags = {})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "El gusto ha sido hallado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Gusto.class))),  @ApiResponse(responseCode = "400", description = "Malformado"), @ApiResponse(responseCode = "404", description = "No se conoce un gusto con tal id")})
    @RequestMapping(value = "/gustos/{gustoId}", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Gusto> gustosGustoIdGet(@Parameter(in = ParameterIn.PATH, description = "id del gusto", required = true, schema = @Schema()) @PathVariable("gustoId") String gustoId);

    @Operation(summary = "", description = "Listar los gustos de helado", tags = {})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Estos son los gustos de helado", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Gusto.class))))})
    @RequestMapping(value = "/gustos", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<List<Gusto>> gustosGet(@Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema()) @Valid @RequestParam(value = "tipo", required = false) TipoDeGusto tipo);

}

