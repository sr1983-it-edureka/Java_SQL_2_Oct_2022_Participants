<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Inputs </h2>

<html:form action="/login">
	Username <html:text property="username" /> <br/>
	Password <html:password property="password" /> <br/>

	<html:submit value="Submit your Details" />
</html:form>

</body>

</html>