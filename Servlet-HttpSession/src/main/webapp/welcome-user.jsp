<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	if (session.getAttribute("valid-user") != null &&
		session.getAttribute("valid-user").equals("true")){
		
		out.println("Welcome user");
		out.println(session.getAttribute("username"));
	}else{
		
		out.println("Invalid User...");
		out.println("Login to the application..");
	}
%>

<form action="logout">

	<input type="submit" value="Logout"/>
	
</form>

</body>
</html>