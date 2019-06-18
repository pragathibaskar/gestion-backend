package com.devonfw.application.tptf.tipotarifamanagement.dataaccess.api.repo;

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

import com.devonfw.application.tptf.tipotarifamanagement.dataaccess.api.TipoTarifaEntity;
import com.devonfw.application.tptf.tipotarifamanagement.logic.api.to.TipoTarifaSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link TipoTarifaEntity}
 */
public interface TipoTarifaRepository extends DefaultRepository<TipoTarifaEntity> {

  /**
   * @param criteria the {@link TipoTarifaSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link TipoTarifaEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<TipoTarifaEntity> findByCriteria(TipoTarifaSearchCriteriaTo criteria) {

    TipoTarifaEntity alias = newDslAlias();
    JPAQuery<TipoTarifaEntity> query = newDslQuery(alias);

    String TipodeTarifa = criteria.getTipodeTarifa();
    if (TipodeTarifa != null && !TipodeTarifa.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getTipodeTarifa()), TipodeTarifa, criteria.getTipodeTarifaOption());
    }
    String description = criteria.getDescription();
    if (description != null && !description.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getDescription()), description, criteria.getDescriptionOption());
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
  public default void addOrderBy(JPAQuery<TipoTarifaEntity> query, TipoTarifaEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "TipodeTarifa":
            if (next.isAscending()) {
              query.orderBy($(alias.getTipodeTarifa()).asc());
            } else {
              query.orderBy($(alias.getTipodeTarifa()).desc());
            }
            break;
          case "description":
            if (next.isAscending()) {
              query.orderBy($(alias.getDescription()).asc());
            } else {
              query.orderBy($(alias.getDescription()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

  /**
   * @param tipodeTarifa
   */
  public TipoTarifaEntity findByTipodeTarifa(String tipodeTarifa);

  /**
   * @param tipodeTarifa
   * @param description
   */
  public TipoTarifaEntity findByTipodeTarifaAndDescription(String tipodeTarifa, String description);

  @Query("SELECT COALESCE(MIN(c.fechaDesdeVigencia),0) FROM CentroTarifaEntity c inner join c.centros m WHERE m.centro=:centro AND c.fechaDesdeVigencia=:fechaDesdeVigencia")
  public BigDecimal getFechafin(@Param("centro") BigInteger centro,
      @Param("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

  /**
   * @param tipodeTarifa
   * @param description
   * @param fechaDesdeVigencia
   * @param centro
   * @param centroDescripcion
   * @return
   */
  @Query("SELECT t FROM TipoTarifaEntity t inner join t.centrotarifa c inner join c.centros m where t.tipodeTarifa=:tipodeTarifa and t.description=:description and c.fechaDesdeVigencia=:fechaDesdeVigencia and m.centro=:centro and m.descripcion=:centroDescripcion ")
  public List<TipoTarifaEntity> findCustomCriteria(@Param("tipodeTarifa") String tipodeTarifa,
      @Param("description") String description, @Param("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia,
      @Param("centro") BigInteger centro, @Param("centroDescripcion") String centroDescripcion);

  /**
   * @param tipodeTarifa
   * @param description
   * @param centro
   * @param descripcion
   * @return
   */
  @Query("SELECT t FROM TipoTarifaEntity t inner join t.centrotarifa c inner join c.centros m where t.tipodeTarifa=:tipodeTarifa and t.description=:description and m.centro=:centro and m.descripcion=:centroDescripcion ")
  public List<TipoTarifaEntity> findListCustomSearch(@Param("tipodeTarifa") String tipodeTarifa,
      @Param("description") String description, @Param("centro") BigInteger centro,
      @Param("centroDescripcion") String centroDescripcion);

  /**
   * @param tipodeTarifa
   * @param description
   * @param fechaDesdeVigencia
   * @return
   */
  @Query("SELECT t FROM TipoTarifaEntity t inner join t.centrotarifa c where t.tipodeTarifa=:tipodeTarifa and t.description=:description and c.fechaDesdeVigencia=:fechaDesdeVigencia ")
  public List<TipoTarifaEntity> findListCentroParam(@Param("tipodeTarifa") String tipodeTarifa,
      @Param("description") String description, @Param("fechaDesdeVigencia") BigDecimal fechaDesdeVigencia);

  @Query("SELECT t.id FROM TipoTarifaEntity t WHERE t.porDefecto=true")
  public Long makeDefault();

}
