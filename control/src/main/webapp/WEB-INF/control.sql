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

CREATE TABLE admin.center(
  center_id integer NOT NULL,
  center_desc character varying COLLATE pg_catalog."es_CO.utf8",
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT center_id_pk PRIMARY KEY (center_id )
)WITH (OIDS=FALSE); ALTER TABLE admin.center OWNER TO postgres;

CREATE TABLE admin.company(
  comp_id serial NOT NULL,
  comp_desc character varying(255) COLLATE pg_catalog."es_CO.utf8",
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT comp_id_pk PRIMARY KEY (comp_id )
)WITH (OIDS=FALSE);ALTER TABLE admin.company OWNER TO postgres;

CREATE TABLE admin.currency(
  currency_id integer NOT NULL,
  currency_desc character varying(255) COLLATE pg_catalog."es_CO.utf8",
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT currency_id_pk PRIMARY KEY (currency_id )
)WITH (OIDS=FALSE); ALTER TABLE admin.currency OWNER TO postgres;

CREATE TABLE admin.level(
  level_id serial NOT NULL,
  level_desc character varying(255) COLLATE pg_catalog."es_CO.utf8",
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT level_id_pk PRIMARY KEY (level_id )
)WITH (OIDS=FALSE); ALTER TABLE admin.level OWNER TO postgres;

CREATE TABLE admin.type_users(
  id serial NOT NULL,
  descripcion character varying(30),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT tip_id_pk PRIMARY KEY (id )
)WITH (OIDS=FALSE); ALTER TABLE admin.type_users OWNER TO postgres;

