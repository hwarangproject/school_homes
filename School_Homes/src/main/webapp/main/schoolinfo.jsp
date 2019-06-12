<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>

/* 파이차트 */
#chartdiv {
	width		: 100%;
	height		: 300px;
	font-size	: 11px;
}

/* =============== */
html, body {height: 100%;}

.container {
  display: grid;
  grid-gap: 5px;
  
  grid-template-columns: 20% 30% 30% 20%;
  grid-template-rows: 70px 400px 200px 200px 300px 100px ; 
}

.item {
  border: 2px solid transparent;/*transparent; grey; */
  font-size: 17px;
  text-align: center;
}
.item-aa{
  grid-column-start: 2.5;
  grid-column-end: 3.5;
  grid-row-start: 1;
  grid-row-end: 1.5;
}
.item-f{
  grid-column-start: 1;
  grid-column-end: 5;
  grid-row-start: 1;
  grid-row-end: 1.5;
}
.item-c {
  grid-column-start: 1;
  grid-column-end: 5;
  grid-row-start: 1.5;
  grid-row-end: 2.5;  
}

.item-d {
  grid-column-start: 1;
  grid-column-end: 3;
  grid-row-start: 1.5;
  grid-row-end: 2.5;
}

.item-e {
  grid-column-start: 3;
  grid-column-end: 5;
  grid-row-start: 2.5;
  grid-row-end: 3.5;
}
.item-z {
  grid-column-start: 3;
  grid-column-end: 5;
  grid-row-start: 3.5;
  grid-row-end: 4.5;
}
.item-i {
  grid-column-start: 1;
  grid-column-end: 3;
  grid-row-start: 3.5;
  grid-row-end: 5;
}
.item-zz {
  grid-column-start: 1;
  grid-column-end: 3;
  grid-row-start: 5;
  grid-row-end: 6.5;
}

</style>
<title>Insert title here</title>
<script src="https://www.amcharts.com/lib/3/amcharts.js"></script>
<script src="https://www.amcharts.com/lib/3/pie.js"></script>
<script src="https://www.amcharts.com/lib/3/themes/light.js"></script>
<script type="text/javascript">
var chart = AmCharts.makeChart( "chartdiv", {
	  "type": "pie",
	  "theme": "light",
	  "dataProvider": [{"total":${vo.COLLEGE_TOTAL},"cate":"대학 진학자 수"},{"total":${vo.HIRED_TOTAL},"cate":"취업자 수"},{"total":${vo.OTHER_TOTAL},"cate":"기타"}],
	  "valueField": "total",
	  "titleField": "cate",
	   "balloon":{
	   "fixedPosition":true
	  },
	  "export": {
	    "enabled": true
	  }
	} );
</script>
</head>
<body>
  <!-- school rate  -->
  <div class="chart-content panel" id="print_schoolinfo">
    <div class="card-header">학교정보</div><br>
     <c:forEach var="vo" items="${schlist }" varStatus="i">
      <div class="container">
        <div class="item item-f">${vo.SCHOOLNAME } &nbsp;${seoullist[0].SCHOOL_RANK }위(상위 ${seoullist[0].SCHOOL_RANGE } )</div>
        <div class="item item-c">
                    총 졸업생 ${vo.GRADUATE_TOTAL }명<br>
          <div id="chartdiv"></div>
        </div>
        
 		<div class="item item-d">졸업생 수<br>
 		  남자:${vo.GRADUATE_MALE }명<br>
 		  여자:${vo.GRADUATE_FEMALE }명 <br>
 		   총  :${vo.GRADUATE_TOTAL }명 <br>
 		</div>
 		<div class="item item-e">대학교 진학 학생 수<br>
 		  남자:${vo.COLLEGE_MALE }명<br>
 		  여자:${vo.COLLEGE_FEMALE }명<br>
 		   총  :${vo.COLLEGE_TOTAL }명<br>
 		  대학교 진학률:${vo.COLLEGE_TOTAL_RATIO }%
 		</div>
 		<div class="item item-i">취업자 현황<br>
 		 남자:${vo.HIRED_MALE }명<br>
 		 여자:${vo.HIRED_FEMALE }명<br>
 		 총 취업자:${vo.HIRED_TOTAL }명<br>
 		 총 취업률:${vo.HIRED_TOTAL_RATIO }%
 		</div>
  		<div class="item item-z">기타<br>
  		남자:${vo.OTHER_MALE }명<br>
  		여자:${vo.OTHER_FEMALE }명<br>
  		총:${vo.OTHER_TOTAL }명<br>
  		기타 비율:${vo.OTHER_TOTAL_RATIO }%
  		</div>
  		
  		
  		<div class="item item-zz">서울대 입학생 수<br>
  		수시:${seoullist[0].ADMISSION_EARLY }명<br>
  		정시:${seoullist[0].ADMISSION_REGULAR }명<br>
  		총:${seoullist[0].ADMISSION_TOTAL }명<br>
  		</div>
      </div>
     </c:forEach>
     
  </div>
</body>
</html>