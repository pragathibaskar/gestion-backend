package com.devonfw.application.tptf.tipotarifamanagement.logic.api.usecase;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomMaestraCentroEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaSearchCriteriaTo;

public interface UcFindTipoTarifa {

  /**
   * Returns a TipoTarifa by its id 'id'.
   *
   * @param id The id 'id' of the TipoTarifa.
   * @return The {@link TipoTarifaEto} with id 'id'
   */
  TipoTarifaEto findTipoTarifa(long id);

  TipoTarifaEto getByTipodeTarifa(String tipodeTarifa);

  List<TipoTarifaEto> findAll();

  List<CentroTarifaEto> listCentroTarifa(TipoTarifaEto tipotarifa);

  List<CustomMaestraCentroEto> listCustomTarifa(TipoTarifaEto tipotarifa);

  List<CustomMaestraCentroEto> listCustomSearch(String tipodeTarifa, String description, BigInteger centro,
      String descripcion);

  List<CustomParametroCentroEto> listCentroParam(String tipodeTarifa, String description,
      BigDecimal fechaDesdeVigencia);

  List<CustomParametroCentroEto> searchCentroParam(String tipodeTarifa, String description,
      BigDecimal fechaDesdeVigencia, BigInteger centro, String descripcion);

  /**
   * Returns a paginated list of TipoTarifas matching the search criteria.
   *
   * @param criteria the {@link TipoTarifaSearchCriteriaTo}.
   * @return the {@link List} of matching {@link TipoTarifaEto}s.
   */
  Page<TipoTarifaEto> findTipoTarifas(TipoTarifaSearchCriteriaTo criteria);

}
