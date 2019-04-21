package com.uem.controller;

import org.springframework.stereotype.Controller;

import com.uem.classesDAO.FilmeDAO;
import com.uem.interfacesDAO.InterfaceFilmeDAO;
import com.uem.model.Filme;

@Controller
public class ControlFilme {
	
	InterfaceFilmeDAO filme = new FilmeDAO();
	
	public boolean cadastrarFilme(String titulo, String produtora, String diretor) {
		return filme.cadastrarFilme(titulo, produtora, diretor);
	}
	
	public boolean excluirFilme(String titulo, String produtora) {
		return filme.excluirFilme(titulo, produtora);
	}
	
	public Filme buscarFilme(String titulo, String produtora) {
		return filme.buscarFilme(titulo, produtora);
		//tratar o retorno na view (se tiver dados do filme, mostrar)
	}
	
	public boolean alterarFilme(String titulo, String produtora) {
		return filme.alterarFilme(titulo, produtora);
	}
}
