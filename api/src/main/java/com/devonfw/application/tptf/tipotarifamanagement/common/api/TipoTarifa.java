package com.devonfw.application.tptf.tipotarifamanagement.common.api;

import com.devonfw.application.tptf.general.common.api.ApplicationEntity;

public interface TipoTarifa extends ApplicationEntity {

  /**
   * @return TipodeTarifaId
   */
  public String getTipodeTarifa();

  /**
   * @param TipodeTarifa setter for TipodeTarifa attribute
   */
  public void setTipodeTarifa(String TipodeTarifa);

  /**
   * @return descriptionId
   */
  public String getDescription();

  /**
   * @param description setter for description attribute
   */
  public void setDescription(String description);

  /**
   * @return porDefectoId
   */
  public boolean isPorDefecto();

  /**
   * @param porDefecto setter for porDefecto attribute
   */
  public void setPorDefecto(boolean porDefecto);

}
