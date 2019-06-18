package com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaSearchCriteriaTo;

public interface UcFindParametroTarifa {

  /**
   * Returns a ParametroTarifa by its id 'id'.
   *
   * @param id The id 'id' of the ParametroTarifa.
   * @return The {@link ParametroTarifaEto} with id 'id'
   */
  ParametroTarifaEto findParametroTarifa(long id);

  /**
   * Returns a paginated list of ParametroTarifas matching the search criteria.
   *
   * @param criteria the {@link ParametroTarifaSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ParametroTarifaEto}s.
   */
  Page<ParametroTarifaEto> findParametroTarifas(ParametroTarifaSearchCriteriaTo criteria);

}
