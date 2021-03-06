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
  <title>合众饰品专卖</title>x
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
      var mySwiper = new Swiper('.slide',{
        autoplay:5000,
        visibilityFullFit : true,
        loop:true,
        pagination : '.pagination',
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


        //加入喜欢功能
        $("[class=like_icon]").click(function () {
            var id = $(this).attr("value");
            $.ajax({
                url:"../../favorite/addToFav",
                data:{"value":id},
                dataType:"json",
                success:function (data) {
                    console.log(data.msg);
                }
            });
        });
    });
  </script>
</head>
<body>
<!--header-->
<header>
  <a href="../../location/location" class="location">深圳市</a>
  <h1>合众饰品专卖</h1>
  <a href="../../search/search" class="rt_searchIcon">&#37;</a>
</header>
<!--slide-->
<div class="slide">
  <div class="swiper-wrapper">
      <%--循环顶部图片--%>
      <c:forEach items="${list.getContent()}" var="b">
    <div class="swiper-slide">
      <a href="#">
        <img src="../../${b.advPicUrl}"/>
      </a>
    </div>
      </c:forEach>

  </div>
  <div class="pagination"></div>
</div>
<!--Tab:productList-->
<dl class="tab_proList">
  <dd>
    <ul>
      <c:forEach items="${goodsInfo.getContent()}" var="b">
        <li>
          <div class="productArea">
            <a href="../../product/product_list" class="goodsPic" >
              <img src="../../${b.goodsImage}"/>
            </a>
            <div class="goodsInfor">
              <h2>
                <a href="../../cart/product?id=${b.goodsId}">${b.goodsSubtitle}</a>
              </h2>
              <p>
                <del>${b.goodsPrice}</del>
              </p>
              <p>
                <strong class="price">${b.goodsSellPrice}</strong>
              </p>
              <a class="addToCart" value="${b.goodsId}">&#126;</a>
            </div>
          </div>
          <aside>
            <a class="like_icon" value="${b.goodsId}">${b.commentNum}</a>
            <a class="comment_icon">${b.thumbsUpNum}</a>
            <a class="deal_icon">${b.salenumNum}</a>
          </aside>
        </li>
      </c:forEach>
    </ul>
  </dd>
</dl>
<!--floatCart-->
<div class="hoverCart">
  <a href="../../cart/cart">0</a>
</div>
<!--fixedNav:footer-->
<div style="height:1.2rem;"></div>
<nav>
  <a href="../../product/index" class="homeIcon">首页</a>
  <a href="../../category/category" class="categoryIcon">分类</a>
  <a href="../../cart/cart" class="cartIcon">购物车</a>
  <a href="../../user/user" class="userIcon">我的</a>
</nav>
</body>
</html>

