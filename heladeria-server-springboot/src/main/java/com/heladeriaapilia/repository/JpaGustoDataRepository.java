package com.heladeriaapilia.repository;
 
import com.heladeriaapilia.model.GustoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGustoDataRepository extends GustoDataRepository, JpaRepository<GustoData, String> {

}