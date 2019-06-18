package com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase;

import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosEto;

/**
 * Interface of UcManageMaestraCentros to centralize documentation and signatures of methods.
 */
public interface UcManageMaestraCentros {

  /**
   * Deletes a maestraCentros from the database by its id 'maestraCentrosId'.
   *
   * @param maestraCentrosId Id of the maestraCentros to delete
   * @return boolean <code>true</code> if the maestraCentros can be deleted, <code>false</code> otherwise
   */
  boolean deleteMaestraCentros(long maestraCentrosId);

  /**
   * Saves a maestraCentros and store it in the database.
   *
   * @param maestraCentros the {@link MaestraCentrosEto} to create.
   * @return the new {@link MaestraCentrosEto} that has been saved with ID and version.
   */
  MaestraCentrosEto saveMaestraCentros(MaestraCentrosEto maestraCentros);

}
