<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Access to welcomeModel.welcomeMessage -->
	<!-- Access beans/models in JSP files -->
	
	<bean:write name="welcomeModel" property="welcomeMessage" />

</body>
</html>