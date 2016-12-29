<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>

</head>
<%-- <%
	String type = SysProperties.getInstance().getProperty("spring.profiles.active");
%>
<script type="text/javascript">
		// 以下方式直接跳转
		var path = "/console/dist/index.html#/tenant"
		//单点登录
		if('<%=type%>'=='cas'){
			path = "/console/dist/index.html#/tenant";
		}else{
			path = "/console/dist/index.html";
		}
		window.location.href= '<%=request.getContextPath()%>' + path;
</script> --%>
<body>
	Hello world!
</body>
</html>