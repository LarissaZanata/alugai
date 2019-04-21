package com.uem.model;

public class Exemplar {
	private int codigo;
	private boolean emprestado;
	private boolean reservado;
	private Filme filme;
	
	public Exemplar() {
		
	}
	
	public Exemplar(Filme filme) {
		this.emprestado = false;
		this.reservado = false;
		this.filme = filme;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
