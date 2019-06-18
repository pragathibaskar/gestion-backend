package com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to;

import java.math.BigInteger;

import com.devonfw.application.tptf.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.tptf.maestracentrosmanagement.common.api.MaestraCentros}s.
 */
public class MaestraCentrosSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private BigInteger centro;

  private String descripcion;

  private BigInteger ensena;

  private BigInteger negocio;

  private StringSearchConfigTo descripcionOption;

  /**
   * @return centroId
   */

  public BigInteger getCentro() {

    return centro;
  }

  /**
   * @param centro setter for centro attribute
   */

  public void setCentro(BigInteger centro) {

    this.centro = centro;
  }

  /**
   * @return descripcionId
   */

  public String getDescripcion() {

    return descripcion;
  }

  /**
   * @param descripcion setter for descripcion attribute
   */

  public void setDescripcion(String descripcion) {

    this.descripcion = descripcion;
  }

  /**
   * @return ensenaId
   */

  public BigInteger getEnsena() {

    return ensena;
  }

  /**
   * @param ensena setter for ensena attribute
   */

  public void setEnsena(BigInteger ensena) {

    this.ensena = ensena;
  }

  /**
   * @return negocioId
   */

  public BigInteger getNegocio() {

    return negocio;
  }

  /**
   * @param negocio setter for negocio attribute
   */

  public void setNegocio(BigInteger negocio) {

    this.negocio = negocio;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getDescripcion() descripcion}.
   */
  public StringSearchConfigTo getDescripcionOption() {

    return this.descripcionOption;
  }

  /**
   * @param descripcionOption new value of {@link #getDescripcionOption()}.
   */
  public void setDescripcionOption(StringSearchConfigTo descripcionOption) {

    this.descripcionOption = descripcionOption;
  }

}
