<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/16
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>새글쓰기</title>
</head>
<style>
	.error{
		color: red;
	}
</style>
<body>
<header>
	<jsp:include page="../include/topMenu.jsp"/>
</header>
<form:form action="${pageContext.request.contextPath}/board/write" method="post" modelAttribute="boardVO1">
	<table>
		<tr>
			<th>제목</th>
			<td><form:input path="title" size="30"/>
			<form:errors path="title" class="error"></form:errors> </td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><form:input path="writer" size="30"/>
			<form:errors path="writer" class="error"></form:errors> </td>
		</tr>
		<tr>
			<th>내용</th>
			<td><form:textarea path="content" cols="30" rows="6"/>
			<form:errors path="content" class="error"></form:errors> </td>
		</tr>
	</table>
	<input type="submit" value="입력">
</form:form>
</body>
</html>