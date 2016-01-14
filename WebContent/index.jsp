<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>首页</title>
    <meta name="Keywords" content="">
    <meta name="description" content="">
    <link href="<%=request.getContextPath() %>/css/public.css" type="text/css" rel="stylesheet">
</head>
<body>
    <div class="container">
    	<jsp:include page="/public/guest/top.jsp"></jsp:include>
    	欢迎来到blindeagle博客
    	<jsp:include page="/public/guest/bottom.jsp"></jsp:include>
    </div>
</body>
</html>