<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.JavaBeans"%>
<%@page import="java.util.ArrayList"%>
<%
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Contatos</title>
<link rel="stylesheet" type="text/css" href="listacontatos.css">
</head>
<body>
	<h1>Lista de Contatos</h1>
  	<a href="download" id="btn-excluir">Download em PDF</a> 
	<table id="tabela">
		<thead>
			<tr>
				<th>Id:</th>
				<th>Nome:</th>
				<th>Fone:</th>
				<th>Email:</th>
				<th>Opções:</th>
			</tr>
		</thead>
		<%
		for (int i = 0; i < lista.size(); i++) {
		%>
		<tr>
			<td><%=lista.get(i).getId()%></td>
			<td><%=lista.get(i).getNome()%></td>
			<td><%=lista.get(i).getFone()%></td>
			<td><%=lista.get(i).getEmail()%></td>
			<td><a id="btn-editar" href="select?id=<%=(lista.get(i).getId())%>">Editar</a> <a id="btn-excluir" href="javascript: confirmar(<%=(lista.get(i).getId())%>)">Excluir</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
<script type="text/javascript" src="scripts/confirmador.js"></script>
</html>