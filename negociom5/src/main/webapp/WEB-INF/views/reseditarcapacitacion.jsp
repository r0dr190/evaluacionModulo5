<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edici�n de Capacitaci�n.</title>
</head>
<body>
	<h1>Editar Capacitaci�n.</h1>
	<p>La Capacitaci�n ha sido editada exitosamente!</p><br/>
	<br/>
	<a href='<c:out value="${pageContext.request.contextPath}" />/listadocapacitaciones'>Ir al listado de capacitaciones.</a>		
</body>
</html>