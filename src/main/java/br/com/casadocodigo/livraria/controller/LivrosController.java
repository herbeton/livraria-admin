package br.com.casadocodigo.livraria.controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;

//Vai controlar o cadastro de livros do form
@Controller
public class LivrosController {
	public void formulario(){}
	
	public void salva(Livro livro, Result result){
		Estante estante = new UmaEstanteQualquer();
		estante.guardar(livro);
		
		//mensagem passada para antes de inserir a lista na página lista.jsp
		result.include("mensagem", "Livro salvo com sucesso!");
				
		//redireciona para o metodo lista desse metrodo controller(this)
		result.redirectTo(this).lista();
	}
	
	public List<Livro> lista(){
		Estante estante = new UmaEstanteQualquer();
		return estante.todosOsLivros();
	}
	public void edita(String isbn, Result result){
		Estante estante = new UmaEstanteQualquer();
		Livro livroEncontrado = estante.buscaPorIsbn(isbn);
		
		//incluido no resultado da variavel livroEncontrado como se fosse
		//um retorno do metodo chamado que nesse caso é editar
		result.include(livroEncontrado);
		
		//redireciona na url para o livros/formulario.jsp
		result.of(this).formulario();
	}
}
