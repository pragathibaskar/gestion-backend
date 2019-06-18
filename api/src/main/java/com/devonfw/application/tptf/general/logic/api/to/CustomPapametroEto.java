package com.devonfw.application.tptf.general.logic.api.to;

import java.math.BigDecimal;

import com.devonfw.application.tptf.general.common.api.BinaryObject;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * The {@link com.devonfw.module.basic.common.api.to.AbstractEto ETO} for a {@link BinaryObject}.
 */
public class CustomPapametroEto extends AbstractEto {

  private static final long serialVersionUID = 1L;

  private String tipodeTarifa;

  private String description;

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

  private String startDate;

  private String endDate;

  private Integer numberOfCentros;

  /**
   * Constructor.
   */
  public CustomPapametroEto() {

    super();
  }

  /**
   * @return tipodeTarifa
   */
  public String getTipodeTarifa() {

    return this.tipodeTarifa;
  }

  /**
   * @param tipodeTarifa new value of {@link #gettipodeTarifa}.
   */
  public void setTipodeTarifa(String tipodeTarifa) {

    this.tipodeTarifa = tipodeTarifa;
  }

  /**
   * @return description
   */
  public String getDescription() {

    return this.description;
  }

  /**
   * @param description new value of {@link #getdescription}.
   */
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @return fechaDesdeVigencia
   */
  public BigDecimal getFechaDesdeVigencia() {

    return this.fechaDesdeVigencia;
  }

  /**
   * @param fechaDesdeVigencia new value of {@link #getfechaDesdeVigencia}.
   */
  public void setFechaDesdeVigencia(BigDecimal fechaDesdeVigencia) {

    this.fechaDesdeVigencia = fechaDesdeVigencia;
  }

  /**
   * @return importeParkingMax
   */
  public BigDecimal getImporteParkingMax() {

    return this.importeParkingMax;
  }

  /**
   * @param importeParkingMax new value of {@link #getimporteParkingMax}.
   */
  public void setImporteParkingMax(BigDecimal importeParkingMax) {

    this.importeParkingMax = importeParkingMax;
  }

  /**
   * @return importeMinSinCompra
   */
  public BigDecimal getImporteMinSinCompra() {

    return this.importeMinSinCompra;
  }

  /**
   * @param importeMinSinCompra new value of {@link #getimporteMinSinCompra}.
   */
  public void setImporteMinSinCompra(BigDecimal importeMinSinCompra) {

    this.importeMinSinCompra = importeMinSinCompra;
  }

  /**
   * @return tiempoMaxSinCompra
   */
  public BigDecimal getTiempoMaxSinCompra() {

    return this.tiempoMaxSinCompra;
  }

  /**
   * @param tiempoMaxSinCompra new value of {@link #gettiempoMaxSinCompra}.
   */
  public void setTiempoMaxSinCompra(BigDecimal tiempoMaxSinCompra) {

    this.tiempoMaxSinCompra = tiempoMaxSinCompra;
  }

  /**
   * @return importeMin1Hora
   */
  public BigDecimal getImporteMin1Hora() {

    return this.importeMin1Hora;
  }

  /**
   * @param importeMin1Hora new value of {@link #getimporteMin1Hora}.
   */
  public void setImporteMin1Hora(BigDecimal importeMin1Hora) {

    this.importeMin1Hora = importeMin1Hora;
  }

  /**
   * @return importeMin2Hora
   */
  public BigDecimal getImporteMin2Hora() {

    return this.importeMin2Hora;
  }

  /**
   * @param importeMin2Hora new value of {@link #getimporteMin2Hora}.
   */
  public void setImporteMin2Hora(BigDecimal importeMin2Hora) {

    this.importeMin2Hora = importeMin2Hora;
  }

  /**
   * @return fraccionFacturacion
   */
  public BigDecimal getFraccionFacturacion() {

    return this.fraccionFacturacion;
  }

  /**
   * @param fraccionFacturacion new value of {@link #getfraccionFacturacion}.
   */
  public void setFraccionFacturacion(BigDecimal fraccionFacturacion) {

    this.fraccionFacturacion = fraccionFacturacion;
  }

  /**
   * @return costeFraccion
   */
  public BigDecimal getCosteFraccion() {

    return this.costeFraccion;
  }

  /**
   * @param costeFraccion new value of {@link #getcosteFraccion}.
   */
  public void setCosteFraccion(BigDecimal costeFraccion) {

    this.costeFraccion = costeFraccion;
  }

  /**
   * @return tiempoMaxSalida
   */
  public BigDecimal getTiempoMaxSalida() {

    return this.tiempoMaxSalida;
  }

  /**
   * @param tiempoMaxSalida new value of {@link #gettiempoMaxSalida}.
   */
  public void setTiempoMaxSalida(BigDecimal tiempoMaxSalida) {

    this.tiempoMaxSalida = tiempoMaxSalida;
  }

  /**
   * @return fechaModificacion
   */
  public BigDecimal getFechaModificacion() {

    return this.fechaModificacion;
  }

  /**
   * @param fechaModificacion new value of {@link #getfechaModificacion}.
   */
  public void setFechaModificacion(BigDecimal fechaModificacion) {

    this.fechaModificacion = fechaModificacion;
  }

  /**
   * @return startDate
   */
  public String getStartDate() {

    return this.startDate;
  }

  /**
   * @param startDate new value of {@link #getstartDate}.
   */
  public void setStartDate(String startDate) {

    this.startDate = startDate;
  }

  /**
   * @return endDate
   */
  public String getEndDate() {

    return this.endDate;
  }

  /**
   * @param endDate new value of {@link #getendDate}.
   */
  public void setEndDate(String endDate) {

    this.endDate = endDate;
  }

  /**
   * @return numberOfCentros
   */
  public Integer getNumberOfCentros() {

    return this.numberOfCentros;
  }

  /**
   * @param numberOfCentros new value of {@link #getnumberOfCentros}.
   */
  public void setNumberOfCentros(Integer numberOfCentros) {

    this.numberOfCentros = numberOfCentros;
  }

}
