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
                <ul class="ul_norWebSub">
                	<c:forEach items="${norWebSubs }" var="norWebSub">
                    	<li value="${norWebSub.norWebSubId }">${norWebSub.norWebSubject }</li>
                    </c:forEach>
                </ul>
            </div>
            <div class="norWebCon_right">
                <ul class="ul_norWeb">
                	<c:forEach items="${norWebs }" var="norWeb">
                    	<li><a href="${norWeb.norWebUrl }" target="_blank">${norWeb.norWebName }</a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    	<jsp:include page="/public/guest/bottom.jsp"></jsp:include>
    </div>

    <div class="norWebMana">
        <ul>
            <li class="addNorWeb"><img src="<%=request.getContextPath() %>/images/addNorWeb.png" width="50" height="50" alt="add"/></li>
            <li class="deleteNorWeb"><img src="<%=request.getContextPath() %>/images/deleteNorWeb.png" width="50" height="50" alt="add"/></li>
        </ul>
    </div>

    <div id="gray"></div>
    <div id="addNorWeb">
        <div class="title">添加网站<a href="#" class="close">X</a></div>
        <div class="info">
            <p>名称<input type="text" class="norWebName txt"/></p>
            <p>网址<input type="text" class="norWebUrl txt"/></p>
            <p><input type="button" class="btn_addNorWeb" value="添 加"/></p>
        </div>
    </div>
    <div id="deleteNorWeb">
        <div class="title">删除网站<a href="#" class="close">X</a></div>
        <div class="info">
            <p>名称<input type="text" class="norWebName txt"/></p>
            <p><input type="button" class="btn_deleteNorWeb" value="删 除"/></p>
        </div>
    </div>

    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/norWebShow.js"></script>

</body>
</html>