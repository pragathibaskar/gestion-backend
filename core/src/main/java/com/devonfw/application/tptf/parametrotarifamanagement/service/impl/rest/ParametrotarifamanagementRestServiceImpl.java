package com.devonfw.application.tptf.parametrotarifamanagement.service.impl.rest;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.Parametrotarifamanagement;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.parametrotarifamanagement.service.api.rest.ParametrotarifamanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component
 * {@link Parametrotarifamanagement}.
 */
@Named("ParametrotarifamanagementRestService")
public class ParametrotarifamanagementRestServiceImpl implements ParametrotarifamanagementRestService {

  @Inject
  private Parametrotarifamanagement parametrotarifamanagement;

  @Override
  public ParametroTarifaEto getParametroTarifa(long id) {

    return this.parametrotarifamanagement.findParametroTarifa(id);
  }

  @Override
  public ParametroTarifaEto saveParametroTarifa(ParametroTarifaEto parametrotarifa) {

    return this.parametrotarifamanagement.saveParametroTarifa(parametrotarifa);
  }

  @Override
  public void deleteParametroTarifa(long id) {

    this.parametrotarifamanagement.deleteParametroTarifa(id);
  }

  @Override
  public Page<ParametroTarifaEto> findParametroTarifas(ParametroTarifaSearchCriteriaTo searchCriteriaTo) {

    return this.parametrotarifamanagement.findParametroTarifas(searchCriteriaTo);
  }

  @Override
  public ParametroTarifaEto updateParametroTarifa(ParametroTarifaEto parametrotarifa) {

    return this.parametrotarifamanagement.updateParametroTarifa(parametrotarifa);
  }

  @Override
  public List<CustomPapametroEto> findAll() {

    return this.parametrotarifamanagement.findAll();
  }

  @Override
  public List<ParametroTarifaEto> getParametroTarifa(String tipodeTarifa, String description, String startDate,
      String endDate) {

    return this.parametrotarifamanagement.getParametroTarifa(tipodeTarifa, description, new BigDecimal(startDate),
        new BigDecimal(endDate));
  }

  @Override
  public List<CustomPapametroEto> findParametroTarifa(CustomPapametroEto searchCriteriaTo) {

    return this.parametrotarifamanagement.findParametroTarifa(searchCriteriaTo);
  }
}