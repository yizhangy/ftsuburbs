<%@ include file="/WEB-INF/jsp/include/NewStyle.jsp"%>
<body id="suburb">
	<%@ include file="/WEB-INF/jsp/include/NewHeader.jsp"%>
	<div class="content suburb">
		<div class="page-header full-content">
			<div class="row">
				<div class="col-sm-6">
					<h1>Auckland Top 10 Suburbs <small>Suburb+</small></h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb">
						<li><a href="/suburb/DemoHome.action" class="active"><i class="fa fa-home"></i> Home</a></li>
					</ol>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-4">
				<div class="card card-pricing card-pricing-justified indigo">
					<div class="card-heading" id="ft-family-income-heading">
						<h4><i class="fa fa-usd"></i> Top Annual Family Income</h4>
					</div>
					<div class="card-body">
						<ul class="pricing-features pricing-features-hover">
							<c:forEach var="suburb" items="${actionBean.topIncomes}">
								<li>
									<a href="/suburb/Demo.action?areaCode=${suburb.areaCode}">${suburb.name}</a> <span class="feature">${suburb.valueAsMoneyFormat}</span>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-pricing card-pricing-justified">
					<div class="card-heading" id="ft-rental-price-heading">
						<h4><i class="fa fa-home"></i> Top Weekly Home Rental Price</h4>
					</div>
					<div class="card-body">
						<ul class="pricing-features pricing-features-hover">
							<c:forEach var="suburb" items="${actionBean.topRental}">
								<li>
									<a href="/suburb/Demo.action?areaCode=${suburb.areaCode}">${suburb.name}</a> <span class="feature">${suburb.valueAsMoneyFormat}</span>
									</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-pricing card-pricing-justified">
					<div class="card-heading" id="ft-education-heading">
						<h4><i class="fa fa-graduation-cap"></i> Top Tertiary Education</h4>
					</div>
					<div class="card-body">
						<ul class="pricing-features pricing-features-hover">
							<c:forEach var="suburb" items="${actionBean.higherQualification}">
								<li>
									<a href="/suburb/Demo.action?areaCode=${suburb.areaCode}">${suburb.name}</a> <span class="feature">${suburb.value} <i class="fa fa-user"></i></span>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-pricing card-pricing-justified">
					<div class="card-heading" id="ft-total-population-heading">
						<h4><i class="fa fa-user"></i> Top Total Population</h4>
					</div>
					<div class="card-body">
						<ul class="pricing-features pricing-features-hover">
							<c:forEach var="suburb" items="${actionBean.topPopulation}">
								<li>
									<a href="/suburb/Demo.action?areaCode=${suburb.areaCode}">${suburb.name}</a> <span class="feature">${suburb.value} <i class="fa fa-user"></i></span>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-pricing card-pricing-justified">
					<div class="card-heading" id="ft-maori-population-heading">
						<h4><i class="fa fa-anchor"></i> Top Total Maori Population</h4>
					</div>
					<div class="card-body">
						<ul class="pricing-features pricing-features-hover">
							<c:forEach var="suburb" items="${actionBean.topMaoriPopulation}">
								<li>
									<a href="/suburb/Demo.action?areaCode=${suburb.areaCode}">${suburb.name}</a> <span class="feature">${suburb.value} <i class="fa fa-user"></i></span>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-pricing card-pricing-justified">
					<div class="card-heading" id="ft-multi-culture-heading">
						<h4><i class="fa fa-group"></i> Top Multi-Culture</h4>
					</div>
					<div class="card-body">
						<ul class="pricing-features pricing-features-hover">
							<c:forEach var="suburb" items="${actionBean.topMultiCulture}">
								<li>
									<a href="/suburb/Demo.action?areaCode=${suburb.areaCode}">${suburb.name}</a></span>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>
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
		});
	</script>
</body>
</html>