CREATE TABLE admin.users(
  id character varying(255) NOT NULL,
  pass character varying(255) NOT NULL,
  cent_center_id integer,
  comp_comp_id integer,
  curr_currency_id integer,
  level_level_id integer,
  type_id integer,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT users_pkey PRIMARY KEY (id ),
  CONSTRAINT fk6a68e0812ff7b56 FOREIGN KEY (type_id)
      REFERENCES admin.type_users (id) 
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6a68e08a6246e7e FOREIGN KEY (curr_currency_id)
      REFERENCES admin.currency (currency_id)
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6a68e08a6bf1244 FOREIGN KEY (level_level_id)
      REFERENCES admin.level (level_id) 
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6a68e08c6cd88f4 FOREIGN KEY (cent_center_id)
      REFERENCES admin.center (center_id) 
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6a68e08f7e10c87 FOREIGN KEY (comp_comp_id)
      REFERENCES admin.company (comp_id) 
      ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH (OIDS=FALSE); ALTER TABLE admin.users OWNER TO postgres;

CREATE TABLE admin.area(
  id_area serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT area_pk PRIMARY KEY (id_area )
)WITH ( OIDS=FALSE); ALTER TABLE admin.area OWNER TO postgres;

CREATE TABLE admin.actividad(
  id_actividad serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT actividad_pk PRIMARY KEY (id_actividad )
)WITH ( OIDS=FALSE); ALTER TABLE admin.actividad OWNER TO postgres;

CREATE TABLE admin.tipo_producto(
  id_tipo_producto serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT tipoproducto_pk PRIMARY KEY (id_tipo_producto )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_producto OWNER TO postgres;

CREATE TABLE admin.tipo_encomienda(
  id_tipo_encomienda serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT tipoencomienda_pk PRIMARY KEY (id_tipo_encomienda )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_encomienda OWNER TO postgres;

CREATE TABLE admin.tipo_persona(
  id_tipo_persona serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT tipopersona_pk PRIMARY KEY (id_tipo_persona )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_persona OWNER TO postgres;

CREATE TABLE admin.dependencia(
  id_dependencia serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT dependencia_pk PRIMARY KEY (id_dependencia )
)WITH ( OIDS=FALSE); ALTER TABLE admin.dependencia OWNER TO postgres;

CREATE TABLE admin.motivo_devolucion(
  id_motivo_devolucion serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT motivo_devolucion_pk PRIMARY KEY (id_motivo_devolucion )
)WITH ( OIDS=FALSE); ALTER TABLE admin.motivo_devolucion OWNER TO postgres;

CREATE TABLE admin.sitio(
  id_sitio serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT sitio_pk PRIMARY KEY (id_sitio )
)WITH ( OIDS=FALSE); ALTER TABLE admin.sitio OWNER TO postgres;

CREATE TABLE admin.tipo_transaccion(
  id_tipo_transaccion serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT tipotransaccion_pk PRIMARY KEY (id_tipo_transaccion )
)WITH ( OIDS=FALSE); ALTER TABLE admin.tipo_transaccion OWNER TO postgres;

CREATE TABLE admin.turno(
  id_turno serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT turno_pk PRIMARY KEY (id_turno )
)WITH ( OIDS=FALSE); ALTER TABLE admin.turno OWNER TO postgres;

CREATE TABLE admin.origen(
  id_origen serial NOT NULL,
  descripcion character varying(128),
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT origen_pk PRIMARY KEY (id_origen )
)WITH ( OIDS=FALSE); ALTER TABLE admin.origen OWNER TO postgres;

CREATE TABLE control.antecedente(
  id_antecedente serial,
  documento character varying(128),
  fecha date,
  scan_responsabilidad bytea,
  scan_produraduria bytea,
  scan_policia bytea,
  scan_fiscalia bytea,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT antecedente_pk PRIMARY KEY (id_antecedente )
)WITH ( OIDS=FALSE); ALTER TABLE control.antecedente OWNER TO postgres;

CREATE TABLE control.contratista(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  id_tipo_persona integer,
  id_dependencia integer,
  coreo_e character varying(128),
  telefono character varying(64),
  scan_foto bytea,
  scan_cedula bytea,
  scan_huella bytea,
  empresa character varying(128),
  nit_empresa character varying(128),
  fecha_ven_curso_ley character varying(128),
-- Pendiente de tabla
  id_persona_responsable character varying(128),
  id_antecedente integer,
  placa character varying(16),
  eps character varying(64),
  eps_vence date,
  alr character varying(64),
  alr_vence date,
  inventario text,
  scan_inventario bytea,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT contratista_pk PRIMARY KEY (documento ),
  CONSTRAINT fk6a68e0814ff7b56 FOREIGN KEY (id_tipo_persona) REFERENCES admin.tipo_persona (id_tipo_persona) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk4b68e0914ff7b56 FOREIGN KEY (id_antecedente) REFERENCES control.antecedente (id_antecedente) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.contratista OWNER TO postgres;

CREATE TABLE control.visitante(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  id_tipo_persona integer,
  id_dependencia integer,
  coreo_e character varying(128),
  telefono character varying(64),
  scan_foto bytea,
  scan_cedula bytea,
  scan_huella bytea,
  empresa character varying(128),
  nit_empresa character varying(128),
  placa character varying(16),
  eps character varying(64),
  eps_vence date,
  alr character varying(64),
  alr_vence date,
  inventario text,
  scan_inventario bytea,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT visitante_pk PRIMARY KEY (documento ),
  CONSTRAINT fk4a68r0814ff7b56 FOREIGN KEY (id_tipo_persona) REFERENCES admin.tipo_persona (id_tipo_persona) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68w0814ff7c56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.visitante OWNER TO postgres;

CREATE TABLE control.conductor(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  id_tipo_persona integer,
  id_dependencia integer,
  coreo_e character varying(128),
  telefono character varying(64),
  scan_foto bytea,
  scan_cedula bytea,
  scan_huella bytea,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT conductor_pk PRIMARY KEY (documento ),
  CONSTRAINT fk2a68h0814ff7b56 FOREIGN KEY (id_tipo_persona) REFERENCES admin.tipo_persona (id_tipo_persona) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68k0814ff7b46 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.conductor OWNER TO postgres;

CREATE TABLE control.presta_llave(
  id serial NOT NULL,
  fecha date,
  hora time,
  nombre_completo character varying(128),
  apellido character varying(128),
  cantidad_llave integer,
  id_dependencia integer,
  quien_entrega character varying(128),
  quien_recibe character varying(128),
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT presta_llave_pk PRIMARY KEY (id ),
  CONSTRAINT fk6b68w0814ff2b56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION
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
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT horario_pk PRIMARY KEY (id_horario )
)WITH ( OIDS=FALSE); ALTER TABLE control.horarios_habiles OWNER TO postgres;

CREATE TABLE control.permisos(
  id serial NOT NULL,
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  novedad text,
  id_dependencia integer,
  hora_entrada time,
  hora_salida time,
  recibido_por character varying(128),
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT permisos_pk PRIMARY KEY (id ),
  CONSTRAINT fk6b68w0834ff7b56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.permisos OWNER TO postgres;

CREATE TABLE control.control_bus(
  id serial NOT NULL,
  id_turno serial,
  id_origen serial,
  hora date,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT control_bus_pk PRIMARY KEY (id )
)WITH ( OIDS=FALSE); ALTER TABLE control.control_bus OWNER TO postgres;

CREATE TABLE control.control_taxi(
  id serial NOT NULL,
  nombre_trabajador character varying(64),
  id_dependencia integer,
  hora_sistema time,
  hora_entrada time,
  hora_salida time,
  nombre_conductor character varying(128),
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT control_taxi_pk PRIMARY KEY (id ),
  CONSTRAINT fk6b68w0214ff7b56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.control_taxi OWNER TO postgres;

CREATE TABLE control.minuta(
  id serial NOT NULL,
  placa character varying(16),
  id_dependencia integer,
  hora_sistema date,
  hora_inicio date,
  hora_terminacion date,
  id_persona_controlo character varying(128),
  id_area_controlo integer,	
  id_actividad_controlo integer,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT minuta_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w0816ff3b56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6d68w0817ff9b56 FOREIGN KEY (id_area_controlo) REFERENCES admin.area (id_area) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6d68w0818ff9b56 FOREIGN KEY (id_actividad_controlo) REFERENCES admin.actividad (id_actividad) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.minuta OWNER TO postgres;

CREATE TABLE control.caja_menor(
  id serial NOT NULL,
  id_tipo_transaccion serial NOT NULL,
  fecha date,
  nombre_completo character varying(128),
  apellido character varying(128),
  id_dependencia integer,
  valor bigint,
  hora_registro time,
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT caja_menor_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w0816fg3b56 FOREIGN KEY (id_dependencia) REFERENCES admin.dependencia (id_dependencia) ON UPDATE NO ACTION ON DELETE NO ACTION 
)WITH ( OIDS=FALSE); ALTER TABLE control.caja_menor OWNER TO postgres;

CREATE TABLE control.devolucion(
  id serial NOT NULL,
  fecha date,
  placa character varying(16),
  conductor character varying(128),
  id_motivo_devolucion integer,
  empresa_transporte character varying(128),
  ciudad character varying(128),
  cajas character varying(128),
  unidad character varying(128),
  pacas character varying(128),
  elemnto character varying(128),
  observaciones text,
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT devolucion_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w0116fg3b56 FOREIGN KEY (id_motivo_devolucion) REFERENCES admin.motivo_devolucion (id_motivo_devolucion) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.devolucion OWNER TO postgres;

CREATE TABLE control.exportacion(
  id serial NOT NULL,
  fecha date,
  id_tipo_producto integer,
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
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT exportacion_pk PRIMARY KEY (id),
  CONSTRAINT fk6e68w0116fg3r56 FOREIGN KEY (id_tipo_producto) REFERENCES admin.tipo_producto (id_tipo_producto)ON UPDATE NO ACTION ON DELETE NO ACTION 
)WITH (OIDS=FALSE); ALTER TABLE control.exportacion OWNER TO postgres;

CREATE TABLE control.correspondencia(
  id serial NOT NULL,
  fecha date,
  hora time,
  id_tipo_encomienda integer,
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
  id_usu character varying(1),
  estado character varying(1),
  CONSTRAINT correspondencia_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w6116fg3r56 FOREIGN KEY (id_tipo_encomienda) REFERENCES admin.tipo_encomienda (id_tipo_encomienda)ON UPDATE NO ACTION ON DELETE NO ACTION)WITH ( OIDS=FALSE); ALTER TABLE control.correspondencia OWNER TO postgres;
  
  INSERT INTO admin.center(center_id, center_desc, id_usu, estado) VALUES (1, 'Seguridad y Control', '1', '1');
  INSERT INTO admin.company(comp_desc, id_usu, estado) VALUES ('PANASA', '1', '1');
  INSERT INTO admin.currency(currency_id, currency_desc, id_usu, estado) VALUES (1, 'PESOS', '1', '1');
  INSERT INTO admin.type_users(descripcion, id_usu, estado) VALUES ('Administrador', '1', '1');
  INSERT INTO admin.level(level_desc, id_usu, estado) VALUES ('Nivel', '1', '1');
  INSERT INTO admin.users(id, pass, cent_center_id, comp_comp_id, curr_currency_id, level_level_id, type_id, id_usu, estado) VALUES ('adm', 'c4ca4238a0b923820dcc509a6f75849b', 1, 1, 1, 1, 1, '1', '1');
  
  
  
  