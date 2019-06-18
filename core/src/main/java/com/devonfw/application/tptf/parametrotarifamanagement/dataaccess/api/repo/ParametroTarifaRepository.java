package com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api.ParametroTarifaEntity;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link ParametroTarifaEntity}
 */
public interface ParametroTarifaRepository extends DefaultRepository<ParametroTarifaEntity> {

  /**
   * @param criteria the {@link ParametroTarifaSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link ParametroTarifaEntity} objects that matched the search. If no pageable is
   *         set, it will return a unique page with all the objects that matched the search.
   */
  default Page<ParametroTarifaEntity> findByCriteria(ParametroTarifaSearchCriteriaTo criteria) {

    ParametroTarifaEntity alias = newDslAlias();
    JPAQuery<ParametroTarifaEntity> query = newDslQuery(alias);

    Long tipodeTarifa = criteria.getTipodeTarifaId();
    if (tipodeTarifa != null) {
      query.where($(alias.getTipodeTarifa().getId()).eq(tipodeTarifa));
    }
    Integer modificationCounter = criteria.getModificationCounter();
    if (modificationCounter != null) {
      query.where($(alias.getModificationCounter()).eq(modificationCounter));
    }
    BigDecimal fechaDesdeVigencia = criteria.getFechaDesdeVigencia();
    if (fechaDesdeVigencia != null) {
      query.where($(alias.getFechaDesdeVigencia()).eq(fechaDesdeVigencia));
    }
    BigDecimal importeParkingMax = criteria.getImporteParkingMax();
    if (importeParkingMax != null) {
      query.where($(alias.getImporteParkingMax()).eq(importeParkingMax));
    }
    BigDecimal importeMinSinCompra = criteria.getImporteMinSinCompra();
    if (importeMinSinCompra != null) {
      query.where($(alias.getImporteMinSinCompra()).eq(importeMinSinCompra));
    }
    BigDecimal tiempoMaxSinCompra = criteria.getTiempoMaxSinCompra();
    if (tiempoMaxSinCompra != null) {
      query.where($(alias.getTiempoMaxSinCompra()).eq(tiempoMaxSinCompra));
    }
    BigDecimal importeMin1Hora = criteria.getImporteMin1Hora();
    if (importeMin1Hora != null) {
      query.where($(alias.getImporteMin1Hora()).eq(importeMin1Hora));
    }
    BigDecimal importeMin2Hora = criteria.getImporteMin2Hora();
    if (importeMin2Hora != null) {
      query.where($(alias.getImporteMin2Hora()).eq(importeMin2Hora));
    }
    BigDecimal fraccionFacturacion = criteria.getFraccionFacturacion();
    if (fraccionFacturacion != null) {
      query.where($(alias.getFraccionFacturacion()).eq(fraccionFacturacion));
    }
    BigDecimal costeFraccion = criteria.getCosteFraccion();
    if (costeFraccion != null) {
      query.where($(alias.getCosteFraccion()).eq(costeFraccion));
    }
    BigDecimal tiempoMaxSalida = criteria.getTiempoMaxSalida();
    if (tiempoMaxSalida != null) {
      query.where($(alias.getTiempoMaxSalida()).eq(tiempoMaxSalida));
    }
    BigDecimal fechaModificacion = criteria.getFechaModificacion();
    if (fechaModificacion != null) {
      query.where($(alias.getFechaModificacion()).eq(fechaModificacion));
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   *
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<ParametroTarifaEntity> query, ParametroTarifaEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "tipodeTarifa":
            if (next.isAscending()) {
              query.orderBy($(alias.getTipodeTarifa().getId()).asc());
            } else {
              query.orderBy($(alias.getTipodeTarifa().getId()).desc());
            }
            break;
          case "modificationCounter":
            if (next.isAscending()) {
              query.orderBy($(alias.getModificationCounter()).asc());
            } else {
              query.orderBy($(alias.getModificationCounter()).desc());
            }
            break;
          case "fechaDesdeVigencia":
            if (next.isAscending()) {
              query.orderBy($(alias.getFechaDesdeVigencia()).asc());
            } else {
              query.orderBy($(alias.getFechaDesdeVigencia()).desc());
            }
            break;
          case "importeParkingMax":
            if (next.isAscending()) {
              query.orderBy($(alias.getImporteParkingMax()).asc());
            } else {
              query.orderBy($(alias.getImporteParkingMax()).desc());
            }
            break;
          case "importeMinSinCompra":
            if (next.isAscending()) {
              query.orderBy($(alias.getImporteMinSinCompra()).asc());
            } else {
              query.orderBy($(alias.getImporteMinSinCompra()).desc());
            }
            break;
          case "tiempoMaxSinCompra":
            if (next.isAscending()) {
              query.orderBy($(alias.getTiempoMaxSinCompra()).asc());
            } else {
              query.orderBy($(alias.getTiempoMaxSinCompra()).desc());
            }
            break;
          case "importeMin1Hora":
            if (next.isAscending()) {
              query.orderBy($(alias.getImporteMin1Hora()).asc());
            } else {
              query.orderBy($(alias.getImporteMin1Hora()).desc());
            }
            break;
          case "importeMin2Hora":
            if (next.isAscending()) {
              query.orderBy($(alias.getImporteMin2Hora()).asc());
            } else {
              query.orderBy($(alias.getImporteMin2Hora()).desc());
            }
            break;
          case "fraccionFacturacion":
            if (next.isAscending()) {
              query.orderBy($(alias.getFraccionFacturacion()).asc());
            } else {
              query.orderBy($(alias.getFraccionFacturacion()).desc());
            }
            break;
          case "costeFraccion":
            if (next.isAscending()) {
              query.orderBy($(alias.getCosteFraccion()).asc());
            } else {
              query.orderBy($(alias.getCosteFraccion()).desc());
            }
            break;
          case "tiempoMaxSalida":
            if (next.isAscending()) {
              query.orderBy($(alias.getTiempoMaxSalida()).asc());
            } else {
              query.orderBy($(alias.getTiempoMaxSalida()).desc());
            }
            break;
          case "fechaModificacion":
            if (next.isAscending()) {
              query.orderBy($(alias.getFechaModificacion()).asc());
            } else {
              query.orderBy($(alias.getFechaModificacion()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

  @Query("select p from ParametroTarifaEntity p inner join p.tipodeTarifa t where t.tipodeTarifa=:tipodeTarifa and t.description=:description and p.fechaDesdeVigencia between :bDStartDate and :bDEndDate ")
  public List<ParametroTarifaEntity> getParametroTarifa(@Param("tipodeTarifa") String tipodeTarifa,
      @Param("description") String description, @Param("bDStartDate") BigDecimal bDStartDate,
      @Param("bDEndDate") BigDecimal bDEndDate);

  /**
   * @param searchCriteriaTo
   * @return
   */
  default List<ParametroTarifaEntity> findByCustomCriteria(CustomPapametroEto searchCriteriaTo) {

    ParametroTarifaEntity alias = newDslAlias();
    JPAQuery<ParametroTarifaEntity> query = newDslQuery(alias);

    String tipodeTarifa = searchCriteriaTo.getTipodeTarifa();
    if (tipodeTarifa != null) {
      query.where($(alias.getTipodeTarifa().getTipodeTarifa()).eq(tipodeTarifa));
    }
    String description = searchCriteriaTo.getDescription();
    if (description != null) {
      query.where($(alias.getTipodeTarifa().getDescription()).eq(description));
    }
    String startDate = searchCriteriaTo.getStartDate();
    String endDate = searchCriteriaTo.getEndDate();
    if (startDate != null && endDate != null) {
      query.where($(alias.getFechaDesdeVigencia()).between(new BigDecimal(searchCriteriaTo.getStartDate()),
          new BigDecimal(searchCriteriaTo.getEndDate())));
    }
    BigDecimal importeParkingMax = searchCriteriaTo.getImporteParkingMax();
    if (importeParkingMax != null) {
      query.where($(alias.getImporteParkingMax()).eq(importeParkingMax));
    }
    BigDecimal importeMinSinCompra = searchCriteriaTo.getImporteMinSinCompra();
    if (importeMinSinCompra != null) {
      query.where($(alias.getImporteMinSinCompra()).eq(importeMinSinCompra));
    }
    BigDecimal tiempoMaxSinCompra = searchCriteriaTo.getTiempoMaxSinCompra();
    if (tiempoMaxSinCompra != null) {
      query.where($(alias.getTiempoMaxSinCompra()).eq(tiempoMaxSinCompra));
    }
    BigDecimal importeMin1Hora = searchCriteriaTo.getImporteMin1Hora();
    if (importeMin1Hora != null) {
      query.where($(alias.getImporteMin1Hora()).eq(importeMin1Hora));
    }
    BigDecimal importeMin2Hora = searchCriteriaTo.getImporteMin2Hora();
    if (importeMin2Hora != null) {
      query.where($(alias.getImporteMin2Hora()).eq(importeMin2Hora));
    }
    BigDecimal fraccionFacturacion = searchCriteriaTo.getFraccionFacturacion();
    if (fraccionFacturacion != null) {
      query.where($(alias.getFraccionFacturacion()).eq(fraccionFacturacion));
    }
    BigDecimal costeFraccion = searchCriteriaTo.getCosteFraccion();
    if (costeFraccion != null) {
      query.where($(alias.getCosteFraccion()).eq(costeFraccion));
    }
    BigDecimal tiempoMaxSalida = searchCriteriaTo.getTiempoMaxSalida();
    if (tiempoMaxSalida != null) {
      query.where($(alias.getTiempoMaxSalida()).eq(tiempoMaxSalida));
    }

    return query.fetch();
  }

}