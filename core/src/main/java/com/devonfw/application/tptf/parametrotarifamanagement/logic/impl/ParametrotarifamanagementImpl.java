package com.devonfw.application.tptf.parametrotarifamanagement.logic.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.Parametrotarifamanagement;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase.UcFindParametroTarifa;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase.UcManageParametroTarifa;

/**
 * Implementation of component interface of parametrotarifamanagement
 */
@Named
public class ParametrotarifamanagementImpl extends AbstractComponentFacade implements Parametrotarifamanagement {

  @Inject
  private UcFindParametroTarifa ucFindParametroTarifa;

  @Inject
  private UcManageParametroTarifa ucManageParametroTarifa;

  @Override
  public ParametroTarifaEto findParametroTarifa(long id) {

    return this.ucFindParametroTarifa.findParametroTarifa(id);
  }

  @Override
  public Page<ParametroTarifaEto> findParametroTarifas(ParametroTarifaSearchCriteriaTo criteria) {

    return this.ucFindParametroTarifa.findParametroTarifas(criteria);
  }

  @Override
  public ParametroTarifaEto saveParametroTarifa(ParametroTarifaEto parametrotarifa) {

    return this.ucManageParametroTarifa.saveParametroTarifa(parametrotarifa);
  }

  @Override
  public boolean deleteParametroTarifa(long id) {

    return this.ucManageParametroTarifa.deleteParametroTarifa(id);
  }

  @Override
  public ParametroTarifaEto updateParametroTarifa(ParametroTarifaEto parametrotarifa) {

    return this.ucManageParametroTarifa.updateParametroTarifa(parametrotarifa);
  }

  @Override
  public List<CustomPapametroEto> findAll() {

    return this.ucManageParametroTarifa.findAll();
  }

  @Override
  public List<ParametroTarifaEto> getParametroTarifa(String tipodeTarifa, String description, BigDecimal bDStartDate,
      BigDecimal bDEndDate) {

    return this.ucManageParametroTarifa.getParametroTarifa(tipodeTarifa, description, bDStartDate, bDEndDate);
  }

  @Override
  public List<CustomPapametroEto> findParametroTarifa(CustomPapametroEto searchCriteriaTo) {

    return this.ucManageParametroTarifa.findParametroTarifa(searchCriteriaTo);
  }
}
