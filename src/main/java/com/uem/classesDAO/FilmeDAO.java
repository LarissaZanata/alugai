package com.uem.classesDAO;

import com.uem.interfacesDAO.InterfaceFilmeDAO;
import com.uem.model.Filme;

public class FilmeDAO implements InterfaceFilmeDAO{

	@Override
	public boolean alterarFilme(String titulo, String produtora) {
		// buscar no banco de dados usando o buscarFilme
		// se voltar null, nao achou o filme, mandar mensagem de filme nao encontrado
		// se NÃO voltar null, permitir alteração dos campos menos do nome (dessa forma mesmo que
		// estiver emprestado podemos alterar o filme
		return false;
	}

	@Override
	public boolean excluirFilme(String titulo, String produtora) {
		// buscar no banco de dados usando o buscarFilme
		// se voltar null, nao achou o filme, mandar mensagem de filme nao encontrado
		// se NÃO voltar null, buscar os exemplares a partir do buscarExemplar()
		// percorrer os mesmos pra ver se algum está emprestado
		// se estiver emprestado bloquear a exclusão
		// se NÃO estiver emprestado permitir a exclusão
		return false;
	}

	@Override
	public Filme buscarFilme(String titulo, String produtora) {
		// buscar no banco de dados usando o buscarFilme
		// se voltar null, nao achou o filme, mandar mensagem de filme nao encontrado
		return null;
	}

	@Override
	public boolean cadastrarFilme(String titulo, String produtora, String diretor) {
		// buscar no banco de dados usando o buscarFilme
	    // se voltar null, nao achou o filme, criar novo instancia de filme e ir cadastrar exemplar
		// se NÃO voltar null, já existe filme prosseguir para a tela de cadastro de exemplar
		
		return false;
	}

}
