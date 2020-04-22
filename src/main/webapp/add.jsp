<%--
  Created by IntelliJ IDEA.
  User: 佐佐龙
  Date: 2020/4/20
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <div align="center">
            <form action="add" method="post" enctype="multipart/form-data">
                菜名:<input name="foodName" type="text"></br>
                材料:<input name="remark" type="text"></br>
                价格:<input name="foodPrice" type="text"></br>
                评价:<input name="description" type="text"></br>
                图片:<input type="file" name="file" class="tname" /></br>
            </br>
                <input type="submit" value="提交">
                <input type="reset" value="重置"/>
            </form>
        </div>
</body>
</html>
