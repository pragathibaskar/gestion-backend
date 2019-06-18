package com.devonfw.application.tptf.centrotarifamanagement.common.api;

import java.math.BigDecimal;

import com.devonfw.application.tptf.general.common.api.ApplicationEntity;

public interface CentroTarifa extends ApplicationEntity {

  /**
   * @return fechaDesdeVigenciaId
   */

  public BigDecimal getFechaDesdeVigencia();

  /**
   * @param fechaDesdeVigencia setter for fechaDesdeVigencia attribute
   */

  public void setFechaDesdeVigencia(BigDecimal fechaDesdeVigencia);

  /**
   * @return fechaModificacionId
   */

  public BigDecimal getFechaModificacion();

  /**
   * @param fechaModificacion setter for fechaModificacion attribute
   */

  public void setFechaModificacion(BigDecimal fechaModificacion);

  /**
   * getter for tipotarifaId attribute
   * 
   * @return tipotarifaId
   */

  public Long getTipotarifaId();

  /**
   * @param tipotarifa setter for tipotarifa attribute
   */

  public void setTipotarifaId(Long tipotarifaId);

  /**
   * getter for centrosId attribute
   * 
   * @return centrosId
   */

  public Long getCentrosId();

  /**
   * @param centros setter for centros attribute
   */

  public void setCentrosId(Long centrosId);

}
