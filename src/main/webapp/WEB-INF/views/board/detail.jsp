<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/16
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>상세보록</title>
</head>
<body>
<header>
	<jsp:include page="../include/topMenu.jsp"/>
</header>
	<h1>글 상세</h1>
	글번호 : ${board.no}<br>
	글제목 : ${board.title}<br>
	글작성자 : ${board.writer}<br>
	조회수 : ${board.viewCnt}<br>
	작성일자 : ${board.regDate}<br>
</body>
</html>
