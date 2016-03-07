<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Lista de livros</title>
	</head>
	<body>
	
		<c:if test = "${not empty mensagem }">
			<p class="mensagem">
				${mensagem}
			</p>
		</c:if>
	
		<h2>Lista de livros</h2>
		<ul>
			<c:forEach items = "${livroList}" var = "livro">
				<li>${livro.titulo} - ${livro.descricao} ISBN: ${livro.isbn}
					<a href="${linkTo[LivroController].edita}?isbn=${livro.isbn}">
						Modificar
					</a>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>