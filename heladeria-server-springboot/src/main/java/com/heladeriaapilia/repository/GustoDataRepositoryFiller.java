package com.heladeriaapilia.repository;

import com.heladeriaapilia.repository.GustoData.TipoDeGustoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class GustoDataRepositoryFiller
implements ApplicationListener<ApplicationReadyEvent> {

  private final GustoDataRepository repository;

  @Autowired
  public GustoDataRepositoryFiller(GustoDataRepository repository) {
    this.repository = repository;
  }

  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {
    repository.save(new GustoData("ddl", "Dulce de leche", TipoDeGustoData.DULCE_DE_LECHES));
    repository.save(new GustoData("ddl_gr", "Dulce de leche granizado", TipoDeGustoData.DULCE_DE_LECHES));
    repository.save(new GustoData("choco_am", "Chocolate amargo", TipoDeGustoData.CHOCOLATES));
    repository.save(new GustoData("choco_nuez", "Chocolate con nuez", TipoDeGustoData.CHOCOLATES));
    repository.save(new GustoData("samb", "Sambayón", TipoDeGustoData.CREMAS));
    repository.save(new GustoData("masc", "Mascarpone", TipoDeGustoData.CREMAS));
    repository.save(new GustoData("frutilla", "Frutilla al agua", TipoDeGustoData.FRUTAS));
    repository.save(new GustoData("limon", "Limón al agua", TipoDeGustoData.FRUTAS));
    repository.save(new GustoData("naranja", "Naranja al agua", TipoDeGustoData.FRUTAS));
  }
}