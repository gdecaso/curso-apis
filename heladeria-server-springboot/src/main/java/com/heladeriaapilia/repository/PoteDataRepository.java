package com.heladeriaapilia.repository;

import com.heladeriaapilia.model.PoteData;

public interface PoteDataRepository {
    PoteData save(PoteData pote);

    void delete(PoteData pote);
}
