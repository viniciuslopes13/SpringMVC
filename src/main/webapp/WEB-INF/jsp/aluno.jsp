<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
      <style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
   <body>

      <h2>Student Information</h2>
      <form:form method = "POST" action = "/SpringMVC/addAluno" commandName="aluno">
      <form:errors path = "*" cssClass = "errorblock" element = "div" />
         <table>
            <tr>
              <td><form:label path = "nome">Nome</form:label></td>
              <td><form:input path = "nome" /></td>
              <td><form:errors path = "nome" cssClass = "error" /></td>
            </tr>
            <tr>
              <td><form:label path = "idade">Idade</form:label></td>
              <td><form:input path = "idade" /></td>
              <td><form:errors path = "idade" cssClass = "error" /></td>
            </tr>
            <tr>
               <td><form:label path = "id">ID</form:label></td>
               <td><form:input path = "id" /></td>
            </tr>
            <tr>
              <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
              </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>