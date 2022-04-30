package io.swagger.api;

import io.swagger.model.Pedido;
import io.swagger.model.PedidoIdPotesBody;
import io.swagger.model.PedidosBody;
import io.swagger.model.Pote;
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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")
@RestController
public class PedidosApiController implements PedidosApi {

    private static final Logger log = LoggerFactory.getLogger(PedidosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PedidosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Pedido> pedidosPedidoIdGet(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\n  \"id\" : 22,\n  \"direccion_entrega\" : \"Lavalleja 244 4C, CABA\"\n}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pote>> pedidosPedidoIdPotesGet(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pote>>(objectMapper.readValue("[ {\n  \"peso\" : \"500\",\n  \"gustos\" : [ \"ddl\", \"pist\" ],\n  \"id\" : 1\n}, {\n  \"peso\" : \"500\",\n  \"gustos\" : [ \"ddl\", \"pist\" ],\n  \"id\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pote>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pote>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pote>> pedidosPedidoIdPotesPost(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PedidoIdPotesBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pote>>(objectMapper.readValue("[ {\n  \"peso\" : \"500\",\n  \"gustos\" : [ \"ddl\", \"pist\" ],\n  \"id\" : 1\n}, {\n  \"peso\" : \"500\",\n  \"gustos\" : [ \"ddl\", \"pist\" ],\n  \"id\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pote>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pote>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pedidosPedidoIdPotesPoteIdDelete(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId,@Parameter(in = ParameterIn.PATH, description = "id del pote", required=true, schema=@Schema()) @PathVariable("poteId") Integer poteId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidosPedidoIdPut(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Pedido body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\n  \"id\" : 22,\n  \"direccion_entrega\" : \"Lavalleja 244 4C, CABA\"\n}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidosPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PedidosBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\n  \"id\" : 22,\n  \"direccion_entrega\" : \"Lavalleja 244 4C, CABA\"\n}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

}
