<%@ include file="/WEB-INF/jsp/include/tags.jsp"%>

<div class="nav-bar-container">
	<div class="nav-menu">
		<div class="hamburger">
			<span class="patty"></span><span class="patty"></span>
			<span class="patty"></span><span class="patty"></span>
			<span class="patty"></span><span class="patty"></span>
		</div>
	</div>
	<div class="nav-search"><span class="search"></span></div>
	<div class="nav-bar-border"></div>
	<div class="overlay">
		<div class="starting-point"><span></span></div>
		<div class="logo">Suburb+</div>
	</div>
	<div class="overlay-secondary"></div>
</div>

<div class="layer-container">
	<div class="menu-layer">
		<ul>
			<li data-open-after="true"><a href="/suburb/DemoHome.action">Home</a></li>
			<li data-open-after="true"><a href="/suburb/DemoTopTen.action">Top 10</a></li>
			<li data-open-after="true"><a href="/suburb/DemoCompareSuburbs.action">Compare Suburbs</a></li>
		</ul>
	</div>
	<div class="search-layer">
		<div class="search">
			<div class="form-group">
				<input type="text" id="ft-suburb-search-input" class="form-control"
					placeholder="type Auckland suburb name search...">
				<button type="submit" class="btn btn-default disabled">
					<i class="fa fa-search"></i>
				</button>
			</div>
		</div>
		<div class="results">
			<div class="row">
				<div class="col-md-4">
					<div id="ft-suburb-search-results" class="result result-users">
					</div>
				</div>
			</div>
		</div>
	</div>
</div>