package com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to;

import java.math.BigDecimal;

import com.devonfw.application.tptf.parametrotarifamanagement.common.api.ParametroTarifa;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of ParametroTarifa
 */
public class ParametroTarifaEto extends AbstractEto implements ParametroTarifa {

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

  private String startDate;

  private String endDate;

  @Override
  public Long getTipodeTarifaId() {

    return this.tipodeTarifaId;
  }

  @Override
  public void setTipodeTarifaId(Long tipodeTarifaId) {

    this.tipodeTarifaId = tipodeTarifaId;
  }

  @Override
  public BigDecimal getFechaDesdeVigencia() {

    return this.fechaDesdeVigencia;
  }

  @Override
  public void setFechaDesdeVigencia(BigDecimal fechaDesdeVigencia) {

    this.fechaDesdeVigencia = fechaDesdeVigencia;
  }

  @Override
  public BigDecimal getImporteParkingMax() {

    return this.importeParkingMax;
  }

  @Override
  public void setImporteParkingMax(BigDecimal importeParkingMax) {

    this.importeParkingMax = importeParkingMax;
  }

  @Override
  public BigDecimal getImporteMinSinCompra() {

    return this.importeMinSinCompra;
  }

  @Override
  public void setImporteMinSinCompra(BigDecimal importeMinSinCompra) {

    this.importeMinSinCompra = importeMinSinCompra;
  }

  @Override
  public BigDecimal getTiempoMaxSinCompra() {

    return this.tiempoMaxSinCompra;
  }

  @Override
  public void setTiempoMaxSinCompra(BigDecimal tiempoMaxSinCompra) {

    this.tiempoMaxSinCompra = tiempoMaxSinCompra;
  }

  @Override
  public BigDecimal getImporteMin1Hora() {

    return this.importeMin1Hora;
  }

  @Override
  public void setImporteMin1Hora(BigDecimal importeMin1Hora) {

    this.importeMin1Hora = importeMin1Hora;
  }

  @Override
  public BigDecimal getImporteMin2Hora() {

    return this.importeMin2Hora;
  }

  @Override
  public void setImporteMin2Hora(BigDecimal importeMin2Hora) {

    this.importeMin2Hora = importeMin2Hora;
  }

  @Override
  public BigDecimal getFraccionFacturacion() {

    return this.fraccionFacturacion;
  }

  @Override
  public void setFraccionFacturacion(BigDecimal fraccionFacturacion) {

    this.fraccionFacturacion = fraccionFacturacion;
  }

  @Override
  public BigDecimal getCosteFraccion() {

    return this.costeFraccion;
  }

  @Override
  public void setCosteFraccion(BigDecimal costeFraccion) {

    this.costeFraccion = costeFraccion;
  }

  @Override
  public BigDecimal getTiempoMaxSalida() {

    return this.tiempoMaxSalida;
  }

  @Override
  public void setTiempoMaxSalida(BigDecimal tiempoMaxSalida) {

    this.tiempoMaxSalida = tiempoMaxSalida;
  }

  @Override
  public BigDecimal getFechaModificacion() {

    return this.fechaModificacion;
  }

  @Override
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

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();

    result = prime * result + ((this.tipodeTarifaId == null) ? 0 : this.tipodeTarifaId.hashCode());
    result = prime * result + ((this.modificationCounter == null) ? 0 : this.modificationCounter.hashCode());
    result = prime * result + ((this.fechaDesdeVigencia == null) ? 0 : this.fechaDesdeVigencia.hashCode());
    result = prime * result + ((this.importeParkingMax == null) ? 0 : this.importeParkingMax.hashCode());
    result = prime * result + ((this.importeMinSinCompra == null) ? 0 : this.importeMinSinCompra.hashCode());
    result = prime * result + ((this.tiempoMaxSinCompra == null) ? 0 : this.tiempoMaxSinCompra.hashCode());
    result = prime * result + ((this.importeMin1Hora == null) ? 0 : this.importeMin1Hora.hashCode());
    result = prime * result + ((this.importeMin2Hora == null) ? 0 : this.importeMin2Hora.hashCode());
    result = prime * result + ((this.fraccionFacturacion == null) ? 0 : this.fraccionFacturacion.hashCode());
    result = prime * result + ((this.costeFraccion == null) ? 0 : this.costeFraccion.hashCode());
    result = prime * result + ((this.tiempoMaxSalida == null) ? 0 : this.tiempoMaxSalida.hashCode());
    result = prime * result + ((this.fechaModificacion == null) ? 0 : this.fechaModificacion.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    ParametroTarifaEto other = (ParametroTarifaEto) obj;

    if (this.tipodeTarifaId == null) {
      if (other.tipodeTarifaId != null) {
        return false;
      }
    } else if (!this.tipodeTarifaId.equals(other.tipodeTarifaId)) {
      return false;
    }
    if (this.modificationCounter == null) {
      if (other.modificationCounter != null) {
        return false;
      }
    } else if (!this.modificationCounter.equals(other.modificationCounter)) {
      return false;
    }
    if (this.fechaDesdeVigencia == null) {
      if (other.fechaDesdeVigencia != null) {
        return false;
      }
    } else if (!this.fechaDesdeVigencia.equals(other.fechaDesdeVigencia)) {
      return false;
    }
    if (this.importeParkingMax == null) {
      if (other.importeParkingMax != null) {
        return false;
      }
    } else if (!this.importeParkingMax.equals(other.importeParkingMax)) {
      return false;
    }
    if (this.importeMinSinCompra == null) {
      if (other.importeMinSinCompra != null) {
        return false;
      }
    } else if (!this.importeMinSinCompra.equals(other.importeMinSinCompra)) {
      return false;
    }
    if (this.tiempoMaxSinCompra == null) {
      if (other.tiempoMaxSinCompra != null) {
        return false;
      }
    } else if (!this.tiempoMaxSinCompra.equals(other.tiempoMaxSinCompra)) {
      return false;
    }
    if (this.importeMin1Hora == null) {
      if (other.importeMin1Hora != null) {
        return false;
      }
    } else if (!this.importeMin1Hora.equals(other.importeMin1Hora)) {
      return false;
    }
    if (this.importeMin2Hora == null) {
      if (other.importeMin2Hora != null) {
        return false;
      }
    } else if (!this.importeMin2Hora.equals(other.importeMin2Hora)) {
      return false;
    }
    if (this.fraccionFacturacion == null) {
      if (other.fraccionFacturacion != null) {
        return false;
      }
    } else if (!this.fraccionFacturacion.equals(other.fraccionFacturacion)) {
      return false;
    }
    if (this.costeFraccion == null) {
      if (other.costeFraccion != null) {
        return false;
      }
    } else if (!this.costeFraccion.equals(other.costeFraccion)) {
      return false;
    }
    if (this.tiempoMaxSalida == null) {
      if (other.tiempoMaxSalida != null) {
        return false;
      }
    } else if (!this.tiempoMaxSalida.equals(other.tiempoMaxSalida)) {
      return false;
    }
    if (this.fechaModificacion == null) {
      if (other.fechaModificacion != null) {
        return false;
      }
    } else if (!this.fechaModificacion.equals(other.fechaModificacion)) {
      return false;
    }
    return true;
  }
}
