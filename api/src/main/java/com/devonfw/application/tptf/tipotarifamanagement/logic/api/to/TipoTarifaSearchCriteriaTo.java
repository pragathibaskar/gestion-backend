package com.devonfw.application.tptf.tipotarifamanagement.logic.api.to;

import com.devonfw.application.tptf.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.tptf.tipotarifamanagement.common.api.TipoTarifa}s.
 */
public class TipoTarifaSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String TipodeTarifa;

  private String description;

  private StringSearchConfigTo TipodeTarifaOption;

  private StringSearchConfigTo descriptionOption;

  private String tipodeTarifa;

  private Boolean porDefecto;

  private StringSearchConfigTo tipodeTarifaOption;

  /**
   * @return TipodeTarifaId
   */
  public String getTipodeTarifa() {

    return TipodeTarifa;
  }

  /**
   * @param TipodeTarifa setter for TipodeTarifa attribute
   */
  public void setTipodeTarifa(String TipodeTarifa) {

    this.TipodeTarifa = TipodeTarifa;
  }

  /**
   * @return descriptionId
   */
  public String getDescription() {

    return description;
  }

  /**
   * @param description setter for description attribute
   */
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getTipodeTarifa() TipodeTarifa}.
   */
  public StringSearchConfigTo getTipodeTarifaOption() {

    return this.TipodeTarifaOption;
  }

  /**
   * @param TipodeTarifaOption new value of {@link #getTipodeTarifaOption()}.
   */
  public void setTipodeTarifaOption(StringSearchConfigTo TipodeTarifaOption) {

    this.TipodeTarifaOption = TipodeTarifaOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getDescription() description}.
   */
  public StringSearchConfigTo getDescriptionOption() {

    return this.descriptionOption;
  }

  /**
   * @param descriptionOption new value of {@link #getDescriptionOption()}.
   */
  public void setDescriptionOption(StringSearchConfigTo descriptionOption) {

    this.descriptionOption = descriptionOption;
  }

  /**
   * @return porDefectoId
   */
  public Boolean getPorDefecto() {

    return porDefecto;
  }

  /**
   * @param porDefecto setter for porDefecto attribute
   */
  public void setPorDefecto(Boolean porDefecto) {

    this.porDefecto = porDefecto;
  }

}
