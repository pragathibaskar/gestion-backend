package com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devonfw.application.tptf.centrotarifamanagement.dataaccess.api.CentroTarifaEntity;
import com.devonfw.application.tptf.centrotarifamanagement.logic.api.to.CentroTarifaSearchCriteriaTo;
import com.devonfw.application.tptf.general.logic.api.to.CustomParametroCentroEto;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link CentroTarifaEntity}
 */
public interface CentroTarifaRepository extends DefaultRepository<CentroTarifaEntity> {

  /**
   * @param criteria the {@link CentroTarifaSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link CentroTarifaEntity} objects that matched the search. If no pageable is set,
   *         it will return a unique page with all the objects that matched the search.
   */
  default Page<CentroTarifaEntity> findByCriteria(CentroTarifaSearchCriteriaTo criteria) {

    CentroTarifaEntity alias = newDslAlias();
    JPAQuery<CentroTarifaEntity> query = newDslQuery(alias);

    BigDecimal fechaDesdeVigencia = criteria.getFechaDesdeVigencia();
    if (fechaDesdeVigencia != null) {
      query.where($(alias.getFechaDesdeVigencia()).eq(fechaDesdeVigencia));
    }
    BigDecimal fechaModificacion = criteria.getFechaModificacion();
    if (fechaModificacion != null) {
      query.where($(alias.getFechaModificacion()).eq(fechaModificacion));
    }
    Long tipotarifa = criteria.getTipotarifaId();
    if (tipotarifa != null) {
      query.where($(alias.getTipotarifa().getId()).eq(tipotarifa));
    }
    Long centros = criteria.getCentrosId();
    if (centros != null) {
      query.where($(alias.getCentros().getId()).eq(centros));
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
  public default void addOrderBy(JPAQuery<CentroTarifaEntity> query, CentroTarifaEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "fechaDesdeVigencia":
            if (next.isAscending()) {
              query.orderBy($(alias.getFechaDesdeVigencia()).asc());
            } else {
              query.orderBy($(alias.getFechaDesdeVigencia()).desc());
            }
            break;
          case "fechaModificacion":
            if (next.isAscending()) {
              query.orderBy($(alias.getFechaModificacion()).asc());
            } else {
              query.orderBy($(alias.getFechaModificacion()).desc());
            }
            break;
          case "tipotarifa":
            if (next.isAscending()) {
              query.orderBy($(alias.getTipotarifa().getId()).asc());
            } else {
              query.orderBy($(alias.getTipotarifa().getId()).desc());
            }
            break;
          case "centros":
            if (next.isAscending()) {
              query.orderBy($(alias.getCentros().getId()).asc());
            } else {
              query.orderBy($(alias.getCentros().getId()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

  public CentroTarifaEntity findByFechaDesdeVigencia(BigDecimal fechaDesdeVigencia);

  @Query("SELECT c.id from CentroTarifaEntity c inner join c.centros m where m.centro=:centro AND c.fechaDesdeVigencia=:fechaDesdeVigencia")
  public Long getId(@Param("centro") BigInteger centro, @Param("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

  /**
   * @param customParametroCentroEto
   * @return
   */
  default List<CentroTarifaEntity> findCustomSearch(CustomParametroCentroEto customParametroCentroEto) {

    CentroTarifaEntity alias = newDslAlias();
    JPAQuery<CentroTarifaEntity> query = newDslQuery(alias);

    String tipodeTarifa = customParametroCentroEto.getTipodeTarifa();
    if (tipodeTarifa != null) {
      query.where($(alias.getTipotarifa().getTipodeTarifa()).eq(tipodeTarifa));
    }
    String descripcion = customParametroCentroEto.getDescription();
    if (descripcion != null) {
      query.where($(alias.getTipotarifa().getDescription()).eq(descripcion));
    }
    BigDecimal fechaDesdeVigencia = customParametroCentroEto.getFechaDesdeVigencia();
    if (fechaDesdeVigencia != null) {
      query.where($(alias.getFechaDesdeVigencia()).eq(fechaDesdeVigencia));
    }
    BigInteger centro = customParametroCentroEto.getCentro();
    if (centro != null) {
      query.where($(alias.getCentros().getCentro()).eq(centro));
    }
    String mastroDescripcion = customParametroCentroEto.getMastroDescripcion();
    if (mastroDescripcion != null) {
      query.where($(alias.getCentros().getDescripcion()).like(mastroDescripcion));
    }

    return query.fetch();
  }

  @Query("SELECT COALESCE(MIN(c.fechaDesdeVigencia),0) FROM CentroTarifaEntity c inner join c.centros m WHERE m.centro=:centro AND c.fechaDesdeVigencia>:fechaDesdeVigencia")
  public BigDecimal getFechafin(@Param("centro") BigInteger centro,
      @Param("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

}