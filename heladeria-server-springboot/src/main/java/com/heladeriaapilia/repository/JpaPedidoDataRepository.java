package com.heladeriaapilia.repository;
 
import com.heladeriaapilia.model.PedidoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPedidoDataRepository extends PedidoDataRepository, JpaRepository<PedidoData, Integer> {

}