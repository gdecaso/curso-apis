package com.heladeriaapilia.repository;

import java.util.List;
import java.util.Optional;

public interface PedidoDataRepository {
    List<PedidoData> findAll();

    Optional<PedidoData> findById(int id);

    PedidoData save(PedidoData pedido);
}
