package br.com.casadocodigo.livraria.controller;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.casadocodigo.livraria.modelo.Livro;
import br.com.casadocodigo.livraria.modelo.LivroDAO;

//classe responsável pela persistencia no DB
public class JPALivroDAO implements LivroDAO{
	
	private final EntityManager manager;
	
	@Inject
	public JPALivroDAO(EntityManager manager) {
		this.manager = manager;
	}

	//construtor do CDI
	JPALivroDAO() {this(null);}
	
	@Override
	public void adiciona(Livro livro) {
		if(livro.getId() == null){
			this.manager.persist(livro);
		}
		else{
			this.manager.merge(livro);
		}
	}

	@Override
	public List<Livro> todos() {
		return this.manager.createQuery("select 1 from Livro 1", 
				Livro.class).getResultList();
	}

	@Override
	public Livro buscarPorIsbn(String isbn) {
		try{
			return this. manager
			. createQuery("select l from Livro l where l.isbn = :isbn", 
					Livro.class).setParameter("isbn", isbn)
			. getSingleResult() ;
			} catch (NoResultException e) {
			return null;
		}
	}

}
