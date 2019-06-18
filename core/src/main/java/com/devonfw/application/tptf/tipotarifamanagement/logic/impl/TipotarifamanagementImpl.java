package com.devonfw.application.tptf.tipotarifamanagement.logic.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomMaestraCentroEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;
import com.devonfw.application.tptf.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.Tipotarifamanagement;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.usecase.UcFindTipoTarifa;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.usecase.UcManageTipoTarifa;

/**
 * Implementation of component interface of tipotarifamanagement
 */
@Named
public class TipotarifamanagementImpl extends AbstractComponentFacade implements Tipotarifamanagement {

  @Inject
  private UcFindTipoTarifa ucFindTipoTarifa;

  @Inject
  private UcManageTipoTarifa ucManageTipoTarifa;

  @Override
  public TipoTarifaEto findTipoTarifa(long id) {

    return this.ucFindTipoTarifa.findTipoTarifa(id);
  }

  @Override
  public Page<TipoTarifaEto> findTipoTarifas(TipoTarifaSearchCriteriaTo criteria) {

    return this.ucFindTipoTarifa.findTipoTarifas(criteria);
  }

  @Override
  public TipoTarifaEto saveTipoTarifa(TipoTarifaEto tipotarifa) {

    return this.ucManageTipoTarifa.saveTipoTarifa(tipotarifa);
  }

  @Override
  public boolean deleteTipoTarifa(long id) {

    return this.ucManageTipoTarifa.deleteTipoTarifa(id);
  }

  @Override
  public TipoTarifaEto updateTipoTarifa(String tipodeTarifa, String description) {

    return this.ucManageTipoTarifa.updateTipoTarifa(tipodeTarifa, description);
  }

  @Override
  public TipoTarifaEto getByTipodeTarifa(String tipodeTarifa) {

    return this.ucFindTipoTarifa.getByTipodeTarifa(tipodeTarifa);
  }

  @Override
  public List<TipoTarifaEto> findAll() {

    return this.ucFindTipoTarifa.findAll();
  }

  @Override
  public List<CentroTarifaEto> listCentroTarifa(TipoTarifaEto tipotarifa) {

    return this.ucFindTipoTarifa.listCentroTarifa(tipotarifa);
  }

  @Override
  public List<CustomMaestraCentroEto> listCustomTarifa(TipoTarifaEto tipotarifa) {

    return this.ucFindTipoTarifa.listCustomTarifa(tipotarifa);
  }

  @Override
  public List<CustomMaestraCentroEto> listCustomSearch(String tipodeTarifa, String description, BigInteger centro,
      String descripcion) {

    return this.ucFindTipoTarifa.listCustomSearch(tipodeTarifa, description, centro, descripcion);
  }

  @Override
  public List<CustomParametroCentroEto> listCentroParam(String tipodeTarifa, String description,
      BigDecimal fechaDesdeVigencia) {

    return this.ucFindTipoTarifa.listCentroParam(tipodeTarifa, description, fechaDesdeVigencia);
  }

  @Override
  public List<CustomParametroCentroEto> searchCentroParam(String tipodeTarifa, String description,
      BigDecimal fechaDesdeVigencia, BigInteger centro, String descripcion) {

    return this.ucFindTipoTarifa.searchCentroParam(tipodeTarifa, description, fechaDesdeVigencia, centro, descripcion);
  }

  @Override
  public TipoTarifaEto updatePordefecto(long id) {

    return this.ucManageTipoTarifa.updatePordefecto(id);
  }

}
