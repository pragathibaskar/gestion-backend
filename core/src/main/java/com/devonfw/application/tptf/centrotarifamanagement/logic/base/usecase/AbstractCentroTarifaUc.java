package com.devonfw.application.tptf.centrotarifamanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api.repo.CentroTarifaRepository;
import com.devonfw.application.tptf.general.logic.base.AbstractUc;

/**
 * Abstract use case for CentroTarifas, which provides access to the commonly necessary data access objects.
 */
public class AbstractCentroTarifaUc extends AbstractUc {

  /** @see #getCentroTarifaRepository() */
  @Inject
  private CentroTarifaRepository centroTarifaRepository;

  /**
   * Returns the field 'centroTarifaRepository'.
   * 
   * @return the {@link CentroTarifaRepository} instance.
   */
  public CentroTarifaRepository getCentroTarifaRepository() {

    return this.centroTarifaRepository;
  }

}
