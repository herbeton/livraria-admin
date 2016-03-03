package br.com.casadocodigo.livraria.controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;

//Vai controlar o cadastro de livros do form
@Controller
public class LivrosController {
	public void formulario(){}
	
	public void salva(Livro livro){
		Estante estante = new UmaEstanteQualquer();
		estante.guardar(livro);
	}
	
	public List<Livro> lista(){
		Estante estante = new UmaEstanteQualquer();
		return estante.todosOsLivros();
	}
}
