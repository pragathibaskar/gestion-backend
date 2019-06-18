package com.devonfw.application.tptf.centrotarifamanagement.logic.api.usecase;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaSearchCriteriaTo;

public interface UcFindCentroTarifa {

  /**
   * Returns a CentroTarifa by its id 'id'.
   *
   * @param id The id 'id' of the CentroTarifa.
   * @return The {@link CentroTarifaEto} with id 'id'
   */
  CentroTarifaEto findCentroTarifa(long id);

  CentroTarifaEto getByKey(BigDecimal fechaDesdeVigencia);

  List<CentroTarifaEto> findAll();

  // List<CentroTarifaEto> findByTipo(long id);

  /**
   * Returns a paginated list of CentroTarifas matching the search criteria.
   *
   * @param criteria the {@link CentroTarifaSearchCriteriaTo}.
   * @return the {@link List} of matching {@link CentroTarifaEto}s.
   */
  Page<CentroTarifaEto> findCentroTarifas(CentroTarifaSearchCriteriaTo criteria);

}
