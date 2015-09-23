DROP DATABASE control;

CREATE DATABASE control
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'es_CO.UTF-8'
       LC_CTYPE = 'es_CO.UTF-8'
       CONNECTION LIMIT = -1;

\c control;

-- DROP SCHEMA admin;
-- DROP TABLE admin.center;
-- DROP SCHEMA control;
-- DROP TABLE admin.company;
-- DROP TABLE admin.currency;
-- DROP TABLE admin.level;
-- DROP TABLE admin.type_users;
-- DROP TABLE admin.users;
-- DROP TABLE control.tipo_persona;

CREATE SCHEMA admin
  AUTHORIZATION postgres;

CREATE SCHEMA control
  AUTHORIZATION postgres;

CREATE SCHEMA nomina
  AUTHORIZATION postgres;
  
CREATE TABLE admin.type_users(
  id serial NOT NULL,
  descripcion character varying(30),
  estado character varying(1),
  CONSTRAINT tip_id_pk PRIMARY KEY (id )
)WITH (OIDS=FALSE); ALTER TABLE admin.type_users OWNER TO postgres;

CREATE TABLE admin.users(
  id character varying(255) NOT NULL,
  pass character varying(255) NOT NULL,
  persona_id character varying(64) NOT NULL,
  type_id integer,
  estado character varying(1),
  CONSTRAINT users_pkey PRIMARY KEY (id ),
  CONSTRAINT fk6a68e0812ff7b56 FOREIGN KEY (type_id)
      REFERENCES admin.type_users (id) 
      ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH (OIDS=FALSE); ALTER TABLE admin.users OWNER TO postgres;

CREATE TABLE admin.area(
  area_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT area_pk PRIMARY KEY (area_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.area OWNER TO postgres;

CREATE TABLE admin.centro_costo(
  centro_costo_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT centro_costo_pk PRIMARY KEY (centro_costo_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.centro_costo OWNER TO postgres;

CREATE TABLE admin.moneda(
  moneda_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT moneda_pk PRIMARY KEY (moneda_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.moneda OWNER TO postgres;

CREATE TABLE admin.actividad(
  actividad_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT actividad_pk PRIMARY KEY (actividad_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.actividad OWNER TO postgres;

CREATE TABLE admin.tipo_producto(
  tipo_producto_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT tipoproducto_pk PRIMARY KEY (tipo_producto_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_producto OWNER TO postgres;

CREATE TABLE admin.tipo_encomienda(
  tipo_encomienda_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT tipoencomienda_pk PRIMARY KEY (tipo_encomienda_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_encomienda OWNER TO postgres;

CREATE TABLE admin.tipo_persona(
  tipo_persona_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT tipopersona_pk PRIMARY KEY (tipo_persona_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_persona OWNER TO postgres;

CREATE TABLE admin.dependencia(
  dependencia_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT dependencia_pk PRIMARY KEY (dependencia_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.dependencia OWNER TO postgres;

CREATE TABLE admin.motivo_devolucion(
  motivo_devolucion_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT motivo_devolucion_pk PRIMARY KEY (motivo_devolucion_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.motivo_devolucion OWNER TO postgres;

CREATE TABLE admin.sitio(
  sitio_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT sitio_pk PRIMARY KEY (sitio_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.sitio OWNER TO postgres;

CREATE TABLE admin.tipo_transaccion(
  tipo_transaccion_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT tipotransaccion_pk PRIMARY KEY (tipo_transaccion_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_transaccion OWNER TO postgres;

CREATE TABLE admin.turno(
  turno_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT turno_pk PRIMARY KEY (turno_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.turno OWNER TO postgres;

CREATE TABLE admin.origen(
  origen_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT origen_pk PRIMARY KEY (origen_id )
)WITH ( OIDS=FALSE); ALTER TABLE admin.origen OWNER TO postgres;

CREATE TABLE control.contratista
(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  tipo_persona_id integer,
  dependencia_id integer,
  coreo_e character varying(128),
  telefono character varying(64),
  scan_foto text,
  scan_cedula character varying,
  scan_huella character varying,
  empresa character varying(128),
  nit_empresa character varying(128),
  fecha_ven_curso_ley date,
  codigo_trabajador character varying(64),
  placa character varying(16),
  eps character varying(64),
  eps_vence date,
  alr character varying(64),
  alr_vence date,
  inventario text,
  scan_inventario character varying,
  observaciones text,
  estado character varying(1),
  CONSTRAINT contratista_pk PRIMARY KEY (documento),
  CONSTRAINT fk6a68e0814ff7b56 FOREIGN KEY (tipo_persona_id) REFERENCES admin.tipo_persona (tipo_persona_id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.contratista OWNER TO postgres;

CREATE TABLE control.antecedente
(
  antecedente_id serial NOT NULL,
  contratista_documento character varying(64),
  fecha date,
  scan_responsabilidad bytea,
  scan_produraduria bytea,
  scan_policia bytea,
  scan_fiscalia bytea,
  observaciones text,
  estado character varying(1),
  CONSTRAINT antecedente_pk PRIMARY KEY (antecedente_id),
  CONSTRAINT contratista_id_fk FOREIGN KEY (contratista_documento)
      REFERENCES control.contratista (documento) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (OIDS=FALSE);
ALTER TABLE control.antecedente
  OWNER TO postgres;

------ N O M I N A --------------------------------------------
CREATE TABLE admin.compania(
  compania_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT compania_pk PRIMARY KEY (compania_id)
)WITH ( OIDS=FALSE); ALTER TABLE admin.compania OWNER TO postgres;

-- Se debe verificar bien que configuración por parámetros se tendrán
CREATE TABLE nomina.configuracion(
  configuracion_id serial NOT NULL,
  descripcion character varying(128),
  tolerancia character varying(64),
  estado character varying(1),
  CONSTRAINT configuracion_pk PRIMARY KEY (configuracion_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.configuracion OWNER TO postgres;

CREATE TABLE nomina.festivos(
  festivos_id serial NOT NULL,
  descripcion character varying(128),
  fecha date,
  dia_feriado_movil boolean,
  estado character varying(1),
  CONSTRAINT festivos_pk PRIMARY KEY (festivos_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.festivos OWNER TO postgres;

CREATE TABLE nomina.calendarios_feriados(
  calendarios_feriados_id serial NOT NULL,
  festivos_id integer,
  estado character varying(1),
  CONSTRAINT calendarios_feriados_pk PRIMARY KEY (calendarios_feriados_id, festivos_id),
  CONSTRAINT fk6a63e0814ff7b56 FOREIGN KEY (festivos_id) REFERENCES nomina.festivos (festivos_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.calendarios_feriados OWNER TO postgres;

-- Pendiente el sobretiempo y las comidas que estan en pestañas aparte
CREATE TABLE nomina.tipo_trabajador(
  tipo_trabajador_id serial NOT NULL,
  descripcion character varying(128),
  genera_horas_trabajadas boolean,
  genera_sobretiempo boolean,
  genera_horas_ausencia boolean,
  calcula_horas_en_terminales_de_acceso boolean,
  horario_fexible boolean,
  descuenta_salidas_intermedios boolean,
  estado character varying(1),
  CONSTRAINT tipo_trabajador_pk PRIMARY KEY (tipo_trabajador_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.tipo_trabajador OWNER TO postgres;

CREATE TABLE nomina.cargo(
  cargo_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT cargo_pk PRIMARY KEY (cargo_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.cargo OWNER TO postgres;

-- Pendiente Variaciones, Parámetros, están en otras pantallas
CREATE TABLE nomina.horario(
  horario_id serial NOT NULL,
  descripcion character varying(128),
  comienzo_jornada integer,
  comienzo_comida integer,
  tiempo_comer integer,
  final_comida integer,
  final_jornada integer,
  descanso_lunes boolean,
  descanso_martes boolean,
  descanso_miercoles boolean,
  descanso_nueves boolean,
  descanso_viernes boolean,
  descanso_sabado boolean,
  descanso_domingo boolean,
  estado character varying(1),
  CONSTRAINT horario_pk PRIMARY KEY (horario_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.horario OWNER TO postgres;

CREATE TABLE nomina.tipo_rotacion(
  tipo_rotacion_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT tipo_rotacion_pk PRIMARY KEY (tipo_rotacion_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.tipo_rotacion OWNER TO postgres;

CREATE TABLE nomina.item_rotacion(
  rotacion_id integer,
  item_rotacion_id integer,
  horario_id integer,
  fecha_comienzo date,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT item_rotacion_pk PRIMARY KEY (item_rotacion_id, rotacion_id),
  CONSTRAINT fk6a68e0814fb7f51 FOREIGN KEY (horario_id) REFERENCES nomina.horario (horario_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.item_rotacion OWNER TO postgres;

-- Pendiente Horarios adicionales, calendario
CREATE TABLE nomina.rotacion(
  rotacion_id serial NOT NULL,
  descripcion character varying(128),
  tipo_rotacion_id integer,
  secuencia integer,
  dias_por_grupo integer,
  cantidad_horario integer,
  item_rotacion_id integer,
  estado character varying(1),
  CONSTRAINT rotacion_pk PRIMARY KEY (rotacion_id),
  CONSTRAINT fk6a68e0814fb7b56 FOREIGN KEY (tipo_rotacion_id) REFERENCES nomina.tipo_rotacion (tipo_rotacion_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.rotacion OWNER TO postgres;
ALTER TABLE nomina.item_rotacion ADD CONSTRAINT fk6a68e08dffb7f51 FOREIGN KEY (rotacion_id) REFERENCES nomina.rotacion (rotacion_id) ON UPDATE NO ACTION ON DELETE NO ACTION;

CREATE TABLE nomina.comedor(
  comedor_id serial NOT NULL,
  descripcion character varying(128),
  hora_inicio_lunch integer,
  hora_fin_lunch integer,
  costo_lunch integer,
  costo_comida integer,
  estado character varying(1),
  CONSTRAINT comedor_pk PRIMARY KEY (comedor_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.comedor OWNER TO postgres;

CREATE TABLE nomina.sucursal(
  sucursal_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT sucursal_pk PRIMARY KEY (sucursal_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.sucursal OWNER TO postgres;

-- Pendiente detalles técnicos de las terminales lectoras de huellas
CREATE TABLE nomina.terminal(
  terminal_id serial NOT NULL,
  descripcion character varying(128),
  ip character varying(25),
  estado character varying(1),
  CONSTRAINT terminal_pk PRIMARY KEY (terminal_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.terminal OWNER TO postgres;

CREATE TABLE nomina.puesto(
  puesto_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT puesto_pk PRIMARY KEY (puesto_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.puesto OWNER TO postgres;

CREATE TABLE nomina.grupo_supervision(
  grupo_supervision_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT grupo_supervision_pk PRIMARY KEY (grupo_supervision_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.grupo_supervision OWNER TO postgres;

-- Crear un árbol organizacional
CREATE TABLE nomina.gerente(
  gerente_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT gerente_pk PRIMARY KEY (gerente_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.gerente OWNER TO postgres;

CREATE TABLE nomina.grupo_gerente(
  gerente_id serial NOT NULL,
  grupo_supervision_id integer,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT grupo_gerente_pk PRIMARY KEY (gerente_id),
  CONSTRAINT fk6a68e0814fb7b53 FOREIGN KEY (gerente_id) REFERENCES nomina.gerente (gerente_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6a68e0814fb7b54 FOREIGN KEY (grupo_supervision_id) REFERENCES nomina.grupo_supervision (grupo_supervision_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.gerente OWNER TO postgres;

CREATE TABLE nomina.grupo(
  grupo_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT grupo_pk PRIMARY KEY (grupo_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.grupo OWNER TO postgres;

CREATE TABLE nomina.justificacion_sobretiempo(
  justificacion_sobretiempo_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT justificacion_sobretiempo_pk PRIMARY KEY (justificacion_sobretiempo_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.justificacion_sobretiempo OWNER TO postgres;

CREATE TABLE nomina.ausencias(
  ausencias_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT ausencias_pk PRIMARY KEY (ausencias_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.ausencias OWNER TO postgres;

CREATE TABLE nomina.estacionamiento(
  estacionamiento_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT estacionamiento_pk PRIMARY KEY (estacionamiento_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.estacionamiento OWNER TO postgres;

CREATE TABLE nomina.grupo_trabajador(
  grupo_id serial NOT NULL,
  codigo_trabajador character varying(64) NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT grupo_trabajador_pk PRIMARY KEY (grupo_id, codigo_trabajador)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.grupo_trabajador OWNER TO postgres;

CREATE TABLE nomina.trabajador(
  codigo_trabajador character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  compania_id integer,
  dependencia_id integer,
  tipo_trabajador_id integer,
  horario_id integer,
  rotacion_id integer,
  puesto_id integer,
  coreo_e character varying(128),
  telefono_casa character varying(64),
  telefono_interno character varying(64),
  scan_foto bytea,
  scan_cedula bytea,
  scan_huella bytea,
  codigo_carnet character varying(128),
  autorizador_terminal boolean,
  viajero boolean,
  paso_libre_terminales boolean,
  trabajador_inactivo boolean,
  ocasional boolean,
  acceso_estacionamiento boolean,
  primario boolean,
  secundario boolean,
  codigo_trabajador_grupo_gerente character varying(64) NOT NULL,
  codigo_trabajador_grupo_supervisor character varying(64) NOT NULL,
  cedula character varying(64) NOT NULL,
  visitable boolean,
  cargo_id integer,
  observaciones text,
  estado character varying(1),
  CONSTRAINT trabajador_pk PRIMARY KEY (codigo_trabajador),
  CONSTRAINT fk6a68e0814ff7b56 FOREIGN KEY (compania_id) REFERENCES admin.compania (compania_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b57 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b58 FOREIGN KEY (tipo_trabajador_id) REFERENCES nomina.tipo_trabajador (tipo_trabajador_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b59 FOREIGN KEY (horario_id) REFERENCES nomina.horario (horario_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b60 FOREIGN KEY (rotacion_id) REFERENCES nomina.rotacion (rotacion_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b61 FOREIGN KEY (puesto_id) REFERENCES nomina.puesto (puesto_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b62 FOREIGN KEY (cargo_id) REFERENCES nomina.cargo (cargo_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.trabajador OWNER TO postgres;
ALTER TABLE nomina.grupo_trabajador ADD CONSTRAINT fk6a68e0814fb7b56 FOREIGN KEY (codigo_trabajador) REFERENCES nomina.trabajador (codigo_trabajador) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE nomina.grupo_trabajador ADD CONSTRAINT fk6a68e0814fb7f53 FOREIGN KEY (grupo_id) REFERENCES nomina.grupo (grupo_id) ON UPDATE NO ACTION ON DELETE NO ACTION;

CREATE TABLE nomina.suplencias(
  suplencias_id serial NOT NULL,
  descripcion character varying(128),
  codigo_trabajador character varying(64) NOT NULL,
  desde date,
  hasta date,
  estado character varying(1),
  CONSTRAINT suplencias_pk PRIMARY KEY (suplencias_id),
  CONSTRAINT fk6b68e0614ff7b61 FOREIGN KEY (codigo_trabajador) REFERENCES nomina.trabajador (codigo_trabajador) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.suplencias OWNER TO postgres;

CREATE TABLE nomina.tipo_permiso(
  tipo_permiso_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT tipo_permiso_pk PRIMARY KEY (tipo_permiso_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.tipo_permiso OWNER TO postgres;

CREATE TABLE nomina.justificacion_ausencia(
  justificacion_ausencia_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT justificacion_ausencia_pk PRIMARY KEY (justificacion_ausencia_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.justificacion_ausencia OWNER TO postgres;

CREATE TABLE nomina.permiso_grupo(
  compania_id integer,
  dependencia_id integer,
  tipo_trabajador_id integer,
  horario_id integer,
  rotacion_id integer,
  grupo_id integer,
  tipo_permiso_id integer,
  fecha_desde date,
  fecha_hasta date,
  justificacion_ausencia_id integer,
  horario_id_para_permiso integer,
  observaciones text,
  estado character varying(1),
  CONSTRAINT permiso_grupo_pk PRIMARY KEY (compania_id, dependencia_id, tipo_trabajador_id, horario_id, rotacion_id, grupo_id, tipo_permiso_id),
  CONSTRAINT fk6a68e0814ff7b56 FOREIGN KEY (compania_id) REFERENCES admin.compania (compania_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b57 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b58 FOREIGN KEY (tipo_trabajador_id) REFERENCES nomina.tipo_trabajador (tipo_trabajador_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b59 FOREIGN KEY (horario_id) REFERENCES nomina.horario (horario_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b60 FOREIGN KEY (rotacion_id) REFERENCES nomina.rotacion (rotacion_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b61 FOREIGN KEY (tipo_permiso_id) REFERENCES nomina.tipo_permiso (tipo_permiso_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b62 FOREIGN KEY (justificacion_ausencia_id) REFERENCES nomina.justificacion_ausencia (justificacion_ausencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b63 FOREIGN KEY (horario_id_para_permiso) REFERENCES nomina.horario (horario_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE nomina.permiso_grupo OWNER TO postgres;

----- C O N T R O L ---------------------------------------
CREATE TABLE control.visitante(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  tipo_persona_id integer,
  dependencia_id integer,
  coreo_e character varying(128),
  telefono character varying(64),
  scan_foto character varying,
  scan_cedula character varying,
  scan_huella character varying,
  empresa character varying(128),
  nit_empresa character varying(128),
  placa character varying(16),
  eps character varying(64),
  eps_vence date,
  alr character varying(64),
  alr_vence date,
  inventario text,
  scan_inventario character varying,
  observaciones text,
  estado character varying(1),
  CONSTRAINT visitante_pk PRIMARY KEY (documento ),
  CONSTRAINT fk4a68r0814ff7b56 FOREIGN KEY (tipo_persona_id) REFERENCES admin.tipo_persona (tipo_persona_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68w0814ff7c56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.visitante OWNER TO postgres;

CREATE TABLE control.conductor(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  tipo_persona_id integer,
  dependencia_id integer,
  coreo_e character varying(128),
  telefono character varying(64),
  scan_foto character varying,
  scan_cedula character varying,
  scan_huella character varying,
  observaciones text,
  estado character varying(1),
  CONSTRAINT conductor_pk PRIMARY KEY (documento ),
  CONSTRAINT fk2a68h0814ff7b56 FOREIGN KEY (tipo_persona_id) REFERENCES admin.tipo_persona (tipo_persona_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68k0814ff7b46 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.conductor OWNER TO postgres;

CREATE TABLE control.registro_conductor(
  documento character varying(64) NOT NULL,
  empresa_de_transporte character varying,
  placa character varying,
  trailer character varying,
  eps character varying(64),
  eps_vence date,
  alr character varying(64),
  alr_vence date,
  patiero character varying(1),
  documento_patiero character varying,
  scan_orden_cargue character varying,
  scan_tarjeta_propiedad character varying,
  scan_alr character varying,
  observaciones text,
  estado character varying(1),
  CONSTRAINT registro_conductor_pk PRIMARY KEY (documento),
  CONSTRAINT fk2a68h0814ff7b51 FOREIGN KEY (documento) REFERENCES control.conductor (documento) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.conductor OWNER TO postgres;

CREATE TABLE control.presta_llave(
  id serial NOT NULL,
  fecha date,
  hora time,
  nombre_completo character varying(128),
  apellido character varying(128),
  cantidad_llave integer,
  dependencia_id integer,
  quien_entrega character varying(128),
  quien_recibe character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT presta_llave_pk PRIMARY KEY (id ),
  CONSTRAINT fk6b68w0814ff2b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.presta_llave OWNER TO postgres;

-- Falta organizar para dejar como está en tempus
CREATE TABLE control.horarios_habiles(
  id_horario serial NOT NULL,
  tipo_horario integer,
  dia_semana character varying(1),
  hora_inicio time,
  hora_sale time,
  fecha_entra date,
  fecha_sale date,
  observaciones text,
  estado character varying(1),
  CONSTRAINT horario_pk PRIMARY KEY (id_horario )
)WITH ( OIDS=FALSE); ALTER TABLE control.horarios_habiles OWNER TO postgres;

CREATE TABLE control.permisos(
  permiso_id serial NOT NULL,
  tipo_permiso_id integer NOT NULL,
  fecha date,
  codigo_trabajador character varying(64) NOT NULL,
  hora_entrada character varying,
  hora_salida character varying,
  recibido_por character varying(128),
  novedad text,
  estado character varying(1),
  CONSTRAINT permisos_pk PRIMARY KEY (permiso_id),
  CONSTRAINT fk6b68e0614ff7b61 FOREIGN KEY (tipo_permiso_id) REFERENCES nomina.tipo_permiso (tipo_permiso_id) ON UPDATE NO ACTION ON DELETE NO ACTION
  --CONSTRAINT fk6b68w0834ff7b56 FOREIGN KEY (codigo_trabajador) REFERENCES nomina.trabajador (codigo_trabajador) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.permisos OWNER TO postgres;

CREATE TABLE control.control_bus(
  control_bus_id serial NOT NULL,
  turno_id integer NOT NULL,
  origen_id integer NOT NULL,
  nro_pasajeros integer,
  hora character varying(20),
  observaciones text,
  estado character varying(1),
  CONSTRAINT control_bus_pk PRIMARY KEY (control_bus_id),
  CONSTRAINT fk6b68e0614ff7b61 FOREIGN KEY (turno_id)
      REFERENCES admin.turno (turno_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b71 FOREIGN KEY (origen_id)
      REFERENCES admin.origen (origen_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.control_bus OWNER TO postgres;

CREATE TABLE control.control_taxi(
  control_taxi_id serial NOT NULL,
  codigo_trabajador character varying(64),
  hora_sistema character varying(20),
  hora_entrada character varying(20),
  hora_salida character varying(20),
  nombre_conductor character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT control_taxi_pk PRIMARY KEY (control_taxi_id)
)WITH ( OIDS=FALSE); ALTER TABLE control.control_taxi OWNER TO postgres;

CREATE TABLE control.minuta(
  minuta_id serial NOT NULL,
  placa character varying(16),
  dependencia_id integer,
  area_id integer,	
  actividad_id integer,
  hora_sistema character varying(10),
  hora_inicio character varying(10),
  hora_terminacion character varying(10),
  codigo_trabajador character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT minuta_pk PRIMARY KEY (minuta_id),
  CONSTRAINT fk6e68w0816ff3b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6d68w0817ff9b56 FOREIGN KEY (area_id) REFERENCES admin.area (area_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6d68w0818ff9b56 FOREIGN KEY (actividad_id) REFERENCES admin.actividad (actividad_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.minuta OWNER TO postgres;

CREATE TABLE control.caja_menor
(
  id serial NOT NULL,
  tipo_transaccion_id integer,
  fecha date,
  nombre_completo character varying(128),
  apellido character varying(128),
  dependencia_id integer,
  valor bigint,
  hora_registro time without time zone,
  observaciones text,
  estado character varying(1),
  CONSTRAINT caja_menor_pk PRIMARY KEY (id),
  CONSTRAINT caja_menor_tipo_transaccion_id_fkey FOREIGN KEY (tipo_transaccion_id)
      REFERENCES admin.tipo_transaccion (tipo_transaccion_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6e68w0816fg3b56 FOREIGN KEY (dependencia_id)
      REFERENCES admin.dependencia (dependencia_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH (OIDS=FALSE); ALTER TABLE control.caja_menor OWNER TO postgres;

CREATE TABLE control.devolucion(
  devolucion_id serial NOT NULL,
  fecha character varying(20),
  placa character varying(16),
  conductor character varying(128),
  motivo_devolucion_id integer,
  empresa_transporte character varying(128),
  ciudad character varying(128),
  cajas character varying(128),
  unidad character varying(128),
  pacas character varying(128),
  elemento character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT devolucion_pk PRIMARY KEY (devolucion_id),
  CONSTRAINT fk6e68w0116fg3b56 FOREIGN KEY (motivo_devolucion_id) REFERENCES admin.motivo_devolucion (motivo_devolucion_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.devolucion OWNER TO postgres;

CREATE TABLE control.exportacion(
  exportacion_id serial NOT NULL,
  fecha date,
  tipo_producto_id integer,
  cliente character varying(128),
  pais_destino character varying(128),
  puerto_llegada character varying(128),
  placa_vehiculo character varying(128),
  numero_contenedor character varying(128),
  numero_trailer character varying(128),
  transportadora character varying(128),
  inicio_operacion date,
  inicio_inspeccion date,
  inicio_cargue date,
  fin_cargue date,
  fin_operacion date,
  peso_pt_kg integer,
  peso_boina integer,
  numero_pedido character varying(128),
  pacas character varying(128),
  numero_bobinas integer,
  numero_cajas integer,
  acta_antinarcotico character varying(128),
  numero_precinto character varying(128),
  sello_aleatorio character varying(128),
  vigilante_proteccion character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT exportacion_pk PRIMARY KEY (exportacion_id),
  CONSTRAINT fk6e68w0116fg3r56 FOREIGN KEY (tipo_producto_id) REFERENCES admin.tipo_producto (tipo_producto_id)ON UPDATE NO ACTION ON DELETE NO ACTION 
)WITH (OIDS=FALSE); ALTER TABLE control.exportacion OWNER TO postgres;

CREATE TABLE control.correspondencia(
  id serial NOT NULL,
  fecha date,
  hora time,
  tipo_encomienda_id integer,
  nombre_quien_recibe character varying(128),
  descripcion character varying(128),
  remitente character varying(128),
  remitente_center_id character varying(128),
  destinatario character varying(128),
  destinatario_center_id character varying(128),
  numero_guia character varying(128),
  empresa_transportadora character varying(128),
  corre_confirmacion character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT correspondencia_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w6116fg3r56 FOREIGN KEY (tipo_encomienda_id) REFERENCES admin.tipo_encomienda (tipo_encomienda_id)ON UPDATE NO ACTION ON DELETE NO ACTION)WITH ( OIDS=FALSE); ALTER TABLE control.correspondencia OWNER TO postgres;
  
  INSERT INTO admin.type_users(descripcion, estado) VALUES ('Administrador', '1');
  INSERT INTO admin.users(id, pass, persona_id, type_id, estado) VALUES ('adm', 'c4ca4238a0b923820dcc509a6f75849b', '1', 1, '1');
  
  INSERT INTO admin.compania(compania_id, descripcion, estado) VALUES ('1', 'PANASA', '1');
  INSERT INTO admin.dependencia(dependencia_id, descripcion, estado) VALUES ('1', 'Dependencia', '1');
  INSERT INTO nomina.tipo_trabajador(descripcion, genera_horas_trabajadas, genera_sobretiempo, genera_horas_ausencia, calcula_horas_en_terminales_de_acceso, horario_fexible, descuenta_salidas_intermedios, estado) VALUES ('Tipo Trabajador', true, true, true, true, true, true, '1');
  INSERT INTO nomina.horario(descripcion, comienzo_jornada, comienzo_comida, tiempo_comer, final_comida, final_jornada, descanso_lunes, descanso_martes, descanso_miercoles, descanso_nueves, descanso_viernes, descanso_sabado, descanso_domingo, estado) VALUES ('Horario', 1, 1, 1, 1, 1, true, true, true, true, true, true, true, '1');
  INSERT INTO nomina.tipo_rotacion( descripcion, estado)VALUES ('Tipo Rotacion', '1');
  INSERT INTO nomina.rotacion(descripcion, tipo_rotacion_id, secuencia, dias_por_grupo, cantidad_horario, item_rotacion_id, estado)VALUES ('Rotacion', 1, 1, 1, 1, 1, '1');
  INSERT INTO nomina.item_rotacion(rotacion_id, item_rotacion_id, horario_id, fecha_comienzo, descripcion, estado) VALUES (1, 1, 1, '01/01/2015', 'Horario Item', '1');
  INSERT INTO nomina.puesto(descripcion, estado) VALUES ('Puesto', '1');
  INSERT INTO nomina.cargo(descripcion, estado)VALUES ('Cargo', '1');
  INSERT INTO nomina.trabajador(codigo_trabajador, nombre_completo, apellido, compania_id, dependencia_id, tipo_trabajador_id, horario_id, rotacion_id, puesto_id, coreo_e, telefono_casa, telefono_interno, scan_foto, scan_cedula, scan_huella, codigo_carnet, autorizador_terminal, viajero, paso_libre_terminales, trabajador_inactivo, ocasional, acceso_estacionamiento, primario, secundario, codigo_trabajador_grupo_gerente, codigo_trabajador_grupo_supervisor, cedula, visitable, cargo_id, observaciones, estado)VALUES ('1', 'Trabajador', 'Apellido', 1, 1, 1, 1, 1, 1, 'correo@correo.com', '111', '111', '', '', '', '111', true, true, true, true, true, true, true, true, '1', '1', '101010', true, 1, 'Observa', '1');
  INSERT INTO nomina.tipo_permiso(descripcion, estado) VALUES ('Cita médica', '1');
  INSERT INTO nomina.tipo_permiso(descripcion, estado) VALUES ('Diligencia Bancaria', '1');
  INSERT INTO admin.tipo_persona(descripcion, estado) VALUES ('Contratista administracion', '1');
  INSERT INTO admin.tipo_persona(descripcion, estado) VALUES ('Contratista planta', '1');
  INSERT INTO admin.area(descripcion, estado) VALUES ('Area', '1');
  INSERT INTO admin.actividad(descripcion, estado) VALUES ('Actividad', '1');
  INSERT INTO admin.tipo_producto(descripcion, estado) VALUES ('Materia Prima', '1');
  INSERT INTO admin.tipo_producto(descripcion, estado) VALUES ('Producto Terminado', '1');

  
  
  