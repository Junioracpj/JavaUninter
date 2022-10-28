package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void MenuPrincipal(){
		System.out.println("COFRINHO");
		System.out.println("1 - Adcionar Moeda \n"
				+ "2 - Remover Moeda \n"
				+ "3 - Listar Moeda \n"
				+ "4 - Calcular total convertido para Real"
				+ "0 - Encerrar");
	}
	public static void MenuMoedas(){
	System.out.println("Escolha a moeda: ");
	System.out.println("1 - Real \n"
			+ "2 - Dolar \n"
			+ "3 - Euro \n");
	}
	
	public static void main(String[] args) {
		
		ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		MenuPrincipal();
		opcao = teclado.nextInt();

		while (opcao!=0) {
			switch(opcao) {
			case 1: // Adcionar Moedas
				int opcao2;
				MenuMoedas();
				opcao2 = teclado.nextInt();
				switch(opcao2) {
				case 1: // Adcionar Euro
					listaMoedas.add(new Euro(teclado.nextDouble()));	
					break;
				case 2:	// Adcionar Dolar
					listaMoedas.add(new Dolar(teclado.nextDouble()));
					break;
				case 3: // Adcionar Real
					listaMoedas.add(new Real(teclado.nextDouble()));
					break;
				default:
					System.out.println("Opção invalida,tente novamente");
					MenuMoedas();
					opcao = teclado.nextInt();
				}
			case 2: // Remover Moedas
				listaMoedas.remove(teclado.nextInt());
				break;
			case 3: // Listar Moedas
				listaMoedas.toString();
				break;
			case 4: // Calcular valor total em reais
				double total = 0;
				for(Moeda c : listaMoedas) {
					total += c.calculaValor();
					System.out.println("Valor total das moedas "
							+ "convertidas em real :" + total);}
				break;
			default:
				System.out.println("Opção invalida,tente novamente");
			}
		}
}
}
