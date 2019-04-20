package com.uem.model;

public class Exemplar {
	private int codigo;
	private boolean emprestado;
	private boolean reservado;
	
	public Exemplar() {
		
	}
	
	public Exemplar(int codigo, boolean emprestado, boolean reservado) {
		this.codigo = codigo;
		this.emprestado = emprestado;
		this.reservado = reservado;
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
	
	
}
