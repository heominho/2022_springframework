<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<%@ page import ="java.util.*" %> 
<html>
<head>
	<title>Lotto</title>
</head>
<body>
<h1>
	Lotto
</h1>

	<%
		out.print("======lotto======<br><br>");
		Random random = new Random();
	
		
		int[] arr = new int[6];
		for(int i=0; i<6;i++){
			arr[i] =0;
		}
		
		int nansu=0;
		int value=0;
		boolean Existval = false;
		int nCurrentNum = 0;
		while(true){
			value = random.nextInt(45) + 1; //1~45 로 만들기 위해 1 더함
			Existval = false;
			for (int j=0;j<nansu;j++){
				if(arr[j]==value){
					out.print("중복<br>");
					Existval = true;
					continue;
				}		
			}
		
			if(!Existval){
				arr[nansu] = value;
				nansu++;
			}
			if(nansu==6)
				break;
		}
		for (int i=0; i<6;i++){
			out.print(i+1+"번쨰 숫자:"+arr[i]+"<br>");
		}
		
		
	%>
</body>
</html>
