<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en-us">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>Gestion y control</title>
<meta name="description" content="">
<meta name="author" content="">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- Basic Styles -->
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/bootstrap.min.css" /> ">
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/font-awesome.min.css" />">

<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/smartadmin-production-plugins.min.css" />">
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/smartadmin-production.min.css" />">
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/smartadmin-skins.min.css" />">

<!-- SmartAdmin RTL Support  -->
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/smartadmin-rtl.min.css" />">

<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/your_style.css"> -->

<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/demo.min.css" />">

<!-- FAVICONS -->
<link rel="shortcut icon"
	href="<c:url value="/resources/img/favicon/favicon.ico" /> type="image/x-icon">
<link rel="icon"
	href="<c:url value="/resources/img/favicon/favicon.ico" />"
	type="image/x-icon">

<!-- GOOGLE FONT -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
<link rel="apple-touch-icon"
	href="<c:url value="/resources/img/splash/sptouch-icon-iphone.png" />">
<link rel="apple-touch-icon" sizes="76x76"
	href="<c:url value="/resources/img/splash/touch-icon-ipad.png" />">
<link rel="apple-touch-icon" sizes="120x120"
	href="<c:url value="/resources/img/splash/touch-icon-iphone-retina.png" />">
<link rel="apple-touch-icon" sizes="152x152"
	href="<c:url value="/resources/img/splash/touch-icon-ipad-retina.png" />">

<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!-- Startup image for web apps -->
<link rel="apple-touch-startup-image"
	media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)"
	href="<c:url value="/resources/img/splash/ipad-landscape.png" />">
<link rel="apple-touch-startup-image"
	media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)"
	href="<c:url value="/resources/img/splash/ipad-portrait.png" />">
<link rel="apple-touch-startup-image"
	media="screen and (max-device-width: 320px)"
	href="<c:url value="/resources/img/splash/iphone.png" />">

</head>

