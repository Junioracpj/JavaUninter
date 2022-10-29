package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
//	methods
 	
	public void adcionar(Moeda c) {
		listaMoedas.add(c);
	}
	
	public void remover(Moeda c) {
		listaMoedas.remove(c);
	}
	
	public void listar() {
		for (Moeda c : listaMoedas) {
			System.out.println(c);
		}
	}

	public void totalConvertido() {
		double total = 0;
		for(Moeda c : listaMoedas) {
			total += c.calculaValor();
		}
		System.out.println("Valor total das moedas "
				+ "convertidas em real :" + total);}
	}

