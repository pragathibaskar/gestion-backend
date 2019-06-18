package com.devonfw.application.tptf.general.logic.api.to;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * TODO pragat This type ...
 *
 * @since v1
 */
public class CustomParametroCentroEto {

  private static final long serialVersionUID = 1L;

  private BigInteger centro;

  private String description;

  private String tipodeTarifa;

  private String mastroDescripcion;

  private BigDecimal fechaDesdeVigencia;

  private BigDecimal fechaFin;

  private BigDecimal centroFechaDesde;

  /**
   * @return centro
   */
  public BigInteger getCentro() {

    return this.centro;
  }

  /**
   * @param centro new value of {@link #getcentro}.
   */
  public void setCentro(BigInteger centro) {

    this.centro = centro;
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
   * @return fechaFin
   */
  public BigDecimal getFechaFin() {

    return this.fechaFin;
  }

  /**
   * @param fechaFin new value of {@link #getfechaFin}.
   */
  public void setFechaFin(BigDecimal fechaFin) {

    this.fechaFin = fechaFin;
  }

  /**
   * @return centroFechaDesde
   */
  public BigDecimal getCentroFechaDesde() {

    return this.centroFechaDesde;
  }

  /**
   * @param centroFechaDesde new value of {@link #getcentroFechaDesde}.
   */
  public void setCentroFechaDesde(BigDecimal centroFechaDesde) {

    this.centroFechaDesde = centroFechaDesde;
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
   * @return mastroDescripcion
   */
  public String getMastroDescripcion() {

    return this.mastroDescripcion;
  }

  /**
   * @param mastroDescripcion new value of {@link #getmastroDescripcion}.
   */
  public void setMastroDescripcion(String mastroDescripcion) {

    this.mastroDescripcion = mastroDescripcion;
  }

}
