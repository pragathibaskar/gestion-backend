package com.devonfw.application.tptf.tipotarifamanagement.logic.api.usecase;

import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaEto;

/**
 * Interface of UcManageTipoTarifa to centralize documentation and signatures of methods.
 */
public interface UcManageTipoTarifa {

  /**
   * Deletes a tipoTarifa from the database by its id 'tipoTarifaId'.
   *
   * @param tipoTarifaId Id of the tipoTarifa to delete
   * @return boolean <code>true</code> if the tipoTarifa can be deleted, <code>false</code> otherwise
   */
  boolean deleteTipoTarifa(long tipoTarifaId);

  TipoTarifaEto updatePordefecto(long id);

  /**
   * Saves a tipoTarifa and store it in the database.
   *
   * @param tipoTarifa the {@link TipoTarifaEto} to create.
   * @return the new {@link TipoTarifaEto} that has been saved with ID and version.
   */
  TipoTarifaEto saveTipoTarifa(TipoTarifaEto tipoTarifa);

  TipoTarifaEto updateTipoTarifa(String tipodeTarifa, String description);

}
