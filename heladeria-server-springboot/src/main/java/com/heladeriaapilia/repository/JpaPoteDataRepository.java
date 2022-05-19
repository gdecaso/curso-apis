package com.heladeriaapilia.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPoteDataRepository extends PoteDataRepository, JpaRepository<PoteData, Integer> {

}