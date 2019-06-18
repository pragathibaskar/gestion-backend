package com.devonfw.application.tptf.tipotarifamanagement.service.api.rest;

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

import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomMaestraCentroEto;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.Tipotarifamanagement;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaEto;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Tipotarifamanagement}.
 */
@Path("/tipotarifamanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TipotarifamanagementRestService {

  /**
   * Delegates to {@link Tipotarifamanagement#findTipoTarifa}.
   *
   * @param id the ID of the {@link TipoTarifaEto}
   * @return the {@link TipoTarifaEto}
   */
  @GET
  @Path("/tipotarifa/{id}/")
  public TipoTarifaEto getTipoTarifa(@PathParam("id") long id);

  /**
   * Delegates to {@link Tipotarifamanagement#findTipoTarifa}.
   *
   * @param tipodeTarifa the tipodeTarifa of the {@link TipoTarifaEto}
   * @return the {@link TipoTarifaEto}
   */
  @GET
  @Path("/tipotarifa/find/{tipodeTarifa}/")
  public TipoTarifaEto getByTipodeTarifa(@PathParam("tipodeTarifa") String tipodeTarifa);

  @GET
  @Path("/tipotarifa/findAll/")
  public List<TipoTarifaEto> findAll();

  /**
   * Delegates to {@link Tipotarifamanagement#saveTipoTarifa}.
   *
   * @param tipotarifa the {@link TipoTarifaEto} to be saved
   * @return the recently created {@link TipoTarifaEto}
   */
  @PUT
  @Path("/tipotarifa/update/{tipodeTarifa}/{description}")
  public TipoTarifaEto updateTipoTarifa(@PathParam("tipodeTarifa") String tipodeTarifa,
      @PathParam("description") String description);

  @GET
  @Path("/tipotarifa/update-boolean/{id}")
  public TipoTarifaEto updatePordefecto(@PathParam("id") long id);

  /**
   * Delegates to {@link Tipotarifamanagement#deleteTipoTarifa}.
   *
   * @param id ID of the {@link TipoTarifaEto} to be deleted
   */
  @POST
  @Path("/tipotarifa/")
  public TipoTarifaEto saveTipoTarifa(TipoTarifaEto tipotarifa);

  @POST
  @Path("/centrotarifas/")
  public List<CentroTarifaEto> listCentroTarifa(TipoTarifaEto tipotarifa);

  @POST
  @Path("/centrotarifas/custom")
  public List<CustomMaestraCentroEto> listCustomTarifa(TipoTarifaEto tipotarifa);

  @GET
  @Path("/centrotarifas/search/{tipodeTarifa}/{description}/{centro}/{descripcion}")
  public List<CustomMaestraCentroEto> listCustomSearch(@PathParam("tipodeTarifa") String tipodeTarifa,
      @PathParam("description") String description, @PathParam("centro") BigInteger centro,
      @PathParam("descripcion") String descripcion);

  @GET
  @Path("/centroparam/{tipodeTarifa}/{description}/{fechaDesdeVigencia}")
  public List<CustomParametroCentroEto> listCentroParam(@PathParam("tipodeTarifa") String tipodeTarifa,
      @PathParam("description") String description, @PathParam("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

  @GET
  @Path("/centroparam/search/{tipodeTarifa}/{description}/{fechaDesdeVigencia}/{centro}/{descripcion}")
  public List<CustomParametroCentroEto> searchCentroParam(@PathParam("tipodeTarifa") String tipodeTarifa,
      @PathParam("description") String description, @PathParam("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia,
      @PathParam("centro") BigInteger centro, @PathParam("descripcion") String descripcion);

  @DELETE
  @Path("/tipotarifa/{id}/")
  public void deleteTipoTarifa(@PathParam("id") long id);

  /**
   * Delegates to {@link Tipotarifamanagement#findTipoTarifaEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding tipotarifas.
   * @return the {@link Page list} of matching {@link TipoTarifaEto}s.
   */
  @Path("/tipotarifa/search")
  @POST
  public Page<TipoTarifaEto> findTipoTarifas(TipoTarifaSearchCriteriaTo searchCriteriaTo);

}
