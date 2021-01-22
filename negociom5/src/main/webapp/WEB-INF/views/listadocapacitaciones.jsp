<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Negocio - Listado Capacitaciones</title>
	</head>
	<body>
		<h1>Listado de Capacitaciones.</h1>
		<table>
			<tr>
				<th>ID CAPACITACION</th>
				<th>FECHA</th>
				<th>HORA</th>
				<th>LUGAR</th>
				<th>DURACION</th>
				<th>CANT. ASIST.</th>
				<th>RUT CLIENTE</th>
			</tr>
			<c:forEach items="${lcap}" var="cap">
				<tr>
					<td><c:out value="${cap.getId()}" /></td>
					<td><c:out value="${cap.getFecha()}" /></td>
					<td><c:out value="${cap.getHora()}" /></td>
					<td><c:out value="${cap.getLugar()}" /></td>
					<td><c:out value="${cap.getDuracion()}" /></td>
					<td><c:out value="${cap.getCantidadasistentes()}" /></td>
					<td><c:out value="${cap.getCliente_rutcliente()}" /></td>
					<td>
						<a href='<c:out value="${pageContext.request.contextPath}" />/eliminarcapacitacion/<c:out value="${cap.getId()}" />'>Eliminar</a>
						&nbsp; | &nbsp;
						<a href='<c:out value="${pageContext.request.contextPath}" />/editarcapacitacion/<c:out value="${cap.getId()}" />'>Editar</a>
						&nbsp; | &nbsp;
						<a href='<c:out value="${pageContext.request.contextPath}" />/detalleventa/<c:out value="${cap.getId()}" />'>Ver detalle</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />/crearcapacitacion'>Crear Capacitación.</a>
	</body>
</html>