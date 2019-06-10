<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.chart-content{
	width: 600px;
}

.sidebar #custom_sidebarToggle {
    width: 2.5rem;
    height: 2.5rem;
    text-align: center;
    margin-bottom: 1rem;
    cursor: pointer;
}
.sidebar #custom_sidebarToggle::after {
    font-weight: 900;
    content: '\f105';
    font-family: 'Font Awesome 5 Free';
    margin-right: .1rem;
}
#custom_sidebarToggle.changed::after {
    font-weight: 900;
    content: '\f104';
    font-family: 'Font Awesome 5 Free';
    margin-right: .1rem;
}

#custom_sidebarToggle.changed2::after {
    font-weight: 900;
    content: '\f105';
    font-family: 'Font Awesome 5 Free';
    margin-right: .1rem;
}
.sidebar-dark #custom_sidebarToggle {
    background-color: rgba(255,255,255,.2);
}

.sidebar-dark #custom_sidebarToggle::after {
    color: rgba(255,255,255,.5);
}

.mb-4{
	margin-top: 18px;
}
.card{
  margin-bottom: 15px;
}
#rec_header {
	padding-top: 18px;
}
#slider{
	width: 350px;
	margin-top: 15px;
}
.btn-container{
	text-align: center;
}
.btn-gray{
	background-color: #f8f9fc;
	border-color: #f8f9fc;
	color: #404040;
}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
var index=0;
$(function(){
	$('#print').hide();
	$('#custom_sidebarToggle').click(function(){
		if(index == 0)
		{
			$('#print').show();
			$('#custom_sidebarToggle').toggleClass('changed');
			index=1;
		}
		
		else
		{
			$('#print').hide();
			$('#custom_sidebarToggle').toggleClass('changed2');
			index=0;
		}
		
	});
});
</script>
</head>
<body>
<!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <!-- <i class="fas fa-laugh-wink"></i> -->
        </div>
        <div class="sidebar-brand-text mx-3">School∩Homes</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
      <!-- Heading -->
      <!-- <div class="sidebar-heading">
        Addons
      </div> -->

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-folder"></i>
          <span>학교랭킹</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <!-- <h6 class="collapse-header">Login Screens:</h6> -->
            <a class="collapse-item" href="login.html">서울대 입결</a>
            <a class="collapse-item" href="register.html">진학률</a>
          </div>
        </div>
      </li>

      <!-- Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link" href="charts.html">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>분석</span></a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="charts.html">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>추천</span></a>
      </li>

      <!-- Nav Item - Tables -->
      <li class="nav-item">
        <a class="nav-link" href="tables.html">
          <i class="fas fa-fw fa-table"></i>
          <span>게시판</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="custom_sidebarToggle"></button>
      </div>
    </ul>
    
    <div class="chart-content" id="print" >
      Ajax TEST
    </div>
    <!-- End of Sidebar -->
</body>
</html>