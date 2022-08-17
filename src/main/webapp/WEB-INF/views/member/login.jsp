<%--
  Created by IntelliJ IDEA.
  User: jyp
  Date: 2022/08/16
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Title</title>
	<script>
		if('${loginmsg}')
            alert(('${loginmsg}'));
	</script>
</head>
<style>
	.error {
		color: red;
	}
</style>
<body>
<header>
	<jsp:include page="../include/topMenu.jsp"/>
</header>
  <form:form action="${pageContext.request.contextPath}/login" method="post" modelAttribute="memberVO">
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
				  <form:input path="password"/>
				  <form:errors path="password" class="error"/>
			  </td>
		  </tr>
	  </table>
	  <button type="submit">로그인 해버리기</button>
  </form:form>
</body>
</html>
