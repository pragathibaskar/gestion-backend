package com.devonfw.application.tptf.centrotarifamanagement.service.impl.rest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.Centrotarifamanagement;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.centrotarifamanagement.service.api.rest.CentrotarifamanagementRestService;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Centrotarifamanagement}.
 */
@Named("CentrotarifamanagementRestService")
public class CentrotarifamanagementRestServiceImpl implements CentrotarifamanagementRestService {

  @Inject
  private Centrotarifamanagement centrotarifamanagement;

  @Override
  public CentroTarifaEto getCentroTarifa(long id) {

    return this.centrotarifamanagement.findCentroTarifa(id);
  }

  @Override
  public CentroTarifaEto saveCentroTarifa(CentroTarifaEto centrotarifa) {

    return this.centrotarifamanagement.saveCentroTarifa(centrotarifa);
  }

  @Override
  public void deleteCentroTarifa(long id) {

    this.centrotarifamanagement.deleteCentroTarifa(id);
  }

  @Override
  public Page<CentroTarifaEto> findCentroTarifas(CentroTarifaSearchCriteriaTo searchCriteriaTo) {

    return this.centrotarifamanagement.findCentroTarifas(searchCriteriaTo);
  }

  @Override
  public CentroTarifaEto getByKey(BigDecimal fechaDesdeVigencia) {

    return this.centrotarifamanagement.getByKey(fechaDesdeVigencia);
  }

  @Override
  public List<CentroTarifaEto> findAll() {

    return this.centrotarifamanagement.findAll();
  }

  @Override
  public CentroTarifaEto updateCentroTarifa(CentroTarifaEto centrotarifa) {

    return this.centrotarifamanagement.updateCentroTarifa(centrotarifa);
  }

  @Override
  public void deleteCentroAssignment(BigInteger centro, BigDecimal fechaDesdeVigencia) {

    this.centrotarifamanagement.deletecentroassignment(centro, fechaDesdeVigencia);

  }

  @Override
  public List<CustomParametroCentroEto> advancSearchCentrotarifa(CustomParametroCentroEto customParametroCentroEto) {

    return this.centrotarifamanagement.advancSearchCentrotarifa(customParametroCentroEto);
    
    
  }
  @Override
  public List<CustomParametroCentroEto> searchCentrosAssinged(CustomParametroCentroEto customParametroCentroEto) {

    return this.centrotarifamanagement.searchCentrosAssinged(customParametroCentroEto);
  }

}
