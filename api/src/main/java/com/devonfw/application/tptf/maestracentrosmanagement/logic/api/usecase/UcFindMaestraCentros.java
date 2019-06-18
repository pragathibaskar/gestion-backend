package com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosEto;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosSearchCriteriaTo;

public interface UcFindMaestraCentros {

  /**
   * Returns a MaestraCentros by its id 'id'.
   *
   * @param id The id 'id' of the MaestraCentros.
   * @return The {@link MaestraCentrosEto} with id 'id'
   */
  MaestraCentrosEto findMaestraCentros(long id);

  /**
   * Returns a paginated list of MaestraCentross matching the search criteria.
   *
   * @param criteria the {@link MaestraCentrosSearchCriteriaTo}.
   * @return the {@link List} of matching {@link MaestraCentrosEto}s.
   */
  Page<MaestraCentrosEto> findMaestraCentross(MaestraCentrosSearchCriteriaTo criteria);

  Long findId(BigInteger centro);

}
