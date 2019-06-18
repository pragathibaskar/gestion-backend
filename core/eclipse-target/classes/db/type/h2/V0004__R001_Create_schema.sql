--MUTITAT
CREATE TABLE MUTITAT (
  id BIGINT NOT NULL,
  modificationCounter INTEGER NOT NULL,
  tipodeTarifa          VARCHAR(1) not null ,
  description           VARCHAR(40),
  porDefecto            boolean not null default 0,
  CONSTRAINT PK_MUTITAT PRIMARY KEY (id)
);

--MUPGPT
CREATE TABLE MUPGPT (
  id BIGINT NOT NULL,
  modificationCounter INTEGER NOT NULL,
  tipodeTarifa          BIGINT(1) not null ,
  fechaDesdeVigencia  DECIMAL(8,0) not null,
  importeParkingMax   DECIMAL(5,2),
  importeMinSinCompra DECIMAL(5,2),
  tiempoMaxSinCompra  DECIMAL(2,0),
  importeMin1Hora     DECIMAL(4,2),
  importeMin2Hora     DECIMAL(4,2),
  fraccionFacturacion DECIMAL(2,0),
  costeFraccion       DECIMAL(4,2),
  tiempoMaxSalida     DECIMAL(2,0),
  fechaModificacion   DECIMAL(8,0),
  CONSTRAINT PK_MUPGPT PRIMARY KEY(fechaDesdeVigencia),
  CONSTRAINT FK_MUPGPT_TipodeTarifa FOREIGN KEY(tipodeTarifa) REFERENCES MUTITAT(id),
);

--CPTDAST
CREATE TABLE CPTDAST (
  id                  BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  centro              DECIMAL(4,0) NOT NULL,
  descripcion         VARCHAR(40),
  ensena              DECIMAL(3,0),
  negocio             DECIMAL(3,0),
  CONSTRAINT PK_CPTDAST PRIMARY KEY(id),
);

--MUCETAT
CREATE TABLE MUCETAT (
  id                  BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  centro              BIGINT NOT NULL,
  tipodeTarifa        BIGINT NOT NULL ,
  fechaDesdeVigencia  DECIMAL(8,0) NOT NULL,
  fechaModificacion   DECIMAL(8,0),
  CONSTRAINT PK_MUCETAT PRIMARY KEY(id),
  CONSTRAINT FK_MUCETAT_tipodeTarifa FOREIGN KEY(tipodeTarifa) REFERENCES MUTITAT(id),
  CONSTRAINT FK_MUCETAT_centro FOREIGN KEY(centro) REFERENCES CPTDAST(id)
);