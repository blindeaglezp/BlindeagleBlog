<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
		<title>个人博客登录</title>
		<meta name="Keywords" content="">
		<meta name="description" content="">
		<link href="<%=request.getContextPath()%>/css/login.css" type="text/css" rel="stylesheet">
	</head>
<body>
	
	<div class="login">
		<form action="/BlindeagleBlog/servlet/LoginServlet?type=checkUser" method="post" onsubmit="return tz_login();">
			<div class="top">
				<span>个人博客登录</span>
				<a class="menu" id="myMenu" href="javascript:void(0);"></a>
				<div class="box_color">
					<a href="javascript:;" to="blue_btn.png"><img src="images/login/blue.png"/></a>
					<a href="javascript:;" to="orange_btn.png"><img src="images/login/orange.png"/></a>
					<a href="javascript:;" to="green_btn.png"><img src="images/login/green.png"/></a>
					<a href="javascript:;" to="red_btn.png"><img src="images/login/red.png"/></a>
				</div>
			</div>
			<div class="logo">
				<a href="javascript:void(0);">
					<img width="180" height="180" alt="logo" src="<%=request.getContextPath() %>/images/login/logo.png" />
				</a>
			</div>
			<div class="text">
				<input type="text" name="username" id="username" tip="请输入用户名" placeholder="请输入用户名"/>
				<input type="password" name="password" id="password" tip="请输入密码" placeholder="请输入密码"/>
			</div>
			<div class="btn">
				<input class="be_submit" type="submit" value="登录"/>
			</div>
		</form>
	</div>

<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#myMenu").click(function(){
			$(".box_color").show();
		});
		$(".box_color").mouseleave(function(){
			$(this).hide();
		});
		$(".box_color").find("a").click(function(){
			var to = $(this).attr("to");
			$(".be_submit").css("background","url('images/login/"+to+"')");
		});
		$(".text input").blur(function(){
			$(this).prev(".tips").remove();
		});

	});

	function be_yanzheng($this){
		var tip = $this.attr("tip");
		$this.prev(".tips").remove();
		$this.before("<div class='tips'><i></i>"+tip+"</div>");
	}

	function be_login(){
		var username = $("#username").val();
		var password = $("#password").val();
		if(username.length == 0 || "" == username){
			be_yanzheng($("#username"));
			return false;
		}

		if(password.length == 0 || "" == password){
			be_yanzheng($("#password"));
			return false;
		}
		return true;
	}




</script>

</body>
</html>