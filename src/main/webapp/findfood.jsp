<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/15
  Time: 11:16
  To change this template use File | Settings | File Templates.
<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/11
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/find.css" rel="stylesheet"/>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="dv">
    <a href="${pageContext.request.contextPath}/listfood">返回</a>
    <table border="1">
        <caption><h2>用户基本信息</h2></caption>
        <tr>
                <td>编号</td>
                <td>菜名</td>
                <td>备注</td>
                <td>价格</td>
                <td>评价</td>
                <td>图片</td>
            </tr>
        <tr>
                <td>${food.foodId}</td>
                <td>${food.foodName}</td>
                <td>${food.remark}</td>
                <td>${food.foodPrice}</td>
                <td>${food.description}</td>
                <td>${food.foodImage}</td>
            </tr>
    </table>
</div>
</body>
</html>
