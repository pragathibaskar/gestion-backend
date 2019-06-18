package com.devonfw.application.tptf.tipotarifamanagement.dataaccess.api;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api.CentroTarifaEntity;
import com.devonfw.application.tptf.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api.ParametroTarifaEntity;
import com.devonfw.application.tptf.tipotarifamanagement.common.api.TipoTarifa;

/**
 * TODO pragat This type ...
 *
 * @since v1
 */
@Entity
@Table(name = "MUTITAT")
public class TipoTarifaEntity extends ApplicationPersistenceEntity implements TipoTarifa {

  private static final long serialVersionUID = 1L;

  @Column(length = 1)
  String tipodeTarifa;

  @Column(length = 40)
  String description;

  boolean porDefecto;

  private List<CentroTarifaEntity> centrotarifa;

  private List<ParametroTarifaEntity> parametros;

  /**
   * @return parametros
   */
  @OneToMany(mappedBy = "tipotarifa", fetch = FetchType.EAGER)
  @Fetch(FetchMode.SUBSELECT)
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
   * @return parametros
   */
  @OneToMany(mappedBy = "tipodeTarifa", fetch = FetchType.EAGER)
  @Fetch(FetchMode.SUBSELECT)
  public List<ParametroTarifaEntity> getParametros() {

    return this.parametros;
  }

  /**
   * @param parametros new value of {@link #getparametros}.
   */
  public void setParametros(List<ParametroTarifaEntity> parametros) {

    this.parametros = parametros;
  }

  /**
   * @return porDefecto
   */
  public boolean isPorDefecto() {

    return this.porDefecto;
  }

  /**
   * @param porDefecto new value of {@link #getporDefecto}.
   */
  public void setPorDefecto(boolean porDefecto) {

    this.porDefecto = porDefecto;
  }

}
