<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>价格</td>
			<td>操作</td>
		</tr>
 		<c:forEach  items="${books } " var="book" >
		<tr>
			<td>${book.bid }</td>
			<td>${book.bname }</td>
			<td>${book.price }</td>
			<td>1111</td>
		</tr>
		</c:forEach> 
	</table>
</body>
</html>