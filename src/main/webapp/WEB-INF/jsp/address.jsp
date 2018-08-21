<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8"/>
 <base href="<%=basePath %>"/>
<title>我的地址-合众饰品专卖</title>
<meta name="keywords"  content="KEYWORDS..." />
<meta name="description" content="DESCRIPTION..." />
<meta name="author" content="HZIT" />
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name='apple-touch-fullscreen' content='yes'>
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="address=no">
<link rel="icon" href="../../images/icon/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" sizes="57x57" href="../../images/icon/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="120x120" href="../../images/icon/apple-touch-icon-120x120-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="196x196" href="../../images/icon/apple-touch-icon-196x196-precomposed.png">
<meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="../../css/style.css" />
<script src="../../js/jquery.js"></script>
<script>
$(document).ready(function(){
  //测试返回页面，程序对接删除即可
  $(".userForm input[type='button']").click(function(){
	  alert("地址修改成功！");
	  location.href="user_set.jsp";
	  });
  //省份
    var province,city;
    var dataList;
    $.ajaxSettings.async = false;
    $.ajax({
        url:"../../address/address1",
        data:{"null":"null"},
        dataType:"json",
        success:function (data) {
            dataList = data;
            var str = "";
            for (var i = 0; i < data.length; i++) {
                if(data[i][0][0] != null){
                    str += "<option value='"+ i +"'>"+ data[i][0][0]+"</option>";
                }
            }
            $("#province").append(str);

        }
    });


    $("#province").change(function(){
        $("#city").html("<option>请选择</option>");
        province = $(this).val();
        var str = "";
        for (var i = 1; i < dataList[province].length; i++) {
            if(dataList[province][i][0] != null){
                str += "<option value='"+ i +"'>"+ dataList[province][i][0]+"</option>";
            }
        }
        $("#city").append(str);
    });

    $("#city").change(function(){
        $("#area").html("<option>请选择</option>");
        city = $(this).val();
        var str = "";
        for (var i = 1; i < dataList[province][city].length; i++) {
            if(dataList[province][city][i] != null){
                str += "<option value='"+ i +"'>"+ dataList[province][city][i]+"</option>";
            }
        }
        $("#area").append(str);
    });

});

</script>
</head>
<body>
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>我的地址</h1>
</header>
<ul class="userForm">
 <li>
  <input type="text" value="HZIT"/>
 </li>
 <li>
  <select id="province">
   <option>请选择</option>
  </select>
 </li>
 <li>
  <select id="city">
   <option>请选择</option>
  </select>
 </li>
 <li>
  <select id="area">
   <option>请选择</option>
  </select>
 </li>
 <li>
  <textarea>三八东路德州市体育中心</textarea>
 </li>
 <li>
  <input type="button" value="修改地址" class="formLastBtn"/>
 </li>
</ul>
</body>
</html>
