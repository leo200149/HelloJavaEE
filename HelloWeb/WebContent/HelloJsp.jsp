<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello Jsp!<br>
	<% for(int i=0;i<10;i++){%>
		Test For <%=i%><br>
	<%} %>
	<%out.println(new Date()); %><br>
	${1+2}<br>
	${header.host}<br>
</body>
</html>