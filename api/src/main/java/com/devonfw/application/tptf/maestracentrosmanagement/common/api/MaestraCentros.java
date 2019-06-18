package com.devonfw.application.tptf.maestracentrosmanagement.common.api;

import java.math.BigInteger;

import com.devonfw.application.tptf.general.common.api.ApplicationEntity;

public interface MaestraCentros extends ApplicationEntity {

  /**
   * @return centroId
   */

  public BigInteger getCentro();

  /**
   * @param centro setter for centro attribute
   */

  public void setCentro(BigInteger centro);

  /**
   * @return descripcionId
   */

  public String getDescripcion();

  /**
   * @param descripcion setter for descripcion attribute
   */

  public void setDescripcion(String descripcion);

  /**
   * @return ensenaId
   */

  public BigInteger getEnsena();

  /**
   * @param ensena setter for ensena attribute
   */

  public void setEnsena(BigInteger ensena);

  /**
   * @return negocioId
   */

  public BigInteger getNegocio();

  /**
   * @param negocio setter for negocio attribute
   */

  public void setNegocio(BigInteger negocio);

}
