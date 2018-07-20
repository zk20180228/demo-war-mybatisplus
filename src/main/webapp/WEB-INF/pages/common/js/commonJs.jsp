<%@ page pageEncoding="UTF-8"%>
<meta charset="UTF-8"/>
<script src="/webjars/jquery/2.1.4/jquery.min.js" type="text/javascript"></script>
<script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/other/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script type="text/javascript">
    $(function(){
        $("input").on("focus",function(){
            document.onkeydown=keyListener;
            function keyListener(e){
                e = e ? e : event;
                if(e.keyCode == 32){
                    return false;
                }
            }
        });

    });
</script>