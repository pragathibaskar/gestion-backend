package com.devonfw.application.tptf.parametrotarifamanagement.common.api;

import java.math.BigDecimal;

import com.devonfw.application.tptf.general.common.api.ApplicationEntity;

public interface ParametroTarifa extends ApplicationEntity {

  /**
   * getter for tipodeTarifaId attribute
   *
   * @return tipodeTarifaId
   */

  public Long getTipodeTarifaId();

  /**
   * @param tipodeTarifa setter for tipodeTarifa attribute
   */

  public void setTipodeTarifaId(Long tipodeTarifaId);

  /**
   * @return fechaDesdeVigenciaId
   */

  public BigDecimal getFechaDesdeVigencia();

  /**
   * @param fechaDesdeVigencia setter for fechaDesdeVigencia attribute
   */

  public void setFechaDesdeVigencia(BigDecimal fechaDesdeVigencia);

  /**
   * @return importeParkingMaxId
   */

  public BigDecimal getImporteParkingMax();

  /**
   * @param importeParkingMax setter for importeParkingMax attribute
   */

  public void setImporteParkingMax(BigDecimal importeParkingMax);

  /**
   * @return importeMinSinCompraId
   */

  public BigDecimal getImporteMinSinCompra();

  /**
   * @param importeMinSinCompra setter for importeMinSinCompra attribute
   */

  public void setImporteMinSinCompra(BigDecimal importeMinSinCompra);

  /**
   * @return tiempoMaxSinCompraId
   */

  public BigDecimal getTiempoMaxSinCompra();

  /**
   * @param tiempoMaxSinCompra setter for tiempoMaxSinCompra attribute
   */

  public void setTiempoMaxSinCompra(BigDecimal tiempoMaxSinCompra);

  /**
   * @return importeMin1HoraId
   */

  public BigDecimal getImporteMin1Hora();

  /**
   * @param importeMin1Hora setter for importeMin1Hora attribute
   */

  public void setImporteMin1Hora(BigDecimal importeMin1Hora);

  /**
   * @return importeMin2HoraId
   */

  public BigDecimal getImporteMin2Hora();

  /**
   * @param importeMin2Hora setter for importeMin2Hora attribute
   */

  public void setImporteMin2Hora(BigDecimal importeMin2Hora);

  /**
   * @return fraccionFacturacionId
   */

  public BigDecimal getFraccionFacturacion();

  /**
   * @param fraccionFacturacion setter for fraccionFacturacion attribute
   */

  public void setFraccionFacturacion(BigDecimal fraccionFacturacion);

  /**
   * @return costeFraccionId
   */

  public BigDecimal getCosteFraccion();

  /**
   * @param costeFraccion setter for costeFraccion attribute
   */

  public void setCosteFraccion(BigDecimal costeFraccion);

  /**
   * @return tiempoMaxSalidaId
   */

  public BigDecimal getTiempoMaxSalida();

  /**
   * @param tiempoMaxSalida setter for tiempoMaxSalida attribute
   */

  public void setTiempoMaxSalida(BigDecimal tiempoMaxSalida);

  /**
   * @return fechaModificacionId
   */

  public BigDecimal getFechaModificacion();

  /**
   * @param fechaModificacion setter for fechaModificacion attribute
   */

  public void setFechaModificacion(BigDecimal fechaModificacion);

}
