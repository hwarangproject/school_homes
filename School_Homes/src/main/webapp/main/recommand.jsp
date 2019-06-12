<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
					<input id="slider" type="range" min="100" max="500" step="10">
				</div>
				
			</div>
			<div class="card -mb4">
				<div class="card-body">
					<div class="h5 mb-0 font-weight-bold text-gray-800">지역</div>
					<p class="mb-4">선택한 지역을 기준으로 추천해 드립니다</p>
					<div class="input-group">
		              <input type="text" class="form-control bg-light border-0 small" placeholder="동을 입력하세요">
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
					 
					   <input type="radio" class="radio btn btn-gray" name="size" id="okay" value="okay"/> <label for="okay">상관없음</label>
					   <input type="radio" class="radio" name="size" id="up20" value="okay"/> <label for="up20">20평 이상</label>
					   <input type="radio" class="radio" name="size" id="up30" value="okay"/> <label for="up30">30평 이상</label>
					   <input type="radio" class="radio" name="size" id="up40" value="okay"/> <label for="up40">40평 이상</label>
					   <input type="radio" class="radio" name="size" id="up50" value="okay"/> <label for="up50">50평 이상</label>
					 
				</div>
				
			</div>
			<div class="btn-container">
			  <div class="btn btn-primary">다음</div>
			</div>
		</div>
	</div>
</body>
</html>