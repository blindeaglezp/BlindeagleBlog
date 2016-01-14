<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>常用网站展示</title>
    <meta name="Keywords" content="">
    <meta name="description" content="">
    <link href="<%=request.getContextPath() %>/css/public.css" type="text/css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/norWebShow.css" type="text/css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <jsp:include page="/public/guest/top.jsp"></jsp:include>
        <div class="norWebCon">
        	<input type="hidden" class="curNorWebSubId" value="${norWebSubs[0].norWebSubId }" />
            <div class="norWebCon_left">
                <ul>
                	<c:forEach items="${norWebSubs }" var="norWebSub">
                    	<li value="${norWebSub.norWebSubId }">${norWebSub.norWebSubject }</li>
                    </c:forEach>
                </ul>
            </div>
            <div class="norWebCon_right">
                <ul>
                	<c:forEach items="${norWebs }" var="norWeb">
                    	<li><a href="${norWeb.norWebUrl }" target="_blank">${norWeb.norWebName }</a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <jsp:include page="/public/guest/bottom.jsp"></jsp:include>
    </div>

    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/norWebShow.js"></script>

</body>
</html>