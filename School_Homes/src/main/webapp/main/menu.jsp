<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.chart-content{
	width: 600px
}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(function(){
	/* $('#aaa').show(); */
	var index =0;
	$('#print').hide();
	$('#a').click(function(){
		
		if(index == 0)
		{
			$('#print').show();
			index=1;
		}
		
		else
		{
			$('#print').hide();
			index=0;
		}
		
	});
});
</script>
</head>
<body>
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="main.do">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">SB Admin <sup>2</sup></div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider">
	

      <!-- <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
       <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
         <i class="fas fa-fw fa-folder"></i>
         <span>Pages</span>
       </a>
       <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
         <div class="bg-white py-2 collapse-inner rounded">
           <h6 class="collapse-header">Login Screens:</h6>
           <a class="collapse-item" href="login.html">Login</a>
           <a class="collapse-item" href="register.html">Register</a>
           <a class="collapse-item" href="forgot-password.html">Forgot Password</a>
           <div class="collapse-divider"></div>
           <h6 class="collapse-header">Other Pages:</h6>
           <a class="collapse-item" href="404.html">404 Page</a>
           <a class="collapse-item" href="blank.html">Blank Page</a>
         </div>
       </div>
     </li> 

      <!-- Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link" href="charts.html">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>Charts</span></a>
      </li>

      <!-- Nav Item - Tables -->
      <li class="nav-item">
        <a class="nav-link" href="tables.html">
          <i class="fas fa-fw fa-table"></i>
          <span>Tables</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
       <!--  <button class="rounded-circle border-0" id="sidebarToggle"></button> -->
       <button class="rounded-circle border-0" id="a">
      </div>
    </ul>
    <div class="chart-content" id="print" >
      dkflsa
    </div>
</body>
</html>