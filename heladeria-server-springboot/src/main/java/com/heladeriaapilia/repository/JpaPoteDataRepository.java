package com.heladeriaapilia.repository;
 
import com.heladeriaapilia.model.PoteData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPoteDataRepository extends PoteDataRepository, JpaRepository<PoteData, Integer> {

}