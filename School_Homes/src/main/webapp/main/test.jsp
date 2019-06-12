<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>다음 지도 시작하기</title>
<style>
    .wrap {position: absolute;left: 0;bottom: 40px;width: 280px;height: 132px;margin-left: -144px;text-align: left;overflow: hidden;font-size: 12px;font-family: 'Malgun Gothic', dotum, '돋움', sans-serif;line-height: 1.5;}
    .wrap * {padding: 0;margin: 0;}
    .wrap .info {width: 286px;height: 120px;border-radius: 5px;border-bottom: 2px solid #ccc;border-right: 1px solid #ccc;overflow: hidden;background: #fff;}
    .wrap .info:nth-child(1) {border: 0;box-shadow: 0px 1px 2px #888;}
    .info .title {padding: 5px 0 0 10px;height: 30px;background: #eee;border-bottom: 1px solid #ddd;font-size: 18px;font-weight: bold;}
    .info .close {position: absolute;top: 10px;right: 10px;color: #888;width: 17px;height: 17px;background: url('http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/overlay_close.png');}
    .info .close:hover {cursor: pointer;}
    .info .body {position: relative;overflow: hidden;}
    .info .desc {position: relative;margin: 13px 0 0 90px;height: 75px;}
    .desc .ellipsis {overflow: hidden;text-overflow: ellipsis;white-space: nowrap;}
    .desc .jibun {font-size: 11px;color: #888;margin-top: -2px;}
    .info .img {position: absolute;top: 6px;left: 5px;width: 73px;height: 71px;border: 1px solid #ddd;color: #888;overflow: hidden;}
    .info:after {content: '';position: absolute;margin-left: -12px;left: 50%;bottom: 0;width: 22px;height: 12px;background: url('http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/vertex_white.png')}
    .info .link {color: #5085BB;}
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
</head>
<body>

	<div id="map" style="width: 100%; height: 980px;"></div>

	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=401147ea060ab849ab02edb7408de18e&libraries=services"></script>
	<script>
	
	
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center : new daum.maps.LatLng(36.0859751, 129.3847215), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		// 지도를 생성합니다    
		var map = new daum.maps.Map(mapContainer, mapOption);
		// 주소-좌표 변환 객체를 생성합니다
		var geocoder = new daum.maps.services.Geocoder();

		/*  var myAddress = [
		         "서울특별시 강서구 수명로2길 " 
		          "상당구 수영로246번길 32-2", 
		         "흥덕구 가로수로 1337",
		         "흥덕구 복대로118번길 3"  ]; 
			 var myAddress = request.getParameter("aptlist");
		 */
			
		var schooladdress= '인천광역시 계양구 주부토로 588"';
		
		var myAddress = $.parseJSON('<%=request.getAttribute("json")%>');
		alert(myAddress.length);
	
		
		
	
		var overlay  = new Array();;
		
		function myMarker(number, address) {
			// 주소로 좌표를 검색합니다
			geocoder.addressSearch(
							//'충북 청주시 흥덕구 진재로 30 연정빌딩',
							address,
							function(result, status) {
								// 정상적으로 검색이 완료됐으면 
								if (status === daum.maps.services.Status.OK) {

									var coords = new daum.maps.LatLng(
											result[0].y, result[0].x);

									// 결과값으로 받은 위치를 마커로 표시합니다
									
									var marker = new daum.maps.Marker({
										map : map,
										position : coords
									});		

									// 인포윈도우로 장소에 대한 설명을 표시합니다

									var content;
									if(number >0)
									{
												
										
									  content = '<div class="wrap">' + 
							            '    <div class="info">' + 
							            '        <div class="title">' + 
							            '            '+myAddress[number-1].off_name+  
							            '            <div class="close" onclick="closeOverlay('+number+')" title="닫기"></div>' + 
							            '        </div>' + 
							            '        <div class="body">' + 
							            //'             <div class="img">' +
							           // '                <img src="http://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
							           // '           </div>' +  
							           // '            <div class="desc">' + 
							            '                <div class="ellipsis">&nbsp;&nbsp;'+address+'</div>' + 
							            '                <div class="jibun ellipsis">&nbsp;&nbsp;건축년도: '+myAddress[number-1].off_found_year+'년도</div>' + 
							            '                <div class="jibun ellipsis">&nbsp;&nbsp;가격:'+myAddress[number-1].off_price+'만원</div>' + 
							            '                <div class="jibun ellipsis">&nbsp;&nbsp;면적:'+myAddress[number-1].off_area+'평</div>' + 
							            '                <div><a href="http://www.kakaocorp.com/main" target="_blank" class="link">상세보기</a></div>' + 
							            //'            </div>' + 
							            '        </div>' + 
							            '    </div>' +    
							            '</div>';
									}
									 else if(number ==0) // 학교
									 {
										 
										 content = '<div class="wrap">' + 
								            '    <div class="info">' + 
								            '        <div class="title">' + 
								            '            ㅁㅁ고등학교'+  
								            '            <div class="close" onclick="closeOverlay('+number+')" title="닫기"></div>' + 
								            '        </div>' + 
								            '        <div class="body">' + 
								            '             <div class="img">' +
								            '                <img src="../main/img/school_img.jpg" width="73" height="70">' +
								            '           </div>' +  
								            '            <div class="desc">' + 
								            '                <div class="ellipsis">대전광역시 동구 신기로 71</div>' + 
								            '                <div class="jibun ellipsis">(우) 63309 (지번) 영평동 2181</div>' + 
								            '                <div><a href="http://www.kakaocorp.com/main" target="_blank" class="link">상세보기</a></div>' + 
								            '            </div>' + 
								            '        </div>' + 
								            '    </div>' +    
								            '</div>';
									 }
									
									
									// 커스텀 오버레이가 표시될 위치입니다 
									var position = new daum.maps.LatLng(
											result[0].y, result[0].x);

									// 커스텀 오버레이를 생성합니다
									overlay[number]  = new daum.maps.CustomOverlay(
											{
												map : map,
												position : marker.getPosition(),
												content : content
												/* yAnchor : 1 */
											});
									
									daum.maps.event.addListener(marker, 'click', function() {
									    overlay[number].setMap(map);
									});
									// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
									if(number==0)
									{
										map.setCenter(coords);
									}

								}
							});

		}
	

		for (i = 0; i < myAddress.length; i++) {

			myMarker(i + 1, myAddress[i].off_addr);
		} 
		myMarker(0, schooladdress);
		
		
		
		// 커스텀 오버레이를 닫기 위해 호출되는 함수입니다 
		function closeOverlay(number) {
		    overlay[number].setMap(null);     
		}
		
	

		
		
	</script>

</body>
</html>