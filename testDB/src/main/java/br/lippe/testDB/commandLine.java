package br.lippe.testDB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//public class commandLine implements CommandLineRunner{
public class commandLine {

	private static final Logger log = 
			LoggerFactory.getLogger(commandLine.class);
	
	@Autowired
	private UserRepo ud;
	
	//@Override
/*	public void run(String... args) throws Exception {
		log.info("---OPA ! ENTRANDO NA MATRIX---");
		Usuario u = new Usuario("José",2);
		ud.save(u);
		log.info("novo usuário no BD "+u);
	}*/

	
	
}
