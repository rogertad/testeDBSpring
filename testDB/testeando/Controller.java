package br.lippe.testeando;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Business bs;
	
	@GetMapping("/sum")
	public int displaySum() {
		return bs.calc();
	}
}


