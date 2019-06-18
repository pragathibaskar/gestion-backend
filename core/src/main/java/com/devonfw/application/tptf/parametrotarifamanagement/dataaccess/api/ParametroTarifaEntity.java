package com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devonfw.application.tptf.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.tptf.parametrotarifamanagement.common.api.ParametroTarifa;
import com.devonfw.application.tptf.tipotarifamanagement.dataaccess.api.TipoTarifaEntity;

/**
 * @since v1
 */
@Entity
@Table(name = "MUPGPT")
public class ParametroTarifaEntity extends ApplicationPersistenceEntity implements ParametroTarifa {

  private TipoTarifaEntity tipodeTarifa;

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

  private static final long serialVersionUID = 1L;

  /**
   * @return tipodeTarifa
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "tipodeTarifa")
  public TipoTarifaEntity getTipodeTarifa() {

    return this.tipodeTarifa;
  }

  /**
   * @param tipodeTarifa new value of {@link #gettipodeTarifa}.
   */
  public void setTipodeTarifa(TipoTarifaEntity tipodeTarifa) {

    this.tipodeTarifa = tipodeTarifa;
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

  @Override
  @Transient
  public Long getTipodeTarifaId() {

    if (this.tipodeTarifa == null) {
      return null;
    }
    return this.tipodeTarifa.getId();
  }

  @Override
  public void setTipodeTarifaId(Long tipodeTarifaId) {

    if (tipodeTarifaId == null) {
      this.tipodeTarifa = null;
    } else {
      TipoTarifaEntity tipoTarifaEntity = new TipoTarifaEntity();
      tipoTarifaEntity.setId(tipodeTarifaId);
      this.tipodeTarifa = tipoTarifaEntity;
    }
  }

}
