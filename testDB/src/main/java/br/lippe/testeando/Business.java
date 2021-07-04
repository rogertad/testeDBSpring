package br.lippe.testeando;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Business{
	
	@Autowired
	Dados dd;
	
	public int calc() {
		List<Integer> lista = dd.getInts(); 
		return lista.stream().reduce(Integer::sum).get();
	}
	  
}
