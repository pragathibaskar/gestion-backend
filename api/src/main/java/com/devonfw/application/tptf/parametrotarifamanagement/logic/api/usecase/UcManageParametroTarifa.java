package com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase;

import java.math.BigDecimal;
import java.util.List;

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;

/**
 * Interface of UcManageParametroTarifa to centralize documentation and signatures of methods.
 */
public interface UcManageParametroTarifa {

  /**
   * Deletes a parametroTarifa from the database by its id 'parametroTarifaId'.
   *
   * @param parametroTarifaId Id of the parametroTarifa to delete
   * @return boolean <code>true</code> if the parametroTarifa can be deleted, <code>false</code> otherwise
   */
  boolean deleteParametroTarifa(long parametroTarifaId);

  /**
   * Saves a parametroTarifa and store it in the database.
   *
   * @param parametroTarifa the {@link ParametroTarifaEto} to create.
   * @return the new {@link ParametroTarifaEto} that has been saved with ID and version.
   */
  ParametroTarifaEto saveParametroTarifa(ParametroTarifaEto parametroTarifa);

  /**
   * @param parametrotarifa
   * @return
   */
  ParametroTarifaEto updateParametroTarifa(ParametroTarifaEto parametrotarifa);

  /**
   * @return
   */
  List<CustomPapametroEto> findAll();

  /**
   * @param tipodeTarifa
   * @param description
   * @param bDStartDate
   * @param bDEndDate
   * @return
   */
  List<ParametroTarifaEto> getParametroTarifa(String tipodeTarifa, String description, BigDecimal bDStartDate,
      BigDecimal bDEndDate);

  /**
   * @param searchCriteriaTo
   * @return
   */
  List<CustomPapametroEto> findParametroTarifa(CustomPapametroEto searchCriteriaTo);

}
