package com.devonfw.application.tptf.centrotarifamanagement.logic.impl.usecase;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api.CentroTarifaEntity;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase.UcFindCentroTarifa;
import com.devonfw.application.tptf.centrotarifamanagement.logic.base.usecase.AbstractCentroTarifaUc;

/**
 * Use case implementation for searching, filtering and getting CentroTarifas
 */
@Named
@Validated
@Transactional
public class UcFindCentroTarifaImpl extends AbstractCentroTarifaUc implements UcFindCentroTarifa {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCentroTarifaImpl.class);

  @Override
  public CentroTarifaEto findCentroTarifa(long id) {

    LOG.debug("Get CentroTarifa with id {} from database.", id);
    Optional<CentroTarifaEntity> foundEntity = getCentroTarifaRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), CentroTarifaEto.class);
    else
      return null;
  }

  @Override
  public Page<CentroTarifaEto> findCentroTarifas(CentroTarifaSearchCriteriaTo criteria) {

    Page<CentroTarifaEntity> centrotarifas = getCentroTarifaRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(centrotarifas, CentroTarifaEto.class);
  }

  @Override
  public CentroTarifaEto getByKey(BigDecimal fechaDesdeVigencia) {

    CentroTarifaEntity centro = getCentroTarifaRepository().findByFechaDesdeVigencia(fechaDesdeVigencia);
    return getBeanMapper().map(centro, CentroTarifaEto.class);
  }

  @Override
  public List<CentroTarifaEto> findAll() {

    List<CentroTarifaEntity> list = getCentroTarifaRepository().findAll();
    LOG.debug("The CentroTarifa  '{}' has been fetched.", list);
    return getBeanMapper().mapList(list, CentroTarifaEto.class);

  }

  // @Override
  // public List<CentroTarifaEto> findByTipo(long id) {
  //
  // List<CentroTarifaEntity> list = getCentroTarifaRepository().findByTipodeTarifa(id);
  // return getBeanMapper().mapList(list, CentroTarifaEto.class);
  // }

}
