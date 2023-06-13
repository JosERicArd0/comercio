package com.itb.inf2dm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("comercio/produtos")

public class LojaController {	
	list<Produto> listaDeProdutos = new ArrayList<Produto>();

@GetMapping("/listar")

public String listarProdutos() {

		
Produto p1 = new Produto();
p1.setid(20l);
p1.setNome("Máquina de lavar Eletrolux 12 l");
p1.setcodigoBarras("JJJJJJJJJJJJJJJJJJJJ");
p1.setPreco("3624.10");
listaDeProdutos.add(p1);
return "produtos";
	}

@GetMapping ("/novo-prod")
public String novoProduto() {
	return "novo-prod";
	
	}
}

