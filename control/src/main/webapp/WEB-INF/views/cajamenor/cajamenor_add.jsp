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

	<!-- END MAIN CONTENT -->



	<!-- widget grid -->
	<section id="widget-grid" class="">

		<!-- row -->
		<div class="row">

			<!-- NEW WIDGET ROW START -->
			<div class="col-sm-12">

				<!-- Widget ID (each widget will need unique ID)-->
				<div class="jarviswidget" id="wid-id-0"
					data-widget-colorbutton="false" data-widget-editbutton="false"
					data-widget-deletebutton="false" data-widget-sortable="false">

					<header>
						<h2>Caja Menor</h2>
					</header>

					<!-- widget div-->

					<div>
						<!-- widget edit box -->
						<div class="jarviswidget-editbox">
							<!-- This area used as dropdown edit box -->
							<input class="form-control" type="text">
						</div>
						<!-- end widget edit box -->

						<!-- widget content -->
						<div class="widget-body">
							<form:form id="frm" method="post" ModelAttribute="cajaMenor"
								commandName="cajaMenor">
								<fieldset>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-12 col-md-4">
												<label class="control-label">Fecha</label>
												<form:input type="hidden" path="id" />
												<form:input type="date" class="form-control" path="fecha"
													placeholder="Fecha" />
											</div>
											<div class="col-sm-12 col-md-4">
												<label class="control-label">Nombre Completo</label>
												<form:input type="text" path="nombreCompleto"
													class="form-control" placeholder="Nombre" />
											</div>
											<div class="col-sm-12 col-md-4">
												<label class="control-label">Apellidos</label>
												<form:input type="text" path="apellido" class="form-control"
													name="Apellido" />
											</div>
										</div>
									</div>
								</fieldset>
								<fieldset>
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 selectContainer">
												<label class="control-label">Dependencia</label>
												<form:select class="form-control"
													path="dependenciaId.dependencia_id"
													items="${dependenciaList}" />
											</div>
											<div class="col-sm-12 col-md-3">
												<label class="control-label">Tipo Transacción</label>
												<form:select class="form-control"
													path="tipoTransaccionId.tipo_transaccion_id"
													items="${tipoList}" />
											</div>
											<div class="col-sm-12 col-md-3">
												<label class="control-label">Hora</label>
												<form:input type="time" path="horaRegistro"
													class="form-control" />
											</div>
											<div class="col-sm-12 col-md-3">
												<label class="control-label">Valor</label>
												<form:input type="text" path="valor" class="form-control" />
											</div>
										</div>
									</div>
								</fieldset>
								<fieldset>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-12 col-md-8">
												<label class="control-label">Observaciones</label>
												<form:textarea class="form-control" path="observaciones" />
											</div>
										</div>
									</div>
								</fieldset>
								<div class="form-actions">
									<div class="row">
										<div class="col-md-12">
											<button id="cance" class="btn btn-danger" type="button"
												onclick="cancelar()">Cancelar</button>
											<button id="elboton" class="btn btn-success" type="button"
												onclick="actualizar()">Nuevo</button>
										</div>
									</div>
								</div>

							</form:form>

						</div>
						<!-- end widget content -->

					</div>
					<!-- end widget div -->

				</div>
				<!-- end widget -->


			</div>
			<!-- WIDGET ROW END -->
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
			<h2>Caja Menor</h2>

			<span class="jarviswidget-loader"><i
				class="fa fa-refresh fa-spin"></i></span>
		</header>

		<!-- widget div-->
		<div role="content">

			<!-- widget edit box -->
			<div class="jarviswidget-editbox">
				<!-- This area used as dropdown edit box -->

			</div>
			<!-- end widget edit box -->

			<!-- widget content -->
			<div class="widget-body no-padding">

				<div id="datatable_fixed_column_wrapper"
					class="dataTables_wrapper form-inline no-footer">

					<table id="datatable_fixed_column"
						class="table table-striped table-bordered dataTable no-footer"
						width="100%" role="grid"
						aria-describedby="datatable_fixed_column_info"
						style="width: 100%;">

						<thead>
							<!-- <tr role="row">
										<th class="hasinput" style="width: 17%" rowspan="1"
											colspan="1"><input type="text" class="form-control"
											placeholder="Filtro DescripciÃ³n"></th>
										
									</tr>   -->
							<tr role="row">
								<th data-hide="cmd" class="sorting_asc" tabindex="0"
									aria-controls="dt_basic" aria-sort="ascending"
									aria-label="ID: activate to sort column ascending"
									style="width: 15px;">Fecha</th>
								<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Nombre Completo</th>
								<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Apellido</th>
								<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Dependencia</th>
									<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Transacción</th>
								<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Valor</th>
								<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Hora</th>
									<th data-class="expand" class="sorting_asc" tabindex="1"
									aria-controls="dt_basic" colspan="1" aria-sort="ascending"
									aria-label="Name: activate to sort column ascending"
									style="width: 540px;">Observaciones</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="cajaMenor" items="${ listCajaMenor }">
								<tr role="row" class="odd">									
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.fecha }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.nombreCompleto }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.apellido }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.dependenciaId.descripcion }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.tipoTransaccionId.descripcion }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span>$<c:out value="${ cajaMenor.valor }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.horaRegistro }"/></td>
									<td class="sorting_1"><span class="responsiveExpander"></span><c:out value="${ cajaMenor.observaciones }"/></td>
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

	<script
		src="<c:url value="/resources/js/plugin/bootstrapvalidator/bootstrapValidator.min.js" />"></script>

	<!-- PAGE RELATED PLUGIN(S) -->
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


	<script>
		$(document)
				.ready(
						function() {
							$('#cance').hide();
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

		$('#frm').bootstrapValidator({
			feedbackIcons : {
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			fields : {
				id_persona : {
					group : '.col-md-4',
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
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				apellido : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				id_tipo_persona : {
					group : '.col-md-6',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				id_dependencia : {
					group : '.col-md-6',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				correo_e : {
					group : '.col-md-6',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				telefono : {
					group : '.col-md-6',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				empresa : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				nit_empresa : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				vencimiento_ley : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				foto_scan : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				cedula_scan : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				huella_scan : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				id_persona_responsable : {
					group : '.col-md-6',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				codigo_antecedente : {
					group : '.col-md-3',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				placa_vehiculo : {
					group : '.col-md-3',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				eps : {
					group : '.col-md-3',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				eps_vence : {
					group : '.col-md-3',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				arl : {
					group : '.col-md-3',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				alr_vence : {
					group : '.col-md-3',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				inventario : {
					group : '.col-md-8',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				inventario_scan : {
					group : '.col-md-4',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				},
				observaciones : {
					group : '.col-md-8',
					validators : {
						notEmpty : {
							message : 'Campo requierido'
						}
					}
				}
			}
		});

		function actualizar() {
			var fecha = document.getElementById('fecha').value;
			var hora = document.getElementById('horaRegistro').value;
			var nombre = document.getElementById('nombreCompleto').value;
			var apellido = document.getElementById('apellido').value;
			var valor = document.getElementById('valor').value;
			var observaciones = document.getElementById('observaciones').value;
			var dependencia = document
					.getElementById('dependenciaId.dependencia_id').value;
			var tipo = document
					.getElementById('tipoTransaccionId.tipo_transaccion_id').value;
			var id = document.getElementById('id').value;
			$.ajax({
						type : "POST",
						url : "cajamenor_registrar/agregar",
						data : {
							id : id,
							tipo : tipo,
							dependencia : dependencia,
							nombre : nombre,
							apellido : apellido,
							observaciones : observaciones,
							valor : valor,
							fecha : fecha,
							hora : hora
						},
						success : function(data) {
							document.getElementById('id').value = "0";
							document.getElementById('fecha').value = "";
							document.getElementById('nombreCompleto').value = "";
							document.getElementById('apellido').value = "";
							document.getElementById('valor').value = "";
							document.getElementById('observaciones').value = "";
							document.getElementById('horaRegistro').value = "";
							var res = data.split(":::");
							$('#datatable_fixed_column').dataTable().fnAddData(
									[ res[1], res[2], res[3], res[4], res[5], res[6], res[7], res[8] ]);
							$
									.smallBox({
										title : "La información se registró adecuadamente",
										content : "Para ingresar un nuevo registro ingrese la información y presione el botón Actualizar",
										color : "#5384AF",
										timeout : 8000,
										icon : "fa fa-bell swing animated"
									});
							$('#cance').hide();
						},
						error : function(data) {
							$
									.smallBox({
										title : "El registró no fue guardado!",
										content : "Por favor verifique<p class='text-align-right'><a href='javascript:void(0);' class='btn btn-danger btn-sm'>Ok</a></p>",
										color : "#296191",
										timeout : 8000,
										icon : "fa fa-bell swing animated"
									});
						}
					});
		}
	</script>


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

						})
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