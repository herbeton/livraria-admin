package br.com.casadocodigo.livraria.modelo;

import java.util.List;

public interface Estante {
	void guardar(Livro livro);
	
	List<Livro> todosOsLivros();

	Livro buscaPorIsbn(String isbn);
}
