package com.uem.model;

import java.util.List;

public class Filme {

	private String titulo;
	private int codigo;
	private String produtora;
	private String diretor;
	private boolean ativo;
	private List<Exemplar> exemplares;
		
	public Filme() {
		
	}
	
	public Filme(String titulo, int codigo, String produtora, String diretor, boolean ativo) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.produtora = produtora;
		this.diretor = diretor;
		this.ativo = ativo;
	}
	
	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
