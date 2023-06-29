package com.itb.inf2dm.comercio.model;

public class Produto {

	private Long id;
	private String descricao;
	private String nome;
	private String codigoBarras;
	private Double preco;
	private Boolean status;
	
	// No projeto orientação objetos, falamos sobre o public, 
	// um modificador de acesso livre para todas as classes e private, 
	// o mesmo só que restrito para membros da própria classe.
	//Membros são atributos/métodos
	//Métodos setter's e getter's : Adicionare Recuperar dados do atribuito "Respectivamente"

public void setId(Long id) {
	this.id = id;
}
public Long getId() {
	return id;
	
}
public void setDescricao(String Descricao) {
	this.descricao = Descricao;
}
public String getDescricao() {
	return descricao;
		}
public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
}
public String getCodigoBarras() {
	return codigoBarras;
		}

public void setNome(String nome) {
	this.nome = nome;
	}

public String getNome() {
	return nome;
}

public void setPreco(Double preco) {
	this.preco = preco;
}
public Double getPreco() {
	return preco;
}

public void setStatus(Boolean status) {
	this.status = status;
	}

public Boolean getStatus() {
	return status;
	
}
	
}