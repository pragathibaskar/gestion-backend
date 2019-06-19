package com.devonfw.application.tptf.parametrotarifamanagement.logic.impl.usecase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.tptf.general.logic.api.to.CustomPapametroEto;
import com.devonfw.application.tptf.parametrotarifamanagement.dataaccess.api.ParametroTarifaEntity;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.to.ParametroTarifaEto;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.api.usecase.UcManageParametroTarifa;
import com.devonfw.application.tptf.parametrotarifamanagement.logic.base.usecase.AbstractParametroTarifaUc;

/**
 * Use case implementation for modifying and deleting ParametroTarifas
 */
@Named
@Validated
@Transactional
public class UcManageParametroTarifaImpl extends AbstractParametroTarifaUc implements UcManageParametroTarifa {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageParametroTarifaImpl.class);

  @Override
  public boolean deleteParametroTarifa(long parametroTarifaId) {

    ParametroTarifaEntity parametroTarifa = getParametroTarifaRepository().find(parametroTarifaId);
    getParametroTarifaRepository().delete(parametroTarifa);
    LOG.debug("The parametroTarifa with id '{}' has been deleted.", parametroTarifaId);
    return true;
  }

  @Override
  public ParametroTarifaEto saveParametroTarifa(ParametroTarifaEto parametroTarifa) {

    Objects.requireNonNull(parametroTarifa, "parametroTarifa");

    ParametroTarifaEntity parametroTarifaEntity = getBeanMapper().map(parametroTarifa, ParametroTarifaEntity.class);

    // initialize, validate parametroTarifaEntity here if necessary
    ParametroTarifaEntity resultEntity = getParametroTarifaRepository().save(parametroTarifaEntity);
    LOG.debug("ParametroTarifa with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, ParametroTarifaEto.class);
  }

  @Override
  public ParametroTarifaEto updateParametroTarifa(ParametroTarifaEto parametrotarifa) {

    Objects.requireNonNull(parametrotarifa, "parametroTarifa");
    ParametroTarifaEntity resultEntity = getParametroTarifaRepository().find(parametrotarifa.getId());
    ParametroTarifaEntity parametroTarifaEntity = null;
    if (resultEntity != null) {
      parametroTarifaEntity = getBeanMapper().map(parametrotarifa, ParametroTarifaEntity.class);
      parametroTarifaEntity = getParametroTarifaRepository().save(parametroTarifaEntity);
      LOG.debug("ParametroTarifa with id '{}' has been updated.", parametroTarifaEntity.getId());
    }
    return getBeanMapper().map(parametroTarifaEntity, ParametroTarifaEto.class);
  }

  @Override
  public List<CustomPapametroEto> findAll() {

    List<CustomPapametroEto> customPapametroEtos = new ArrayList<>();
    List<ParametroTarifaEntity> resultList = getParametroTarifaRepository().findAll();
    LOG.debug("The parametroTarifa  '{}' has been fetched.", resultList);
    resultList.forEach(entityResult -> {
      CustomPapametroEto papametroEto = new CustomPapametroEto();
      transformFromEntity(customPapametroEtos, entityResult, papametroEto);
    });
    return customPapametroEtos;
  }

  @Override
  public List<ParametroTarifaEto> getParametroTarifa(String tipodeTarifa, String description, BigDecimal bDStartDate,
      BigDecimal bDEndDate) {

    List<ParametroTarifaEntity> resultList = getParametroTarifaRepository().getParametroTarifa(tipodeTarifa,
        description, bDStartDate, bDEndDate);
    LOG.debug("The parametroTarifa  '{}' has been fetched.", resultList);
    return getBeanMapper().mapList(resultList, ParametroTarifaEto.class);
  }

  @Override
  public List<CustomPapametroEto> findParametroTarifa(CustomPapametroEto searchCriteriaTo) {

    List<CustomPapametroEto> customPapametroEtos = new ArrayList<>();
    List<ParametroTarifaEntity> resultList = getParametroTarifaRepository().findByCustomCriteria(searchCriteriaTo);
    LOG.debug("The parametroTarifa  '{}' has been fetched.", resultList);
    resultList.forEach(entityResult -> {
      CustomPapametroEto papametroEto = new CustomPapametroEto();
      transformFromEntity(customPapametroEtos, entityResult, papametroEto);
    });
    return customPapametroEtos;
  }

  /**
   * @param customPapametroEtos
   * @param entityResult
   */
  private void transformFromEntity(List<CustomPapametroEto> customPapametroEtos, ParametroTarifaEntity entityResult,
      CustomPapametroEto papametroEto) {

    papametroEto.setId(entityResult.getId());
    papametroEto.setTipodeTarifa(entityResult.getTipodeTarifa().getTipodeTarifa());
    papametroEto.setDescription(entityResult.getTipodeTarifa().getDescription());
    papametroEto.setFechaDesdeVigencia(entityResult.getFechaDesdeVigencia());
    papametroEto.setImporteParkingMax(entityResult.getImporteParkingMax());
    papametroEto.setImporteMinSinCompra(entityResult.getImporteMinSinCompra());
    papametroEto.setTiempoMaxSinCompra(entityResult.getTiempoMaxSinCompra());
    papametroEto.setImporteMin1Hora(entityResult.getImporteMin1Hora());
    papametroEto.setImporteMin2Hora(entityResult.getImporteMin2Hora());
    papametroEto.setFraccionFacturacion(entityResult.getFraccionFacturacion());
    papametroEto.setCosteFraccion(entityResult.getCosteFraccion());
    papametroEto.setTiempoMaxSalida(entityResult.getTiempoMaxSalida());
    papametroEto.setFechaModificacion(entityResult.getFechaModificacion());
    papametroEto.setNumberOfCentros(entityResult.getTipodeTarifa().getCentrotarifa().size());
    entityResult.getTipodeTarifa().getCentrotarifa().forEach(centros -> {
      papametroEto.setCentro(centros.getCentros().getCentro());

    });
    customPapametroEtos.add(papametroEto);
  }
}
