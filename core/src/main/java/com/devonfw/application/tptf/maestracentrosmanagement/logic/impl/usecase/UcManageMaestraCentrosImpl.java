package com.devonfw.application.tptf.maestracentrosmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api.MaestraCentrosEntity;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosEto;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase.UcManageMaestraCentros;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.base.usecase.AbstractMaestraCentrosUc;

/**
 * Use case implementation for modifying and deleting MaestraCentross
 */
@Named
@Validated
@Transactional
public class UcManageMaestraCentrosImpl extends AbstractMaestraCentrosUc implements UcManageMaestraCentros {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageMaestraCentrosImpl.class);

  @Override
  public boolean deleteMaestraCentros(long maestraCentrosId) {

    MaestraCentrosEntity maestraCentros = getMaestraCentrosRepository().find(maestraCentrosId);
    getMaestraCentrosRepository().delete(maestraCentros);
    LOG.debug("The maestraCentros with id '{}' has been deleted.", maestraCentrosId);
    return true;
  }

  @Override
  public MaestraCentrosEto saveMaestraCentros(MaestraCentrosEto maestraCentros) {

    Objects.requireNonNull(maestraCentros, "maestraCentros");

    MaestraCentrosEntity maestraCentrosEntity = getBeanMapper().map(maestraCentros, MaestraCentrosEntity.class);

    // initialize, validate maestraCentrosEntity here if necessary
    MaestraCentrosEntity resultEntity = getMaestraCentrosRepository().save(maestraCentrosEntity);
    LOG.debug("MaestraCentros with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, MaestraCentrosEto.class);
  }
}
