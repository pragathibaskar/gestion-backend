package com.devonfw.application.tptf.tipotarifamanagement.service.impl.rest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomMaestraCentroEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.Tipotarifamanagement;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.tipotarifamanagement.service.api.rest.TipotarifamanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Tipotarifamanagement}.
 */
@Named("TipotarifamanagementRestService")
public class TipotarifamanagementRestServiceImpl implements TipotarifamanagementRestService {

  @Inject
  private Tipotarifamanagement tipotarifamanagement;

  @Override
  public TipoTarifaEto getTipoTarifa(long id) {

    return this.tipotarifamanagement.findTipoTarifa(id);
  }

  @Override
  public TipoTarifaEto saveTipoTarifa(TipoTarifaEto tipotarifa) {

    return this.tipotarifamanagement.saveTipoTarifa(tipotarifa);
  }

  @Override
  public void deleteTipoTarifa(long id) {

    this.tipotarifamanagement.deleteTipoTarifa(id);
  }

  @Override
  public Page<TipoTarifaEto> findTipoTarifas(TipoTarifaSearchCriteriaTo searchCriteriaTo) {

    return this.tipotarifamanagement.findTipoTarifas(searchCriteriaTo);
  }

  @Override
  public TipoTarifaEto updateTipoTarifa(String tipodeTarifa, String description) {

    return this.tipotarifamanagement.updateTipoTarifa(tipodeTarifa, description);
  }

  @Override
  public TipoTarifaEto getByTipodeTarifa(String tipodeTarifa) {

    return this.tipotarifamanagement.getByTipodeTarifa(tipodeTarifa);
  }

  @Override
  public List<TipoTarifaEto> findAll() {

    return this.tipotarifamanagement.findAll();
  }

  @Override
  public List<CentroTarifaEto> listCentroTarifa(TipoTarifaEto tipotarifa) {

    return this.tipotarifamanagement.listCentroTarifa(tipotarifa);
  }

  @Override
  public List<CustomMaestraCentroEto> listCustomTarifa(TipoTarifaEto tipotarifa) {

    return this.tipotarifamanagement.listCustomTarifa(tipotarifa);
  }

  @Override
  public List<CustomMaestraCentroEto> listCustomSearch(String tipodeTarifa, String description, BigInteger centro,
      String descripcion) {

    return this.tipotarifamanagement.listCustomSearch(tipodeTarifa, description, centro, descripcion);
  }

  @Override
  public List<CustomParametroCentroEto> listCentroParam(String tipodeTarifa, String description,
      BigDecimal fechaDesdeVigencia) {

    return this.tipotarifamanagement.listCentroParam(tipodeTarifa, description, fechaDesdeVigencia);
  }

  @Override
  public List<CustomParametroCentroEto> searchCentroParam(String tipodeTarifa, String description,
      BigDecimal fechaDesdeVigencia, BigInteger centro, String descripcion) {

    return this.tipotarifamanagement.searchCentroParam(tipodeTarifa, description, fechaDesdeVigencia, centro,
        descripcion);
  }

  @Override
  public TipoTarifaEto updatePordefecto(long id) {

    return this.tipotarifamanagement.updatePordefecto(id);
  }

}
