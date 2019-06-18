package com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to;

import java.math.BigInteger;

import com.devonfw.application.tptf.maestracentrosmanagement.common.api.MaestraCentros;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of MaestraCentros
 */
public class MaestraCentrosEto extends AbstractEto implements MaestraCentros {

  private static final long serialVersionUID = 1L;

  private BigInteger centro;

  private String descripcion;

  private BigInteger ensena;

  private BigInteger negocio;

  @Override
  public BigInteger getCentro() {

    return centro;
  }

  @Override
  public void setCentro(BigInteger centro) {

    this.centro = centro;
  }

  @Override
  public String getDescripcion() {

    return descripcion;
  }

  @Override
  public void setDescripcion(String descripcion) {

    this.descripcion = descripcion;
  }

  @Override
  public BigInteger getEnsena() {

    return ensena;
  }

  @Override
  public void setEnsena(BigInteger ensena) {

    this.ensena = ensena;
  }

  @Override
  public BigInteger getNegocio() {

    return negocio;
  }

  @Override
  public void setNegocio(BigInteger negocio) {

    this.negocio = negocio;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.centro == null) ? 0 : this.centro.hashCode());
    result = prime * result + ((this.descripcion == null) ? 0 : this.descripcion.hashCode());
    result = prime * result + ((this.ensena == null) ? 0 : this.ensena.hashCode());
    result = prime * result + ((this.negocio == null) ? 0 : this.negocio.hashCode());

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
    MaestraCentrosEto other = (MaestraCentrosEto) obj;
    if (this.centro == null) {
      if (other.centro != null) {
        return false;
      }
    } else if (!this.centro.equals(other.centro)) {
      return false;
    }
    if (this.descripcion == null) {
      if (other.descripcion != null) {
        return false;
      }
    } else if (!this.descripcion.equals(other.descripcion)) {
      return false;
    }
    if (this.ensena == null) {
      if (other.ensena != null) {
        return false;
      }
    } else if (!this.ensena.equals(other.ensena)) {
      return false;
    }
    if (this.negocio == null) {
      if (other.negocio != null) {
        return false;
      }
    } else if (!this.negocio.equals(other.negocio)) {
      return false;
    }

    return true;
  }
}
