package com.devonfw.application.tptf.tipotarifamanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.tptf.general.logic.base.AbstractUc;
import com.devonfw.application.tptf.tipotarifamanagement.dataaccess.api.repo.TipoTarifaRepository;

/**
 * Abstract use case for TipoTarifas, which provides access to the commonly necessary data access objects.
 */
public class AbstractTipoTarifaUc extends AbstractUc {

  /** @see #getTipoTarifaRepository() */
  @Inject
  private TipoTarifaRepository tipoTarifaRepository;

  /**
   * Returns the field 'tipoTarifaRepository'.
   * 
   * @return the {@link TipoTarifaRepository} instance.
   */
  public TipoTarifaRepository getTipoTarifaRepository() {

    return this.tipoTarifaRepository;
  }

}
