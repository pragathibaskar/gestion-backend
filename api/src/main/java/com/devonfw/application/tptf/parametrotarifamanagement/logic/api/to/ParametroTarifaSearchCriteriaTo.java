package com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to;

import java.math.BigDecimal;

import com.devonfw.application.tptf.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.tptf.parametrotarifamanagement.common.api.ParametroTarifa}s.
 */
public class ParametroTarifaSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long tipodeTarifaId;

  private Integer modificationCounter;

  private BigDecimal fechaDesdeVigencia;

  private BigDecimal importeParkingMax;

  private BigDecimal importeMinSinCompra;

  private BigDecimal tiempoMaxSinCompra;

  private BigDecimal importeMin1Hora;

  private BigDecimal importeMin2Hora;

  private BigDecimal fraccionFacturacion;

  private BigDecimal costeFraccion;

  private BigDecimal tiempoMaxSalida;

  private BigDecimal fechaModificacion;

  /**
   * getter for tipodeTarifaId attribute
   * 
   * @return tipodeTarifaId
   */

  public Long getTipodeTarifaId() {

    return tipodeTarifaId;
  }

  /**
   * @param tipodeTarifa setter for tipodeTarifa attribute
   */

  public void setTipodeTarifaId(Long tipodeTarifaId) {

    this.tipodeTarifaId = tipodeTarifaId;
  }

  /**
   * @return modificationCounterId
   */

  public Integer getModificationCounter() {

    return modificationCounter;
  }

  /**
   * @param modificationCounter setter for modificationCounter attribute
   */

  public void setModificationCounter(Integer modificationCounter) {

    this.modificationCounter = modificationCounter;
  }

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
   * @return importeParkingMaxId
   */

  public BigDecimal getImporteParkingMax() {

    return importeParkingMax;
  }

  /**
   * @param importeParkingMax setter for importeParkingMax attribute
   */

  public void setImporteParkingMax(BigDecimal importeParkingMax) {

    this.importeParkingMax = importeParkingMax;
  }

  /**
   * @return importeMinSinCompraId
   */

  public BigDecimal getImporteMinSinCompra() {

    return importeMinSinCompra;
  }

  /**
   * @param importeMinSinCompra setter for importeMinSinCompra attribute
   */

  public void setImporteMinSinCompra(BigDecimal importeMinSinCompra) {

    this.importeMinSinCompra = importeMinSinCompra;
  }

  /**
   * @return tiempoMaxSinCompraId
   */

  public BigDecimal getTiempoMaxSinCompra() {

    return tiempoMaxSinCompra;
  }

  /**
   * @param tiempoMaxSinCompra setter for tiempoMaxSinCompra attribute
   */

  public void setTiempoMaxSinCompra(BigDecimal tiempoMaxSinCompra) {

    this.tiempoMaxSinCompra = tiempoMaxSinCompra;
  }

  /**
   * @return importeMin1HoraId
   */

  public BigDecimal getImporteMin1Hora() {

    return importeMin1Hora;
  }

  /**
   * @param importeMin1Hora setter for importeMin1Hora attribute
   */

  public void setImporteMin1Hora(BigDecimal importeMin1Hora) {

    this.importeMin1Hora = importeMin1Hora;
  }

  /**
   * @return importeMin2HoraId
   */

  public BigDecimal getImporteMin2Hora() {

    return importeMin2Hora;
  }

  /**
   * @param importeMin2Hora setter for importeMin2Hora attribute
   */

  public void setImporteMin2Hora(BigDecimal importeMin2Hora) {

    this.importeMin2Hora = importeMin2Hora;
  }

  /**
   * @return fraccionFacturacionId
   */

  public BigDecimal getFraccionFacturacion() {

    return fraccionFacturacion;
  }

  /**
   * @param fraccionFacturacion setter for fraccionFacturacion attribute
   */

  public void setFraccionFacturacion(BigDecimal fraccionFacturacion) {

    this.fraccionFacturacion = fraccionFacturacion;
  }

  /**
   * @return costeFraccionId
   */

  public BigDecimal getCosteFraccion() {

    return costeFraccion;
  }

  /**
   * @param costeFraccion setter for costeFraccion attribute
   */

  public void setCosteFraccion(BigDecimal costeFraccion) {

    this.costeFraccion = costeFraccion;
  }

  /**
   * @return tiempoMaxSalidaId
   */

  public BigDecimal getTiempoMaxSalida() {

    return tiempoMaxSalida;
  }

  /**
   * @param tiempoMaxSalida setter for tiempoMaxSalida attribute
   */

  public void setTiempoMaxSalida(BigDecimal tiempoMaxSalida) {

    this.tiempoMaxSalida = tiempoMaxSalida;
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

}
