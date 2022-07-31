<%--
  Created by IntelliJ IDEA.
  User: Shie
  Date: 31/07/2022
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de livro</title>
</head>
<body>
    <h1> Cadastro de Livro</h1>
    <form action="livro-servlet" method="post">
        <div>
        <label for="idNome">Nome:</label>
        <input type="text" id="idNome" name="nome"> <!-- atributo name="xxx" é a chave-->
        </div>

        <div>
        <label for="idAutor">Autor:</label>
        <input type="text" id="idAutor" name="autor">
        </div>

        <input type="submit" value="Enviar">

    </form>
</body>
</html>
