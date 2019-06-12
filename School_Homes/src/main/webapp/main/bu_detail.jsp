<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);

      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
          ['Month', 'Bolivia', 'Ecuador', 'Madagascar', 'Papua New Guinea', 'Rwanda', 'Average'],
          ['2004/05',  165,      938,         522,             998,           450,      614.6],
          ['2005/06',  135,      1120,        599,             1268,          288,      682],
          ['2006/07',  157,      1167,        587,             807,           397,      623],
          ['2007/08',  139,      1110,        615,             968,           215,      609.4],
          ['2008/09',  136,      691,         629,             1026,          366,      569.6]
        ]);

        var options = {
          title : 'Monthly Coffee Production by Country',
          vAxis: {title: 'Cups'},
          hAxis: {title: 'Month'},
          seriesType: 'bars',
          series: {5: {type: 'line'}}
        };

        var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    </script> -->
<style type="text/css">	
.avg_container{
	display: flex;
	justify-content: space-evenly;
} 
.deal_avg{
 	margin: 18px 0px;
}
.avg{
	margin-top: 0px;
	margin-bottom: 12px;
}
.det_header{
	background-color: #fff;
	border-bottom-width: 4px;
	display: flex;
	justify-content: space-between;
}
.dong_container{
	display: flex;
}
.dong{
	margin: 0px;
}
.dong_sub{
	font-size: 10px;
}
</style>
</head>
<body>
  <!-- recommend -->
	<div class="chart-content panel" id="print_bu_detail">
		<div class="card-header">부동산 종합정보</div>
		<div class="card-header det_header">
		  <div class="dong_container">
		    <div class="dong_row">
		      <p class="dong">작전동</p>
		      <span class="dong_sub">73개의 아파트 실거래가 평균</span>
		    </div>
		    <div class="dong_row">
		      <p class="dong"><b>1.8억</b></p>
		    </div>
		  </div>
		  <div class="year_container">
		    <div>
		      <p class="dong">설립일자</p>
		      <span class="dong_sub">1996년 12월(24년차)</span>
		    </div>
		  </div> 
		</div>
		<div class="container-fluid ">
		  <div class="avg_container">
		    <div class="deal_avg">			
	          <p class="avg">3달 전 실거래 평균</p>
		      <h1 class="h3 mb-0 text-gray-800">3억 4,600</h1>
		    </div>
		    <div class="deal_avg">			
	          <p class="avg">최근 1개월 매물 평균</p>
		      <h1 class="h3 mb-0 text-gray-800">3억 4,933</h1>
		    </div>
		  </div>
			<div class="card -mb4">
				<div class="card-body">
					<div class="h5 mb-0 font-weight-bold text-gray-800">30평대 지역 실거래가 비교</div>
					<div id="chart_div" style="width: 400px; height: 200px;"></div>
				</div>				
			</div>		
		</div>
		<hr style="border-width: 4px;">
	</div>
</body>
</html>
