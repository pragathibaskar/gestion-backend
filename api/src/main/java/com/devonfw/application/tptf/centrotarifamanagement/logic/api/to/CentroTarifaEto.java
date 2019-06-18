package com.devonfw.application.tptf.centrotarifamanagement.logic.api.to;

import java.math.BigDecimal;

import com.devonfw.application.tptf.centrotarifamanagement.common.api.CentroTarifa;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of CentroTarifa
 */
public class CentroTarifaEto extends AbstractEto implements CentroTarifa {

  private static final long serialVersionUID = 1L;

  private BigDecimal fechaDesdeVigencia;

  private BigDecimal fechaModificacion;

  private Long tipotarifaId;

  private Long centrosId;

  @Override
  public BigDecimal getFechaDesdeVigencia() {

    return fechaDesdeVigencia;
  }

  @Override
  public void setFechaDesdeVigencia(BigDecimal fechaDesdeVigencia) {

    this.fechaDesdeVigencia = fechaDesdeVigencia;
  }

  @Override
  public BigDecimal getFechaModificacion() {

    return fechaModificacion;
  }

  @Override
  public void setFechaModificacion(BigDecimal fechaModificacion) {

    this.fechaModificacion = fechaModificacion;
  }

  @Override
  public Long getTipotarifaId() {

    return tipotarifaId;
  }

  @Override
  public void setTipotarifaId(Long tipotarifaId) {

    this.tipotarifaId = tipotarifaId;
  }

  @Override
  public Long getCentrosId() {

    return centrosId;
  }

  @Override
  public void setCentrosId(Long centrosId) {

    this.centrosId = centrosId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.fechaDesdeVigencia == null) ? 0 : this.fechaDesdeVigencia.hashCode());
    result = prime * result + ((this.fechaModificacion == null) ? 0 : this.fechaModificacion.hashCode());

    result = prime * result + ((this.tipotarifaId == null) ? 0 : this.tipotarifaId.hashCode());

    result = prime * result + ((this.centrosId == null) ? 0 : this.centrosId.hashCode());
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
    CentroTarifaEto other = (CentroTarifaEto) obj;
    if (this.fechaDesdeVigencia == null) {
      if (other.fechaDesdeVigencia != null) {
        return false;
      }
    } else if (!this.fechaDesdeVigencia.equals(other.fechaDesdeVigencia)) {
      return false;
    }
    if (this.fechaModificacion == null) {
      if (other.fechaModificacion != null) {
        return false;
      }
    } else if (!this.fechaModificacion.equals(other.fechaModificacion)) {
      return false;
    }

    if (this.tipotarifaId == null) {
      if (other.tipotarifaId != null) {
        return false;
      }
    } else if (!this.tipotarifaId.equals(other.tipotarifaId)) {
      return false;
    }

    if (this.centrosId == null) {
      if (other.centrosId != null) {
        return false;
      }
    } else if (!this.centrosId.equals(other.centrosId)) {
      return false;
    }
    return true;
  }
}
