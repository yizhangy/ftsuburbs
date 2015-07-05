<%@ include file="/WEB-INF/jsp/include/NewStyle.jsp"%>
<body id="suburb">
	<%@ include file="/WEB-INF/jsp/include/NewHeader.jsp"%>
	<div class="content suburb">
		<div class="page-header full-content">
			<div class="row">
				<div class="col-sm-9">
					<h1>Compare Suburbs <small>Suburb+</small></h1>
				</div>
				<div class="col-sm-3">
					<ol class="breadcrumb">
						<li><a href="/suburb/DemoHome.action" class="active"><i class="fa fa-home"></i> Home</a></li>
					</ol>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="card card-pricing card-pricing-justified indigo">
					<div class="card-heading">
						<h4>Compare Suburbs</h4>
					</div>
					<div class="card-body">
						<div  id="generate-report-graph" class="note note-primary note-top-striped">
							<h4>Find suburbs to compare</h4>
							<p>
							To compare your interested suburbs, please follow the simple steps
							</p>
							<ul>
								<li>1. Search and select more than two suburbs.</li>
								<li>2. Select a radio button from the suburb's category</li>
								<li>3. Click the COMPARE button.</li>
							</ul> 
						</div>
						
						<div class="form-group col-xs-4 input-wrapper">
							<input type="text" class="form-control" id="compared-suburbs-autocomplete" placeholder="Search a suburb"/>
							<div id="select-suburb-warning" role="alert" class="alert alert-warning hidden"><strong>Warning!</strong> Please search and select more than two suburbs to compare.</div>
						</div>
						<div id="compareBtContainer">
							<button id="comparebt" class="btn btn-primary btn-ripple" type="button">Compare</button>
						</div>
						<div id="compare-chart">
						</div>
						<div id="autoComplete-results">
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="suburbs-list-for-compare" class="row">	
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
			CompareSuburbs.init();
		
			// Index.init();
			// WidgetAudio.single();
			// ChartsKnob.init();                  
		});
	</script>
</body>
</html>