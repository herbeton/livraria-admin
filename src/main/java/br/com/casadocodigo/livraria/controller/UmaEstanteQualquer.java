package br.com.casadocodigo.livraria.controller;

import java.util.Arrays;
import java.util.List;

import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;

public class UmaEstanteQualquer implements Estante {

	@Override
	public void guardar(Livro livro) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Livro> todosOsLivros() {
		Livro vraptor = new Livro();
		vraptor.setIsbn("123-45");
		vraptor.setTitulo("VRaptor 3");
		vraptor.setDescricao("Um livro sobre VRaptor 3");
		
		Livro arquitetura = new Livro();
		arquitetura.setIsbn("5678-90");
		arquitetura.setTitulo("Arquitetura");
		arquitetura.setDescricao("Um livro sobre arquitetura");
		
		return Arrays.asList(vraptor, arquitetura);
	}

}
