<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/17
  Time: 9:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<table>
	<tr>
		<td rowspan="2">
			<a href="${pageContext.request.contextPath}/">
				<img src="${pageContext.request.contextPath}/resources/logo1.png" width="60px" height="60px">
			</a>
		</td>
		<c:if test="${not empty loginVO}">
			<td>${loginVO.name}님 안녕하세요.</td>
		</c:if>
	</tr>
	<tr>
		<td>
			<a href="<%= request.getContextPath()%>/board"><h1>게시판</h1></a>
		</td>
		<td>
			<a href="<%= request.getContextPath()%>/board/write"><h1>새글 쓰기</h1></a>
		</td>
		<c:choose>
			<c:when test="${not empty loginVO}">
				<td>
					<a href="<%= request.getContextPath()%>/logout"><h1>로그아웃하기</h1></a>
				</td>
			</c:when>
			<c:otherwise>
				<td>
					<a href="<%= request.getContextPath()%>/login"><h1>로그인하기</h1></a>
				</td>
				<td>
					<a href="<%= request.getContextPath()%>/register"><h1>회원가입</h1></a>
				</td>
			</c:otherwise>
		</c:choose>
		<td>
			<a href="<%= request.getContextPath()%>/test"><h1>테스트</h1></a>
		</td>
	</tr>
</table>
<hr>
</body>
</html>
