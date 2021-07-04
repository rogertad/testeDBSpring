package br.lippe.testeando;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.lippe.testDB.UserRepo;
import br.lippe.testDB.Usuario;
import br.lippe.testDB.commandLine;

@RestController
@ComponentScan("br.lippe.testDB")
public class Controller2 {
	
	@Autowired
	private Business bs;
	
	@Autowired
	private UserRepo ud;
	private static final Logger log = 
			LoggerFactory.getLogger(commandLine.class);

	
	@GetMapping("/foi")
	public String displaySum() {
		
		log.info("---OPA ! ENTRANDO NA MATRIX---");
		Usuario u = new Usuario("José",2);
		ud.save(u);
		log.info("novo usuário no BD "+u);

		return "===AH===: "+u.getId();
	
	}
}
