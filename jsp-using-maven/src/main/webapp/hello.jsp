<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	StringBuilder contents = new StringBuilder();

	contents.append("JSP Project here");
	contents.append("Generated through Maven template");
	
	out.println(contents.toString());
	
%>

</body>
</html>