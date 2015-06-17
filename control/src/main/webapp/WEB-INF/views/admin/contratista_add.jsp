<%@ include file="/WEB-INF/views/include.jsp"%>
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

<!--

	TABLE OF CONTENTS.
	
	Use search to find needed section.
	
	===================================================================
	
	|  01. #CSS Links                |  all CSS links and file paths  |
	|  02. #FAVICONS                 |  Favicon links and file paths  |
	|  03. #GOOGLE FONT              |  Google font link              |
	|  04. #APP SCREEN / ICONS       |  app icons, screen backdrops   |
	|  05. #BODY                     |  body tag                      |
	|  06. #HEADER                   |  header tag                    |
	|  07. #PROJECTS                 |  project lists                 |
	|  08. #TOGGLE LAYOUT BUTTONS    |  layout buttons and actions    |
	|  09. #MOBILE                   |  mobile view dropdown          |
	|  10. #SEARCH                   |  search field                  |
	|  11. #NAVIGATION               |  left panel & navigation       |
	|  12. #RIGHT PANEL              |  right panel userlist          |
	|  13. #MAIN PANEL               |  main panel                    |
	|  14. #MAIN CONTENT             |  content holder                |
	|  15. #PAGE FOOTER              |  page footer                   |
	|  16. #SHORTCUT AREA            |  dropdown shortcuts area       |
	|  17. #PLUGINS                  |  all scripts and plugins       |
	
	===================================================================
	
	-->

<!-- #BODY -->
<!-- Possible Classes

		* 'smart-style-{SKIN#}'
		* 'smart-rtl'         - Switch theme mode to RTL
		* 'menu-on-top'       - Switch to top navigation (no DOM change required)
		* 'no-menu'			  - Hides the menu completely
		* 'hidden-menu'       - Hides the main menu but still accessable by hovering over left edge
		* 'fixed-header'      - Fixes the header
		* 'fixed-navigation'  - Fixes the main menu
		* 'fixed-ribbon'      - Fixes breadcrumb
		* 'fixed-page-footer' - Fixes footer
		* 'container'         - boxed layout mode (non-responsive: will not work with fixed-navigation & fixed-ribbon)
	-->
