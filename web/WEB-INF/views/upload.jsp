<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/26
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="<%=path%>/upload/file" method="post" enctype="multipart/form-data">
        文件上传:<input type="file"  name="file"/>
        上传按钮:<input type="submit" value="文件上传"/>
    </form>
</body>
</html>
