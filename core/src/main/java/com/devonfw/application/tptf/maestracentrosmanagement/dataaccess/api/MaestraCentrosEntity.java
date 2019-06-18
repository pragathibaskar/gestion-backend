package com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api.CentroTarifaEntity;
import com.devonfw.application.tptf.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.tptf.maestracentrosmanagement.common.api.MaestraCentros;

/**
 * TODO pragat This type ...
 *
 * @since v1
 */
@Entity
@Table(name = "CPTDAST")
public class MaestraCentrosEntity extends ApplicationPersistenceEntity implements MaestraCentros {

  private BigInteger centro;

  private String descripcion;

  private BigInteger ensena;

  private BigInteger negocio;

  private List<CentroTarifaEntity> centrotarifa;

  private static final long serialVersionUID = 1L;

  /**
   * @return centrotarifa
   */
  @OneToMany(mappedBy = "centros", fetch = FetchType.EAGER)
  public List<CentroTarifaEntity> getCentrotarifa() {

    return this.centrotarifa;
  }

  /**
   * @param centrotarifa new value of {@link #getcentrotarifa}.
   */
  public void setCentrotarifa(List<CentroTarifaEntity> centrotarifa) {

    this.centrotarifa = centrotarifa;
  }

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
   * @return ensena
   */
  public BigInteger getEnsena() {

    return this.ensena;
  }

  /**
   * @param ensena new value of {@link #getensena}.
   */
  public void setEnsena(BigInteger ensena) {

    this.ensena = ensena;
  }

  /**
   * @return negocio
   */
  public BigInteger getNegocio() {

    return this.negocio;
  }

  /**
   * @param negocio new value of {@link #getnegocio}.
   */
  public void setNegocio(BigInteger negocio) {

    this.negocio = negocio;
  }

}
