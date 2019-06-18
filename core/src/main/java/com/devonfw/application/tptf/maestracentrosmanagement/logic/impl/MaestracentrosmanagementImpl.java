package com.devonfw.application.tptf.maestracentrosmanagement.logic.impl;

import java.math.BigInteger;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.Maestracentrosmanagement;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosEto;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosSearchCriteriaTo;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase.UcFindMaestraCentros;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase.UcManageMaestraCentros;

/**
 * Implementation of component interface of maestracentrosmanagement
 */
@Named
public class MaestracentrosmanagementImpl extends AbstractComponentFacade implements Maestracentrosmanagement {

  @Inject
  private UcFindMaestraCentros ucFindMaestraCentros;

  @Inject
  private UcManageMaestraCentros ucManageMaestraCentros;

  @Override
  public MaestraCentrosEto findMaestraCentros(long id) {

    return this.ucFindMaestraCentros.findMaestraCentros(id);
  }

  @Override
  public Page<MaestraCentrosEto> findMaestraCentross(MaestraCentrosSearchCriteriaTo criteria) {

    return this.ucFindMaestraCentros.findMaestraCentross(criteria);
  }

  @Override
  public MaestraCentrosEto saveMaestraCentros(MaestraCentrosEto maestracentros) {

    return this.ucManageMaestraCentros.saveMaestraCentros(maestracentros);
  }

  @Override
  public boolean deleteMaestraCentros(long id) {

    return this.ucManageMaestraCentros.deleteMaestraCentros(id);
  }

  @Override
  public Long findId(BigInteger centro) {

    return this.ucFindMaestraCentros.findId(centro);
  }
}
