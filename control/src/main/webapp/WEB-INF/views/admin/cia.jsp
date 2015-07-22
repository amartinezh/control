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

		<!-- RIBBON -->

		<!-- END RIBBON -->

		<!-- MAIN CONTENT -->
		<div id="content">

			<!-- widget grid -->
			<section id="widget-grid" class="">
				<!-- row -->
				<div class="row">

					<!-- NEW WIDGET START -->
					<article class="col-sm-12 col-md-12 col-lg-6">

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
								<h2> </h2>
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

									<!-- <form id="movieForm" method="post" novalidate="novalidate" class="bv-form">  -->
									<form:form method="POST" action="validar" ModelAttribute="user" commandName="user" class="bv-form">
										<button type="submit" class="bv-hidden-submit"
											style="display: none; width: 0px; height: 0px;"></button>

										<fieldset>
											<legend> Compañias </legend>
											<div class="form-group">
												<div class="row">
													<div class="col-md-12 has-feedback">
														<label class="control-label">Descripción</label> <input
															type="text" class="form-control" name="title"
															data-bv-field="title"> 
															<i
															class="form-control-feedback" data-bv-icon-for="title"
															style="display: none;"></i> <small class="help-block"
															data-bv-validator="notEmpty" data-bv-for="title"
															data-bv-result="NOT_VALIDATED" style="display: none;">The
															title is required</small><small class="help-block"
															data-bv-validator="stringLength" data-bv-for="title"
															data-bv-result="NOT_VALIDATED" style="display: none;">The
															title must be less than 200 characters long</small>
													</div>


												</div>
											</div>
										</fieldset>


										<div class="form-actions">
											<div class="row">
												<div class="col-md-12">
													<button class="btn btn-default" type="submit">
														<i class="fa fa-save"></i> Actualizar
													</button>
												</div>
											</div>
										</div>

									<!--  </form>  -->
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
				id="wid-id-1" data-widget-editbutton="false" data-widget-editbutton="true" role="widget">
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
					<h2>Herramientas</h2>

					<span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>

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
											aria-controls="dt_basic" 
											aria-sort="ascending"
											aria-label="ID: activate to sort column ascending"
											style="width: 15px;"></th>

										<th data-class="expand" class="sorting_asc" tabindex="1"
											aria-controls="dt_basic" 
											colspan="1" aria-sort="ascending"
											aria-label="Name: activate to sort column ascending"
											style="width: 540px;">Descripción</th>
									</tr>
								</thead>

								<tbody>

									<tr role="row" class="odd">
										<td class="sorting_1"><span class="responsiveExpander"></span> 
											<a class="btn btn-success btn-circle btn-sx"
												href="javascript:void(0);"><i class="fa fa-edit"></i></a> 
											<a class="btn btn-danger btn-circle" 
												href="javascript:void(0);"><i class="fa fa-trash-o"></i></a>
									 	</td>
										<td class="sorting_1"><span class="responsiveExpander"></span>A</td>

									</tr>
									<tr role="row" class="even">
										<td class="sorting_1"><span class="responsiveExpander"></span> 
											<a class="btn btn-success btn-circle btn-sx"
												href="javascript:void(0);"><i class="fa fa-edit"></i></a> 
											<a class="btn btn-danger btn-circle" 
												href="javascript:void(0);"><i class="fa fa-trash-o"></i></a>
									 	</td>
										<td class="sorting_1"><span class="responsiveExpander"></span>B</td>

									</tr>
									<tr role="row" class="odd">
										<td class="sorting_1"><span class="responsiveExpander"></span> 
											<a class="btn btn-success btn-circle btn-sx"
												href="javascript:void(0);"><i class="fa fa-edit"></i></a> 
											<a class="btn btn-danger btn-circle" 
												href="javascript:void(0);"><i class="fa fa-trash-o"></i></a>
									 	</td>
										<td class="sorting_1"><span class="responsiveExpander"></span>C</td>
									</tr>

									<tr role="row" class="even">
										<td class="sorting_1"><span class="responsiveExpander"></span> 
											<a class="btn btn-success btn-circle btn-sx"
												href="javascript:void(0);"><i class="fa fa-edit"></i></a> 
											<a class="btn btn-danger btn-circle" 
												href="javascript:void(0);"><i class="fa fa-trash-o"></i></a>
									 	</td>
										<td class="sorting_1"><span class="responsiveExpander"></span>D</td>
									</tr>
									<tr role="row" class="odd">
										<td class="sorting_1"><span class="responsiveExpander"></span> 
											<a class="btn btn-success btn-circle btn-sx"
												href="javascript:void(0);"><i class="fa fa-edit"></i></a> 
											<a class="btn btn-danger btn-circle" 
												href="javascript:void(0);"><i class="fa fa-trash-o"></i></a>
									 	</td>
										<td class="sorting_1"><span class="responsiveExpander"></span>E</td>
									</tr>

								</tbody>

							</table>

						</div>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>

		</div>

	</div>
	<!-- END MAIN CONTENT -->

	</div>
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
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js">
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