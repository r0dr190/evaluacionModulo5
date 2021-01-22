<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creación de Capacitación.</title>
</head>
<body>
	<h1>Creación de Capacitación.</h1>
	<p>La Capacitación ha sido creada exitosamente!</p><br/>
	<br/>
	<a href='<c:out value="${pageContext.request.contextPath}" />/listadocapacitaciones'>Ir al listado de capacitaciones.</a>		
</body>
</html>