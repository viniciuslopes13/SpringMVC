<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Informações enviadas pelo usuário</h2>
	<table>
		<tr>
			<td>Nome</td>
			<td>${nome}</td>
		</tr>
		<tr>
			<td>Senha</td>
			<td>${senha}</td>
		</tr>
	</table>
</body>
</html>