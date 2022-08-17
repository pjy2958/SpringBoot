<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/16
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<header>
	<jsp:include page="../include/topMenu.jsp"/>
</header>
  <form:form action="${pageContext.request.contextPath}/register" method="post" modelAttribute="memberVO">
        <table>
	        <tr>
		        <th>ID</th>
		        <td>
			        <form:input path="id"/>
			        <form:errors path="id" class="error"/>
		        </td>
	        </tr>
	        <tr>
		        <th>Password</th>
		        <td>
			        <form:password path="password"/>
			        <form:errors path="password" class="error"/>
		        </td>
	        </tr>
	        <tr>
		        <th>Password재입력</th>
		        <td>
			        <input type="repassword" name="repassword">
			        <form:errors path="password" class="error"/>
		        </td>
	        </tr>
	        <tr>
		        <th>Name</th>
		        <td>
			        <form:input path="name"/>
			        <form:errors path="name" class="error"/>
		        </td>
	        </tr>
        </table>
	  <button type="submit">회원가입해보리기</button>
  </form:form>
</body>
</html>
