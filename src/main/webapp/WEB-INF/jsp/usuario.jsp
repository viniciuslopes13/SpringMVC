<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Informa��es de Usu�rio</h2>
	<form:form method="POST" action="/SpringMVC/addUsuario">
		<table>
			<tr>
				<td><form:label path="nome">Nome</form:label></td>
				<td><form:input path="nome" /></td>
			</tr>
			<tr>
				<td><form:label path="senha">Senha</form:label></td>
				<td><form:password path="senha" /></td>
			</tr>
			<tr>
				<td><form:label path="endereco">Endere�o</form:label></td>
				<td><form:textarea path="endereco" rows="5" cols="30" /></td>
			</tr>
			<tr>
				<td><form:label path="receberNoticias">Inscri��o Newsletter</form:label></td>
				<td><form:checkbox path="receberNoticias" /></td>
			</tr>
			<tr>
				<td><form:label path="frameworkFavorito">Frameworks favoritos da Web</form:label></td>
				<td><form:checkboxes items="${listaFrameworksWeb}"
						path="frameworkFavorito" /></td>
			</tr>
			<tr>
				<td><form:label path="genero">Genero</form:label></td>
				<td><form:radiobutton path="genero" value="M" label="Masculino" />
					<form:radiobutton path="genero" value="F" label="Feminino" /></td>
			</tr>
			<tr>
				<td><form:label path="numeroFavorito">N�mero favorito</form:label></td>
				<td><form:radiobuttons path="numeroFavorito"
						items="${listaNumeros}" /></td>
			</tr>
			<tr>
				<td><form:label path="pais">Pa�s</form:label></td>
				<td><form:select path="pais">
						<form:option value="NONE" label="Selecione" />
						<form:options items="${listaPaises}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="habilidades">Habilidades</form:label></td>
				<td><form:select path="habilidades" items="${listaHabilidades}"
						multiple="true" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>