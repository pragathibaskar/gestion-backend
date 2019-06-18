package com.devonfw.application.tptf.parametrotarifamanagement.logic.api;

import java.math.BigDecimal;
import java.util.List;

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase.UcFindParametroTarifa;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase.UcManageParametroTarifa;

/**
 * Interface for Parametrotarifamanagement component.
 */
public interface Parametrotarifamanagement extends UcFindParametroTarifa, UcManageParametroTarifa {

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
