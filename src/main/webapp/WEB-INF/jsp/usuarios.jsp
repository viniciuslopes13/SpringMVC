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
		<tr>
			<td>Endereco</td>
			<td>${endereco}</td>
		</tr>
		<tr>
			<td>Inscrição Newsletter</td>
			<td>${receberNoticias}</td>
		</tr>
		<tr>
			<td>Frameworks favoritos da Web</td>
			<td>
				<%
				String[] favoriteFrameworks = (String[]) request.getAttribute("frameworkFavorito");
				for (String framework : favoriteFrameworks) {
					out.println(framework);
				}
				%>
			</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${(genero=="M"? "Masculino" : "Feminino")}</td>
		</tr>
		<tr>
			<td>Número favorito</td>
			<td>${numeroFavorito}</td>
		</tr>
		<tr>
			<td>País</td>
			<td>${pais}</td>
		</tr>
		<tr>
			<td>Habilidades</td>
			<td>
				<%
				String[] habilidades = (String[]) request.getAttribute("habilidades");
				for (String skill : habilidades) {
					out.println(skill);
				}
				%>
			</td>
		</tr>
	</table>
</body>
</html>