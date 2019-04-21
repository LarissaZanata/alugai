package com.uem.interfacesDAO;

import com.uem.model.Filme;

import java.util.List;

import com.uem.model.Exemplar;

public interface InterfaceExemplarDAO {
	public boolean checarStatus(List <Exemplar> exemplares);
	public boolean cadastrarExemplar(Filme filme);
	public boolean devolverExemplar(int codigo);
	public List<Exemplar> buscarExemplar(Filme filme);
	public boolean excluirExemplar(Filme filme);
	public void alterarExemplar(Filme filme);
	public boolean consultaReserva(List<Exemplar> exemplares);
}
