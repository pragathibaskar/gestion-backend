package com.devonfw.application.tptf.maestracentrosmanagement.logic.api;

import java.math.BigInteger;

import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase.UcFindMaestraCentros;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.usecase.UcManageMaestraCentros;

/**
 * Interface for Maestracentrosmanagement component.
 */
public interface Maestracentrosmanagement extends UcFindMaestraCentros, UcManageMaestraCentros {

  Long findId(BigInteger centro);

}
