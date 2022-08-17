<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/11
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<header>
	<jsp:include page="include/topMenu.jsp"/>
</header>
	<a href="<%= request.getContextPath()%>/board"><h1>게시판</h1></a>
	<a href="<%= request.getContextPath()%>/board/write"><h1>새글 쓰기</h1></a>
	<a href="<%= request.getContextPath()%>/register"><h1>회원가입</h1></a>
	<a href="<%= request.getContextPath()%>/login"><h1>로그인하기</h1></a>
	<a href="<%= request.getContextPath()%>/logout"><h1>로그아웃하기</h1></a>
	<a href="<%= request.getContextPath()%>/test"><h1>테스트</h1></a>
</body>
</html>
