package com.devonfw.application.tptf.parametrotarifamanagement.service.api.rest;

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

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.Parametrotarifamanagement;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Parametrotarifamanagement}.
 */
@Path("/parametrotarifamanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ParametrotarifamanagementRestService {

  /**
   * Delegates to {@link Parametrotarifamanagement#findParametroTarifa}.
   *
   * @param id the ID of the {@link ParametroTarifaEto}
   * @return the {@link ParametroTarifaEto}
   */
  @GET
  @Path("/parametrotarifa/{id}/")
  public ParametroTarifaEto getParametroTarifa(@PathParam("id") long id);

  /**
   * Delegates to {@link Parametrotarifamanagement#saveParametroTarifa}.
   *
   * @param parametrotarifa the {@link ParametroTarifaEto} to be saved
   * @return the recently created {@link ParametroTarifaEto}
   */
  @POST
  @Path("/parametrotarifa/")
  public ParametroTarifaEto saveParametroTarifa(ParametroTarifaEto parametrotarifa);

  /**
   * Delegates to {@link Parametrotarifamanagement#deleteParametroTarifa}.
   *
   * @param id ID of the {@link ParametroTarifaEto} to be deleted
   */
  @DELETE
  @Path("/parametrotarifa/{id}/")
  public void deleteParametroTarifa(@PathParam("id") long id);

  /**
   * Delegates to {@link Parametrotarifamanagement#findParametroTarifaEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding parametrotarifas.
   * @return the {@link Page list} of matching {@link ParametroTarifaEto}s.
   */
  @Path("/parametrotarifa/search")
  @POST
  public Page<ParametroTarifaEto> findParametroTarifas(ParametroTarifaSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Parametrotarifamanagement#updateParametroTarifa}.
   *
   * @param parametrotarifa the {@link ParametroTarifaEto} to be updated
   * @return the recently created {@link ParametroTarifaEto}
   */
  @PUT
  @Path("/parametrotarifa/")
  public ParametroTarifaEto updateParametroTarifa(ParametroTarifaEto parametrotarifa);

  /**
   * Delegates to {@link Parametrotarifamanagement#findAll}.
   *
   * @return the recently created {@link ParametroTarifaEto}
   */
  @GET
  @Path("/parametrotarifas/")
  public List<CustomPapametroEto> findAll();

  /**
   * Delegates to {@link Parametrotarifamanagement#getParametroTarifa}.
   *
   * @param id the ID of the {@link ParametroTarifaEto}
   * @return the {@link ParametroTarifaEto}
   */
  @GET
  @Path("/parametrotarifa/advn-search/{tipodeTarifa}/{description}/{startDate}/{endDate}")
  public List<ParametroTarifaEto> getParametroTarifa(@PathParam("tipodeTarifa") String tipodeTarifa,
      @PathParam("description") String description, @PathParam("startDate") String startDate,
      @PathParam("endDate") String endDate);

  /**
   * Delegates to {@link Parametrotarifamanagement#findCustomPapametroEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding parametrotarifa.
   * @return the {@link Page list} of matching {@link ParametroTarifaEto}s.
   */
  @Path("/parametrotarifa/advance-search")
  @POST
  public List<CustomPapametroEto> findParametroTarifa(CustomPapametroEto searchCriteriaTo);

}