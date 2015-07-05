<%@ include file="/WEB-INF/jsp/include/NewStyle.jsp"%>
<body id="suburb">
	<%@ include file="/WEB-INF/jsp/include/NewHeader.jsp"%>
	<div class="content suburb">
		<div class="page-header full-content">
			<div class="row">
				<div class="col-sm-6">
					<h1>${actionBean.suburb.baseInfo.areaName} <small>Suburb+</small></h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb">
						<li><a href="/suburb/DemoHome.action" class="active"><i class="fa fa-home"></i> Home</a></li>
					</ol>
				</div>
			</div>
		</div>
		<div class="display-animation">
			<div class="row image-row">
				<div class="col-md-8">
					<div class="row image-row">
						<div class="col-sm-8">
							<div
								class="card tile card-green card-weather bg-image material-animate sample-bg-image15">
								<div class="card-heading">
									<div class="card-action"></div>
								</div>
								<div class="card-body">
									<div class="forecast-container">
										<span class="temparature">${actionBean.suburb.baseInfo.areaName}</span>
										<span class="place"><!--  North Shore, -->
											${actionBean.suburb.baseInfo.territorialAuthorityDescription}</span>
										<span class="forecast">${actionBean.suburb.baseInfo.localBoardDescription}</span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-4 quick-stat">
							<!-- Population  -->
							<div class="card card-dashboard-info card-blue">
								<div class="card-body">
									<div class="card-icon">
										<i class="fa fa-user"></i>
									</div>
									<h4>Total Population</h4>
									<p class="result">${actionBean.suburb.population.totalPopulation}</p>
									<small></small>
								</div>
							</div>
							<div class="card card-dashboard-info card-green">
								<div class="card-body">
									<div class="card-icon">
										<i class="fa fa-usd"></i>
									</div>
									<h4>Avg. Family Income</h4>
									<p class="result">${actionBean.suburb.family.totalFamilyMedianIncomeWithFormat}</p>
									<small></small>
								</div>
							</div>
							<div class="card card-dashboard-info card-orange">
								<div class="card-body">
									<div class="card-icon">
										<i class="fa fa-home"></i>
									</div>
									<h4>Avg. Weekly Home Rental</h4>
									<p class="result">${actionBean.suburb.household.averageWeeklyRentalWithFormat}</p>
									<small></small>
								</div>
							</div>
							<!-- Education -->
							<div class="card card-dashboard-info card-purple">
								<div class="card-body">
									<div class="card-icon">
										<i class="fa fa-graduation-cap"></i>
									</div>
									<h4>Tertiary Degree Population</h4>
									<p class="result">${actionBean.suburb.education.tertiaryPopulation }</p>
									<small></small>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="row image-row">
						<div class="col-md-12">
							<div class="card tile card-light-blue card-image material-animate">
								<div id="boundary" class="example-map">No Map Boundary Information</div>
							</div>
							<!--.card-->
						</div>
					</div>
				</div>
			</div>
		</div>

		<%-- <div class="row">
			<div class="col-md-12">
				<div class="panel panel-with-shadow indigo">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Overview</h4>
						</div>
					</div>
					<!--.panel-heading-->
					<div class="panel-body">
						<p>${actionBean.suburb.customizedInfo.summary}</p>
					</div>
				</div>
			</div>
		</div> --%>

		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-with-shadow blue">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Dwelling</h4>
						</div>
					</div>
					<div class="panel-body" id="dwelling-chart"></div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-with-shadow light-blue">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Family Income</h4>
						</div>
					</div>
					<div class="panel-body" id="income-chart"></div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-with-shadow cyan">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Occupation</h4>
						</div>
					</div>
					<div class="panel-body" id="occupation-chart"></div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-with-shadow teal">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Ethnicity</h4>
						</div>
					</div>
					<!--.panel-heading-->
					<div class="panel-body" id="ethnicity-chart"></div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-with-shadow green">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Education</h4>
						</div>
					</div>
					<div class="panel-body" id="education-chart"></div>
				</div>
			</div>
			<!--.col-->
			<div class="col-md-6">
				<div class="panel panel-with-shadow light-green">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Religion</h4>
						</div>
					</div>
					<div class="panel-body" id="religion-chart"></div>
				</div>
			</div>
		</div>

		<%-- <div class="row">
			<div class="col-md-12">
				<div class="panel panel-with-shadow">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Education</h4>
						</div>
					</div>
					<!--.panel-heading-->
					<div class="panel-body">
						<p></p>
					</div>
				</div>
			</div>
		</div> --%>

		<div class="footer-links margin-top-40">
			<div class="row no-gutters bg-blue">
				<div class="col-xs-6"></div>
				<div class="col-xs-6"></div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/jsp/include/NewScript.jsp"%>
	
	<script type="text/javascript">
		$(document).ready(function () {
			Pleasure.init();
			Layout.init();
			SuburbSearch.init();
		
			// Index.init();
			// WidgetAudio.single();
			// ChartsKnob.init();
			<c:if test="${actionBean.suburb.baseInfo.defaultLatLon != ''}">
				var map = new google.maps.Map(document.getElementById('boundary'), {
				    zoom: 12,
				    center: ${actionBean.suburb.baseInfo.defaultLatLon},
				    disableDefaultUI: true,
				    draggable: true,
				    zoomControl: false,
				    disableDoubleClickZoom: true,
				    scrollwheel: true
				});
				map.set('styles', [{"featureType":"water","stylers":[{"saturation":43},{"lightness":-11},{"hue":"#0088ff"}]},{"featureType":"road","elementType":"geometry.fill","stylers":[{"hue":"#ff0000"},{"saturation":-100},{"lightness":99}]},{"featureType":"road","elementType":"geometry.stroke","stylers":[{"color":"#808080"},{"lightness":54}]},{"featureType":"landscape.man_made","elementType":"geometry.fill","stylers":[{"color":"#ece2d9"}]},{"featureType":"poi.park","elementType":"geometry.fill","stylers":[{"color":"#ccdca1"}]},{"featureType":"road","elementType":"labels.text.fill","stylers":[{"color":"#767676"}]},{"featureType":"road","elementType":"labels.text.stroke","stylers":[{"color":"#ffffff"}]},{"featureType":"poi","stylers":[{"visibility":"off"}]},{"featureType":"landscape.natural","elementType":"geometry.fill","stylers":[{"visibility":"on"},{"color":"#b8cb93"}]},{"featureType":"poi.park","stylers":[{"visibility":"on"}]},{"featureType":"poi.sports_complex","stylers":[{"visibility":"on"}]},{"featureType":"poi.medical","stylers":[{"visibility":"on"}]},{"featureType":"poi.business","stylers":[{"visibility":"simplified"}]}]);
				// Construct the polygon.
				var boundaryOptions = {
						strokeColor: '#D31C0E',
						strokeWeight: 1,
						fillColor: '#D31C0E',
						fillOpacity: 0.5
				};
				var myGoogleVector = new GeoJSON(${actionBean.suburb.baseInfo.boundaryData}, boundaryOptions);
				if (myGoogleVector.error){
				    throw "Error parse coordinates";
				} else{
					myGoogleVector.setMap(map);
				}
			</c:if>
			                  
		});
		
		google.load('visualization', '1.0', {'packages':['corechart', 'treemap']});
	      google.setOnLoadCallback(drawChart);
	      function drawChart() {
			// Set chart options
	        var options = {'title':'', 'chartArea' : {width : '40%'}};

	        var dwelingData = google.visualization.arrayToDataTable([
	          ['Task', 'Private Owned Dwelling'], ${actionBean.suburb.dwelling.privateDwellingsData}
	        ]);
	        var chart = new google.visualization.PieChart(document.getElementById('dwelling-chart'));
	        chart.draw(dwelingData, options);
	        
	        // Income
	        var incomeData = google.visualization.arrayToDataTable([
	          ['Task', 'Income'], ${actionBean.suburb.family.incomeData}
	        ]);
	        chart = new google.visualization.BarChart(document.getElementById('income-chart'));
	        chart.draw(incomeData, options);
	        
	        var chart = new google.visualization.PieChart(document.getElementById('occupation-chart'));
	        chart.draw(dwelingData, options);

	        // Ethnicity
	        var ethnicData = google.visualization.arrayToDataTable([
	          ['Task', 'Ethnicity'], ${actionBean.suburb.population.ethnicData}
	        ]);
	        var chart = new google.visualization.BarChart(document.getElementById('ethnicity-chart'));
	        chart.draw(ethnicData, options);
	        
	        // Education
			var educationData = google.visualization.arrayToDataTable([
			  ['Task', 'Education'], ${actionBean.suburb.education.educationData}
			]);
	        var chart = new google.visualization.BarChart(document.getElementById('education-chart'));
	        chart.draw(educationData, options);
	        
	     	// Religion
			var religionData = google.visualization.arrayToDataTable([
			  ['Task', 'Religion'], ${actionBean.suburb.religion.religionData}
			]);
	        var chart = new google.visualization.BarChart(document.getElementById('religion-chart'));
	        chart.draw(religionData, options);
	      }
	</script>
</body>
</html>
