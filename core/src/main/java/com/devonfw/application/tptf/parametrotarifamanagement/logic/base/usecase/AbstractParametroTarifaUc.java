package com.devonfw.application.tptf.parametrotarifamanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.tptf.general.logic.base.AbstractUc;
import com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api.repo.ParametroTarifaRepository;

/**
 * Abstract use case for ParametroTarifas, which provides access to the commonly necessary data access objects.
 */
public class AbstractParametroTarifaUc extends AbstractUc {

  /** @see #getParametroTarifaRepository() */
  @Inject
  private ParametroTarifaRepository parametroTarifaRepository;

  /**
   * Returns the field 'parametroTarifaRepository'.
   * 
   * @return the {@link ParametroTarifaRepository} instance.
   */
  public ParametroTarifaRepository getParametroTarifaRepository() {

    return this.parametroTarifaRepository;
  }

}
