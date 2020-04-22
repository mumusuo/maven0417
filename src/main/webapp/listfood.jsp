<%--
  Created by IntelliJ IDEA.
  User: 佐佐龙
  Date: 2020/4/15
  Time: 22:12
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
    <p align="center"><a href="add.jsp">添加</a></p>
    <table border="1" align="center">
        <caption><h2>用户基本信息</h2></caption>
        <tr>
            <td>编号</td>
            <td>菜名</td>
            <td>备注</td>
            <td>价格</td>
            <td>评价</td>
            <td>图片</td>
        </tr>
        <c:forEach var="food" items="${listf}">
            <tr>
                <td>${food.foodId}</td>
                <td>${food.foodName}</td>
                <td>${food.remark}</td>
                <td>${food.foodPrice}</td>
                <td>${food.description}</td>
                <td>${food.foodImage}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/findfood?foodId=${food.foodId}">详情</a>
                    <a href="${pageContext.request.contextPath}/findUpdatefood?foodId=${food.foodId}">修改</a>
                    <a href="${pageContext.request.contextPath}/del?foodId=${food.foodId}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <p class="page">
        第${pageInfo.pageNum}/ ${pageInfo.pages}页 &nbsp; 共${pageInfo.total} 条  &nbsp;
        <a href="list?pageCurrent=1&foodName=${food.foodName}">首页</a> &nbsp;

        <c:if test="${!pageInfo.isFirstPage}">
        <a href="list?pageCurrent=${pageInfo.prePage}&foodName=${food.foodName}">上一页</a>&nbsp;
        </c:if>

        <a href="list?pageCurrent=${pageInfo.nextPage}&foodName=${food.foodName}">下一页</a>&nbsp;
        <a href="list?pageCurrent=${pageInfo.pages}&foodName=${food.foodName}">尾页</a>&nbsp;

        <c:forEach var="i" begin="1" end="${pageInfo.pages}">
        <a href="list?pageCurrent=${i}">${i}</a>&nbsp;
        </c:forEach>
    <p>
</div>
</body>
</html>
