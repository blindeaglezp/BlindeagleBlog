<%@ page pageEncoding="UTF-8" %>
<div class="top">
    <img src="<%=request.getContextPath() %>/images/top_logo.png" width="80" height="80" alt="logo"/>
    <ul>
        <li><a href="">首页</a></li>
        <li><a href="">项目展示</a></li>
        <li><a href="">学习笔记</a></li>
        <li><a href="<%=request.getContextPath() %>/servlet/PageForwardServlet?type=toNormalWebShow">常用网站</a></li>
    </ul>
</div>