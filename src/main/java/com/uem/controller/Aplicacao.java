package com.uem.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacao {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	       
	    context.scan(Aplicacao.class.getPackage().getName());
	    context.refresh();
	       
	    // Utilizando a nossa classe ControllerFilme com as
	    // injeções feitas pelo Spring.
	    
	  //  ControllerFilme controller = context.getBean(ControlFilme.class);
	    
	       
	    context.close();
	}
}
