<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.rank-container {
	display: inline-block;
}

.rank{
text-align:center;
vertical-align:middle; 
display:flex; 
align-items:center;
width:100%;
}


</style>
</head>
<body>
	<!-- seouluniv -->
	<div class="chart-content panel" id="print_seouluniv">
		<div class="card-header">서울대 입결 순위</div>
		<div class="container-fluid">
			<div class="content" id="rec_header">
				<h1 class="h3 mb-0 text-gray-800">서울대 입결 순위</h1>
				<p class="mb-4" style="font-size: 14px">2018년에 서울대에 입학한 학생 수를
					기준으로 한 순위입니다.</p>
			</div>
			<hr style="border-width: 2px; border-color: #909090">
			<!-- <div class="-mb4">
		<div class="rank-container"> -->
			<div class="table-responsive">
				<table class="table" id="dataTable">
				 <c:forEach var="svo" items="${list }" varStatus="i">
						<c:if test="${i.index<10 }">
							<tr>
								<td class="h2 mb-0 text-gray-800 text-center" rowspan="3" width="25%" id="rank" align="center" valign="middle" 
									style="padding-top: 30px; font-size: 20px">
									${i.count }
								</td>
								<td class="mb-0 text-gray-800 text-center" rowspan="2" width="50%" width="25%" height="75%"  align="center" valign="middle" 
								style="font-size:15px; padding-top: 10px; padding-bottom: 5px">
									${svo.schoolname }
								</td>
								<td class="mb-0 text-gray-800 text-center" rowspan="3" width="25%" 
								style="font-size:15px; padding-top: 30px" >
									${svo.admission_total }
								</td>
							</tr>
		
							<tr>
								
							</tr>
							<!-- <tr>
								<td class="mb-0 text-gray-800 text-center" style="font-size:12px">아무거나</td>	
							</tr> -->
							<tr>						
								<td class="mb-0 text-gray-800 text-center" style="font-size:12px">${blist[i.index].addr }</td>					
							</tr>
						</c:if>
					</c:forEach> 													
				</table>

<!-- 		<div>
			 순위
			</div>
			<div>
			학교명
			</div>
			<div>
			명수
			</div> -->
			
		</div>
	</div>
	</div>

</body>
</html>