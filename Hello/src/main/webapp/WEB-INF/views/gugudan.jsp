<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<%
		
		out.print("======구구단======<br>");
		
		for(int k = 2; k<=9;k++){
			out.print(k+"단<br>");
			for (int l=1; l<=9; l++){
				out.print(k+"*"+l+"="+k*l+"<br>");
			}
		}
	
	%>
</body>
</html>
