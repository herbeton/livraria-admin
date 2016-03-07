package br.com.casadocodigo.livraria.modelo;

import java.util.List;

public interface LivroDAO {
	void adiciona(Livro livro);
	List<Livro> todos();
	Livro buscarPorIsbn(String isbn);
}
