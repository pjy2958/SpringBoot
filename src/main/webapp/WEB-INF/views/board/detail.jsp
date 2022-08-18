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
	<title>상세보깅</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(document).ready(function (){
            $('#AddReplyBtn').click(function (){
                let r_content = document.rform.content.value;
                let r_writer = document.rform.writer.value;
                $.ajax({
	                url : '${pageContext.request.contextPath}/reply',
	                method  : 'post',
	                data    :   {
                        boardNo: ${board.no},
		                content: r_content,
		                writer:  r_writer,
	                },
	                success :   function (){
						alert('성공')
	                },
	                error   :   function (){
						alert('실패')
	                },
	                complete    :   function (){
						alert('우하하')
	                }
                })
            })
		})
	</script>
</head>
<body>
<header>
	<jsp:include page="../include/topMenu.jsp"/>
</header>
	<h1>글 상세</h1>
	글번호 : ${board.no}<br>
	글제목 : ${board.title}<br>
	글내용 : ${board.content}<br>
	글작성자 : ${board.writer}<br>
	조회수 : ${board.viewCnt}<br>
	작성일자 : ${board.regDate}<br>
	<form name="rform">
		댓글 : <input type="text" size="30" name="content">
		작성자 : <input type="text" name="writer" value="${loginVO.name}" readonly>
		<input type="submit" value="댓글작성" id="AddReplyBtn">
	</form>
	<div id="replylist"></div>
</body>
</html>
