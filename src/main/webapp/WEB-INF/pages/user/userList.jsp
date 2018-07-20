<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/pages/common/taglib/taglib.jsp" %>
<!doctype html>
<html>
<head>
    <title>
        demo工程
    </title>
    <%@ include file="/WEB-INF/pages/common/css/commonCss.jsp" %>
    <%@ include file="/WEB-INF/pages/common/js/commonJs.jsp" %>
</head>
<body>
<div>
    <div class="row text-center" >
        <img src="${pageContext.request.contextPath}/static/images/admin.png">
        <h1 id="title">${h1}</h1>
    </div>

    <!--测试bootstrap-->
    <div class="row text-center" style="margin-top: 20px;">
        <!-- 标准的按钮 -->
        <button type="button" class="btn btn-default">默认按钮</button>
        <!-- 提供额外的视觉效果，标识一组按钮中的原始动作 -->
        <button type="button" class="btn btn-primary">原始按钮</button>
        <!-- 表示一个成功的或积极的动作 -->
        <button type="button" class="btn btn-success">成功按钮</button>
        <!-- 信息警告消息的上下文按钮 -->
        <button type="button" class="btn btn-info">信息按钮</button>
        <!-- 表示应谨慎采取的动作 -->
        <button type="button" class="btn btn-warning">警告按钮</button>
        <!-- 表示一个危险的或潜在的负面动作 -->
        <button type="button" class="btn btn-danger">危险按钮</button>
        <!-- 并不强调是一个按钮，看起来像一个链接，但同时保持按钮的行为 -->
        <button type="button" class="btn btn-link">链接按钮</button>
    </div>

    <div class="row text-center"  style="margin-top: 20px;">
        <input size="16" type="text" value="" class="form_datetime">
    </div>



</div>
</body>
</html>

<script type="text/javascript">

    $(function(){

        $("#title").on("click",function(){
            alert("${h1}");
        });

    });


    //日期插件
    $(".form_datetime").datetimepicker({
        format: 'yyyy-mm-dd',//显示格式
        todayHighlight: 1,//今天高亮
        minView: "month",//设置只显示到月份
        startView:2,
        forceParse: 0,
        showMeridian: 1,
        autoclose: 1//选择后自动关闭
    });

</script>