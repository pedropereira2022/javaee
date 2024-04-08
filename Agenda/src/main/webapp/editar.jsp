<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Agenda de Contatos</title>
<link rel="icon" href="imagens/telephone.png">
<link rel="stylesheet" type="text/css" href="novo.css">
</head>
<body>
	<div class="container">
		<h1>Editar Contato</h1>
		<form name="frmEditarContato" action="editar">
			<table>
				<tr>
					<td><input type="text" name="id" placeholder="id"
						class="input" value=<%=request.getAttribute("id")%> hidden="true"
						readonly></td>
				</tr>
				<tr>
					<td><input type="text" name="nome" placeholder="Nome"
						class="input" value=<%=request.getAttribute("nome")%>></td>
				</tr>
				<tr>
					<td><input type="text" name="fone" placeholder="Telefone"
						class="inputfone" value=<%=request.getAttribute("fone")%>></td>
				</tr>
				<tr>
					<td><input type="text" name="email" placeholder="E-mail"
						class="input" value=<%=request.getAttribute("email")%>></td>
				</tr>
			</table>
			<input type="submit" class="botao1" value="Salvar"
				onclick="return validarEditar(event)">
		</form>
	</div>
</body>
<script type="text/javascript" src="scripts/editar.js"></script>
</html>