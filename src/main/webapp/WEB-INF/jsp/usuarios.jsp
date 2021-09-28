<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Informa��es enviadas pelo usu�rio</h2>
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
			<td>Inscri��o Newsletter</td>
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
			<td>N�mero favorito</td>
			<td>${numeroFavorito}</td>
		</tr>
		<tr>
			<td>Pa�s</td>
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