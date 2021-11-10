package br.com.corpus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.corpus.model.ProdutoEpi;

public interface ProdutoEpiRepository extends CrudRepository<ProdutoEpi, Long>{
	
	
	@Query(value="select * from sqma_prdProtheus_epi", nativeQuery = true)
	
	Iterable<ProdutoEpi> findProduto();	
	


}
