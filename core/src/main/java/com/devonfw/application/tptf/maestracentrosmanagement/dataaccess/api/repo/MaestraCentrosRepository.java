package com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.math.BigInteger;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.tptf.maestracentrosmanagement.dataaccess.api.MaestraCentrosEntity;
import com.devonfw.application.tptf.maestracentrosmanagement.logic.api.to.MaestraCentrosSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link MaestraCentrosEntity}
 */
public interface MaestraCentrosRepository extends DefaultRepository<MaestraCentrosEntity> {

  /**
   * @param criteria the {@link MaestraCentrosSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link MaestraCentrosEntity} objects that matched the search. If no pageable is
   *         set, it will return a unique page with all the objects that matched the search.
   */
  default Page<MaestraCentrosEntity> findByCriteria(MaestraCentrosSearchCriteriaTo criteria) {

    MaestraCentrosEntity alias = newDslAlias();
    JPAQuery<MaestraCentrosEntity> query = newDslQuery(alias);

    BigInteger centro = criteria.getCentro();
    if (centro != null) {
      query.where($(alias.getCentro()).eq(centro));
    }
    String descripcion = criteria.getDescripcion();
    if (descripcion != null && !descripcion.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getDescripcion()), descripcion, criteria.getDescripcionOption());
    }
    BigInteger ensena = criteria.getEnsena();
    if (ensena != null) {
      query.where($(alias.getEnsena()).eq(ensena));
    }
    BigInteger negocio = criteria.getNegocio();
    if (negocio != null) {
      query.where($(alias.getNegocio()).eq(negocio));
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
  public default void addOrderBy(JPAQuery<MaestraCentrosEntity> query, MaestraCentrosEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "centro":
            if (next.isAscending()) {
              query.orderBy($(alias.getCentro()).asc());
            } else {
              query.orderBy($(alias.getCentro()).desc());
            }
            break;
          case "descripcion":
            if (next.isAscending()) {
              query.orderBy($(alias.getDescripcion()).asc());
            } else {
              query.orderBy($(alias.getDescripcion()).desc());
            }
            break;
          case "ensena":
            if (next.isAscending()) {
              query.orderBy($(alias.getEnsena()).asc());
            } else {
              query.orderBy($(alias.getEnsena()).desc());
            }
            break;
          case "negocio":
            if (next.isAscending()) {
              query.orderBy($(alias.getNegocio()).asc());
            } else {
              query.orderBy($(alias.getNegocio()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

  public MaestraCentrosEntity findByCentro(BigInteger centro);

}