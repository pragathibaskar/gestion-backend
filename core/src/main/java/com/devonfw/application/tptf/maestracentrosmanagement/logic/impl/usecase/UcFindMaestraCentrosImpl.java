package com.devonfw.application.tptf.maestracentrosmanagement.logic.impl.usecase;

import java.math.BigInteger;
import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api.MaestraCentrosEntity;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosEto;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosSearchCriteriaTo;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase.UcFindMaestraCentros;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.base.usecase.AbstractMaestraCentrosUc;

/**
 * Use case implementation for searching, filtering and getting MaestraCentross
 */
@Named
@Validated
@Transactional
public class UcFindMaestraCentrosImpl extends AbstractMaestraCentrosUc implements UcFindMaestraCentros {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindMaestraCentrosImpl.class);

  @Override
  public MaestraCentrosEto findMaestraCentros(long id) {

    LOG.debug("Get MaestraCentros with id {} from database.", id);
    Optional<MaestraCentrosEntity> foundEntity = getMaestraCentrosRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), MaestraCentrosEto.class);
    else
      return null;
  }

  @Override
  public Page<MaestraCentrosEto> findMaestraCentross(MaestraCentrosSearchCriteriaTo criteria) {

    Page<MaestraCentrosEntity> maestracentross = getMaestraCentrosRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(maestracentross, MaestraCentrosEto.class);
  }

  @Override
  public Long findId(BigInteger centro) {

    MaestraCentrosEntity maestra = getMaestraCentrosRepository().findByCentro(centro);
    return maestra.getId();
  }

}
