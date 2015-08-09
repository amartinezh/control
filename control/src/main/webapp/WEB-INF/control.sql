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
  id_origen serial NOT NULL,
  descripcion character varying(128),
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
  estado character varying(1),
  CONSTRAINT antecedente_pk PRIMARY KEY (id_antecedente )
)WITH ( OIDS=FALSE); ALTER TABLE control.antecedente OWNER TO postgres;

CREATE TABLE control.contratista(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  tipo_persona_id integer,
  dependencia_id integer,
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
  estado character varying(1),
  CONSTRAINT contratista_pk PRIMARY KEY (documento ),
  CONSTRAINT fk6a68e0814ff7b56 FOREIGN KEY (tipo_persona_id) REFERENCES admin.tipo_persona (tipo_persona_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68e0614ff7b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk4b68e0914ff7b56 FOREIGN KEY (id_antecedente) REFERENCES control.antecedente (id_antecedente) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.contratista OWNER TO postgres;

CREATE TABLE admin.compania(
  compania_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT compania_pk PRIMARY KEY (compania_id)
)WITH ( OIDS=FALSE); ALTER TABLE admin.compania OWNER TO postgres;

CREATE TABLE nomina.tipo_trabajador(
  tipo_trabajador_id serial NOT NULL,
  descripcion character varying(128),
  genera_horas_trabajadas boolean,
  genera_sobretiempo boolean,
  genera_horas_ausencia boolean,
  calcula_horas_en_terminales_de_acceso boolean,
  
  estado character varying(1),
  CONSTRAINT tipo_trabajador_pk PRIMARY KEY (tipo_trabajador_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.tipo_trabajador OWNER TO postgres;

CREATE TABLE nomina.cargo(
  cargo_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT cargo_pk PRIMARY KEY (cargo_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.cargo OWNER TO postgres;

CREATE TABLE nomina.horario(
  horario_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT horario_pk PRIMARY KEY (horario_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.horario OWNER TO postgres;

CREATE TABLE nomina.rotacion(
  rotacion_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT rotacion_pk PRIMARY KEY (rotacion_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.rotacion OWNER TO postgres;

CREATE TABLE nomina.sucursal(
  sucursal_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT sucursal_pk PRIMARY KEY (sucursal_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.sucursal OWNER TO postgres;

CREATE TABLE nomina.puesto(
  puesto_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT puesto_pk PRIMARY KEY (puesto_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.puesto OWNER TO postgres;

CREATE TABLE nomina.grupo(
  grupo_id serial NOT NULL,
  descripcion character varying(128),
  estado character varying(1),
  CONSTRAINT grupo_pk PRIMARY KEY (grupo_id)
)WITH ( OIDS=FALSE); ALTER TABLE nomina.grupo OWNER TO postgres;

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
  telefono character varying(64),
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

CREATE TABLE control.visitante(
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  tipo_persona_id integer,
  dependencia_id integer,
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
  scan_foto bytea,
  scan_cedula bytea,
  scan_huella bytea,
  observaciones text,
  estado character varying(1),
  CONSTRAINT conductor_pk PRIMARY KEY (documento ),
  CONSTRAINT fk2a68h0814ff7b56 FOREIGN KEY (tipo_persona_id) REFERENCES admin.tipo_persona (tipo_persona_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6b68k0814ff7b46 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION
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
  id serial NOT NULL,
  documento character varying(64) NOT NULL,
  nombre_completo character varying(128),
  apellido character varying(128),
  novedad text,
  dependencia_id integer,
  hora_entrada time,
  hora_salida time,
  recibido_por character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT permisos_pk PRIMARY KEY (id ),
  CONSTRAINT fk6b68w0834ff7b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.permisos OWNER TO postgres;

CREATE TABLE control.control_bus(
  id serial NOT NULL,
  turno_id serial,
  id_origen serial,
  hora date,
  observaciones text,
  estado character varying(1),
  CONSTRAINT control_bus_pk PRIMARY KEY (id )
)WITH ( OIDS=FALSE); ALTER TABLE control.control_bus OWNER TO postgres;

CREATE TABLE control.control_taxi(
  id serial NOT NULL,
  nombre_trabajador character varying(64),
  dependencia_id integer,
  hora_sistema time,
  hora_entrada time,
  hora_salida time,
  nombre_conductor character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT control_taxi_pk PRIMARY KEY (id ),
  CONSTRAINT fk6b68w0214ff7b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.control_taxi OWNER TO postgres;

CREATE TABLE control.minuta(
  id serial NOT NULL,
  placa character varying(16),
  dependencia_id integer,
  hora_sistema date,
  hora_inicio date,
  hora_terminacion date,
  id_persona character varying(128),
  area_id integer,	
  actividad_id integer,
  observaciones text,
  estado character varying(1),
  CONSTRAINT minuta_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w0816ff3b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6d68w0817ff9b56 FOREIGN KEY (area_id) REFERENCES admin.area (area_id) ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6d68w0818ff9b56 FOREIGN KEY (actividad_id) REFERENCES admin.actividad (actividad_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.minuta OWNER TO postgres;

CREATE TABLE control.caja_menor(
  id serial NOT NULL,
  tipo_transaccion_id serial NOT NULL,
  fecha date,
  nombre_completo character varying(128),
  apellido character varying(128),
  dependencia_id integer,
  valor bigint,
  hora_registro time,
  observaciones text,
  estado character varying(1),
  CONSTRAINT caja_menor_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w0816fg3b56 FOREIGN KEY (dependencia_id) REFERENCES admin.dependencia (dependencia_id) ON UPDATE NO ACTION ON DELETE NO ACTION 
)WITH ( OIDS=FALSE); ALTER TABLE control.caja_menor OWNER TO postgres;

CREATE TABLE control.devolucion(
  id serial NOT NULL,
  fecha date,
  placa character varying(16),
  conductor character varying(128),
  motivo_devolucion_id integer,
  empresa_transporte character varying(128),
  ciudad character varying(128),
  cajas character varying(128),
  unidad character varying(128),
  pacas character varying(128),
  elemnto character varying(128),
  observaciones text,
  estado character varying(1),
  CONSTRAINT devolucion_pk PRIMARY KEY (id ),
  CONSTRAINT fk6e68w0116fg3b56 FOREIGN KEY (motivo_devolucion_id) REFERENCES admin.motivo_devolucion (motivo_devolucion_id) ON UPDATE NO ACTION ON DELETE NO ACTION
)WITH ( OIDS=FALSE); ALTER TABLE control.devolucion OWNER TO postgres;

CREATE TABLE control.exportacion(
  id serial NOT NULL,
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
  CONSTRAINT exportacion_pk PRIMARY KEY (id),
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
  
  
  
  