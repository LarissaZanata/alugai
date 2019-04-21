package com.uem.interfacesDAO;

import com.uem.model.Filme;

public interface InterfaceFilmeDAO {
	public boolean alterarFilme(String titulo, String produtora);
	public boolean excluirFilme(String titulo, String produtora);
	public Filme buscarFilme(String titulo, String produtora);
	public boolean cadastrarFilme(String titulo, String produtora, String diretor);
}
