package com.devonfw.application.tptf.centrotarifamanagement.service.api.rest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.Centrotarifamanagement;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Centrotarifamanagement}.
 */
@Path("/centrotarifamanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CentrotarifamanagementRestService {

  /**
   * Delegates to {@link Centrotarifamanagement#findCentroTarifa}.
   *
   * @param id the ID of the {@link CentroTarifaEto}
   * @return the {@link CentroTarifaEto}
   */
  @GET
  @Path("/centrotarifa/{id}/")
  public CentroTarifaEto getCentroTarifa(@PathParam("id") long id);

  @GET
  @Path("/centrotarifa/find/{fechaDesdeVigencia}/")
  public CentroTarifaEto getByKey(@PathParam("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

  @GET
  @Path("/centrotarifa/findAll/")
  public List<CentroTarifaEto> findAll();

  /**
   * Delegates to {@link Centrotarifamanagement#updateCentroTarifa}.
   *
   * @param centrotarifa the {@link CentroTarifaEto} to be saved
   * @return the recently created {@link CentroTarifaEto}
   */
  @PUT
  @Path("/centrotarifa/update")
  public CentroTarifaEto updateCentroTarifa(CentroTarifaEto centrotarifa);

  /**
   * Delegates to {@link Centrotarifamanagement#saveCentroTarifa}.
   *
   * @param centrotarifa the {@link CentroTarifaEto} to be saved
   * @return the recently created {@link CentroTarifaEto}
   */
  @POST
  @Path("/centrotarifa/")
  public CentroTarifaEto saveCentroTarifa(CentroTarifaEto centrotarifa);

  /**
   * Delegates to {@link Centrotarifamanagement#deleteCentroTarifa}.
   *
   * @param id ID of the {@link CentroTarifaEto} to be deleted
   */
  @DELETE
  @Path("/centrotarifa/{id}/")
  public void deleteCentroTarifa(@PathParam("id") long id);

  @DELETE
  @Path("/centrotarifa/delete/{centro}/{fechaDesdeVigencia}")
  public void deleteCentroAssignment(@PathParam("centro") BigInteger centro,
      @PathParam("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

  /**
   * Delegates to {@link Centrotarifamanagement#findCentroTarifaEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding centrotarifas.
   * @return the {@link Page list} of matching {@link CentroTarifaEto}s.
   */
  @Path("/centrotarifa/search")
  @POST
  public Page<CentroTarifaEto> findCentroTarifas(CentroTarifaSearchCriteriaTo searchCriteriaTo);

  @POST
  @Path("/centrotarifa/advance-search")
  public List<CustomParametroCentroEto> advancSearchCentrotarifa(CustomParametroCentroEto customParametroCentroEto);

}