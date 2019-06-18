package com.devonfw.application.tptf.parametrotarifamanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api.ParametroTarifaEntity;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase.UcFindParametroTarifa;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.base.usecase.AbstractParametroTarifaUc;

/**
 * Use case implementation for searching, filtering and getting ParametroTarifas
 */
@Named
@Validated
@Transactional
public class UcFindParametroTarifaImpl extends AbstractParametroTarifaUc implements UcFindParametroTarifa {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindParametroTarifaImpl.class);

  @Override
  public ParametroTarifaEto findParametroTarifa(long id) {

    LOG.debug("Get ParametroTarifa with id {} from database.", id);
    Optional<ParametroTarifaEntity> foundEntity = getParametroTarifaRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), ParametroTarifaEto.class);
    else
      return null;
  }

  @Override
  public Page<ParametroTarifaEto> findParametroTarifas(ParametroTarifaSearchCriteriaTo criteria) {

    Page<ParametroTarifaEntity> parametrotarifas = getParametroTarifaRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(parametrotarifas, ParametroTarifaEto.class);
  }

}
