<%--
  Created by IntelliJ IDEA.
  User: 佐佐龙
  Date: 2020/4/20
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <br action="findUpdate">
        菜名:<input name="foodName" type="text" value="${food.foodName}"></br>
        材料:<input name="remark" type="text" value="${food.remark}"></br>
        价格:<input name="foodPrice" type="text" value="${food.foodPrice}"></br>
        评价:<input name="description" type="text" value="${food.description}"></br>
        图片:<input type="file" name="file" class="tname" /><img src="D:\Y2Study\mavenIng\maven0417\target\maven0417-1.0-SNAPSHOT\img\${foodImage}" height="200px" width="200px" name="图片"/></br>
        </br>
        <input type="submit" value="提交">
        <input type="button" value="返回" onclick="history.back(-1)"/>
    </form>
</div>
</body>
</html>
