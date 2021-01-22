<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Capacitación</title>
</head>
<body>
		<h1>Editar Capacitación</h1>
		<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesareditarcapacitacion'>
			ID CAPACITACIÓN: <input type="text" name="id" id="id" value='<c:out value="${mycap.getId()}" />' readonly /><br/>
			FECHA: <input type="text" name="fecha" id="fecha" value='<c:out value="${mycap.getFecha()}" />' /><br/>
			HORA: <input type="text" name="hora" id="hora" value='<c:out value="${mycap.getHora()}" />' /><br/>
			LUGAR: <input type="text" name="lugar" id="lugar" value='<c:out value="${mycap.getLugar()}" />' /><br/>
			DURACION: <input type="text" name="duracion" id="duracion" value='<c:out value="${mycap.getDuracion()}" />' /><br/>
			CANT. ASIST.: <input type="text" name="cantidadasistentes" id="cantidadasistentes" value='<c:out value="${mycap.getCantidadasistentes()}" />' /><br/>
			RUT CLIENTE: <input type="text" name="cliente_rutcliente" id="cliente_rutcliente" value='<c:out value="${mycap.getCliente_rutcliente()}" />' /><br/>
			<input type="submit" value="Editar Capacitacion" /><br/>
		</form>	
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />/listadocapacitaciones'>Ir al listado de capacitaciones.</a>	

</body>
</html>