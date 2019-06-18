package com.devonfw.application.tptf.centrotarifamanagement.logic.api.to;

import java.math.BigDecimal;

import com.devonfw.application.tptf.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.tptf.centrotarifamanagement.common.api.CentroTarifa}s.
 */
public class CentroTarifaSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private BigDecimal fechaDesdeVigencia;

  private BigDecimal fechaModificacion;

  private Long tipotarifaId;

  private Long centrosId;

  /**
   * @return fechaDesdeVigenciaId
   */

  public BigDecimal getFechaDesdeVigencia() {

    return fechaDesdeVigencia;
  }

  /**
   * @param fechaDesdeVigencia setter for fechaDesdeVigencia attribute
   */

  public void setFechaDesdeVigencia(BigDecimal fechaDesdeVigencia) {

    this.fechaDesdeVigencia = fechaDesdeVigencia;
  }

  /**
   * @return fechaModificacionId
   */

  public BigDecimal getFechaModificacion() {

    return fechaModificacion;
  }

  /**
   * @param fechaModificacion setter for fechaModificacion attribute
   */

  public void setFechaModificacion(BigDecimal fechaModificacion) {

    this.fechaModificacion = fechaModificacion;
  }

  /**
   * getter for tipotarifaId attribute
   * 
   * @return tipotarifaId
   */

  public Long getTipotarifaId() {

    return tipotarifaId;
  }

  /**
   * @param tipotarifa setter for tipotarifa attribute
   */

  public void setTipotarifaId(Long tipotarifaId) {

    this.tipotarifaId = tipotarifaId;
  }

  /**
   * getter for centrosId attribute
   * 
   * @return centrosId
   */

  public Long getCentrosId() {

    return centrosId;
  }

  /**
   * @param centros setter for centros attribute
   */

  public void setCentrosId(Long centrosId) {

    this.centrosId = centrosId;
  }

}