<body class="">

	<!-- HEADER -->

	<!-- END HEADER -->

	<!-- Left panel : Navigation area -->
	<!-- Note: This width of the aside area can be adjusted through LESS variables -->
	<!-- END NAVIGATION -->

	<!-- MAIN PANEL -->
	<div>

		<!-- RIBBON -->

		<!-- END RIBBON -->

		<!-- MAIN CONTENT -->
		<div id="content">

			<!-- widget grid -->
			<section id="widget-grid" class="">
				<!-- row -->
				<div class="row">
					<div id="men"></div>
					<!-- NEW WIDGET START -->
					<article class="col-sm-12 col-xs-12 col-lg-6">

						<div class="jarviswidget" id="wid-id-0"
							data-widget-colorbutton="false" data-widget-editbutton="false"
							data-widget-deletebutton="false" data-widget-sortable="false"
							role="widget" style="">
							<!-- widget options:
									usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

									data-widget-colorbutton="false"
									data-widget-editbutton="false"
									data-widget-togglebutton="false"
									data-widget-deletebutton="false"
									data-widget-fullscreenbutton="false"
									data-widget-custombutton="false"
									data-widget-collapsed="true"
									data-widget-sortable="false"

									-->
							<header role="heading">
								<div class="jarviswidget-ctrls" role="menu">
									<a href="javascript:void(0);"
										class="button-icon jarviswidget-toggle-btn" rel="tooltip"
										title="" data-placement="bottom"
										data-original-title="Collapse"><i class="fa fa-minus "></i></a>
									<a href="javascript:void(0);"
										class="button-icon jarviswidget-fullscreen-btn" rel="tooltip"
										title="" data-placement="bottom"
										data-original-title="Fullscreen"><i class="fa fa-expand "></i></a>
								</div>
								<h2></h2>
								<span class="jarviswidget-loader"><i
									class="fa fa-refresh fa-spin"></i></span>
							</header>

							<!-- widget div-->

							<div role="content">
								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->
									<input class="form-control" type="text">
								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">
									<form:form id="frm" method="post" class="bv-form"
										ModelAttribute="conductor" commandName="conductor">
										<button type="submit" class="bv-hidden-submit"
											style="display: none; width: 0px; height: 0px;"></button>
										<fieldset>
											<div class="form-group">
												<div class="row">
													<legend>  Conductores </legend>
													<form:input type="hidden" path="fecha_registro" value="0" />
														<form:input type="hidden" path="estado" />
													<div class="col-xs-3">
														<label class="control-label">Documento</label> 
														<form:input path="documento" type="text"
															class="form-control" data-bv-field="Documento"
															required="required" /> 
													</div>
													<div class="col-xs-3">
														<label class="control-label">Nombre Completo</label>
														 <form:input path="nombre_completo" type="text"
															class="form-control" data-bv-field="Nombre Completo"
															required="required" />
													</div>
													<div class="col-xs-3">
														<label class="control-label">Apellidos</label>
														<form:input path="apellido" type="text"	class="form-control" data-bv-field="Apellido" required="required" />
													</div>
													<div class="col-xs-3">
														<div id="dialog-message_foto" title="Foto">
															<div id='botonera'>
																<input id='botonIniciar' class='btn' type='button'
																	value='Iniciar'></input> <input id='botonDetener'
																	type='button' value='Detener'></input> <input
																	id='botonFoto' type='button' value='Foto'></input>
															</div>
															<div class="contenedor" style="position: realitve; top:5px">
																<div class="titulo">Cámara</div>
																<video id="camara" autoplay controls style="height: 200px; width: 240px"></video>
															</div>
														</div>
														<div class="contenedor">
																<div class="titulo"><a href="#" id="modal_link_foto"> Tomar	Foto </a></div>
																<canvas id="scan_foto" style="height: 120px; width: 150px; border: 1px solid grey;"></canvas>
														</div>
													</div>
												</div>
											</div>
										</fieldset>
										 <fieldset>
											<div class="form-group">
												<div class="row">
													<div class="col-xs-3">
														<label class="control-label">Placa</label> 
															<input type="text" class="form-control" name="placa" id="placa"/>
													</div>
													<div class="col-xs-3">
														<label class="control-label">Empresa  de Transporte</label> <input
															type="text" class="form-control" name="empresa_de_transporte" id="empresa_de_transporte"/>
															
													</div>
													<div class="col-xs-3">
														<label class="control-label">Trailer</label> <input
															type="text" class="form-control" name="trailer" id="trailer"/>
													</div>
													<div class="col-xs-3">
														<label class="control-label">Número Precinto</label> <input
															type="text" class="form-control" name="precinto" id="precinto"/>
													</div>
												</div>
											</div>
										</fieldset>
										<fieldset>
											<div class="form-group">
												<div class="row">
													<div class="col-xs-3">
														<label class="control-label">EPS</label> <input
															type="text" class="form-control" name="eps" id="eps"/>
													</div>
													<div class="col-xs-3">
														<label class="control-label">Fecha Vencimiento EPS</label> <input
															type="date" class="form-control" name="eps_vence" id="eps_vence"/>
													</div>
													<div class="col-xs-3">
														<label class="control-label">ARL</label> <input
															type="text" class="form-control" name="arl" id="arl"/>
													</div>
													<div class="col-xs-3">
														<label class="control-label">Fecha Vencimiento ARL</label> <input
															type="date" class="form-control" name="arl_vence" id="arl_vence"/>
													</div>
												</div>
											</div>
										</fieldset>
										<fieldset>
											<div class="form-group">
												<div class="row">
													
													<div class="col-xs-3">
														<label class="control-label">Documento Patiero</label> 
															<input type="text" class="form-control" name="documento_patiero" id="documento_patiero"/>
													</div>
													<div class="col-xs-3">
														<label class="control-label">Correo  Electrónico</label>
														<form:input path="correo_e" type="text"	class="form-control" data-bv-field="Coreo Electrónico" required="required" />
													</div>
													<div class="col-xs-3">
														<label class="control-label">Teléfonos</label>
														<form:input path="telefono" type="text"	class="form-control" data-bv-field="Teléfono" required="required" />
													</div>
													<div class="col-xs-3">
														<label class="control-label input-file"><a href="#" id="modal_link_scan_huella"> Archivo Huella</a></label>
														<form:input path="scan_huella" type="file" accept="image/*"	class="form-control" data-bv-field="Huella" required="required" />
													
														<div id="dialog-message_huella" title="Imagen Huella">
															<canvas id="scan_huella2"  width="900" height="300" style="background-color:#ffffff;"></canvas>
														</div>
													</div>
												</div>
											</div>
										</fieldset>
										<fieldset>
											<div class="form-group">
												<div class="row">
													
													<div class="col-xs-3">
														<label class="control-label input-file"><a href="#" id="modal_link_scan_arl"> Archivo ARL</a></label>
														<form:input path="scan_arl" type="file" accept="image/*"	class="form-control" data-bv-field="Orden Cargue" required="required" />
													
														<div id="dialog-message_arl" title="arl">
															<canvas id="scan_arl2"  width="900" height="300" style="background-color:#ffffff;"></canvas>
														</div>
													</div>
													
													<div class="col-xs-3">
														<label class="control-label input-file"><a href="#" id="modal_link_scan_tarjeta_propiedad"> Archivo Tarjeta Propiedad</a></label>
														<form:input path="scan_tarjeta_propiedad" type="file" accept="image/*"	class="form-control" data-bv-field="Tarjeta Propiedad" required="required" />
													
														<div id="dialog-message_tarjeta_propiedad" title="Orden Cargue">
															<canvas id="scan_tarjeta_propiedad2"  width="900" height="300" style="background-color:#ffffff;"></canvas>
														</div>
													</div>
		
													<div class="col-xs-3">
														<label class="control-label input-file"><a href="#" id="modal_link_scan_orden_cargue"> Archivo Orden Cargue</a></label>
														<form:input path="scan_orden_cargue" type="file" accept="image/*"	class="form-control" data-bv-field="Orden Cargue" required="required" />
													
														<div id="dialog-message_orden_cargue" title="Orden Cargue">
															<canvas id="scan_orden_cargue2"  width="900" height="300" style="background-color:#ffffff;"></canvas>
														</div>
													</div>
													<div class="col-xs-3">
														<label class="control-label input-file"><a href="#" id="modal_link_scan_cedula"> Archivo Cédula</a></label>
														<form:input path="scan_cedula" type="file" accept="image/*"	class="form-control" data-bv-field="Cédula" required="required" />
													
														<div id="dialog-message_cedula" title="Orden Cargue">
															<canvas id="scan_cedula2"  width="900" height="300" style="background-color:#ffffff;"></canvas>
														</div>
													</div>
												</div>
											</div>
										</fieldset>
										<fieldset>
											<div class="form-group">
												<div class="row">
													<div class="col-xs-10">
														<label class="control-label">Observaciones</label> 
														<form:textarea path="observaciones" type="text" class="form-control" data-bv-field="Placa" required="required" />
													</div>
												</div>
											</div>
										</fieldset>
										<div class="form-actions">
											<div class="row">
												<div class="col-xs-12">
													<button id="cance" class="btn btn-danger" type="button"
														onclick="cancelar()">Cancelar</button>
													<button id="elboton" class="btn btn-success" type="button"
														onclick="actualizar()">Nuevo</button>
													<button id="reset" class="btn btn-success" type="Reset">Limpiar</button>
												</div>
											</div>
										</div>

									</form:form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>

					</article>
					<!-- WIDGET END -->

				</div>

				<!-- end row -->

			</section>
			<!-- end widget grid -->

			<div
				class="jarviswidget jarviswidget-color-blueDark jarviswidget-sortable"
				id="wid-id-1" data-widget-editbutton="false"
				data-widget-editbutton="true" role="widget">
				<!-- widget options:
								usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
				
								data-widget-colorbutton="false"
								data-widget-editbutton="false"
								data-widget-togglebutton="false"
								data-widget-deletebutton="false"
								data-widget-fullscreenbutton="false"
								data-widget-custombutton="false"
								data-widget-collapsed="true"
								data-widget-sortable="false"
				
								-->
				<header role="heading">

					<span class="widget-icon"> <i class="fa fa-table"></i>
					</span>
					<h2>Visitantes</h2>

					<span class="jarviswidget-loader"><i
						class="fa fa-refresh fa-spin"></i></span>
				</header>

				<!-- widget div-->
				<div role="content">

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This Permiso used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div class="widget-body no-padding">

						<div id="datatable_fixed_column_wrapper"
							class="dataTables_wrapper form-inline no-footer">

							<table id="datatable_fixed_column" name="datatable_fixed_column"
								class="table table-striped table-bordered dataTable no-footer"
								width="100%" role="grid"
								aria-describedby="datatable_fixed_column_info"
								style="width: 100%;">
								<thead>
									<tr role="row">
										<th data-hide="cmd" class="sorting_asc" tabindex="0"
											aria-controls="dt_basic" aria-sort="ascending"
											aria-label="ID: activate to sort column ascending"
											style="width: 15px;"></th>

										<th data-class="expand" class="sorting_asc" tabindex="1"
											aria-controls="dt_basic" colspan="1" aria-sort="ascending"
											aria-label="Name: activate to sort column ascending"
											style="width: 540px;">Descripción</th>
									</tr>
								</thead>
								<tbody> 
									<c:forEach items="${conductorList}" var="obj"
										varStatus="loopCounter">
										<tr role="row" class="odd"> 
											<td class="sorting_1"><span class="responsiveExpander"></span>
												<a class="btn btn-success btn-circle btn-sx"
												onclick="con('<c:out value="${obj.documento}"></c:out>','<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${obj.fecha_registro}" pattern="yyyy-MM-dd"/>','<c:out value="${obj.nombre_completo}"></c:out>','<c:out value="${obj.apellido}"></c:out>','<c:out value="${obj.correo_e}"></c:out>','<c:out value="${obj.telefono}"></c:out>','<c:out value="${obj.scan_foto}"></c:out>','<c:out value="${obj.scan_cedula}"></c:out>','<c:out value="${obj.scan_huella}"></c:out>','<c:out value="${obj.empresa_de_transporte}"></c:out>','<c:out value="${obj.placa}"></c:out>','<c:out value="${obj.trailer}"></c:out>','<c:out value="${obj.eps}"></c:out>','<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${obj.eps_vence}" pattern="yyyy-MM-dd"/>','<c:out value="${obj.arl}"></c:out>','<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${obj.arl_vence}" pattern="yyyy-MM-dd"/>','<c:out value="${obj.precinto}"></c:out>','<c:out value="${obj.documento_patiero}"></c:out>','<c:out value="${obj.scan_orden_cargue}"></c:out>','<c:out value="${obj.scan_tarjeta_propiedad}"></c:out>','<c:out value="${obj.scan_arl}"></c:out>','<c:out value="${obj.observaciones}"></c:out>','<c:out value="${obj.estado}"></c:out>',$(this))">
												<i class="fa fa-edit"></i></a> <a class="btn btn-danger btn-circle"
												onclick="borrar(<c:out value="${obj.documento}"></c:out>, $(this))">
												<i class="fa fa-trash-o"></i></a></td>
											<td class="sorting_1"><span class="responsiveExpander"></span>
												<c:out value="${obj.nombre_completo}"></c:out></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<!-- end widget content -->
				</div>
				<!-- end widget div -->
			</div>
	</div>
	<!-- END MAIN CONTENT -->


	<!-- END MAIN PANEL -->

	<!-- PAGE FOOTER -->

	<!-- END PAGE FOOTER -->

	<!-- SHORTCUT AREA : With large tiles (activated via clicking user name tag)
		Note: These tiles are completely responsive,
		you can add as many as you like
		-->

	<!-- END SHORTCUT AREA -->
	<!--================================================== -->
	<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
	<script data-pace-options='{ "restartOnRequestAfter": true }'
		src="<c:url value="/resources/js/plugin/pace/pace.min.js" />"></script>

	<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js">
		
	</script>
	<script>
		if (!window.jQuery) {
			document
					.write('<script src="<c:url value="/resources/js/libs/jquery-2.1.1.min.js" />"><\/script>');
		}
	</script>

	<script
		src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
	<script>
		if (!window.jQuery.ui) {
			document
					.write('<script src="<c:url value="/resources/js/libs/jquery-ui-1.10.3.min.js" />"><\/script>');
		}
	</script>

	<!-- IMPORTANT: APP CONFIG -->
	<script src="<c:url value="/resources/js/app.config.js" />"></script>

	<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
	<script
		src="<c:url value="/resources/js/plugin/jquery-touch/jquery.ui.touch-punch.min.js" />"></script>

	<!-- BOOTSTRAP JS -->
	<script
		src="<c:url value="/resources/js/bootstrap/bootstrap.min.js" />"></script>

	<!-- CUSTOM NOTIFICATION -->
	<script
		src="<c:url value="/resources/js/notification/SmartNotification.min.js" />"></script>

	<!-- JARVIS WIDGETS -->
	<script
		src="<c:url value="/resources/js/smartwidgets/jarvis.widget.min.js" />"></script>

	<!-- EASY PIE CHARTS 
	<script
		src="<c:url value="/resources/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js" />"></script>
	-->
	<!-- SPARKLINES -->
	<script
		src="<c:url value="/resources/js/plugin/sparkline/jquery.sparkline.min.js" />"></script>

	<!-- JQUERY VALIDATE -->
	<script
		src="<c:url value="/resources/js/plugin/jquery-validate/jquery.validate.min.js" />"></script>

	<!-- JQUERY MASKED INPUT -->
	<script
		src="<c:url value="/resources/js/plugin/masked-input/jquery.maskedinput.min.js" />"></script>

	<!-- JQUERY SELECT2 INPUT -->
	<script
		src="<c:url value="/resources/js/plugin/select2/select2.min.js" />"></script>

	<!-- JQUERY UI + Bootstrap Slider -->
	<script
		src="<c:url value="/resources/js/plugin/bootstrap-slider/bootstrap-slider.min.js" />"></script>

	<!-- browser msie issue fix -->
	<script
		src="<c:url value="/resources/js/plugin/msie-fix/jquery.mb.browser.min.js" />"></script>

	<!-- FastClick: For mobile devices -->
	<script
		src="<c:url value="/resources/js/plugin/fastclick/fastclick.min.js" />"></script>

	<!--[if IE 8]>

		<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

		<![endif]-->

	<!-- Demo purpose only -->
	<script src="<c:url value="/resources/js/demo.min.js" />"></script>

	<!-- MAIN APP JS FILE -->
	<script src="<c:url value="/resources/js/app.min.js" />"></script>

	<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
	<!-- Voice command : plugin 
	<script
		src="<c:url value="/resources/js/speech/voicecommand.min.js" />"></script>
 	-->
	<!-- SmartChat UI : plugin 
	<script
		src="<c:url value="/resources/js/smart-chat-ui/smart.chat.ui.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/smart-chat-ui/smart.chat.manager.min.js" />"></script>
	-->
	<!-- PAGE RELATED PLUGIN(S) -->

	<script
		src="<c:url value="/resources/js/plugin/bootstrapvalidator/bootstrapValidator.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/datatables/jquery.dataTables.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/datatables/dataTables.colVis.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/datatables/dataTables.tableTools.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/datatables/dataTables.bootstrap.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/datatable-responsive/datatables.responsive.min.js" />"></script>

	<!-- PAGE RELATED PLUGIN(S) -->

	<!-- Flot Chart Plugin: Flot Engine, Flot Resizer, Flot Tooltip 
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.cust.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.resize.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.time.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.tooltip.min.js" />"></script>
	-->
	<!-- Vector Maps Plugin: Vectormap engine, Vectormap language 
	<script
		src="<c:url value="/resources/js/plugin/vectormap/jquery-jvectormap-1.2.2.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/vectormap/jquery-jvectormap-world-mill-en.js" />"></script>
	-->
	<!-- Full Calendar -->
	<script
		src="<c:url value="/resources/js/plugin/moment/moment.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/fullcalendar/jquery.fullcalendar.min.js" />"></script>

	<script type="text/javascript">
		// DO NOT REMOVE : GLOBAL FUNCTIONS!

		$(document)
				.ready(
						function() {

							pageSetUp();

							/* // DOM Position key index //
							
							l - Length changing (dropdown)
							f - Filtering input (search)
							t - The Table! (datatable)
							i - Information (records)
							p - Pagination (paging)
							r - pRocessing 
							< and > - div elements
							<"#id" and > - div with an id
							<"class" and > - div with a class
							<"#id.class" and > - div with an id and class
							
							Also see: http://legacy.datatables.net/usage/features
							 */

							/* BASIC ;*/
							var responsiveHelper_dt_basic = undefined;
							var responsiveHelper_datatable_fixed_column = undefined;
							var responsiveHelper_datatable_col_reorder = undefined;
							var responsiveHelper_datatable_tabletools = undefined;

							var breakpointDefinition = {
								tablet : 1024,
								phone : 480
							};
							$('#cance').hide();
							
							$('#frm').bootstrapValidator({
								feedbackIcons : {
									valid : 'glyphicon glyphicon-ok',
									invalid : 'glyphicon glyphicon-remove',
									validating : 'glyphicon glyphicon-refresh'
								},
								fields : {
									documento : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											},
											stringLength : {
												max : 200,
												message : 'De ser menor a 200 caracteres'
											}
										}
									},
									nombre_completo : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									apellido : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									placa : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									empresa_de_transporte : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									trailer : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									precinto : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									documento_patiero : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									eps : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									eps_vence : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									arl : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									arl_vence : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									correo_e : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									telefono : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									/* scan_foto : {
										group : '.col-xs-4',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									}, 
									scan_cedula : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									scan_huella : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									scan_arl : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									scan_tarjeta_propiedad : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									},
									scan_orden_cargue : {
										group : '.col-xs-3',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									}, */
									observaciones : {
										group : '.col-xs-10',
										validators : {
											notEmpty : {
												message : 'Campo requierido'
											}
										}
									}
									
								}
							});
							
							$('#dt_basic')
									.dataTable(
											{
												"sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>"
														+ "t"
														+ "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
												"autoWidth" : true,
												"preDrawCallback" : function() {
													// Initialize the responsive datatables helper once.
													if (!responsiveHelper_dt_basic) {
														responsiveHelper_dt_basic = new ResponsiveDatatablesHelper(
																$('#dt_basic'),
																breakpointDefinition);
													}
												},
												"rowCallback" : function(nRow) {
													responsiveHelper_dt_basic
															.createExpandIcon(nRow);
												},
												"drawCallback" : function(
														oSettings) {
													responsiveHelper_dt_basic
															.respond();
												}
											});

							/* END BASIC */

							/* COLUMN FILTER  */
							var otable = $('#datatable_fixed_column')
									.DataTable(
											{
												//"bFilter": false,
												//"bInfo": false,
												//"bLengthChange": false
												//"bAutoWidth": false,
												//"bPaginate": false,
												//"bStateSave": true // saves sort state using localStorage
												"sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6 hidden-xs'f><'col-sm-6 col-xs-12 hidden-xs'<'toolbar'>>r>"
														+ "t"
														+ "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
												"autoWidth" : true,
												"preDrawCallback" : function() {
													// Initialize the responsive datatables helper once.
													if (!responsiveHelper_datatable_fixed_column) {
														responsiveHelper_datatable_fixed_column = new ResponsiveDatatablesHelper(
																$('#datatable_fixed_column'),
																breakpointDefinition);
													}
												},
												"rowCallback" : function(nRow) {
													responsiveHelper_datatable_fixed_column
															.createExpandIcon(nRow);
												},
												"drawCallback" : function(
														oSettings) {
													responsiveHelper_datatable_fixed_column
															.respond();
												}

											});

							// custom toolbar
							//$("div.toolbar")
							//		.html( '<div class="text-right"><img src="img/logo.png" alt="SmartAdmin" style="width: 111px; margin-top: 3px; margin-right: 10px;"></div>');

							// Apply the filter
							$(
									"#datatable_fixed_column thead th input[type=text]")
									.on(
											'keyup change',
											function() {

												otable.column(
														$(this).parent()
																.index()
																+ ':visible')
														.search(this.value)
														.draw();

											});
							/* END COLUMN FILTER */

							/* COLUMN SHOW - HIDE */
							$('#datatable_col_reorder')
									.dataTable(
											{
												"sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'C>r>"
														+ "t"
														+ "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
												"autoWidth" : true,
												"preDrawCallback" : function() {
													// Initialize the responsive datatables helper once.
													if (!responsiveHelper_datatable_col_reorder) {
														responsiveHelper_datatable_col_reorder = new ResponsiveDatatablesHelper(
																$('#datatable_col_reorder'),
																breakpointDefinition);
													}
												},
												"rowCallback" : function(nRow) {
													responsiveHelper_datatable_col_reorder
															.createExpandIcon(nRow);
												},
												"drawCallback" : function(
														oSettings) {
													responsiveHelper_datatable_col_reorder
															.respond();
												}
											});

							/* END COLUMN SHOW - HIDE */

							/* TABLETOOLS */
							$('#datatable_tabletools')
									.dataTable(
											{

												// Tabletools options: 
												//   https://datatables.net/extensions/tabletools/button_options
												"sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'T>r>"
														+ "t"
														+ "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
												"oTableTools" : {
													"aButtons" : [
															"copy",
															"csv",
															"xls",
															{
																"sExtends" : "pdf",
																"sTitle" : "SmartAdmin_PDF",
																"sPdfMessage" : "SmartAdmin PDF Export",
																"sPdfSize" : "letter"
															},
															{
																"sExtends" : "print",
																"sMessage" : "Generated by SmartAdmin <i>(press Esc to close)</i>"
															} ],
													"sSwfPath" : "js/plugin/datatables/swf/copy_csv_xls_pdf.swf"
												},
												"autoWidth" : true,
												"preDrawCallback" : function() {
													// Initialize the responsive datatables helper once.
													if (!responsiveHelper_datatable_tabletools) {
														responsiveHelper_datatable_tabletools = new ResponsiveDatatablesHelper(
																$('#datatable_tabletools'),
																breakpointDefinition);
													}
												},
												"rowCallback" : function(nRow) {
													responsiveHelper_datatable_tabletools
															.createExpandIcon(nRow);
												},
												"drawCallback" : function(
														oSettings) {
													responsiveHelper_datatable_tabletools
															.respond();
												}
											});
							
											

							/* END TABLETOOLS */

						});
		function validar(){
			alert('validando');
		}
		
		function el(id){return document.getElementById(id);} // Get elem by ID

		// Para la imagen
		canvas2  = el("scan_cedula2");
		context2 = canvas2.getContext("2d");

		function readImage2() {
		    if ( this.files && this.files[0] ) {
		        var FR= new FileReader();
		        FR.onload = function(e) {
		        	
		           var img2 = new Image();
		           img2.onload = function() {
		             context2.drawImage(img2, 0, 0);
		           };
		           img2.src = e.target.result;
		        };
		        FR.readAsDataURL( this.files[0] );
		    }
		}
		el("scan_cedula").addEventListener("change", readImage2, false);

		// Para la imagen
		canvas3  = el("scan_huella2");
		context3 = canvas3.getContext("2d");

		function readImage3() {
		    if ( this.files && this.files[0] ) {
		        var FR= new FileReader();
		        FR.onload = function(e) {
		        	
		           var img3 = new Image();
		           img3.onload = function() {
		             context3.drawImage(img3, 0, 0);
		           };
		           img3.src = e.target.result;
		        };
		        FR.readAsDataURL( this.files[0] );
		    }
		}
		el("scan_huella").addEventListener("change", readImage3, false);
		
		// Para la imagen
		canvas4  = el("scan_orden_cargue2");
		context4 = canvas4.getContext("2d");

		function readImage4() {
		    if ( this.files && this.files[0] ) {
		        var FR= new FileReader();
		        FR.onload = function(e) {
		        	
		           var img4 = new Image();
		           img4.onload = function() {
		             context4.drawImage(img4, 0, 0);
		           };
		           img4.src = e.target.result;
		        };
		        FR.readAsDataURL( this.files[0] );
		    }
		}
		el("scan_orden_cargue").addEventListener("change", readImage4, false);

		// Para la imagen
		canvas5  = el("scan_tarjeta_propiedad2");
		context5 = canvas5.getContext("2d");

		function readImage5() {
		    if ( this.files && this.files[0] ) {
		        var FR= new FileReader();
		        FR.onload = function(e) {
		        	
		           var img5 = new Image();
		           img5.onload = function() {
		             context5.drawImage(img5, 0, 0);
		           };
		           img5.src = e.target.result;
		        };
		        FR.readAsDataURL( this.files[0] );
		    }
		}
		el("scan_tarjeta_propiedad").addEventListener("change", readImage5, false);
		
		
		// Para la imagen
		canvas6  = el("scan_arl2");
		context6 = canvas6.getContext("2d");

		function readImage6() {
		    if ( this.files && this.files[0] ) {
		        var FR= new FileReader();
		        FR.onload = function(e) {
		        	
		           var img6 = new Image();
		           img6.onload = function() {
		             context6.drawImage(img6, 0, 0);
		           };
		           img6.src = e.target.result;
		        };
		        FR.readAsDataURL( this.files[0] );
		    }
		}
		el("scan_arl").addEventListener("change", readImage6, false);
		
		function actualizar() { 
			$( "#frm" ).submit();
			var documento = document.getElementById('documento').value;
			var nombre_completo = document.getElementById('nombre_completo').value;
			var apellido = document.getElementById('apellido').value;
			var correo_e = document.getElementById('correo_e').value;
			var telefono = document.getElementById('telefono').value;
			var empresa_de_transporte = document.getElementById('empresa_de_transporte').value;
			
			var placa = document.getElementById('placa').value;
			var trailer = document.getElementById('trailer').value;
			var eps = document.getElementById('eps').value;
			var eps_vence = document.getElementById('eps_vence').value;
			var arl = document.getElementById('arl').value;
			var arl_vence = document.getElementById('arl_vence').value;
			var precinto = document.getElementById('precinto').value;
			var documento_patiero = document.getElementById('documento_patiero').value;
			
			// Para leer la foto que está en el CANVAS
			var canvas = document.getElementById('scan_foto');
			var canvasWidth  = canvas.width; var canvasHeight = canvas.height; var ctx = canvas.getContext('2d'); var imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_foto = canvas.toDataURL();
			
			canvas = document.getElementById('scan_cedula2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_cedula = canvas.toDataURL();
			
			canvas = document.getElementById('scan_huella2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_huella = canvas.toDataURL();
			
			canvas = document.getElementById('scan_orden_cargue2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_orden_cargue = canvas.toDataURL();
			
			canvas = document.getElementById('scan_tarjeta_propiedad2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_tarjeta_propiedad = canvas.toDataURL();
			
			canvas = document.getElementById('scan_arl2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_arl = canvas.toDataURL();

			var o = document.getElementById('observaciones').value;
			var est = document.getElementById('estado').value;
			var opc=document.getElementById('elboton').innerHTML;
			var fecha_registro = arl_vence;
			$.ajax({
				type : "POST",
				url : "conductor_add/agregar",
				processData: true,
				data : {
					documento: documento,
					fecha_registro: arl_vence,
					nombre_completo: nombre_completo,
					apellido: apellido,
					telefono: telefono,
					correo_e: correo_e,
					scan_foto: scan_foto,
					scan_cedula: scan_cedula,
					scan_huella: scan_huella,
					empresa_de_transporte: empresa_de_transporte,
					placa: placa,
					trailer:	trailer,
					eps:	eps,
					eps_vence: eps_vence,
					arl: arl,
					arl_vence: arl_vence,
					precinto: precinto,
					documento_patiero: documento_patiero,
					scan_orden_cargue: scan_orden_cargue,
					scan_tarjeta_propiedad: scan_tarjeta_propiedad,
					scan_arl: scan_arl,
					observaciones:	o,
					estado:	est,
					opcion: opc
				},
				success : function(data) {		
					 if (data=="semodifico"){
						 $.smallBox({
							title : "Fue modificado con éxito!!!",
							content : "Por favor verifique<p class='text-align-right'><a href='javascript:void(0);' class='btn btn-danger btn-sm'>Ok</a></p>",
							color : "#468D47",
							//timeout: 8000,
							icon : "fa fa-bell swing animated"
						});
						
					 }
					 else{
						 if (data=="error"){
							 $.smallBox({
									title : "ATENCIÓN: El registró no fue guardado!",
									content : "<i class='fa fa-clock-o'></i> <i>Es posible que falte información, Por favor verifique que todos los campos estén ingresados</i>",
									color : "#C46A69",
									iconSmall : "fa fa-times fa-2x fadeInRight animated",
									timeout : 8000
							 });
						 }
						 else{
							 var res = data.split(":::");
							 $('#datatable_fixed_column').dataTable().fnAddData( [res[0],res[1]] );
							 $.smallBox({
									title : "La información se registró adecuadamente",
									content : "Para ingresar un nuevo registro ingrese la información y presione el botón Actualizar",
									color : "#5384AF",
									timeout: 8000,
									icon : "fa fa-bell swing animated"
							 });
							 $('#cance').hide();
						 }
					 }
				},
				error : function(data) {			
					$.smallBox({
						title : "ATENCIÓN: El registró no fue guardado!",
						content : "<i class='fa fa-clock-o'></i> <i>Es posible que falte información, Por favor verifique que<br> todos los campos estén ingresados</i>",
						color : "#C46A69",
						iconSmall : "fa fa-times fa-2x fadeInRight animated",
						timeout : 8000
				 });
				}
			});
		}
		
		function del(dato, thi) {
			$.ajax({
				type : "POST",
				url : "conductor_add/borrar",
				data : {
					documento : dato
				},
				success : function(data) {
					nRow=$(thi).closest("tr").index();
					$('#datatable_fixed_column').dataTable().fnDeleteRow(nRow);
				 	$.smallBox({
						title : "Eliminación de Información",
						content : "La información se eliminó adecuadamente",
						color : "#5384AF",
						timeout: 8000,
						icon : "fa fa-bell"
				    });
				},
				error : function(data) {
					$.smallBox({
						title : "ATENCIÓN: No se eliminó!",
						content : "<i class='fa fa-clock-o'></i> <i>El registro no se eliminó correctamente</i>",
						color : "#C46A69",
						iconSmall : "fa fa-times fa-2x fadeInRight animated",
						timeout : 8000
				 });
				}
			});
		}
		
		function borrar(dato, thi){
			$.SmartMessageBox({
				title : "Eliminación!",
				content : "Está apunto de eliminar un registro, está de acuerdo?",
				buttons : '[No][Si]'
			}, function(ButtonPressed) {
				if (ButtonPressed === "Si") {
					del(dato,thi);
				}
				if (ButtonPressed === "No") {
					$.smallBox({
						title : "Operación Cancelada",
						content : "<i class='fa fa-clock-o'></i> <i>No se afectó la información</i>",
						color : "#C46A69",
						iconSmall : "fa fa-times fa-2x fadeInRight animated",
						timeout : 2000
					});
				}
	
			});
			//e.preventDefault();
		}
		
		function cancelar() {
			var documento = document.getElementById('documento').value;
			var fecha_registro = document.getElementById('fecha_registro').value;
			var nombre_completo = document.getElementById('nombre_completo').value;
			var apellido = document.getElementById('apellido').value;
			var correo_e = document.getElementById('correo_e').value;
			var telefono = document.getElementById('telefono').value;
			var empresa_de_transporte = document.getElementById('empresa_de_transporte').value;
			
			var placa = document.getElementById('placa').value;
			var trailer = document.getElementById('trailer').value;
			var eps = document.getElementById('eps').value;
			var eps_vence = document.getElementById('eps_vence').value;
			var arl = document.getElementById('arl').value;
			var arl_vence = document.getElementById('arl_vence').value;
			var precinto = document.getElementById('precinto').value;
			var documento_patiero = document.getElementById('documento_patiero').value;
			
			// Para leer la foto que está en el CANVAS
			var canvas = document.getElementById('scan_foto');
			var canvasWidth  = canvas.width; var canvasHeight = canvas.height; var ctx = canvas.getContext('2d'); var imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_foto = canvas.toDataURL();
			
			canvas = document.getElementById('scan_cedula2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_cedula = canvas.toDataURL();
			
			canvas = document.getElementById('scan_huella2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_huella = canvas.toDataURL();
			
			canvas = document.getElementById('scan_orden_cargue2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_orden_cargue = canvas.toDataURL();
			
			canvas = document.getElementById('scan_tarjeta_propiedad2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_tarjeta_propiedad = canvas.toDataURL();
			
			canvas = document.getElementById('scan_arl2');
			canvasWidth  = canvas.width; canvasHeight = canvas.height; ctx = canvas.getContext('2d'); imageData = ctx.getImageData(0, 0, canvasWidth, canvasHeight);
			var scan_arl = canvas.toDataURL();

			var o = document.getElementById('observaciones').value;
			var est = document.getElementById('estado').value;
			var opc=document.getElementById('elboton').innerHTML;
			$('#elboton').text('Nuevo');
			$.ajax({
				type : "POST",
				url : "conductor_add/cancelar",
				data : {
					documento: documento,
					fecha_registro: fecha_registro,
					nombre_completo: nombre_completo,
					apellido: apellido,
					correo_e: correo_e,
					telefono: telefono,
					scan_foto: scan_foto,
					scan_cedula: scan_cedula,
					scan_huella: scan_huella,
					empresa_de_transporte: empresa_de_transporte,
					placa: placa,
					trailer:	trailer,
					eps:	eps,
					eps_vence: eps_vence,
					arl: arl,
					arl_vence: arl_vence,
					precinto: precinto,
					documento_patiero: documento_patiero,
					scan_orden_cargue: scan_orden_cargue,
					scan_tarjeta_propiedad: scan_tarjeta_propiedad,
					scan_arl: scan_arl,
					observaciones:	o,
					estado:	est,
					opcion: opc
				},
				success : function(data) {					
					//document.getElementById('descripcion').value = "";
					//document.getElementById('area_id').value = "0";
					 var res = data.split(":::");
					 $('#datatable_fixed_column').dataTable().fnAddData( [res[0],res[1]] );
					 $.smallBox({
							title : "Operación Cancelada",
							content : "<i class='fa fa-clock-o'></i> <i>Se regresó la información a la tabla sin modificaciones</i>",
							color : "#C46A69",
							iconSmall : "fa fa-times fa-2x fadeInRight animated",
							timeout : 4000
					 });
					 $('#cance').hide();
				},
				error : function(data) {
					/* document.getElementById('descripcion').value = "";
					document.getElementById('area_id').value = "0"; */					
				}
			});
		}
		
		function con(documento, fecha_registro, nombre_completo, apellido, correo_e, telefono, scan_foto, scan_cedula, scan_huella, empresa_de_transporte, placa, trailer, eps, eps_vence, arl, arl_vence, precinto, documento_patiero, scan_orden_cargue, scan_tarjeta_propiedad,   scan_arl, observaciones, estado, thi) {
			document.getElementById('documento').value=documento;
			// Lectura CANVAS para foto
			document.getElementById('fecha_registro').value=fecha_registro;
			document.getElementById('nombre_completo').value=nombre_completo;
			document.getElementById('apellido').value=apellido;
			document.getElementById('correo_e').value=correo_e;
			document.getElementById('telefono').value=telefono;
			
			document.getElementById('empresa_de_transporte').value=empresa_de_transporte;
			document.getElementById('placa').value=placa;
			document.getElementById('trailer').value=trailer;
			document.getElementById('eps').value=eps;
			document.getElementById('eps_vence').value=eps_vence;
			document.getElementById('arl').value=arl;
			document.getElementById('arl_vence').value=arl_vence;
			document.getElementById('precinto').value=precinto;
			document.getElementById('documento_patiero').value=documento_patiero;
			
			// Lectura CANVAS	
			var canvas = document.getElementById('scan_foto');
			var ctx = canvas.getContext('2d');
			var image = new Image();
			image.src = scan_foto;
			image.onload = function(){
			   ctx.drawImage(image, 0, 0,300, 150);
			}
			
			// Lectura CANVAS
			var canvas2 = document.getElementById('scan_cedula2');
			var ctx2 = canvas2.getContext('2d');
			var image2 = new Image();
			image2.src = scan_cedula;
			image2.onload = function(){
			   ctx2.drawImage(image2, 0, 0);
			}
			
			// Lectura CANVAS
			var canvas3 = document.getElementById('scan_huella2');
			var ctx3 = canvas3.getContext('2d');
			var image3 = new Image();
			image3.src = scan_huella;
			image3.onload = function(){
			   ctx3.drawImage(image3, 0, 0);
			}
			
			// Lectura CANVAS
			var canvas4 = document.getElementById('scan_orden_cargue2');
			var ctx4 = canvas4.getContext('2d');
			var image4 = new Image();
			image4.src = scan_orden_cargue;
			image4.onload = function(){
			   ctx4.drawImage(image4, 0, 0);
			}
			
			// Lectura CANVAS
			var canvas5 = document.getElementById('scan_tarjeta_propiedad2');
			var ctx5 = canvas5.getContext('2d');
			var image5 = new Image();
			image5.src = scan_tarjeta_propiedad;
			image5.onload = function(){
			   ctx5.drawImage(image5, 0, 0);
			}
			
			// Lectura CANVAS
			var canvas6= document.getElementById('scan_arl2');
			var ctx6 = canvas6.getContext('2d');
			var image6 = new Image();
			image6.src = scan_arl;
			image6.onload = function(){
			   ctx6.drawImage(image6, 0, 0);
			}
			
			document.getElementById('observaciones').value=observaciones;
			document.getElementById('estado').value=estado;
			$('#cance').show();
			document.getElementById('elboton').innerHTML='Actualizar';
			nRow=$(thi).closest("tr").index();
			$('#datatable_fixed_column').dataTable().fnDeleteRow(nRow);
			$.smallBox({
				title : "Inició la modificación del registro",
				content : "Ya no está en el listado, en caso de no querer precione el botón Cancelar",
				color : "#5384AF",
				timeout: 8000,
				icon : "fa fa-bell"
		    });
		}
	
	</script>
	<script type="text/javascript">
			//Nos aseguramos que estén definidas
			//algunas funciones básicas
			window.URL = window.URL || window.webkitURL;
			navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia ||
			function() {
			    alert('Su navegador no soporta navigator.getUserMedia().');
			};
		
			//Este objeto guardará algunos datos sobre la cámara
			window.datosVideo = {
			    'StreamVideo': null,
			    'url': null
			}
		
			jQuery('#botonIniciar').on('click', function(e) {
		
			    //Pedimos al navegador que nos da acceso a 
			    //algún dispositivo de video (la webcam)
			    navigator.getUserMedia({
			        'audio': false,
			        'video': true
			    }, function(streamVideo) {
			        datosVideo.StreamVideo = streamVideo;
			        datosVideo.url = window.URL.createObjectURL(streamVideo);
			        jQuery('#camara').attr('src', datosVideo.url);
		
			    }, function() {
			        alert('No fue posible obtener acceso a la cámara.');
			    });
		
			});
		
			jQuery('#botonDetener').on('click', function(e) {
		
			    if (datosVideo.StreamVideo) {
			        datosVideo.StreamVideo.stop();
			        window.URL.revokeObjectURL(datosVideo.url);
			    }
		
			});
		
			jQuery('#botonFoto').on('click', function(e) {
			    var oCamara, oFoto, oContexto, w, h;
		
			    oCamara = jQuery('#camara');
			    oFoto = jQuery('#scan_foto');
			    w = oCamara.width();
			    h = oCamara.height();
			    oFoto.attr({
			        'width': w,
			        'height': h
			    });
			    oContexto = oFoto[0].getContext('2d');
			    oContexto.drawImage(oCamara[0], 0, 0, w, h);
		
			});
			
			// Modal Link
			$('#modal_link_foto').click(function() {
				$('#dialog-message_foto').dialog('open');
				return false;
			});
			
			// Modal Link
			$('#modal_link_scan_arl').click(function() {
				$('#dialog-message_arl').dialog('open');
				return false;
			});
			
			// Modal Link 
			$('#modal_link_scan_tarjeta_propiedad').click(function() {
				$('#dialog-message_tarjeta_propiedad').dialog('open');
				return false;
			});
			
			// Modal Link 
			$('#modal_link_scan_orden_cargue').click(function() {
				$('#dialog-message_orden_cargue').dialog('open');
				return false;
			});
			
			// Modal Link 
			$('#modal_link_scan_huella').click(function() {
				$('#dialog-message_huella').dialog('open');
				return false;
			});
			
			// Modal Link 
			$('#modal_link_scan_cedula').click(function() {
				$('#dialog-message_cedula').dialog('open');
				return false;
			});
		
			$("#dialog-message_foto").dialog({
				autoOpen : false,
				modal : true,
				title : "Gestión de Fotos",
				buttons : [{
					html : "Cancel",
					"class" : "btn btn-default",
					click : function() {
						$(this).dialog("close");
					}
				}, {
					html : "<i class='fa fa-check'></i>&nbsp; OK",
					"class" : "btn btn-primary",
					click : function() {
						$(this).dialog("close");
					}
				}],
				position: 'top'
				
			});
			
			$("#dialog-message_arl").dialog({
				autoOpen : false,
				modal : true,
				title : "Imagen ARL",
				buttons : [{
					html : "<i class='fa fa-check'></i>&nbsp; OK",
					"class" : "btn btn-primary",
					click : function() {
						$(this).dialog("close");
					}
				}],
				position: 'top',
				width: "90%",
			   	maxWidth: "768px"
			});
			
			$("#dialog-message_tarjeta_propiedad").dialog({
				autoOpen : false,
				modal : true,
				title : "Imagen Tarjeta Propiedad",
				buttons : [{
					html : "<i class='fa fa-check'></i>&nbsp; OK",
					"class" : "btn btn-primary",
					click : function() {
						$(this).dialog("close");
					}
				}],
				position: 'top',
				width: "90%",
			   	maxWidth: "768px"
			});
			
			$("#dialog-message_orden_cargue").dialog({
				autoOpen : false,
				modal : true,
				title : "Imagen Orden Cargue",
				buttons : [{
					html : "<i class='fa fa-check'></i>&nbsp; OK",
					"class" : "btn btn-primary",
					click : function() {
						$(this).dialog("close");
					}
				}],
				position: 'top',
				width: "90%",
			   	maxWidth: "768px"
			});
			
			$("#dialog-message_huella").dialog({
				autoOpen : false,
				modal : true,
				title : "Imagen Huella",
				buttons : [{
					html : "<i class='fa fa-check'></i>&nbsp; OK",
					"class" : "btn btn-primary",
					click : function() {
						$(this).dialog("close");
					}
				}],
				position: 'top',
				width: "90%",
			   	maxWidth: "768px"
			});
			
			$("#dialog-message_cedula").dialog({
				autoOpen : false,
				modal : true,
				title : "Imagen Cedula",
				buttons : [{
					html : "<i class='fa fa-check'></i>&nbsp; OK",
					"class" : "btn btn-primary",
					click : function() {
						$(this).dialog("close");
					}
				}],
				position: 'top',
				width: "90%",
			   	maxWidth: "768px"
			});
	</script>

		<!-- Your GOOGLE ANALYTICS CODE Below -->
	<script type="text/javascript">
		var _gaq = _gaq || [];
		_gaq.push([ '_setAccount', 'UA-XXXXXXXX-X' ]);
		_gaq.push([ '_trackPageview' ]);

		(function() {
			var ga = document.createElement('script');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl'
					: 'http://www')
					+ '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
		})();
	</script>

</body>

</html>