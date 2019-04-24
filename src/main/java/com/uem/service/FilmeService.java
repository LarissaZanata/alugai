package com.uem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uem.model.Filme;
import com.uem.repository.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;

	public boolean alterarFilme(String titulo, String produtora) {
		Filme filme = new Filme();

		filme.setAtivo(true);

		filmeRepository.save(filme);

		return false;
	}

	public boolean excluirFilme(String titulo, String produtora) {
		try {
			filmeRepository.deleteById(1L);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Filme buscarFilme(String titulo, String produtora) {
		
		return null;
	}

	public boolean cadastrarFilme(String titulo, String produtora, String diretor) {

		return true;
	}
}
