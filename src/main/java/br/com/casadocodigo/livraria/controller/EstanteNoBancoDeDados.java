package br.com.casadocodigo.livraria.controller;

import java.util.List;

import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;
import br.com.casadocodigo.livraria.modelo.LivroDAO;

public class EstanteNoBancoDeDados implements Estante {
	
	private final LivroDAO dao;
	
	public EstanteNoBancoDeDados(LivroDAO dao){
		this.dao = dao;
	}
	
	EstanteNoBancoDeDados() {this(null);}
	
	@Override
	public void guardar(Livro livro) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Livro> todosOsLivros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro buscaPorIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
