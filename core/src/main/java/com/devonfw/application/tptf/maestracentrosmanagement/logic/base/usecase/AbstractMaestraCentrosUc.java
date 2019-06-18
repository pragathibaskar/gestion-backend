package com.devonfw.application.tptf.maestracentrosmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.tptf.general.logic.base.AbstractUc;
import com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api.repo.MaestraCentrosRepository;

/**
 * Abstract use case for MaestraCentross, which provides access to the commonly necessary data access objects.
 */
public class AbstractMaestraCentrosUc extends AbstractUc {

  /** @see #getMaestraCentrosRepository() */
  @Inject
  private MaestraCentrosRepository maestraCentrosRepository;

  /**
   * Returns the field 'maestraCentrosRepository'.
   * 
   * @return the {@link MaestraCentrosRepository} instance.
   */
  public MaestraCentrosRepository getMaestraCentrosRepository() {

    return this.maestraCentrosRepository;
  }

}
