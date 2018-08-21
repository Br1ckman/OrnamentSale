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
<title>分类列表-合众饰品专卖</title>
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
<script src="../../js/swiper.min.js"></script>
<script>
$(document).ready(function(){
    var sort = "asc";
    var gc_Id = 1;

    //选择排序方式
    $(".des_icon").each(function (i,o) {
        $(this).click(function(){
            $(this).toggleClass("asc_icon");
            if(sort == "asc"){
                sort = "desc";
            }else {
                sort = "asc";
            }
            if(i ==0){
                var type = "goods_sell_price";
            }else {
                var type = "salenum_num";
            }

            $.ajax({
                url:"../../category/orderBy",
                data:{"gcId":gc_Id,"sort":type,"orderBy":sort},
                dataType:"json",
                success:function (data) {
                    $("[class=productList]").html("");
                    $("#gcName").html(data[0].gcName);
                    for (var i = 0; i < data.length; i++) {
                        var child ="<ul>" +
                            "    <li>\n" +
                            "     <a href=\"../../cart/product\" class=\"goodsPic\">\n" +
                            "      <img src=\"../../"+ data[i].goodsImage +" \"/>\n" +
                            "     </a>\n" +
                            "     <div class=\"goodsInfor\">\n" +
                            "      <h2>\n" +
                            "       <a href=\"../../cart/product\">"+data[i].goodsName+"</a>\n" +
                            "      </h2>\n" +
                            "      <p>\n" +
                            "       <del>"+ data[i].goodsPrice+"</del>\n" +
                            "      </p>\n" +
                            "      <p>\n" +
                            "       <strong class=\"price\">"+ data[i].goodsSellPrice+"</strong>\n" +
                            "      </p>\n" +
                            "      <a class=\"addToCart\" value="+data[i].goodsId +">&#126;</a>\n" +
                            "     </div>\n" +
                            "    </li>\n";

                        $("[class=productList]").append(child);
                        if(i == data.length -1){
                            $("[class=productList]").append("</ul>");
                        }
                    }
                }
            });
        });
    });

    //改变款式
  $(".drop_icon").click(function(){
	  $(".drop_list").toggle();
	  $(".drop_list li a").click(function(){
		  $(this).parents(".drop_list").hide();
		  gc_Id = $(this).attr("value");
		  });
	  });

   //飞入动画，具体根据实际情况调整
   $(".addToCart").click(function(){
	        $(".hoverCart a").html(parseInt($(".hoverCart a").html())+1);/*测试+1*/
            var shopOffset = $(".hoverCart").offset();
            var cloneDiv = $(this).parent().siblings(".goodsPic").clone();
            var proOffset = $(this).parent().siblings(".goodsPic").offset();
            cloneDiv.css({ "position": "absolute", "top": proOffset.top, "left": proOffset.left });
            $(this).parent().siblings(".goodsPic").parent().append(cloneDiv);
            cloneDiv.animate({
				width:0,
				height:0,
                left: shopOffset.left,
                top: shopOffset.top,
				opacity:1
            },"slow");
	   });

    //加入购物车
    $("[class=addToCart]").click(function () {
        var id = $(this).attr("value");
        $.ajax({
            url:"../../cart/addToCart",
            data:{"value":id},
            dataType:"json",
            success:function (data) {
                console.log(data.msg);
            }
        });
    });

	var mySwiper = new Swiper('.swiper-container',{
	slidesPerView :5,
	slidesPerGroup :5,
	})
});
</script>
</head>
<body style="background:white;">
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>分类列表${sessionScope.fromObject[0].goodsName}</h1>
</header>
<!-- category Swiper -->
<div class="swiper-container category_list">
    <ul class="swiper-wrapper">
        <li class="swiper-slide"><a href="../../category/category">分类</a></li>
        <li class="swiper-slide"><a href="../../category/category">横向滚动</a></li>
        <li class="swiper-slide"><a href="../../category/category" class="curr_link">当前分类</a></li>
        <li class="swiper-slide"><a href="../../category/category">分类</a></li>
        <li class="swiper-slide" id="gcName"><a href="../../category/category">${categorys[0].gcName}</a></li>
        <li class="swiper-slide"><a href="../../category/category">创意</a></li>
        <li class="swiper-slide"><a href="../../category/category">设计</a></li>
        <li class="swiper-slide"><a href="../../category/category">设计稿</a></li>
        <li class="swiper-slide"><a href="../../category/category">测试</a></li>
        <li class="swiper-slide"><a href="../../category/category">分类</a></li>
    </ul>
    <!-- Add Pagination -->
    <div class="swiper-pagination"></div>
</div>
 <!--asc->1[升序asc_icon];des->0[降序des_icon]-->
 <ul class="sift_nav">
  <li><a class="des_icon">价格</a></li>
  <li><a class="des_icon">销量优先</a></li>
  <li>
   <a class="nav_li drop_icon">筛选项目</a>
   <ul class="drop_list">
    <li ><a value="1">项链</a></li>
    <li ><a value="2">耳环</a></li>
    <li ><a value="6">手链</a></li>
    <li ><a value="3">手镯</a></li>
   </ul>
  </li>
 </ul>
<!--productList-->
<section class="productList">
  <ul>
   <c:forEach items="${categorys}" var="b">
    <li>
     <a href="../../cart/product?id=${b.goodsId}" class="goodsPic">
      <img src="../../${b.goodsImage}"/>
     </a>
     <div class="goodsInfor">
      <h2>
       <a href="../../cart/product?id=${b.goodsId}">${b.goodsName}</a>
      </h2>
      <p>
       <del>${b.goodsPrice}</del>
      </p>
      <p>
       <strong class="price">${b.goodsSellPrice}</strong>
      </p>
      <a class="addToCart" value="${b.goodsId}">&#126;</a>
     </div>
    </li>
   </c:forEach>
  </ul>
  <a class="more_btn">加载更多</a>
</section>
<!--floatCart-->
<div class="hoverCart">
 <a href="../../cart/cart">0</a>
</div>
</body>
</html>
