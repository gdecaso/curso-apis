package com.heladeriaapilia.api;

import com.heladeriaapilia.model.TipoDeGusto;
import com.heladeriaapilia.service.GustoService;
import com.heladeriaapilia.api.mapper.GustoMapper;
import com.heladeriaapilia.model.Gusto;
import com.heladeriaapilia.repository.GustoData;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")
@RestController
public class GustosApiController implements GustosApi {

    private static final Logger log = LoggerFactory.getLogger(GustosApiController.class);

    private final GustoMapper gustoMapper;

    private final GustoService gustoService;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GustosApiController(GustoMapper gustoMapper, GustoService gustoService, HttpServletRequest request) {
        this.gustoMapper = gustoMapper;
        this.gustoService = gustoService;
        this.request = request;
    }

    public ResponseEntity<List<Gusto>> gustosGet(
            @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema())
            @Valid
            @RequestParam(value = "tipo", required = false) TipoDeGusto tipo) {
        List<GustoData> gustos = tipo != null ?
                gustoService.getGustosByTipo(gustoMapper.apiToData(tipo)) :
                gustoService.getGustos();
        return new ResponseEntity<>(gustoMapper.dataToApi(gustos), HttpStatus.OK);
    }
}
