package com.uem.classesDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
		
		Filme achouFilme = new Filme();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		achouFilme = (Filme) session.get(Filme.class, 1);
		session.close();
		
		return achouFilme;
		
		// buscar no banco de dados usando o buscarFilme
		// se voltar null, nao achou o filme, mandar mensagem de filme nao encontrado
		
	}

	@Override
	public boolean cadastrarFilme(String titulo, String produtora, String diretor) {
		Filme achouFilme = new Filme();
		
		achouFilme = this.buscarFilme(titulo, produtora);
		
		if(achouFilme == null) {
			Filme novo = new Filme(titulo, produtora, diretor);
			
			//partir para cadastrar exemplar
			//depois de voltar do cadastro de exemplar, persistir no banco
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(novo);
			session.getTransaction().commit();
			session.close();
			
			return true;
			
		}
		else {
			
			//partir para cadastrar exemplar passando o achouFilme como parametro
			
			return true;
		}
		
		
		
		
	    // se voltar null, nao achou o filme, criar novo instancia de filme e ir cadastrar exemplar
		// se NÃO voltar null, já existe filme prosseguir para a tela de cadastro de exemplar
		
		
	}

}
