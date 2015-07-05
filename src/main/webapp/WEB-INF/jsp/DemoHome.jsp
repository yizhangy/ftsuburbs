<%@ include file="/WEB-INF/jsp/include/NewStyle.jsp"%>
<body id="suburb">
	<%@ include file="/WEB-INF/jsp/include/NewHeader.jsp"%>
	<div class="content suburb">
		<div class="page-header full-content parallax" style="height: 600px; overflow: hidden">
			<div class="parallax-bg" style="background: url('/suburb/static/demo/globals/img/auckland_city.jpg') 50% 50%; background-size: cover; width: 100%; height: 100%; position: absolute; left: 0; top: 0;">
			</div>

			<div class="row">
				<div class="col-sm-6">
					<h1>Suburb+ <small>Auckland</small></h1>
				</div><!--.col-->
				<div class="col-sm-6">
				</div><!--.col-->
			</div><!--.row-->
			
			
			<div class="profile-info">
				<div class="profile-photo">
					<img src="/suburb/static/demo/globals/img/govhack.png" />
				</div><!--.profile-photo-->
				<div class="profile-text light">New Zealand GovHack<span class="caption">Auckland Team</span>
				</div><!--.profile-text-->
			</div><!--.profile-info-->
		</div><!--.page-header-->
		
		<div class="row">
			<div class="col-md-4">
				<div class="panel panel-with-shadow indigo">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Introduction</h4>
						</div>
					</div>
					<div class="panel-body">
						Welcome to New Zealand GovHack Suburb+.<br />
						You can explore Auckland suburbs based on this site. We use 2013 New Zealand census data provided by
						New Zealand statistic department. We developed modern data visualization and aggregated the raw data to present
						Auckland suburbs characteristics and its own attributes. You can explore the suburb geography information, population,
						economics, dwelling, family, ethnicity groups and so on.<br />
						You can interact with Suburb+ Search, Top 10 and Compare Suburbs functions to get explicit view of each Auckland Suburb.<br />
						Enjoy!
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-with-shadow indigo">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Explore</h4>
						</div>
					</div>
					<div class="panel-body">
						
						
						<ul class="list-material">
							<li>
							<div class="list-content">
								<span class="title"><a href="/suburb/DemoTopTen.action" class="visible">Top 10 Suburbs</a></span>
								<span class="caption">Explore Auckland Top 10 Suburbs</span>
							</div>
							<div class="list-content">
								<span class="title"><a href="/suburb/DemoCompareSuburbs.action" class="visible">Compare Suburbs</a></span>
							</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-with-shadow indigo">
					<div class="panel-heading">
						<div class="panel-title">
							<h4>Team</h4>
						</div>
					</div>
					<div class="panel-body">
						<ul class="list-material">
							<li class="has-action-left">
								<a href="#" class="visible">
									<div class="list-action-left">
										<img src="/suburb/static/demo/globals/img/dev_avatar_2.jpg" class="face-radius" alt="">
									</div>
									<div class="list-content">
										<span class="title">Yizhang Ying</span>
										<span class="caption">Suburb+ Developer</span>
									</div>
								</a>
							</li>
							<li class="has-action-left">
								<a href="#" class="visible">
									<div class="list-action-left">
										<img src="/suburb/static/demo/globals/img/dev_avatar_1.jpg" class="face-radius" alt="">
									</div>
									<div class="list-content">
										<span class="title">Qing Dan</span>
										<span class="caption">Suburb+ Developer</span>
									</div>
								</a>
							</li>
							<li class="has-action-left">
								<a href="#" class="visible">
									<div class="list-action-left">
										<img src="/suburb/static/demo/globals/img/avatar-3.jpg" class="face-radius" alt="">
									</div>
									<div class="list-content">
										<span class="title">Qing Mi</span>
										<span class="caption">Suburb+ Digital Producer</span>
									</div>
								</a>
							</li>
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