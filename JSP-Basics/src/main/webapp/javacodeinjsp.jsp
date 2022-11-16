<!DOCTYPE html>


<%@page import="java.util.ArrayList" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	StringBuilder contents = new StringBuilder();
	contents.append("hello")
	.append("Good afternoon")
	.append("When is the training timing tomorrow?");
	
	out.println(contents.toString());
%>

<%
	ArrayList<String> colors = new ArrayList<String>();
	colors.add("RED");colors.add("BLUE");

	out.println(colors);
%>

</body>
</html>