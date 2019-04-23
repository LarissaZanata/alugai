package com.uem.alugai;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.uem.views.Logon;

@SpringBootApplication
public class AlugaiApplication{

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlugaiApplication.class).headless(false).run(args);
		Logon logon = applicationContext.getBean(Logon.class);
       
		 
		  }
		
	}
	


