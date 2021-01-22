<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Crear Capacitaci�n.</title>
	</head>
	<body>
		<h1>Crear Capacitaci�n.</h1>
		<form method="post" action="procesarcrearcapacitacion">
			ID CAPACITACI�N: <input type="text" name="id" id="id" /><br/>
			FECHA: <input type="text" name="fecha" id="fecha" /><br/>
			HORA: <input type="text" name="hora" id="hora" /><br/>
			LUGAR: <input type="text" name="lugar" id="lugar" /><br/>
			DURACI�N: <input type="text" name="duracion" id="duracion" /><br/>
			CANT. ASIST.: <input type="text" name="cantidadasistentes" id="cantidadasistentes" /><br/>
			RUT CLIENTE: <input type="text" name="cliente_rutcliente" id="cliente_rutcliente" /><br/>
			<input type="submit" value="Guardar Capacitaci�n" /><br/>
		</form>	
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />/listadocapacitaciones'>Ir al listado de capacitaciones.</a>		
	</body>
</html>