<body class="">

	<!-- HEADER -->

	<!-- END HEADER -->

	<!-- Left panel : Navigation area -->
	<!-- Note: This width of the aside area can be adjusted through LESS variables -->
	<!-- END NAVIGATION -->

	<!-- MAIN PANEL -->
	<div>

		<div id="content">
			<div class="alert alert-block alert-success">
				<a class="close" data-dismiss="alert" href="#">×</a>
				<h4 class="alert-heading">
					<i class="fa fa-check-square-o"></i> Atención!
				</h4>
				<p>Especio para sacar los letreros de todo tipo</p>
			</div>

			<!-- widget grid -->
			<section id="widget-grid" class="">
				<!-- START ROW -->
				<div class="row">
					<!-- NEW COL START -->
					<article
						class="col-sm-12 col-md-12 col-lg-6 sortable-grid ui-sortable">

						<!-- Widget ID (each widget will need unique ID)-->
						<div
							class="jarviswidget jarviswidget-color-blueDark jarviswidget-collapsed jarviswidget-sortable"
							id="wid-id-1" data-widget-editbutton="false"
							data-widget-custombutton="false"
							data-widget-attstyle="jarviswidget-color-blueDark" role="widget"
							style="">
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
										data-original-title="Collapse"><i class=" fa fa-plus"></i></a>
									<a href="javascript:void(0);"
										class="button-icon jarviswidget-fullscreen-btn" rel="tooltip"
										title="" data-placement="bottom"
										data-original-title="Fullscreen"><i class="fa fa-expand "></i></a>
									<a href="javascript:void(0);"
										class="button-icon jarviswidget-delete-btn" rel="tooltip"
										title="" data-placement="bottom" data-original-title="Delete"><i
										class="fa fa-times"></i></a>
								</div>
								<div class="widget-toolbar" role="menu">
									<a data-toggle="dropdown"
										class="dropdown-toggle color-box selector"
										href="javascript:void(0);"></a>
									<ul
										class="dropdown-menu arrow-box-up-right color-select pull-right">
										<li><span class="bg-color-green"
											data-widget-setstyle="jarviswidget-color-green" rel="tooltip"
											data-placement="left" data-original-title="Green Grass"></span></li>
										<li><span class="bg-color-greenDark"
											data-widget-setstyle="jarviswidget-color-greenDark"
											rel="tooltip" data-placement="top"
											data-original-title="Dark Green"></span></li>
										<li><span class="bg-color-greenLight"
											data-widget-setstyle="jarviswidget-color-greenLight"
											rel="tooltip" data-placement="top"
											data-original-title="Light Green"></span></li>
										<li><span class="bg-color-purple"
											data-widget-setstyle="jarviswidget-color-purple"
											rel="tooltip" data-placement="top"
											data-original-title="Purple"></span></li>
										<li><span class="bg-color-magenta"
											data-widget-setstyle="jarviswidget-color-magenta"
											rel="tooltip" data-placement="top"
											data-original-title="Magenta"></span></li>
										<li><span class="bg-color-pink"
											data-widget-setstyle="jarviswidget-color-pink" rel="tooltip"
											data-placement="right" data-original-title="Pink"></span></li>
										<li><span class="bg-color-pinkDark"
											data-widget-setstyle="jarviswidget-color-pinkDark"
											rel="tooltip" data-placement="left"
											data-original-title="Fade Pink"></span></li>
										<li><span class="bg-color-blueLight"
											data-widget-setstyle="jarviswidget-color-blueLight"
											rel="tooltip" data-placement="top"
											data-original-title="Light Blue"></span></li>
										<li><span class="bg-color-teal"
											data-widget-setstyle="jarviswidget-color-teal" rel="tooltip"
											data-placement="top" data-original-title="Teal"></span></li>
										<li><span class="bg-color-blue"
											data-widget-setstyle="jarviswidget-color-blue" rel="tooltip"
											data-placement="top" data-original-title="Ocean Blue"></span></li>
										<li><span class="bg-color-blueDark"
											data-widget-setstyle="jarviswidget-color-blueDark"
											rel="tooltip" data-placement="top"
											data-original-title="Night Sky"></span></li>
										<li><span class="bg-color-darken"
											data-widget-setstyle="jarviswidget-color-darken"
											rel="tooltip" data-placement="right"
											data-original-title="Night"></span></li>
										<li><span class="bg-color-yellow"
											data-widget-setstyle="jarviswidget-color-yellow"
											rel="tooltip" data-placement="left"
											data-original-title="Day Light"></span></li>
										<li><span class="bg-color-orange"
											data-widget-setstyle="jarviswidget-color-orange"
											rel="tooltip" data-placement="bottom"
											data-original-title="Orange"></span></li>
										<li><span class="bg-color-orangeDark"
											data-widget-setstyle="jarviswidget-color-orangeDark"
											rel="tooltip" data-placement="bottom"
											data-original-title="Dark Orange"></span></li>
										<li><span class="bg-color-red"
											data-widget-setstyle="jarviswidget-color-red" rel="tooltip"
											data-placement="bottom" data-original-title="Red Rose"></span></li>
										<li><span class="bg-color-redLight"
											data-widget-setstyle="jarviswidget-color-redLight"
											rel="tooltip" data-placement="bottom"
											data-original-title="Light Red"></span></li>
										<li><span class="bg-color-white"
											data-widget-setstyle="jarviswidget-color-white" rel="tooltip"
											data-placement="right" data-original-title="Purity"></span></li>
										<li><a href="javascript:void(0);"
											class="jarviswidget-remove-colors" data-widget-setstyle=""
											rel="tooltip" data-placement="bottom"
											data-original-title="Reset widget color to default">Remove</a></li>
									</ul>
								</div>
								<span class="widget-icon"> <i class="fa fa-edit"></i>
								</span>
								<h2>Registro Contratistas</h2>

								<span class="jarviswidget-loader"><i
									class="fa fa-refresh fa-spin"></i></span>
							</header>

							<!-- widget div-->
							<div role="content" style="display: none;">

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body no-padding">

									<form id="checkout-form" class="smart-form"
										novalidate="novalidate">
										<button type="submit" class="bv-hidden-submit" style="display: none; width: 0px; height: 0px;" disabled="disabled"></button>

										<fieldset>
											<div class="row">
												<section class="col col-4">
												<label class="label">Documento</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input type="text" name="id_persona" id="id_persona" placeholder="Ingreso Documento">
													</label>
												</section>
												<section class="col col-4">
												<label class="label">Nombre Completo</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input type="text" name="nombre" id="nombre" placeholder="Nombre Completo">
													</label>
												</section>
												<section class="col col-4">
													<label class="label">Apellidos</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input type="text" name="apellido" id="apellido" placeholder="Apellidos">
													</label>
												</section>
											</div>
											<div class="row">
												<section class="col col-6">
												<label class="label">Tipo Persona</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input name="id_tipo_persona" id="id_tipo_persona" class="form-control" placeholder="Ingrese la Dependencia" type="text" list="list_id_tipo_persona">
														<datalist id="list_id_tipo_persona">
															<option value="Empleado">Empleado</option>
															<option value="Contratista">Contratista</option>
															<option value="Visitante">Visitante</option>
															<option value="Conductor">Conductor</option>
															<option value="Patiero">Patiero</option>
														</datalist>
													</label>
												</section>
												<section class="col col-6">
												<label class="label">Dependencia</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input name="id_dependencia" id="id_dependencia" class="form-control" placeholder="Ingrese la Dependencia" type="text" list="list_id_dependencia">
														<datalist id="list_id_dependencia">
															<option value="Planta">Planta</option>
															<option value="Comercial">Comercial</option>
															<option value="Control y Seguridad">Control y Seguridad</option>
															<option value="Sistemas">Sistemas</option>
															<option value="Nómina">Nómina</option>
														</datalist>
													</label>
												</section>
												
											</div>
											<div class="row">
												<section class="col col-6">
													<label class="label">Correo Electrónico</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-envelope-o"></i> <input
														type="email" name="correo-e" id="correo-e" placeholder="Correo Electrónico">
													</label>
												</section>
												<section class="col col-6">
													<label class="label">Teléfonos</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-phone"></i> <input type="tel"
														name="telefono" id="telefono" placeholder="Teléfonos"
														data-mask="(999) 999-9999">
													</label>
												</section>
											</div>
											<div class="row">
												<section class="col col-4">
													<label class="label">Archivo Foto</label>
													<div class="input input-file state-success">
														<span class="button"><input type="file" name="foto_scan" id="foto_scan" onchange="this.parentNode.nextSibling.value = this.value">Seleccione</span><input type="text" readonly="">
													</div>
													<!-- <div class="note note-success">Éste campo es requerido.</div>  -->
												</section>
												<section class="col col-4">
													<label class="label">Archivo Cédula</label>
													<div class="input input-file state-success">
														<span class="button"><input type="file" name="doc_scan" id="doc_scan" onchange="this.parentNode.nextSibling.value = this.value">Seleccione</span><input type="text" readonly="">
													</div>
													<!--  <div class="note note-success">Éste campo es requerido.</div> -->
												</section>
												<section class="col col-4">
													<label class="label">Archivo Huella</label>
													<div class="input input-file state-success">
														<span class="button"><input type="file" name="huella" id="huella" onchange="this.parentNode.nextSibling.value = this.value">Seleccione</span><input type="text" readonly="">
													</div>
													<!-- <div class="note note-success">Éste campo es requerido.</div>  -->
												</section>
											</div>
											<div class="row">
												<section class="col col-4">
													<label class="label">Empresa</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="empresa" id="empresa" placeholder="Empresa">
													</label>
												</section>
												<section class="col col-4">
													<label class="label">NIT Empresa</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="nit_empresa" id="nit_empresa" placeholder="NIT Empresa">
													</label>
												</section>
												<section class="col col-4">
													<label class="label">Fecha Vencimiento Ley Industrial</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input type="text" name="curso_ley_vence" id="curso_ley_vence" placeholder="Vencimiento Ley Industrial" class="form-control datepicker" data-dateformat="dd/mm/yy">
														
													</label>
												</section>
											</div>
											<div class="row">
												<section class="col col-6">
													<label class="label">Persona Responsable</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input name="id_persona_responsable" id="id_persona_responsable" class="form-control" placeholder="Ingrese Persona Responsable" type="text" list="list_id_tipo_persona">
														<datalist id="list_id_tipo_persona">
															<option value="Empleado">Juan</option>
															<option value="Contratista">Pedro</option>
															<option value="Visitante">Maria</option>
														</datalist>
													</label>
												</section>
												<section class="col col-3">
													<label class="label">Código Antecedente</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="codigo_antecedente" id="codigo_antecedente" placeholder="Código Antecedente">
													</label>
												</section>
												<section class="col col-3">
													<label class="label">Placa Vehículo</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="placa_vehiculo" id="placa_vehiculo" placeholder="Placa Vehiculo">
													</label>
												</section>
											</div>
											<div class="row">
												<section class="col col-3">
													<label class="label">EPS</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="eps" id="eps" placeholder="EPS">
													</label>
												</section>
												<section class="col col-3">
													<label class="label">Fecha Vencimiento EPS</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input type="text" name="eps_vence" id="eps_vence" placeholder="Fecha Vencimiento EPS" class="form-control datepicker" data-dateformat="dd/mm/yy">
													</label>
												</section>
												<section class="col col-3">
													<label class="label">ALR</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="alr" id="alr" placeholder="ALR">
													</label>
												</section>
												<section class="col col-3">
													<label class="label">Fecha Vencimiento ALR</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> 
														<input type="text" name="alr_vence" id="alr_vence" placeholder="Fecha Vencimiento ALR" class="form-control datepicker" data-dateformat="dd/mm/yy">
													</label>
												</section>
											</div>
											<div class="row">
												<section class="col col-8">
													<label class="label">Inventario</label>
													<label class="textarea textarea-resizable state-success"> 										
														<textarea name="inventario_texto" id="inventario_texto" rows="3" class="custom-scroll"></textarea> 
													</label>
												</section>
												<section class="col col-4">
													<label class="label">Imagen inventario</label>
													<div class="input input-file state-success">
														<span class="button"><input type="file" name="inventario_scan" id="inventario_scan" onchange="this.parentNode.nextSibling.value = this.value">Seleccione</span><input type="text" readonly="">
													</div>
													<!-- <div class="note note-success">Éste campo es requerido.</div>  -->
												</section>
											</div>
											<div class="row">
												<section class="col col-10">
													<label class="label">Observaciones</label>
													<label class="input state-success"> <i
														class="icon-prepend fa fa-user"></i> <input type="text"
														name="alr" id="alr" placeholder="Observaciones">
													</label>
												</section>
											</div>
										</fieldset>
										<footer>
											<button type="submit" class="btn btn-primary">
												Recargar</button>
											<button type="submit" class="btn btn-primary">
												Actualizar</button>
												<button class="btn btn-default" type="submit" >
																<i class="fa fa-eye"></i>
																Validate
															</button>
										</footer>
									</form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->


					</article>
					<!-- END COL -->

				</div>

				<!-- END ROW -->

			</section>
			<!-- end widget grid -->

		</div>

	</div>
	<!-- END MAIN CONTENT -->

	</div>
	<!-- END MAIN PANEL -->

	<!-- PAGE FOOTER -->

	<!-- END PAGE FOOTER -->


	<!--================================================== -->

	<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
	<script data-pace-options='{ "restartOnRequestAfter": true }'
		src="<c:url value="/resources/js/plugin/pace/pace.min.js" />"></script>

	<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" />
	">
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

	<!-- EASY PIE CHARTS -->
	<script
		src="<c:url value="/resources/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js" />"></script>

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
	<!-- Voice command : plugin -->
	<script
		src="<c:url value="/resources/js/speech/voicecommand.min.js" />"></script>

	<!-- SmartChat UI : plugin -->
	<script
		src="<c:url value="/resources/js/smart-chat-ui/smart.chat.ui.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/smart-chat-ui/smart.chat.manager.min.js" />"></script>

	<!-- PAGE RELATED PLUGIN(S) -->

	<!-- Flot Chart Plugin: Flot Engine, Flot Resizer, Flot Tooltip -->
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.cust.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.resize.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.time.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/flot/jquery.flot.tooltip.min.js" />"></script>

	<!-- Vector Maps Plugin: Vectormap engine, Vectormap language -->
	<script
		src="<c:url value="/resources/js/plugin/vectormap/jquery-jvectormap-1.2.2.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/vectormap/jquery-jvectormap-world-mill-en.js" />"></script>

	<!-- Full Calendar -->
	<script
		src="<c:url value="/resources/js/plugin/moment/moment.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/plugin/fullcalendar/jquery.fullcalendar.min.js" />"></script>

	<script>
		$(document)
				.ready(
						function() {

							// DO NOT REMOVE : GLOBAL FUNCTIONS!
							pageSetUp();

							/*
							 * PAGE RELATED SCRIPTS
							 */

							$(".js-status-update a")
									.click(
											function() {
												var selText = $(this).text();
												var $this = $(this);
												$this
														.parents('.btn-group')
														.find(
																'.dropdown-toggle')
														.html(
																selText
																		+ ' <span class="caret"></span>');
												$this.parents('.dropdown-menu')
														.find('li')
														.removeClass('active');
												$this.parent().addClass(
														'active');
											});

							/*
							 * TODO: add a way to add more todo's to list
							 */

							// initialize sortable
							$(function() {
								$("#sortable1, #sortable2").sortable({
									handle : '.handle',
									connectWith : ".todo",
									update : countTasks
								}).disableSelection();
							});

							// check and uncheck
							$('.todo .checkbox > input[type="checkbox"]')
									.click(
											function() {
												var $this = $(this).parent()
														.parent().parent();

												if ($(this).prop('checked')) {
													$this.addClass("complete");

													// remove this if you want to undo a check list once checked
													//$(this).attr("disabled", true);
													$(this).parent().hide();

													// once clicked - add class, copy to memory then remove and add to sortable3
													$this
															.slideUp(
																	500,
																	function() {
																		$this
																				.clone()
																				.prependTo(
																						"#sortable3")
																				.effect(
																						"highlight",
																						{},
																						800);
																		$this
																				.remove();
																		countTasks();
																	});
												} else {
													// insert undo code here...
												}

											})
							// count tasks
							function countTasks() {

								$('.todo-group-title').each(
										function() {
											var $this = $(this);
											$this.find(".num-of-tasks").text(
													$this.next().find("li")
															.size());
										});

							}

							/*
							 * RUN PAGE GRAPHS
							 */

							/* TAB 1: UPDATING CHART */
							// For the demo we use generated data, but normally it would be coming from the server
							var data = [], totalPoints = 200, $UpdatingChartColors = $(
									"#updating-chart").css('color');

							function getRandomData() {
								if (data.length > 0)
									data = data.slice(1);

								// do a random walk
								while (data.length < totalPoints) {
									var prev = data.length > 0 ? data[data.length - 1]
											: 50;
									var y = prev + Math.random() * 10 - 5;
									if (y < 0)
										y = 0;
									if (y > 100)
										y = 100;
									data.push(y);
								}

								// zip the generated y values with the x values
								var res = [];
								for (var i = 0; i < data.length; ++i)
									res.push([ i, data[i] ])
								return res;
							}

							// setup control widget
							var updateInterval = 1500;
							$("#updating-chart").val(updateInterval).change(
									function() {

										var v = $(this).val();
										if (v && !isNaN(+v)) {
											updateInterval = +v;
											$(this).val("" + updateInterval);
										}

									});

							// setup plot
							var options = {
								yaxis : {
									min : 0,
									max : 100
								},
								xaxis : {
									min : 0,
									max : 100
								},
								colors : [ $UpdatingChartColors ],
								series : {
									lines : {
										lineWidth : 1,
										fill : true,
										fillColor : {
											colors : [ {
												opacity : 0.4
											}, {
												opacity : 0
											} ]
										},
										steps : false

									}
								}
							};

							var plot = $.plot($("#updating-chart"),
									[ getRandomData() ], options);

							/* live switch */
							$('input[type="checkbox"]#start_interval').click(
									function() {
										if ($(this).prop('checked')) {
											$on = true;
											updateInterval = 1500;
											update();
										} else {
											clearInterval(updateInterval);
											$on = false;
										}
									});

							function update() {
								if ($on == true) {
									plot.setData([ getRandomData() ]);
									plot.draw();
									setTimeout(update, updateInterval);

								} else {
									clearInterval(updateInterval)
								}

							}

							var $on = false;

							/*end updating chart*/

							/* TAB 2: Social Network  */

							$(function() {
								// jQuery Flot Chart
								var twitter = [ [ 1, 27 ], [ 2, 34 ],
										[ 3, 51 ], [ 4, 48 ], [ 5, 55 ],
										[ 6, 65 ], [ 7, 61 ], [ 8, 70 ],
										[ 9, 65 ], [ 10, 75 ], [ 11, 57 ],
										[ 12, 59 ], [ 13, 62 ] ], facebook = [
										[ 1, 25 ], [ 2, 31 ], [ 3, 45 ],
										[ 4, 37 ], [ 5, 38 ], [ 6, 40 ],
										[ 7, 47 ], [ 8, 55 ], [ 9, 43 ],
										[ 10, 50 ], [ 11, 47 ], [ 12, 39 ],
										[ 13, 47 ] ], data = [ {
									label : "Twitter",
									data : twitter,
									lines : {
										show : true,
										lineWidth : 1,
										fill : true,
										fillColor : {
											colors : [ {
												opacity : 0.1
											}, {
												opacity : 0.13
											} ]
										}
									},
									points : {
										show : true
									}
								}, {
									label : "Facebook",
									data : facebook,
									lines : {
										show : true,
										lineWidth : 1,
										fill : true,
										fillColor : {
											colors : [ {
												opacity : 0.1
											}, {
												opacity : 0.13
											} ]
										}
									},
									points : {
										show : true
									}
								} ];

								var options = {
									grid : {
										hoverable : true
									},
									colors : [ "#568A89", "#3276B1" ],
									tooltip : true,
									tooltipOpts : {
										//content : "Value <b>$x</b> Value <span>$y</span>",
										defaultTheme : false
									},
									xaxis : {
										ticks : [ [ 1, "JAN" ], [ 2, "FEB" ],
												[ 3, "MAR" ], [ 4, "APR" ],
												[ 5, "MAY" ], [ 6, "JUN" ],
												[ 7, "JUL" ], [ 8, "AUG" ],
												[ 9, "SEP" ], [ 10, "OCT" ],
												[ 11, "NOV" ], [ 12, "DEC" ],
												[ 13, "JAN+1" ] ]
									},
									yaxes : {

									}
								};

								var plot3 = $.plot($("#statsChart"), data,
										options);
							});

							// END TAB 2

							// TAB THREE GRAPH //
							/* TAB 3: Revenew  */

							$(function() {

								var trgt = [ [ 1354586000000, 153 ],
										[ 1364587000000, 658 ],
										[ 1374588000000, 198 ],
										[ 1384589000000, 663 ],
										[ 1394590000000, 801 ],
										[ 1404591000000, 1080 ],
										[ 1414592000000, 353 ],
										[ 1424593000000, 749 ],
										[ 1434594000000, 523 ],
										[ 1444595000000, 258 ],
										[ 1454596000000, 688 ],
										[ 1464597000000, 364 ] ], prft = [
										[ 1354586000000, 53 ],
										[ 1364587000000, 65 ],
										[ 1374588000000, 98 ],
										[ 1384589000000, 83 ],
										[ 1394590000000, 980 ],
										[ 1404591000000, 808 ],
										[ 1414592000000, 720 ],
										[ 1424593000000, 674 ],
										[ 1434594000000, 23 ],
										[ 1444595000000, 79 ],
										[ 1454596000000, 88 ],
										[ 1464597000000, 36 ] ], sgnups = [
										[ 1354586000000, 647 ],
										[ 1364587000000, 435 ],
										[ 1374588000000, 784 ],
										[ 1384589000000, 346 ],
										[ 1394590000000, 487 ],
										[ 1404591000000, 463 ],
										[ 1414592000000, 479 ],
										[ 1424593000000, 236 ],
										[ 1434594000000, 843 ],
										[ 1444595000000, 657 ],
										[ 1454596000000, 241 ],
										[ 1464597000000, 341 ] ], toggles = $("#rev-toggles"), target = $("#flotcontainer");

								var data = [ {
									label : "Target Profit",
									data : trgt,
									bars : {
										show : true,
										align : "center",
										barWidth : 30 * 30 * 60 * 1000 * 80
									}
								}, {
									label : "Actual Profit",
									data : prft,
									color : '#3276B1',
									lines : {
										show : true,
										lineWidth : 3
									},
									points : {
										show : true
									}
								}, {
									label : "Actual Signups",
									data : sgnups,
									color : '#71843F',
									lines : {
										show : true,
										lineWidth : 1
									},
									points : {
										show : true
									}
								} ]

								var options = {
									grid : {
										hoverable : true
									},
									tooltip : true,
									tooltipOpts : {
										//content: '%x - %y',
										//dateFormat: '%b %y',
										defaultTheme : false
									},
									xaxis : {
										mode : "time"
									},
									yaxes : {
										tickFormatter : function(val, axis) {
											return "$" + val;
										},
										max : 1200
									}

								};

								plot2 = null;

								function plotNow() {
									var d = [];
									toggles.find(':checkbox').each(
											function() {
												if ($(this).is(':checked')) {
													d.push(data[$(this).attr(
															"name")
															.substr(4, 1)]);
												}
											});
									if (d.length > 0) {
										if (plot2) {
											plot2.setData(d);
											plot2.draw();
										} else {
											plot2 = $.plot(target, d, options);
										}
									}

								}
								;

								toggles.find(':checkbox').on('change',
										function() {
											plotNow();
										});
								plotNow()

							});

							/*
							 * VECTOR MAP
							 */

							data_array = {
								"US" : 4977,
								"AU" : 4873,
								"IN" : 3671,
								"BR" : 2476,
								"TR" : 1476,
								"CN" : 146,
								"CA" : 134,
								"BD" : 100
							};

							$('#vector-map')
									.vectorMap(
											{
												map : 'world_mill_en',
												backgroundColor : '#fff',
												regionStyle : {
													initial : {
														fill : '#c4c4c4'
													},
													hover : {
														"fill-opacity" : 1
													}
												},
												series : {
													regions : [ {
														values : data_array,
														scale : [ '#85a8b6',
																'#4d7686' ],
														normalizeFunction : 'polynomial'
													} ]
												},
												onRegionLabelShow : function(e,
														el, code) {
													if (typeof data_array[code] == 'undefined') {
														e.preventDefault();
													} else {
														var countrylbl = data_array[code];
														el.html(el.html()
																+ ': '
																+ countrylbl
																+ ' visits');
													}
												}
											});

							/*
							 * FULL CALENDAR JS
							 */

							if ($("#calendar").length) {
								var date = new Date();
								var d = date.getDate();
								var m = date.getMonth();
								var y = date.getFullYear();

								var calendar = $('#calendar')
										.fullCalendar(
												{

													editable : true,
													draggable : true,
													selectable : false,
													selectHelper : true,
													unselectAuto : false,
													disableResizing : false,

													header : {
														left : 'title', //,today
														center : 'prev, next, today',
														right : 'month, agendaWeek, agenDay' //month, agendaDay,
													},

													select : function(start,
															end, allDay) {
														var title = prompt('Event Title:');
														if (title) {
															calendar
																	.fullCalendar(
																			'renderEvent',
																			{
																				title : title,
																				start : start,
																				end : end,
																				allDay : allDay
																			},
																			true // make the event "stick"
																	);
														}
														calendar
																.fullCalendar('unselect');
													},

													events : [
															{
																title : 'All Day Event',
																start : new Date(
																		y, m, 1),
																description : 'long description',
																className : [
																		"event",
																		"bg-color-greenLight" ],
																icon : 'fa-check'
															},
															{
																title : 'Long Event',
																start : new Date(
																		y, m,
																		d - 5),
																end : new Date(
																		y, m,
																		d - 2),
																className : [
																		"event",
																		"bg-color-red" ],
																icon : 'fa-lock'
															},
															{
																id : 999,
																title : 'Repeating Event',
																start : new Date(
																		y, m,
																		d - 3,
																		16, 0),
																allDay : false,
																className : [
																		"event",
																		"bg-color-blue" ],
																icon : 'fa-clock-o'
															},
															{
																id : 999,
																title : 'Repeating Event',
																start : new Date(
																		y, m,
																		d + 4,
																		16, 0),
																allDay : false,
																className : [
																		"event",
																		"bg-color-blue" ],
																icon : 'fa-clock-o'
															},
															{
																title : 'Meeting',
																start : new Date(
																		y, m,
																		d, 10,
																		30),
																allDay : false,
																className : [
																		"event",
																		"bg-color-darken" ]
															},
															{
																title : 'Lunch',
																start : new Date(
																		y, m,
																		d, 12,
																		0),
																end : new Date(
																		y, m,
																		d, 14,
																		0),
																allDay : false,
																className : [
																		"event",
																		"bg-color-darken" ]
															},
															{
																title : 'Birthday Party',
																start : new Date(
																		y, m,
																		d + 1,
																		19, 0),
																end : new Date(
																		y, m,
																		d + 1,
																		22, 30),
																allDay : false,
																className : [
																		"event",
																		"bg-color-darken" ]
															},
															{
																title : 'Smartadmin Open Day',
																start : new Date(
																		y, m,
																		28),
																end : new Date(
																		y, m,
																		29),
																className : [
																		"event",
																		"bg-color-darken" ]
															} ],

													eventRender : function(
															event, element,
															icon) {
														if (!event.description == "") {
															element
																	.find(
																			'.fc-event-title')
																	.append(
																			"<br/><span class='ultra-light'>"
																					+ event.description
																					+ "</span>");
														}
														if (!event.icon == "") {
															element
																	.find(
																			'.fc-event-title')
																	.append(
																			"<i class='air air-top-right fa " + event.icon + " '></i>");
														}
													}
												});

							}
							;

							/* hide default buttons */
							$('.fc-header-right, .fc-header-center').hide();

							// calendar prev
							$('#calendar-buttons #btn-prev').click(function() {
								$('.fc-button-prev').click();
								return false;
							});

							// calendar next
							$('#calendar-buttons #btn-next').click(function() {
								$('.fc-button-next').click();
								return false;
							});

							// calendar today
							$('#calendar-buttons #btn-today').click(function() {
								$('.fc-button-today').click();
								return false;
							});

							// calendar month
							$('#mt').click(
									function() {
										$('#calendar').fullCalendar(
												'changeView', 'month');
									});

							// calendar agenda week
							$('#ag').click(
									function() {
										$('#calendar').fullCalendar(
												'changeView', 'agendaWeek');
									});

							// calendar agenda day
							$('#td').click(
									function() {
										$('#calendar').fullCalendar(
												'changeView', 'agendaDay');
									});

							/*
							 * CHAT
							 */

							$.filter_input = $('#filter-chat-list');
							$.chat_users_container = $('#chat-container > .chat-list-body')
							$.chat_users = $('#chat-users')
							$.chat_list_btn = $('#chat-container > .chat-list-open-close');
							$.chat_body = $('#chat-body');

							/*
							 * LIST FILTER (CHAT)
							 */

							// custom css expression for a case-insensitive contains()
							jQuery.expr[':'].Contains = function(a, i, m) {
								return (a.textContent || a.innerText || "")
										.toUpperCase().indexOf(
												m[3].toUpperCase()) >= 0;
							};

							function listFilter(list) {// header is any element, list is an unordered list
								// create and add the filter form to the header

								$.filter_input
										.change(
												function() {
													var filter = $(this).val();
													if (filter) {
														// this finds all links in a list that contain the input,
														// and hide the ones not containing the input while showing the ones that do
														$.chat_users
																.find(
																		"a:not(:Contains("
																				+ filter
																				+ "))")
																.parent()
																.slideUp();
														$.chat_users
																.find(
																		"a:Contains("
																				+ filter
																				+ ")")
																.parent()
																.slideDown();
													} else {
														$.chat_users.find("li")
																.slideDown();
													}
													return false;
												}).keyup(function() {
											// fire the above change event after every letter
											$(this).change();

										});

							}

							// on dom ready
							listFilter($.chat_users);

							// open chat list
							$.chat_list_btn.click(function() {
								$(this).parent('#chat-container').toggleClass(
										'open');
							})

							$.chat_body.animate({
								scrollTop : $.chat_body[0].scrollHeight
							}, 500);

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