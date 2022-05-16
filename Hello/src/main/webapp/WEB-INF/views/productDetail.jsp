<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<span>${productVO.name }</span>
<span>${productVO.price }</span>
<span>${productVO.toString() }</span>

<%
	int i=1;
	int j=2;
	int sum=i+j;
	out.print(sum);
%>
</body>
</html>