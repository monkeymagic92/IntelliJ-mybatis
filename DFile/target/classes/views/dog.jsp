<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-03-19
  Time: 오전 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    ${dog} 입니다.
    <button type="button" onclick="moveToCat()">cat으로 입동</button>

<script>
    var a = "ㄹㄴㅇ머ㅑㅐ";
    function moveToCat() {

        location.href="/home/cat?a="+a;
    }
</script>
</body>
</html>
