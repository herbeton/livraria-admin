<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Cadastro de livros</title>
	</head>
	<body>
		<form action="${linkTo[LivrosController].salva }" method="post">
			<h2>Formulario de cadastro de livros</h2>
			<ul>
				<li>Titulo: <br/> 
					<input type="text" name="livro.titulo"/>
				</li>
				
				<li>Descrição: <br/>
					<textarea name="livro.descricao" ></textarea>
				</li>
				
				<li>ISBN: <br/>
					<input type="text" name="livro.isbn"/>
				</li>
				
				<li>Preço: <br/>
					<input type="text" name="livro.preco">
				</li>
				
				<li>Data de publicacao: <br/>
					<input type="text" name="livro.dataPublicacao"/>
				</li>
			</ul>
			
			<input type="submit" value="Salvar"/>
			
		</form>
	</body>
</html>