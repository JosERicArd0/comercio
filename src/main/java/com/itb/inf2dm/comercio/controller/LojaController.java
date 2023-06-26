package com.itb.inf2dm.comercio.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;


@Controller
@RequestMapping("comercio/produtos")

public class LojaController {	
	List <Produto> listaDeProdutos = new ArrayList<Produto>();

@GetMapping("/listar")
 
public String listarProdutos(Model model) {
		
Produto p1 = new Produto();
p1.setid(20l);
p1.setNome("Máquina de lavar Eletrolux 12 l");
p1.setcodigoBarras("JJJJJJJJJJJJJJJJJJJJ");
p1.setPreco(3624.10);
p1.setDescricao("é uma máquinma de lavar, o que você está esperando?");
p1.setStatus(false);
listaDeProdutos.add(p1);

Produto p2 = new Produto();
p2.setid(21l);
p2.setNome("Freezer de 5 portas");
p2.setcodigoBarras("KKKKKKKKKKKK");
p2.setPreco(100000.10);
p2.setDescricao("é um freezer, o que você está esperando?");
p2.setStatus(true);
listaDeProdutos.add(p2);


model.addAttribute ("listaDeProdutos", listaDeProdutos);

return "produtos";
	
}


@GetMapping ("/novo-prod")
public String novoProduto() {
	return "novo-prod";
	
	}
}


