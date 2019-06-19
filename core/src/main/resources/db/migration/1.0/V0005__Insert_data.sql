--MUTITAT
INSERT INTO MUTITAT (id, modificationCounter, TipodeTarifa, description) VALUES (1, 1, 'A', 'sample');
INSERT INTO MUTITAT (id, modificationCounter, TipodeTarifa, description) VALUES (2, 1, 'B', 'sampleB');
INSERT INTO MUTITAT (id, modificationCounter, TipodeTarifa, description) VALUES (3, 1, 'C', 'sampleC');
INSERT INTO MUTITAT (id, modificationCounter, TipodeTarifa, description) VALUES (4, 1, 'D', 'sampleD');
INSERT INTO MUTITAT (id, modificationCounter, TipodeTarifa, description) VALUES (5, 1, 'E', 'sampleE');
INSERT INTO MUTITAT (id, modificationCounter, TipodeTarifa, description) VALUES (6, 1, 'F', 'sampleF');

--MUPGPT
INSERT INTO MUPGPT (id, modificationCounter, tipodeTarifa, fechaDesdeVigencia, importeParkingMax, importeMinSinCompra, tiempoMaxSinCompra, importeMin1Hora,
importeMin2Hora, fraccionFacturacion, costeFraccion, tiempoMaxSalida, fechaModificacion) VALUES (1, 1, 1, 20190412, 1, 1, 1, 1, 1, 1, 1, 1, 1);

INSERT INTO MUPGPT (id, modificationCounter, tipodeTarifa, fechaDesdeVigencia, importeParkingMax, importeMinSinCompra, tiempoMaxSinCompra, importeMin1Hora,
importeMin2Hora, fraccionFacturacion, costeFraccion, tiempoMaxSalida, fechaModificacion) VALUES (2, 1, 2, 20180415, 2, 2, 2, 2, 2, 2, 2, 2, 2);

INSERT INTO MUPGPT (id, modificationCounter, tipodeTarifa, fechaDesdeVigencia, importeParkingMax, importeMinSinCompra, tiempoMaxSinCompra, importeMin1Hora,
importeMin2Hora, fraccionFacturacion, costeFraccion, tiempoMaxSalida, fechaModificacion) VALUES (3, 1, 5, 20190608, 3, 3, 3, 3, 3, 3, 3, 3, 3);

INSERT INTO MUPGPT (id, modificationCounter, tipodeTarifa, fechaDesdeVigencia, importeParkingMax, importeMinSinCompra, tiempoMaxSinCompra, importeMin1Hora,
importeMin2Hora, fraccionFacturacion, costeFraccion, tiempoMaxSalida, fechaModificacion) VALUES (4, 1, 2, 20190609, 4, 4, 4, 4, 4, 4, 4, 4, 4);

INSERT INTO MUPGPT (id, modificationCounter, tipodeTarifa, fechaDesdeVigencia, importeParkingMax, importeMinSinCompra, tiempoMaxSinCompra, importeMin1Hora,
importeMin2Hora, fraccionFacturacion, costeFraccion, tiempoMaxSalida, fechaModificacion) VALUES (5, 1, 1, 20190412, 5, 5, 5, 5, 5, 5, 5, 5, 5);


--CPTDAST maestro
INSERT INTO CPTDAST (id, modificationCounter, centro, descripcion, ensena, negocio) VALUES (1, 1, 15, 'description',12, 13 );
INSERT INTO CPTDAST (id, modificationCounter, centro, descripcion, ensena, negocio) VALUES (2, 1, 17, 'spanish',12, 13 );
INSERT INTO CPTDAST (id, modificationCounter, centro, descripcion, ensena, negocio) VALUES (3, 1, 18, 'spanishcentre',12, 13 );
INSERT INTO CPTDAST (id, modificationCounter, centro, descripcion, ensena, negocio) VALUES (4, 1, 19, 'assignedcentre',12, 13 );

--MUCETAT
INSERT INTO MUCETAT (id, modificationCounter, centro, tipodeTarifa, fechaDesdeVigencia, fechaModificacion) VALUES (1, 1, 2, 1, 20190412, 20190512 );
INSERT INTO MUCETAT (id, modificationCounter, centro, tipodeTarifa, fechaDesdeVigencia, fechaModificacion) VALUES (2, 1, 1, 3, 20140415, 20140512 );
INSERT INTO MUCETAT (id, modificationCounter, centro, tipodeTarifa, fechaDesdeVigencia, fechaModificacion) VALUES (3, 1, 3, 2, 20180415, 20180512 );
INSERT INTO MUCETAT (id, modificationCounter, centro, tipodeTarifa, fechaDesdeVigencia, fechaModificacion) VALUES (4, 1, 2, 1, 20150415, 20150512 );
INSERT INTO MUCETAT (id, modificationCounter, centro, tipodeTarifa, fechaDesdeVigencia, fechaModificacion) VALUES (5, 1, 4, 2, 20150515, 20150612 );
INSERT INTO MUCETAT (id, modificationCounter, centro, tipodeTarifa, fechaDesdeVigencia, fechaModificacion) VALUES (6, 1, 4, 1, 20150417, 20150712 );
