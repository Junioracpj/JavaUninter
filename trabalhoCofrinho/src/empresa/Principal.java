package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void MenuPrincipal(){
		System.out.println("COFRINHO");
		System.out.println("1 - Adcionar Moeda /n"
				+ "2 - Remover Moeda /n"
				+ "3 -Listar Moeda /n"
				+ "4 - Calcular total convertido para Real"
				+ "0 -Encerrar");
	}
	public static void MenuMoedas(){
	System.out.println("Escolha a moeda: ");
	System.out.println("1 - Real /n"
			+ "2 - Dolar /n"
			+ "3 - Euro /n");
	}
	
	public static void main(String[] args) {
		
		ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
		
		Scanner teclado = new Scanner(System.in);
		boolean fim = false;
		int resposta;
		

		while (!fim) {
			MenuPrincipal();
			resposta = teclado.nextInt();
			if(resposta == 1) {
				MenuMoedas();
				resposta = teclado.nextInt();
				if(resposta == 01) {
					listaMoedas.add(new Euro(teclado.nextDouble()));
				}else if(resposta == 02) {
					listaMoedas.add(new Dolar(teclado.nextDouble()));
				}else {
					listaMoedas.add(new Real(teclado.nextDouble()));
				}
			}else if(resposta == 2) {
				listaMoedas.remove(teclado.nextInt());
			}else if(resposta == 3) {
					listaMoedas.toString();
			}else if(resposta == 4) {
//				enconstrar solucao para o calculo	
			}else {
				System.out.println("Encerrando");
				fim = true;
			}
	}
}
}
