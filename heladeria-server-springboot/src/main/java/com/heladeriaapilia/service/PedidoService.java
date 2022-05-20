package com.heladeriaapilia.service;

import com.heladeriaapilia.model.PedidoData;
import com.heladeriaapilia.repository.PedidoDataRepository;
import com.heladeriaapilia.model.PoteData;
import com.heladeriaapilia.model.PoteData.PesoDePoteData;
import com.heladeriaapilia.repository.PoteDataRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PedidoService {

    private final GustoService gustoService;
    private final PedidoDataRepository pedidoDataRepository;
    private final PoteDataRepository poteDataRepository;

    public PedidoService(GustoService gustoService, PedidoDataRepository pedidoDataRepository, PoteDataRepository poteDataRepository) {
        this.gustoService = gustoService;
        this.pedidoDataRepository = pedidoDataRepository;
        this.poteDataRepository = poteDataRepository;
    }

    public Optional<PedidoData> findPedidoById(int id) {
        return pedidoDataRepository.findById(id);
    }

    public PedidoData createPedido(String direccionEntrega) {
        PedidoData pedidoData = new PedidoData(null, direccionEntrega);
        return pedidoDataRepository.save(pedidoData);
    }

    public PoteData addPoteToPedido(PedidoData pedido, PesoDePoteData peso, List<String> gustos) {
        for (String gusto : gustos) {
            if (!gustoService.getGustoById(gusto).isPresent()) {
                throw new BusinessLogicException("Gusto desconocido " + gusto);
            }
        }
        PoteData poteData = new PoteData(null, peso, gustos, pedido);
        poteData = poteDataRepository.save(poteData);
        pedido.addPote(poteData);
        return poteData;
    }

    public void removePoteFromPedido(PedidoData pedido, PoteData pote) {
        pedido.removePote(pote);
        poteDataRepository.delete(pote);
    }

    public PedidoData updateDireccionDeEntrega(PedidoData pedido, String direccionEntrega) {
        pedido.setDireccionDeEntrega(direccionEntrega);
        return pedidoDataRepository.save(pedido);
    }
}
