package com.devonfw.application.tptf.general.logic.api.to;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * TODO pragat This type ...
 *
 * @since v1
 */
public class CustomMaestraCentroEto {

  private static final long serialVersionUID = 1L;

  private BigInteger centro;

  private String descripcion;

  private BigDecimal fechaDesdeVigencia;

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
   * @return descripcion
   */
  public String getDescripcion() {

    return this.descripcion;
  }

  /**
   * @param descripcion new value of {@link #getdescripcion}.
   */
  public void setDescripcion(String descripcion) {

    this.descripcion = descripcion;
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

}
