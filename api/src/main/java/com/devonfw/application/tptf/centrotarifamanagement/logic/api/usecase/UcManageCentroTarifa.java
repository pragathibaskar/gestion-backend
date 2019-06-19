package com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;

/**
 * Interface of UcManageCentroTarifa to centralize documentation and signatures of methods.
 */
public interface UcManageCentroTarifa {

  /**
   * Deletes a centroTarifa from the database by its id 'centroTarifaId'.
   *
   * @param centroTarifaId Id of the centroTarifa to delete
   * @return boolean <code>true</code> if the centroTarifa can be deleted, <code>false</code> otherwise
   */
  boolean deleteCentroTarifa(long centroTarifaId);

  boolean deletecentroassignment(BigInteger centro, BigDecimal fechaDesdeVigencia);

  /**
   * Saves a centroTarifa and store it in the database.
   *
   * @param centroTarifa the {@link CentroTarifaEto} to create.
   * @return the new {@link CentroTarifaEto} that has been saved with ID and version.
   */
  CentroTarifaEto saveCentroTarifa(CentroTarifaEto centroTarifa);

  /**
   * @param centrotarifa
   * @return
   */
  CentroTarifaEto updateCentroTarifa(CentroTarifaEto centrotarifa);

  /**
   * @param customParametroCentroEto
   * @return
   */
  List<CustomParametroCentroEto> advancSearchCentrotarifa(CustomParametroCentroEto customParametroCentroEto);
  
  List<CustomParametroCentroEto> searchCentrosAssinged(CustomParametroCentroEto customParametroCentroEto);

}
