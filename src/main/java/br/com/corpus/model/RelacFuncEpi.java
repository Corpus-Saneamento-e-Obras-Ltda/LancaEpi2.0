package br.com.corpus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "sqma_app_relacfuncepi")
public class RelacFuncEpi implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	

	private String coligada;

	private String centrocusto;

	private String codigofuncao;

	private Integer idproduto;

	private Integer diasduracao;

	private Integer quantidaderetirada;

	private Integer quantidadetroca;

	private String tipo;

	private String tamanho;

	}