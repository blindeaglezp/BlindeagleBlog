/**
 * Created by blindeagle on 15-12-3.
 */

$("a.close").click(function() {
    $("#gray").hide();
    $("#addNorWeb").hide();
    $("#deleteNorWeb").hide();
});
function setCenter($item) {
    var _top = ($(window).height() - $item.height()) / 2;
    var _left = ($(window).width() - $item.width()) / 2;
    $item.css({top:_top,left:_left});
}
$(document).ready(function() {
    $("#addNorWeb").draggable();
    $("#deleteNorWeb").draggable();
});

/* 点击添加按钮，弹出添加常用网站对话框 */
$(".addNorWeb").click(function() {
    $("#gray").show();
    $("#addNorWeb").show();
    setCenter($("#addNorWeb"));
});

/* 添加常用网站 */
$(".btn_addNorWeb").click(function() {
	$("#gray").hide();
    $("#addNorWeb").hide();
	var norWebSubId = $(".curNorWebSubId").val();
	var norWebName = $("#addNorWeb .info .norWebName").val();
	var norWebUrl = $("#addNorWeb .info .norWebUrl").val();
	var data = {"norWebSubId":norWebSubId,"norWebName":norWebName,"norWebUrl":norWebUrl};
	$.ajax({
		type:"post",
		url:"/BlindeagleBlog/servlet/NormalWebShowServlet?type=addNormalWeb",
		dataType:"json",
		data:data,
		success:function(data){
			$("#addNorWeb .info .norWebName").val("");
		    $("#addNorWeb .info .norWebUrl").val("");
			var $norWebUL = $(".norWebCon .norWebCon_right ul");
			$norWebUL.find("li").remove();
			$(data).each(function() {
				$norWebUL.append("<li><a href='"+this.norWebUrl+"' target='_blank'>"+this.norWebName+"</a></li>");
			});
		}
	});
});

/* 点击删除按钮，弹出删除常用网站对话框 */
$(".deleteNorWeb").click(function() {
    $("#gray").show();
    $("#deleteNorWeb").show();
    setCenter($("#deleteNorWeb"));
});

/* 删除常用网站 */
$(".btn_deleteNorWeb").click(function() {
	var norWebSubId = $(".curNorWebSubId").val();
	var norWebName = $("#deleteNorWeb .info .norWebName").val();
	var data = {"norWebSubId":norWebSubId,"norWebName":norWebName};
	if (confirm("确认删除"+norWebName+"？")) {  
		$("#gray").hide();
	    $("#deleteNorWeb").hide();
		$.ajax({
			type:"post",
			url:"/BlindeagleBlog/servlet/NormalWebShowServlet?type=deleteNormalWeb",
			dataType:"json",
			data:data,
			success:function(data){
				$("#deleteNorWeb .info .norWebName").val("");
				var $norWebUL = $(".norWebCon .norWebCon_right ul");
				$norWebUL.find("li").remove();
				$(data).each(function() {
					$norWebUL.append("<li><a href='"+this.norWebUrl+"' target='_blank'>"+this.norWebName+"</a></li>");
				});
			}
		});
	}
});

/* 选择网站类别查询网站 */
$(".ul_norWebSub li").click(function() {
	var norWebSubId = $(this).val();
	var data = {"norWebSubId":norWebSubId};
	$.ajax({
		type:"post",
		url:"/BlindeagleBlog/servlet/NormalWebShowServlet?type=queryNorWebBySubId",
		dataType:"json",
		data:data,
		success:function(data){
			$(".curNorWebSubId").val(norWebSubId);
			var $norWebUL = $(".norWebCon .norWebCon_right ul.ul_norWeb");
			$norWebUL.find("li").remove();
			$(data).each(function() {
				$norWebUL.append("<li><a href='"+this.norWebUrl+"' target='_blank'>"+this.norWebName+"</a></li>");
			});
		}
	});
});

















