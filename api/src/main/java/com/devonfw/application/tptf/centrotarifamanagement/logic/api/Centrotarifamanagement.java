package com.devonfw.application.tptf.centrotarifamanagement.logic.api;

import java.util.List;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase.UcFindCentroTarifa;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase.UcManageCentroTarifa;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;

/**
 * Interface for Centrotarifamanagement component.
 */
public interface Centrotarifamanagement extends UcFindCentroTarifa, UcManageCentroTarifa {

  /**
   * @param customParametroCentroEto
   * @return
   */
  List<CustomParametroCentroEto> advancSearchCentrotarifa(CustomParametroCentroEto customParametroCentroEto);
  
  List<CustomParametroCentroEto> searchCentrosAssinged(CustomParametroCentroEto customParametroCentroEto);

  /**
   * @param centrotarifa
   * @return
   */
  // CentroTarifaEto updateCentroTarifa(CentroTarifaEto centrotarifa);

}
