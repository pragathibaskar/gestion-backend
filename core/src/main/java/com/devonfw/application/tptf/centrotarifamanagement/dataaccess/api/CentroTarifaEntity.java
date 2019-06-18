package com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devonfw.application.tptf.centrotarifamanagement.common.api.CentroTarifa;
import com.devonfw.application.tptf.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api.MaestraCentrosEntity;
import com.devonfw.application.tptf.tipotarifamanagement.dataaccess.api.TipoTarifaEntity;

@Entity
@Table(name = "MUCETAT")
public class CentroTarifaEntity extends ApplicationPersistenceEntity implements CentroTarifa {

  private BigDecimal fechaDesdeVigencia;

  private BigDecimal fechaModificacion;

  private TipoTarifaEntity tipotarifa;

  private MaestraCentrosEntity centros;

  private static final long serialVersionUID = 1L;

  /**
   * @return centros
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "centro")
  public MaestraCentrosEntity getCentros() {

    return this.centros;
  }

  /**
   * @param centros new value of {@link #getcentros}.
   */
  public void setCentros(MaestraCentrosEntity centros) {

    this.centros = centros;
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
   * @return tipotarifa
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "tipodeTarifa")
  public TipoTarifaEntity getTipotarifa() {

    return this.tipotarifa;
  }

  /**
   * @param tipotarifa new value of {@link #gettipotarifa}.
   */
  public void setTipotarifa(TipoTarifaEntity tipotarifa) {

    this.tipotarifa = tipotarifa;
  }

  @Override
  @Transient
  public Long getTipotarifaId() {

    if (this.tipotarifa == null) {
      return null;
    }
    return this.tipotarifa.getId();
  }

  @Override
  public void setTipotarifaId(Long tipotarifaId) {

    if (tipotarifaId == null) {
      this.tipotarifa = null;
    } else {
      TipoTarifaEntity tipoTarifaEntity = new TipoTarifaEntity();
      tipoTarifaEntity.setId(tipotarifaId);
      this.tipotarifa = tipoTarifaEntity;
    }
  }

  @Override
  @Transient
  public Long getCentrosId() {

    if (this.centros == null) {
      return null;
    }
    return this.centros.getId();
  }

  @Override
  public void setCentrosId(Long centrosId) {

    if (centrosId == null) {
      this.centros = null;
    } else {
      MaestraCentrosEntity maestraCentrosEntity = new MaestraCentrosEntity();
      maestraCentrosEntity.setId(centrosId);
      this.centros = maestraCentrosEntity;
    }
  }

}
