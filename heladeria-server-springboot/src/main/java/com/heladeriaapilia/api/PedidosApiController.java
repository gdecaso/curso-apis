package com.heladeriaapilia.api;

import com.heladeriaapilia.api.dto.DatosDePago;
import com.heladeriaapilia.api.dto.Pago;
import com.heladeriaapilia.api.dto.Pedido;
import com.heladeriaapilia.api.dto.PedidoIdPotesBody;
import com.heladeriaapilia.api.dto.PedidosBody;
import com.heladeriaapilia.api.dto.PedidosPedidoIdBody;
import com.heladeriaapilia.api.dto.Pote;
import com.heladeriaapilia.api.mapper.PedidoMapper;
import com.heladeriaapilia.model.PedidoData;
import com.heladeriaapilia.model.PoteData;
import com.heladeriaapilia.service.GustoService;
import com.heladeriaapilia.service.PedidoService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")
@RestController
public class PedidosApiController implements PedidosApi {

    private static final Logger log = LoggerFactory.getLogger(PedidosApiController.class);

    private final PedidoMapper pedidoMapper;

    private final PedidoService pedidoService;
    private final GustoService gustoService;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PedidosApiController(PedidoMapper pedidoMapper, PedidoService pedidoService, GustoService gustoService, HttpServletRequest request) {
        this.pedidoMapper = pedidoMapper;
        this.pedidoService = pedidoService;
        this.gustoService = gustoService;
        this.request = request;
    }

    public ResponseEntity<Pedido> pedidosPedidoIdGet(
            @Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema())
            @PathVariable("pedidoId") Integer pedidoId) {
        return pedidoService.findPedidoById(pedidoId)
                .map(pedidoMapper::dataToApi)
                .map(pedido -> new ResponseEntity<>(pedido, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<List<Pote>> pedidosPedidoIdPotesGet(
            @Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema())
            @PathVariable("pedidoId") Integer pedidoId) {
        return pedidoService.findPedidoById(pedidoId)
                .map(PedidoData::getPotes)
                .map(pedidoMapper::dataToApi)
                .map(pedido -> new ResponseEntity<>(pedido, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<Pote> pedidosPedidoIdPotesPost(
            @Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema())
            @PathVariable("pedidoId") Integer pedidoId,
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema())
            @Valid @RequestBody PedidoIdPotesBody body) {
        Optional<PedidoData> maybePedido = pedidoService.findPedidoById(pedidoId);
        if (maybePedido.isPresent()) {
            PedidoData pedido = maybePedido.get();
            PoteData pote = pedidoService.addPoteToPedido(pedido, pedidoMapper.apiToData(body.getPeso()), body.getGustos());
            return new ResponseEntity<>(pedidoMapper.dataToApi(pote), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Void> pedidosPedidoIdPotesPoteIdDelete(
            @Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema())
            @PathVariable("pedidoId") Integer pedidoId,
            @Parameter(in = ParameterIn.PATH, description = "id del pote", required=true, schema=@Schema())
            @PathVariable("poteId") Integer poteId) {
        Optional<PedidoData> maybePedido = pedidoService.findPedidoById(pedidoId);
        if (maybePedido.isPresent()) {
            PedidoData pedido = maybePedido.get();
            Optional<PoteData> maybePote = pedido.getPotes().stream()
                    .filter(pote -> pote.getId() == poteId)
                    .findAny();
            if (maybePote.isPresent()) {
                PoteData pote = maybePote.get();
                pedidoService.removePoteFromPedido(pedido, pote);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Pedido> pedidosPedidoIdPut(
            @Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema())
            @PathVariable("pedidoId") Integer pedidoId,
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema())
            @Valid @RequestBody PedidosPedidoIdBody body) {
        Optional<PedidoData> maybePedido = pedidoService.findPedidoById(pedidoId);
        if (maybePedido.isPresent()) {
            PedidoData pedido = maybePedido.get();
            pedido = pedidoService.updateDireccionDeEntrega(pedido, body.getDireccionEntrega());
            return new ResponseEntity<>(pedidoMapper.dataToApi(pedido), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Pedido> pedidosPost(
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema())
            @Valid @RequestBody PedidosBody body) {
        PedidoData pedido = pedidoService.createPedido(body.getDireccionEntrega());
        return new ResponseEntity<>(pedidoMapper.dataToApi(pedido), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> pedidosPedidoIdPagarPost(Integer pedidoId, DatosDePago body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Pago> pedidosPedidoIdPagoGet(Integer pedidoId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
