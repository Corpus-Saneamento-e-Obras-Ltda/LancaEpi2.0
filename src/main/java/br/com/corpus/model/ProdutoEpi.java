package br.com.corpus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Subselect;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity

public class ProdutoEpi implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String cod;
	private String nome;
	private String unidademedida;
	

}
