<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script type="text/javascript">
function ShowSliderValue(sVal)
{
	var obValueView = document.getElementById("slider_value_view");
	obValueView.innerHTML = sVal
}

    var RangeSlider = function(){
	var range = $('.slider_range');
    
	range.on('input', function(){		
		ShowSliderValue(this.value);
	});
};

RangeSlider();

$(function(){
/* 	$('#keyword').keyup(function(){
		var k=$('#keyword').val();
		$('#user_table>tbody>tr').hide();
		var temp=$('#user_table>tbody>tr>td:nth-child(4n+2):contains("'+k+'")');
		$(temp).parent().show();
	}); */
	 var availableCity = <%= request.getAttribute("list")%>;

	    $("#keyword").autocomplete({	    	
	        source: availableCity,
	        select: function(event, ui) {
	            console.log(ui.item);
	        },

	        focus: function(event, ui) {
	            return false;
	            //event.preventDefault();
	        }
	    });
	    // $('.h5').text();
});

</script>
</head>
<body>
  <!-- recommend -->
	<div class="chart-content panel" id="print_recommand">
		<div class="card-header">아파트 추천</div>
		<div class="container-fluid">
			<div class="content" id="rec_header">
				<h1 class="h3 mb-0 text-gray-800">나에게 딱 맞는 아파트는?</h1>
				<p class="mb-4">지금 내 상황에 적합한 아파트들을 추천해 드립니다. 추천받은 아파트를 중심으로 아파트를
					탐색해보세요.</p>
			</div>
			<div class="card -mb4">
				<div class="card-body">
					<div class="h5 mb-0 font-weight-bold text-gray-800">최대 예산</div>
					<input class="slider_range" id="slider" value="0" type="range" min="5000000" max="8100000000" step="100">
					<font size=2 id="slider_value_view">0</font>
				</div>
				
			</div>
			<div class="card -mb4">
				<div class="card-body">
					<div class="h5 mb-0 font-weight-bold text-gray-800">지역</div>
					<p class="mb-4">선택한 지역을 기준으로 추천해 드립니다</p>
					<div class="input-group">
		              <input type="text" id="keyword" class="form-control bg-light border-0 small" placeholder="동을 입력하세요" autocomplete="on">
		              <div class="input-group-append">
		                <button class="btn btn-gray" type="button">
		                  <i class="fas fa-search fa-sm"></i>
		                </button>
		              </div>
		            </div>

				</div>
			</div>
			<div class="card -mb4">
				<div class="card-body">
					
					<div class="h5 mb-0 font-weight-bold text-gray-800">최소 평형</div>	
					 
					
				</div>
				
			</div>
			<div class="btn-container">
			  <div class="btn btn-primary">다음</div>
			</div>
		</div>
	</div>
</body>
</html>