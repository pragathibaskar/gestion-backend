package com.devonfw.application.tptf.centrotarifamanagement.logic.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.Centrotarifamanagement;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase.UcFindCentroTarifa;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase.UcManageCentroTarifa;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;
import com.devonfw.application.tptf.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of centrotarifamanagement
 */
@Named
public class CentrotarifamanagementImpl extends AbstractComponentFacade implements Centrotarifamanagement {

  @Inject
  private UcFindCentroTarifa ucFindCentroTarifa;

  @Inject
  private UcManageCentroTarifa ucManageCentroTarifa;

  @Override
  public CentroTarifaEto findCentroTarifa(long id) {

    return this.ucFindCentroTarifa.findCentroTarifa(id);
  }

  @Override
  public Page<CentroTarifaEto> findCentroTarifas(CentroTarifaSearchCriteriaTo criteria) {

    return this.ucFindCentroTarifa.findCentroTarifas(criteria);
  }

  @Override
  public CentroTarifaEto saveCentroTarifa(CentroTarifaEto centrotarifa) {

    return this.ucManageCentroTarifa.saveCentroTarifa(centrotarifa);
  }

  @Override
  public boolean deleteCentroTarifa(long id) {

    return this.ucManageCentroTarifa.deleteCentroTarifa(id);
  }

  @Override
  public CentroTarifaEto getByKey(BigDecimal fechaDesdeVigencia) {

    return this.ucFindCentroTarifa.getByKey(fechaDesdeVigencia);
  }

  @Override
  public List<CentroTarifaEto> findAll() {

    return this.ucFindCentroTarifa.findAll();
  }

  @Override
  public CentroTarifaEto updateCentroTarifa(CentroTarifaEto centrotarifa) {

    return this.ucManageCentroTarifa.updateCentroTarifa(centrotarifa);
  }

  @Override
  public boolean deletecentroassignment(BigInteger centro, BigDecimal fechaDesdeVigencia) {

    return this.ucManageCentroTarifa.deletecentroassignment(centro, fechaDesdeVigencia);
  }

  @Override
  public List<CustomParametroCentroEto> advancSearchCentrotarifa(CustomParametroCentroEto customParametroCentroEto) {

    return this.ucManageCentroTarifa.advancSearchCentrotarifa(customParametroCentroEto);
  }
  @Override
  public List<CustomParametroCentroEto> searchCentrosAssinged(CustomParametroCentroEto customParametroCentroEto) {

    return this.ucManageCentroTarifa.searchCentrosAssinged(customParametroCentroEto);
  }

}
