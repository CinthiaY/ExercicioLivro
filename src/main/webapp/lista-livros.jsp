<%--
  Created by IntelliJ IDEA.
  User: Shie
  Date: 01/08/2022
  Time: 00:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%> <!--é o import do jstl no arquivo .jsp-->
<html>
<head>
    <title>Lista de Livros</title>
</head>
<body>
    <h1>Lista de Livros</h1>
    <h3>Livro ${nomeLivro} cadastrado com ID: ${idLivroSalvo}!!!</h3>

    <table border="solid">
        <tr>

            <th>ID</th>
            <th>Nome do livro</th>
            <th>Autor</th>
        </tr>
        <c:forEach var="livro" items="${livros}" varStatus="id">
        <tr>
            <td>${id.count}</td>
            <td>${livro.nome}</td>
            <td>${livro.autor}</td>

        </tr>
        </c:forEach>
    </table>
    <a href="cadastro-livro.jsp">Cadastre outro livro!</a>
</body>
</html>
