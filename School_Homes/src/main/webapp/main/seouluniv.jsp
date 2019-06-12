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
				<p class="mb-4" style="font-size: 14px">2018년도 서울대에 입학한 학생 수를 기준으로 한 순위입니다.</p>
			</div>
			<hr style="border-width: 2px; border-color: #909090">
			
			<!-- 스크롤 설정 -->
			<div class="table-responsive" style="overflow:auto; width:400px; height:700px;">
				<table class="table" id="dataTable">
					<c:forEach var="svo" items="${list }" varStatus="i">
						<c:if test="${i.index<100 }">
							<tr>
								<td class="h2 mb-0 text-gray-800 text-center" rowspan="3" width="25%" id="rank" align="center" valign="middle" 
									style="padding-top: 20px; font-size: 30px">
									${i.count }
								</td>
								<td class="mb-0 text-gray-800 text-center" rowspan="2" width="50%" width="25%" height="75%"  align="center" valign="middle" 
								style="font-size:13px; padding-top: 10px; padding-bottom: 5px; font-weight: bold">
									<!-- 학교 상세정보로 이동 -->
									<a href="#">${svo.schoolname }</a>									
								</td>
								<td class="mb-0 text-gray-800 text-center" rowspan="3" width="25%" 
								style="font-size:20px; padding-top: 20px" >
									${svo.admission_total }명
								</td>
							</tr>
		
							<tr>
								<!-- 표 설정을 위한 tr -->
							</tr>
							
							<tr>						
								<td class="mb-0 text-gray-800 text-center" style="font-size:10px">
									<!-- 학교 주소로 이동(지도) -->
									<a href="#">${blist[i.index].addr }</a>
								</td>					
							</tr>
						</c:if>
					</c:forEach>													
				</table>
			</div>
		</div>
	</div>

</body>
</html>