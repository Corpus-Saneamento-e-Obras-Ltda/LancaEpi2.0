package br.com.corpus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.corpus.model.CategoriaEPI;

public interface CategoriaEpirepository extends CrudRepository<CategoriaEPI, String> {
	
	@Query(value="select * from CategoriaEpi ", nativeQuery = true)
	Iterable<CategoriaEPI> findAllCategoria();
	

}
