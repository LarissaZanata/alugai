package com.uem.interfacesDAO;

import com.uem.model.Filme;

import java.util.List;

import com.uem.model.Exemplar;

public interface InterfaceExemplarDAO {
	public boolean checarStatus(Filme filme);
	public boolean cadastrarExemplar(int codigo, boolean emprestado, boolean reservado);
	public boolean devolverExemplar(int codigo);
	public Exemplar buscarExemplar(Filme filme);
	public boolean excluirExemplar(Filme filme);
	public void alterarExemplar(Filme filme);
	public boolean consultaEmprestimo(List<Exemplar> exemplares);
}
