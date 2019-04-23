package com.uem.alugai;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.uem.views.Logon;

@SpringBootApplication
@Profile("default")
public class AlugaiApplication{

	public static void main(String[] args) {		
		Logon logon  = new Logon();
		logon.frmAluga.setVisible(true);
	    
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlugaiApplication.class).headless(false).run(args);
	 
		}
}
	


