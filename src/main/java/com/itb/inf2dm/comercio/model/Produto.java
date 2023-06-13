package com.itb.inf2dm.comercio.model;

public class Produto {

	private Long id;
	private String Descricao;
	private String nome;
	private String codigoBarras;
	private Double preco;
	
	// No projeto orientação objetos, falamos sobre o public, 
	// um modificador de acesso livre para todas as classes e private, 
	// o mesmo só que restrito para membros da própria classe.
	//Membros são atributos/métodos
	//Métodos setter's e getter's : Adicionare Recuperar dados do atribuito "Respectivamente"

public void setid(Long id) {
	this.id = id;
}
public Long getid() {
	return id;
	
}
public void setDescricao(String Descricao) {
	this.Descricao = Descricao;
}
public String getDescricao() {
	return Descricao;
		}
public void setcodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
}
public String getcodigoBarras() {
	return codigoBarras;
		}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCodigoBarras() {
	return codigoBarras;
}
public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
}
public Double getPreco() {
	return preco;
}
public void setPreco(Double preco) {
	this.preco = preco;
}

	}
