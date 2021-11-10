package br.com.corpus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.corpus.model.CentroCustoEpi;

public interface CentroCustoEpiRepository extends CrudRepository<CentroCustoEpi, String> {
	
	@Query(value="select * from pccusto where length(codccusto)=5 and substr(codccusto,1,2)<> 10", nativeQuery = true)
	Iterable<CentroCustoEpi> findCC();

}
