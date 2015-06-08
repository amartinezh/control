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
	<div >

		<!-- RIBBON -->

		<!-- END RIBBON -->

		<!-- MAIN CONTENT -->
		<div id="content">


			<div class="row">
				<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
					<h1 class="page-title txt-color-blueDark">
						<i class="fa fa-pencil-square-o fa-fw "></i> Forms <span>>
							Bootstrap Form Elements </span>
					</h1>
				</div>
				<div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
					<ul id="sparks" class="">
						<li class="sparks-info">
							<h5>
								My Income <span class="txt-color-blue">$47,171</span>
							</h5>
							<div
								class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm">
								1300, 1877, 2500, 2577, 2000, 2100, 3000, 2700, 3631, 2471,
								2700, 3631, 2471</div>
						</li>
						<li class="sparks-info">
							<h5>
								Site Traffic <span class="txt-color-purple"><i
									class="fa fa-arrow-circle-up" data-rel="bootstrap-tooltip"
									title="Increased"></i>&nbsp;45%</span>
							</h5>
							<div
								class="sparkline txt-color-purple hidden-mobile hidden-md hidden-sm">
								110,150,300,130,400,240,220,310,220,300, 270, 210</div>
						</li>
						<li class="sparks-info">
							<h5>
								Site Orders <span class="txt-color-greenDark"><i
									class="fa fa-shopping-cart"></i>&nbsp;2447</span>
							</h5>
							<div
								class="sparkline txt-color-greenDark hidden-mobile hidden-md hidden-sm">
								110,150,300,130,400,240,220,310,220,300, 270, 210</div>
						</li>
					</ul>
				</div>
			</div>

			<!-- widget grid -->
			<section id="widget-grid" class="">

				<div class="well">
					<div class="input-group">
						<input class="form-control" type="text" placeholder="Search...">
						<div class="input-group-btn">
							<button class="btn btn-default btn-primary" type="button">
								<i class="fa fa-search"></i> Search
							</button>
						</div>
					</div>
				</div>

				<!-- row -->
				<div class="row">

					<!-- NEW WIDGET START -->
					<article class="col-sm-12 col-md-12 col-lg-6">

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-0"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-eye"></i>
								</span>
								<h2>Default Elements</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<form class="form-horizontal">

										<fieldset>
											<legend>Default Form Elements</legend>
											<div class="form-group">
												<label class="col-md-2 control-label">Text field</label>
												<div class="col-md-10">
													<input class="form-control"
														placeholder="Default Text Field" type="text">
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-2 control-label">Auto Complete</label>
												<div class="col-md-10">
													<input class="form-control" placeholder="Type somethine..."
														type="text" list="list">
													<datalist id="list">
														<option value="Alexandra">Alexandra</option>
														<option value="Alice">Alice</option>
														<option value="Anastasia">Anastasia</option>
														<option value="Avelina">Avelina</option>
														<option value="Basilia">Basilia</option>
														<option value="Beatrice">Beatrice</option>
														<option value="Cassandra">Cassandra</option>
														<option value="Cecil">Cecil</option>
														<option value="Clemencia">Clemencia</option>
														<option value="Desiderata">Desiderata</option>
														<option value="Dionisia">Dionisia</option>
														<option value="Edith">Edith</option>
														<option value="Eleanora">Eleanora</option>
														<option value="Elizabeth">Elizabeth</option>
														<option value="Emma">Emma</option>
														<option value="Felicia">Felicia</option>
														<option value="Florence">Florence</option>
														<option value="Galiana">Galiana</option>
														<option value="Grecia">Grecia</option>
														<option value="Helen">Helen</option>
														<option value="Helewisa">Helewisa</option>
														<option value="Idonea">Idonea</option>
														<option value="Isabel">Isabel</option>
														<option value="Joan">Joan</option>
														<option value="Juliana">Juliana</option>
														<option value="Karla">Karla</option>
														<option value="Karyn">Karyn</option>
														<option value="Kate">Kate</option>
														<option value="Lakisha">Lakisha</option>
														<option value="Lana">Lana</option>
														<option value="Laura">Laura</option>
														<option value="Leona">Leona</option>
														<option value="Mandy">Mandy</option>
														<option value="Margaret">Margaret</option>
														<option value="Maria">Maria</option>
														<option value="Nanacy">Nanacy</option>
														<option value="Nicole">Nicole</option>
														<option value="Olga">Olga</option>
														<option value="Pamela">Pamela</option>
														<option value="Patricia">Patricia</option>
														<option value="Qiana">Qiana</option>
														<option value="Rachel">Rachel</option>
														<option value="Ramona">Ramona</option>
														<option value="Samantha">Samantha</option>
														<option value="Sandra">Sandra</option>
														<option value="Tanya">Tanya</option>
														<option value="Teresa">Teresa</option>
														<option value="Ursula">Ursula</option>
														<option value="Valerie">Valerie</option>
														<option value="Veronica">Veronica</option>
														<option value="Wilma">Wilma</option>
														<option value="Yasmin">Yasmin</option>
														<option value="Zelma">Zelma</option>
													</datalist>
													<p class="note">
														<strong>Note:</strong> works in Chrome, Firefox, Opera and
														IE10.
													</p>
												</div>

											</div>

											<div class="form-group">
												<label class="col-md-2 control-label">Password field</label>
												<div class="col-md-10">
													<input class="form-control" placeholder="Password field"
														type="password" value="mypassword">
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-2 control-label">Textarea</label>
												<div class="col-md-10">
													<textarea class="form-control" placeholder="Textarea"
														rows="4"></textarea>
												</div>
											</div>


										</fieldset>

										<fieldset>
											<legend>Unstyled Checkbox</legend>
											<div class="form-group">
												<label class="col-md-2 control-label">Checkbox
													default</label>
												<div class="col-md-10">
													<div class="checkbox">
														<label> <input type="checkbox"> Checkbox 1
														</label>
													</div>
													<div class="checkbox">
														<label> <input type="checkbox"> Checkbox 2
														</label>
													</div>
													<div class="checkbox">
														<label> <input type="checkbox"> Checkbox 3
														</label>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-2 control-label">Inline</label>
												<div class="col-md-10">
													<label class="checkbox-inline"> <input
														type="checkbox"> Checkbox 2
													</label> <label class="checkbox-inline"> <input
														type="checkbox"> Checkbox 2
													</label> <label class="checkbox-inline"> <input
														type="checkbox"> Checkbox 3
													</label>
												</div>
											</div>

										</fieldset>

										<fieldset>
											<legend>Unstyled Radiobox</legend>
											<div class="form-group">
												<label class="col-md-2 control-label">Radios default</label>
												<div class="col-md-10">
													<div class="radio">
														<label> <input type="radio"> Radiobox 1
														</label>
													</div>
													<div class="radio">
														<label> <input type="radio"> Radiobox 2
														</label>
													</div>
													<div class="radio">
														<label> <input type="radio"> Radiobox 3
														</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-2 control-label">Inline</label>
												<div class="col-md-10">
													<label class="radio radio-inline"> <input
														type="radio"> Radiobox 1
													</label> <label class="radio radio-inline"> <input
														type="radio"> Radiobox 2
													</label> <label class="radio radio-inline"> <input
														type="radio"> Radiobox 3
													</label>
												</div>
											</div>



										</fieldset>

										<fieldset>
											<legend>File inputs</legend>

											<div class="form-group">
												<label class="col-md-2 control-label">File input</label>
												<div class="col-md-10">
													<input type="file" class="btn btn-default"
														id="exampleInputFile1">
													<p class="help-block">some help text here.</p>
												</div>
											</div>

										</fieldset>

										<fieldset class="demo-switcher-1">
											<legend>Styled Checkbox and Radiobox</legend>

											<span class="toggle-demo"> <span>Styles: </span> <span
												class="btn-group btn-group-justified" data-toggle="buttons">
													<label class="btn btn-default btn-xs active"> <input
														type="radio" name="demo-switcher-1" id="style-0">
														1
												</label> <label class="btn btn-default btn-xs"> <input
														type="radio" name="demo-switcher-1" id="style-1">
														2
												</label> <label class="btn btn-default btn-xs"> <input
														type="radio" name="demo-switcher-1" id="style-2">
														3
												</label> <label class="btn btn-default btn-xs"> <input
														type="radio" name="demo-switcher-1" id="style-3">
														4
												</label>
											</span>
											</span>
											<div class="form-group">
												<label class="col-md-2 control-label">Checkbox
													Styles</label>
												<div class="col-md-10">

													<div class="checkbox">
														<label> <input type="checkbox"
															class="checkbox style-0" checked="checked"> <span>Checkbox
																1</span>
														</label>
													</div>

													<div class="checkbox">
														<label> <input type="checkbox"
															class="checkbox style-0"> <span>Checkbox 2</span>
														</label>
													</div>

													<div class="checkbox">
														<label> <input type="checkbox"
															class="checkbox style-0"> <span>Checkbox 3</span>
														</label>
													</div>

												</div>
											</div>

											<div class="form-group">
												<label class="col-md-2 control-label">Inline</label>
												<div class="col-md-10">
													<label class="checkbox-inline"> <input
														type="checkbox" class="checkbox style-0"> <span>Checkbox
															1</span>
													</label> <label class="checkbox-inline"> <input
														type="checkbox" class="checkbox style-0"> <span>Checkbox
															2</span>
													</label> <label class="checkbox-inline"> <input
														type="checkbox" class="checkbox style-0"> <span>Checkbox
															3</span>
													</label>
												</div>
											</div>

										</fieldset>

										<fieldset class="demo-switcher-1">
											<legend></legend>

											<div class="form-group">
												<label class="col-md-2 control-label">Radios Styles</label>
												<div class="col-md-10">
													<div class="radio">
														<label> <input type="radio"
															class="radiobox style-0" checked="checked" name="style-0">
															<span>Radiobox 1</span>
														</label>
													</div>
													<div class="radio">
														<label> <input type="radio"
															class="radiobox style-0" name="style-0"> <span>Radiobox
																2</span>
														</label>
													</div>
													<div class="radio">
														<label> <input type="radio"
															class="radiobox style-0" name="style-0"> <span>Radiobox
																3</span>
														</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-2 control-label">Inline</label>
												<div class="col-md-10">
													<label class="radio radio-inline"> <input
														type="radio" class="radiobox" name="style-0a"> <span>Radiobox
															1</span>

													</label> <label class="radio radio-inline"> <input
														type="radio" class="radiobox" name="style-0a"> <span>Radiobox
															2</span>
													</label> <label class="radio radio-inline"> <input
														type="radio" class="radiobox" name="style-0a"> <span>Radiobox
															3</span>
													</label>
												</div>
											</div>

										</fieldset>

										<fieldset>
											<legend>Unstyled Select</legend>
											<div class="form-group">
												<label class="col-md-2 control-label" for="select-1">Select</label>
												<div class="col-md-10">

													<select class="form-control" id="select-1">
														<option>Amsterdam</option>
														<option>Atlanta</option>
														<option>Baltimore</option>
														<option>Boston</option>
														<option>Buenos Aires</option>
														<option>Calgary</option>
														<option>Chicago</option>
														<option>Denver</option>
														<option>Dubai</option>
														<option>Frankfurt</option>
														<option>Hong Kong</option>
														<option>Honolulu</option>
														<option>Houston</option>
														<option>Kuala Lumpur</option>
														<option>London</option>
														<option>Los Angeles</option>
														<option>Melbourne</option>
														<option>Mexico City</option>
														<option>Miami</option>
														<option>Minneapolis</option>
													</select>

												</div>
											</div>
											<div class="form-group">
												<label class="col-md-2 control-label" for="multiselect1">Multiple
													select</label>
												<div class="col-md-10">
													<select multiple="multiple" id="multiselect1"
														class="form-control custom-scroll"
														title="Click to Select a City">
														<option>Amsterdam</option>
														<option selected="selected">Atlanta</option>
														<option>Baltimore</option>
														<option>Boston</option>
														<option>Buenos Aires</option>
														<option>Calgary</option>
														<option selected="selected">Chicago</option>
														<option>Denver</option>
														<option>Dubai</option>
														<option>Frankfurt</option>
														<option>Hong Kong</option>
														<option>Honolulu</option>
														<option>Houston</option>
														<option>Kuala Lumpur</option>
														<option>London</option>
														<option>Los Angeles</option>
														<option>Melbourne</option>
														<option>Mexico City</option>
														<option>Miami</option>
														<option>Minneapolis</option>
													</select>
												</div>
											</div>
										</fieldset>

										<fieldset>
											<legend>Input States</legend>

											<div class="form-group has-warning">
												<label class="col-md-2 control-label">Input warning</label>
												<div class="col-md-10">
													<div class="input-group">
														<input class="form-control" type="text"> <span
															class="input-group-addon"><i class="fa fa-warning"></i></span>
													</div>
													<span class="help-block">Something may have gone
														wrong</span>
												</div>

											</div>

											<div class="form-group has-error">
												<label class="col-md-2 control-label">Input error</label>
												<div class="col-md-10">
													<div class="input-group">
														<input class="form-control" type="text"> <span
															class="input-group-addon"><i
															class="glyphicon glyphicon-remove-circle"></i></span>
													</div>
													<span class="help-block"><i class="fa fa-warning"></i>
														Please correct the error</span>
												</div>
											</div>

											<div class="form-group has-success">
												<label class="col-md-2 control-label">Input success</label>
												<div class="col-md-10">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-dollar"></i></span> <input class="form-control"
															type="text"> <span class="input-group-addon"><i
															class="fa fa-check"></i></span>
													</div>
													<span class="help-block">Something may have gone
														wrong</span>
												</div>
											</div>

										</fieldset>

										<fieldset>
											<legend>Input sizes</legend>

											<div class="form-group">
												<label class="control-label col-md-2">Extra Small
													Input</label>
												<div class="col-md-10">
													<input class="form-control input-xs"
														placeholder=".input-xs" type="text">
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-2">Small Input</label>
												<div class="col-md-10">
													<input class="form-control input-sm"
														placeholder=".input-sm" type="text">
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-2">Default Input</label>
												<div class="col-md-10">
													<input class="form-control" placeholder="Default input"
														type="text">
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-2">Large Input</label>
												<div class="col-md-10">
													<input class="form-control input-lg"
														placeholder=".input-lg" type="text">
												</div>
											</div>

										</fieldset>

										<fieldset>
											<legend>Select Sizes</legend>
											<div class="form-group">
												<label class="control-label col-md-2">Small Select</label>
												<div class="col-md-10">
													<select class="form-control input-sm">
														<option>Amsterdam</option>
														<option>Atlanta</option>
														<option>Baltimore</option>
														<option>Boston</option>
														<option>Buenos Aires</option>
														<option>Calgary</option>
														<option>Chicago</option>
														<option>Denver</option>
														<option>Dubai</option>
														<option>Frankfurt</option>
														<option>Hong Kong</option>
														<option>Honolulu</option>
														<option>Houston</option>
														<option>Kuala Lumpur</option>
														<option>London</option>
														<option>Los Angeles</option>
														<option>Melbourne</option>
														<option>Mexico City</option>
														<option>Miami</option>
														<option>Minneapolis</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-2">Default Select</label>
												<div class="col-md-10">
													<select class="form-control">
														<option>Amsterdam</option>
														<option>Atlanta</option>
														<option>Baltimore</option>
														<option>Boston</option>
														<option>Buenos Aires</option>
														<option>Calgary</option>
														<option>Chicago</option>
														<option>Denver</option>
														<option>Dubai</option>
														<option>Frankfurt</option>
														<option>Hong Kong</option>
														<option>Honolulu</option>
														<option>Houston</option>
														<option>Kuala Lumpur</option>
														<option>London</option>
														<option>Los Angeles</option>
														<option>Melbourne</option>
														<option>Mexico City</option>
														<option>Miami</option>
														<option>Minneapolis</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-2">Large Select</label>
												<div class="col-md-10">
													<select class="form-control input-lg">
														<option>Amsterdam</option>
														<option>Atlanta</option>
														<option>Baltimore</option>
														<option>Boston</option>
														<option>Buenos Aires</option>
														<option>Calgary</option>
														<option>Chicago</option>
														<option>Denver</option>
														<option>Dubai</option>
														<option>Frankfurt</option>
														<option>Hong Kong</option>
														<option>Honolulu</option>
														<option>Houston</option>
														<option>Kuala Lumpur</option>
														<option>London</option>
														<option>Los Angeles</option>
														<option>Melbourne</option>
														<option>Mexico City</option>
														<option>Miami</option>
														<option>Minneapolis</option>
													</select>
												</div>
											</div>

										</fieldset>

										<fieldset>
											<legend>Prepend &amp; Append</legend>

											<div class="form-group">
												<label class="control-label col-md-2" for="prepend">Prepended
													Input</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<span class="input-group-addon">@</span> <input
																	class="form-control" id="prepend"
																	placeholder="Username" type="text">
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2" for="prepend">W/
													input &amp; radios</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<span class="input-group-addon"> <span
																	class="checkbox"> <label> <input
																			type="checkbox" class="checkbox style-0"
																			checked="checked"> <span></span>
																	</label>
																</span>
																</span> <input class="form-control" placeholder="" type="text">
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2"></label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<input class="form-control" placeholder="With switch"
																	type="text"> <span class="input-group-addon">
																	<span class="onoffswitch"> <input
																		type="checkbox" name="start_interval"
																		class="onoffswitch-checkbox" id="st3"> <label
																		class="onoffswitch-label" for="st3"> <span
																			class="onoffswitch-inner" data-swchon-text="YES"
																			data-swchoff-text="NO"></span> <span
																			class="onoffswitch-switch"></span>
																	</label>
																</span>
																</span>
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2"></label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<span class="input-group-addon"> <span
																	class="radio"> <label> <input
																			type="radio" class="radiobox style-0"
																			name="style-0a2"> <span> Left</span>
																	</label>
																</span>
																</span> <input class="form-control" placeholder="" type="text">
																<span class="input-group-addon"> <span
																	class="radio"> <label> <input
																			type="radio" class="radiobox style-0"
																			name="style-0a2"> <span> Right</span>
																	</label>
																</span>
																</span>
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2" for="append">Appended
													Input</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<input class="form-control" id="append" type="text">
																<span class="input-group-addon">.00</span>
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2" for="appendprepend">Combined</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<span class="input-group-addon">$</span> <input
																	class="form-control" id="appendprepend" type="text">
																<span class="input-group-addon">.00</span>
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2" for="appendbutton">With
													buttons</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">
															<div class="input-group">
																<input class="form-control" id="appendbutton"
																	type="text">
																<div class="input-group-btn">
																	<button class="btn btn-default" type="button">
																		Search</button>
																	<button class="btn btn-default" type="button">
																		Options</button>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2">With dropdowns</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">

															<div class="input-group">
																<input type="text" class="form-control">
																<div class="input-group-btn">
																	<button type="button" class="btn btn-default"
																		tabindex="-1">Action</button>
																	<button type="button"
																		class="btn btn-default dropdown-toggle"
																		data-toggle="dropdown" tabindex="-1">
																		<span class="caret"></span>
																	</button>
																	<ul class="dropdown-menu pull-right" role="menu">
																		<li><a href="javascript:void(0);">Action</a></li>
																		<li><a href="javascript:void(0);">Another
																				action</a></li>
																		<li><a href="javascript:void(0);">Something
																				else here</a></li>
																		<li class="divider"></li>
																		<li><a href="javascript:void(0);">Cancel</a></li>
																	</ul>
																</div>
															</div>

														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2"></label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">

															<div class="input-group">
																<div class="input-group-btn">
																	<button type="button" class="btn btn-default"
																		tabindex="-1">Action</button>
																	<button type="button"
																		class="btn btn-default dropdown-toggle"
																		data-toggle="dropdown" tabindex="-1">
																		<span class="caret"></span>
																	</button>
																	<ul class="dropdown-menu" role="menu">
																		<li><a href="javascript:void(0);">Action</a></li>
																		<li><a href="javascript:void(0);">Another
																				action</a></li>
																		<li><a href="javascript:void(0);">Something
																				else here</a></li>
																		<li class="divider"></li>
																		<li><a href="javascript:void(0);">Cancel</a></li>
																	</ul>
																</div>
																<input type="text" class="form-control">
															</div>

														</div>
													</div>
												</div>
											</div>

										</fieldset>

										<fieldset>
											<legend>Flexible Input fields with icons</legend>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Addon
													Large</label>
												<div class="col-md-10">
													<div class="icon-addon addon-lg">
														<input type="text" placeholder="Email"
															class="form-control"> <label for="email"
															class="glyphicon glyphicon-search" rel="tooltip"
															title="email"></label>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Addon
													Medium</label>
												<div class="col-md-10">
													<div class="icon-addon addon-md">
														<input type="text" placeholder="Email"
															class="form-control"> <label for="email"
															class="glyphicon glyphicon-search" rel="tooltip"
															title="email"></label>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Addon
													Small</label>
												<div class="col-md-10">
													<div class="icon-addon addon-sm">
														<input type="text" placeholder="Email"
															class="form-control"> <label for="email"
															class="glyphicon glyphicon-search" rel="tooltip"
															title="email"></label>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Select
													Large</label>
												<div class="col-md-10">
													<div class="icon-addon addon-lg">
														<select class="form-control">
															<option>Select Option</option>
															<option>Sample</option>
															<option>Sample</option>
														</select> <label for="email" class="glyphicon glyphicon-search"
															rel="tooltip" title="email"></label>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Select
													Medium</label>
												<div class="col-md-10">
													<div class="icon-addon addon-md">
														<select class="form-control">
															<option>Select Option</option>
															<option>Sample</option>
															<option>Sample</option>
														</select> <label for="email" class="glyphicon glyphicon-search"
															rel="tooltip" title="email"></label>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Select
													Small</label>
												<div class="col-md-10">
													<div class="icon-addon addon-sm">
														<select class="form-control">
															<option>Select Option</option>
															<option>Sample</option>
															<option>Sample</option>
														</select> <label for="email" class="glyphicon glyphicon-search"
															rel="tooltip" title="email"></label>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Prepended
													Large</label>
												<div class="col-md-10">
													<div class="input-group input-group-lg">
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-filter"></i></span>
														<div class="icon-addon addon-lg">
															<input type="text" placeholder="Email"
																class="form-control"> <label for="email"
																class="glyphicon glyphicon-search" rel="tooltip"
																title="email"></label>
														</div>
														<span class="input-group-btn">
															<button class="btn btn-default" type="button">Go!</button>
														</span>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Prepended
													Medium</label>
												<div class="col-md-10">
													<div class="input-group input-group-md">
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-filter"></i></span>
														<div class="icon-addon addon-md">
															<input type="text" placeholder="Email"
																class="form-control"> <label for="email"
																class="glyphicon glyphicon-search" rel="tooltip"
																title="email"></label>
														</div>
														<span class="input-group-btn">
															<button class="btn btn-default" type="button">Go!</button>
														</span>
													</div>
												</div>

											</div>

											<div class="form-group">

												<label class="control-label col-md-2" for="prepend">Prepended
													Small</label>
												<div class="col-md-10">
													<div class="input-group input-group-sm">
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-filter"></i></span>
														<div class="icon-addon addon-sm">
															<input type="text" placeholder="Email"
																class="form-control"> <label for="email"
																class="glyphicon glyphicon-search" rel="tooltip"
																title="email"></label>
														</div>
														<span class="input-group-btn">
															<button class="btn btn-default" type="button">Go!</button>
														</span>
													</div>
												</div>

											</div>

										</fieldset>

										<fieldset>
											<legend>Simple input with icons</legend>

											<div class="form-group">
												<label class="control-label col-md-2">Input with
													icon</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">

															<div class="input-icon-left">
																<i class="fa fa-microphone"></i> <input
																	class="form-control" placeholder="Left Icon"
																	type="text">
															</div>

														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2">With right
													icon</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">

															<div class="input-icon-right">
																<i class="fa fa-microphone"></i> <input
																	class="form-control" placeholder="" type="text">
															</div>

														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-2">Input with
													spinner</label>
												<div class="col-md-10">
													<div class="row">
														<div class="col-sm-12">

															<input class="form-control ui-autocomplete-loading"
																placeholder="" type="text">

														</div>
													</div>
												</div>
											</div>



										</fieldset>

										<div class="form-actions">
											<div class="row">
												<div class="col-md-12">
													<button class="btn btn-default" type="submit">
														Cancel</button>
													<button class="btn btn-primary" type="submit">
														<i class="fa fa-save"></i> Submit
													</button>
												</div>
											</div>
										</div>

									</form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-2"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-eye"></i>
								</span>
								<h2>Horizontal Form</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<form>

										<fieldset>
											<input name="authenticity_token" type="hidden">
											<div class="form-group">
												<label>Text field</label> <input class="form-control"
													placeholder="Text field" type="text">
											</div>
											<div class="form-group">
												<label>Password field</label> <input class="form-control"
													placeholder="Password" type="password" value="mypassword">
											</div>
											<div class="form-group">
												<label>Textarea</label>
												<textarea class="form-control" placeholder="Textarea"
													rows="3"></textarea>
											</div>
											<div class="form-group">
												<label>Readonly</label> <span class="form-control">Read
													only text</span>
											</div>
										</fieldset>
										<div class="form-actions">
											<div class="btn btn-primary btn-lg">
												<i class="fa fa-save"></i> Submit
											</div>
										</div>
									</form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-4"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-eye"></i>
								</span>
								<h2>Inline Form</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<div class="alert adjusted alert-info fade in">
										<button class="close" data-dismiss="alert">×</button>
										<i class="fa-fw fa-lg fa fa-exclamation"></i> <strong>Hey
											hey!</strong> This is an inline form!
									</div>

									<form class="form-inline" role="form">

										<fieldset>
											<div class="form-group">
												<label class="sr-only" for="exampleInputEmail2">Email
													address</label> <input type="email" class="form-control"
													id="exampleInputEmail2" placeholder="Enter email">
											</div>
											<div class="form-group">
												<label class="sr-only" for="exampleInputPassword2">Password</label>
												<input type="password" class="form-control"
													id="exampleInputPassword2" placeholder="Password">
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="checkbox">
													<span>Remember me </span></label>
											</div>
											<button type="submit" class="btn btn-primary">Sign
												in</button>
										</fieldset>

									</form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

					</article>
					<!-- WIDGET END -->

					<!-- NEW WIDGET START -->
					<article class="col-sm-12 col-md-12 col-lg-6">

						<!-- Widget ID (each widget will need unique ID)-->
						
						<!-- end widget -->

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-3"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-eye-slash"></i>
								</span>
								<h2>Disabled Horizontal Form</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<form>
										<fieldset>
											<input name="authenticity_token" type="hidden">
											<div class="form-group">
												<label>Text field</label> <input class="form-control"
													disabled="disabled" placeholder="Text field" type="text">
											</div>
											<div class="form-group">
												<label>Password field</label> <input class="form-control"
													disabled="disabled" placeholder="Password" type="password"
													value="mypassword">
											</div>
											<div class="form-group">
												<label>Textarea</label>
												<textarea class="form-control" disabled="disabled"
													placeholder="Textarea" rows="3"></textarea>
											</div>
											<div class="form-group">
												<label>Readonly</label> <span class="form-control">Read
													only text</span>
											</div>
										</fieldset>
										<div class="form-actions">
											<button class="btn btn-primary btn-lg" disabled="disabled">
												<i class="fa fa-save"></i> Submit
											</button>
										</div>

									</form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-5"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-eye-slash"></i>
								</span>
								<h2>Inline Form Disabled</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<div class="alert adjusted alert-warning fade in">
										<button class="close" data-dismiss="alert">×</button>
										<i class="fa fa-fw fa-lg fa-exclamation"></i> <strong>Hey
											hey!</strong> I am disabled!
									</div>

									<form class="form-inline" role="form">

										<fieldset>
											<div class="form-group">
												<label class="sr-only">Email address</label> <input
													type="email" class="form-control" disabled="disabled"
													placeholder="Enter email">
											</div>
											<div class="form-group">
												<label class="sr-only">Password</label> <input
													type="password" class="form-control" disabled="disabled"
													placeholder="Password">
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="checkbox"
													disabled="disabled"> <span>Remember me </span></label>
											</div>
											<button type="submit" disabled="disabled"
												class="btn btn-primary">Sign in</button>
										</fieldset>
									</form>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

					</article>
					<!-- WIDGET END -->

				</div>

				<!-- end row -->

				<!-- row -->
				<div class="row">

					<!-- NEW WIDGET START -->
					<article class="col-sm-12">

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-8"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-columns"></i>
								</span>
								<h2>Column sizing</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<div class="row">
										<div class="col-sm-12">
											<input type="text" class="form-control"
												placeholder=".col-sm-12">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-6">
											<input type="text" class="form-control"
												placeholder=".col-sm-6">
										</div>
										<div class="col-sm-6">
											<input type="text" class="form-control"
												placeholder=".col-sm-6">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-6">
											<input type="text" class="form-control"
												placeholder=".col-sm-6">
										</div>
										<div class="col-sm-3">
											<input type="text" class="form-control"
												placeholder=".col-sm-3">
										</div>
										<div class="col-sm-3">
											<input type="text" class="form-control"
												placeholder=".col-sm-3">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-3">
											<input type="text" class="form-control"
												placeholder=".col-sm-3">
										</div>
										<div class="col-sm-3">
											<input type="text" class="form-control"
												placeholder=".col-sm-3">
										</div>
										<div class="col-sm-6">
											<input type="text" class="form-control"
												placeholder=".col-sm-6">
										</div>

									</div>

									<hr>

									<div class="row">
										<div class="col-sm-4">
											<input type="text" class="form-control"
												placeholder=".col-sm-4">
										</div>
										<div class="col-sm-4">
											<input type="text" class="form-control"
												placeholder=".col-sm-4">
										</div>
										<div class="col-sm-4">
											<input type="text" class="form-control"
												placeholder=".col-sm-4">
										</div>

									</div>

									<hr>

									<div class="row">
										<div class="col-sm-2">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
										<div class="col-sm-2">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
										<div class="col-sm-2">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
										<div class="col-sm-2">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
										<div class="col-sm-2">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
										<div class="col-sm-2">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
									</div>

								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

					</article>
					<!-- WIDGET END -->

				</div>
				<!-- end row -->

				<!-- row -->
				<div class="row">

					<!-- NEW WIDGET START -->
					<article class="col-sm-12 col-md-12 col-lg-6">

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-9"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-columns"></i>
								</span>
								<h2>Right Aligned</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<div class="row">
										<div class="col-sm-2 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-3 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-3">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-4 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-4">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-5 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-5">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-6 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-6">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-7 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-7">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-8 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-8">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-9 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-9">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-10 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-10">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-11 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-11">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-12 pull-right">
											<input type="text" class="form-control"
												placeholder=".col-sm-12">
										</div>
									</div>



								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

					</article>
					<!-- WIDGET END -->

					<!-- NEW WIDGET START -->
					<article class="col-sm-12 col-md-12 col-lg-6">

						<!-- Widget ID (each widget will need unique ID)-->
						<div class="jarviswidget" id="wid-id-10"
							data-widget-colorbutton="false" data-widget-editbutton="false">
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
							<header>
								<span class="widget-icon"> <i class="fa fa-columns"></i>
								</span>
								<h2>Left Align</h2>

							</header>

							<!-- widget div-->
							<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->

								</div>
								<!-- end widget edit box -->

								<!-- widget content -->
								<div class="widget-body">

									<div class="row">
										<div class="col-sm-2 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-2">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-3 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-3">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-4 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-4">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-5 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-5">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-6 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-6">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-7 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-7">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-8 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-8">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-9 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-9">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-10 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-10">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-11 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-11">
										</div>
									</div>

									<hr>

									<div class="row">
										<div class="col-sm-12 pull-left">
											<input type="text" class="form-control"
												placeholder=".col-sm-12">
										</div>
									</div>



								</div>
								<!-- end widget content -->

							</div>
							<!-- end widget div -->

						</div>
						<!-- end widget -->

					</article>
					<!-- WIDGET END -->

				</div>
				<!-- end row -->


			</section>
			<!-- end widget grid -->

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
	<div id="shortcut">
		<ul>
			<li><a href="inbox.html"
				class="jarvismetro-tile big-cubes bg-color-blue"> <span
					class="iconbox"> <i class="fa fa-envelope fa-4x"></i> <span>Mail
							<span class="label pull-right bg-color-darken">14</span>
					</span>
				</span>
			</a></li>
			<li><a href="calendar.html"
				class="jarvismetro-tile big-cubes bg-color-orangeDark"> <span
					class="iconbox"> <i class="fa fa-calendar fa-4x"></i> <span>Calendar</span>
				</span>
			</a></li>
			<li><a href="gmap-xml.html"
				class="jarvismetro-tile big-cubes bg-color-purple"> <span
					class="iconbox"> <i class="fa fa-map-marker fa-4x"></i> <span>Maps</span>
				</span>
			</a></li>
			<li><a href="invoice.html"
				class="jarvismetro-tile big-cubes bg-color-blueDark"> <span
					class="iconbox"> <i class="fa fa-book fa-4x"></i> <span>Invoice
							<span class="label pull-right bg-color-darken">99</span>
					</span>
				</span>
			</a></li>
			<li><a href="gallery.html"
				class="jarvismetro-tile big-cubes bg-color-greenLight"> <span
					class="iconbox"> <i class="fa fa-picture-o fa-4x"></i> <span>Gallery
					</span>
				</span>
			</a></li>
			<li><a href="profile.html"
				class="jarvismetro-tile big-cubes selected bg-color-pinkDark"> <span
					class="iconbox"> <i class="fa fa-user fa-4x"></i> <span>My
							Profile </span>
				</span>
			</a></li>
		</ul>
	</div>
	<!-- END SHORTCUT AREA -->

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