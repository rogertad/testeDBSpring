package br.lippe.testeando;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Dados{
	public List<Integer> getInts(){
		return Arrays.asList(12,45,65,77);
	}
	
}
