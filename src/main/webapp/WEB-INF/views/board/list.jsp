<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/16
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>목기</title>
</head>
<body>
<header>
	<jsp:include page="../include/topMenu.jsp"/>
</header>
<h1>게시판 목록</h1>
<table>
	<c:if test="${not empty loginVO}">
		<h3>${loginVO.name}님 반갑습니다.</h3>
	</c:if>
	<c:forEach items="${boardlist}" var="board">
		<tr>
			<td>${board.no}</td>
			<td>
				<a href="${pageContext.request.contextPath}/board/detail/${board.no}">
						${board.title}
				</a>
			</td>
			<td>${board.writer}</td>
			<td>${board.regDate}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
