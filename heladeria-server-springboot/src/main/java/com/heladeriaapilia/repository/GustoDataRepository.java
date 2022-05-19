package com.heladeriaapilia.repository;

import java.util.List;
import java.util.Optional;

public interface GustoDataRepository {
    List<GustoData> findAll();

    Optional<GustoData> findById(String id);

    GustoData save(GustoData gusto);
}
