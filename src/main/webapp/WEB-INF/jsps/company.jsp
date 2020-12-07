<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savecompany" method="post" modelAttribute="company">
		Enter Company Name
		<form:input path="cname"/><br>
		Enter Address
		<form:input path="caddr"/><br>
		Select City
		<form:select path="city" items="${citylist}" />
		
		<input type="submit" value="Save"/>
	
	</form:form>

</body>
</html>