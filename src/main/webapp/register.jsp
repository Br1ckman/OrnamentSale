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
<title>注册-DIY会员</title>
<meta name="keywords"  content="KEYWORDS..." />
<meta name="description" content="DESCRIPTION..." />
<meta name="author" content="HZIT" />
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name='apple-touch-fullscreen' content='yes'>
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="address=no">
<link rel="icon" href="images/icon/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" sizes="57x57" href="images/icon/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="120x120" href="images/icon/apple-touch-icon-120x120-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="196x196" href="images/icon/apple-touch-icon-196x196-precomposed.png">
<meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/jquery.js"></script>
<script type="text/javascript ">
 var isTrue = false;
$(document).ready(function(){
   $("[name=memberMobile]").blur(function () {
       var memberMobile = $(this).val();
       var data = {"memberMobile":memberMobile};
       $.getJSON("/register/checkName",data,function (result) {
           $("[class=formMark]").html(result.msg);
           if(result.msg == "此账号已存在"){
               isTrue = false;
           }else {
               isTrue = true;
           }
       });
   });
});

function regSub() {
    alert(isTrue);
    if(isTrue){
        $("#reg").submit();
    }
}
</script>
</head>
<body>
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>注册</h1>
</header>
<mark class="formMark"></mark>

<form method="post" action="register/regSubmit" id="reg">
 <ul class="formarea">
  <li>
   <label class="lit">账号：</label>
   <input type="tel" name="memberMobile" placeholder="手机号码" class="textbox" placeholder="HZIT"/>
  </li>
  <li style="padding:0;"><a class="checkCode">获取手机校验码</a></li>
  <li>
   <label class="lit">密码</label>
   <input type="password" name="memberPasswd" id="password" placeholder="请输入密码" class="textbox"/>
  </li>
  <li class="liLink">
   <a href="WEB-INF/jsp/article.jsp" class="fl">《用户协议》</a>
   <a href="login/userLogin" class="fr">已有账号，登录</a>
  </li>
  <li>
   <input type="button" value="立即注册 " onclick="regSub()"/>
  </li>
 </ul>
</form>
<!--fixedNav:footer-->
<div style="height:1.2rem;"></div>
<nav>
 <a href="product/index" class="homeIcon">首页</a>
 <a href="category/category" class="categoryIcon">分类</a>
 <a href="cart/cart" class="cartIcon">购物车</a>
 <a href="user/user" class="userIcon">我的</a>
</nav>
</body>
</html>
