package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
//	Menus que serao usados no programa
	public static void MenuPrincipal(){
		System.out.println("COFRINHO");
		System.out.println("1 - Adcionar Moeda \n"
				+ "2 - Remover Moeda \n"
				+ "3 - Listar Moeda \n"
				+ "4 - Calcular total convertido para Real\n"
				+ "0 - Encerrar");
	}
	public static void MenuMoedas(){
		System.out.println("Escolha a moeda: ");
		System.out.println("1 - Real \n"
				+ "2 - Dolar \n"
				+ "3 - Euro \n");
	}
	public static void MenuRemover(){
		System.out.println("Escolha a moeda para remover: ");
		System.out.println("1 - Real \n"
				+ "2 - Dolar \n"
				+ "3 - Euro \n");
	}
	
//	--------- PROGRAMA PRINCIPAL ---------
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		int opcao2;
		int opcao3;
		Moeda moeda = null;
		
//		Criando lista de moedas 
		Cofrinho cofre = new Cofrinho();

		
		MenuPrincipal();
		opcao = teclado.nextInt();

		while (opcao!=0) {
			switch(opcao) {
			case 1: // Adcionar Moedas
				MenuMoedas();
				opcao2 = teclado.nextInt();
				while(opcao2!=0) {
					switch(opcao2) {
					case 1:
						moeda = new Real(teclado.nextDouble());	
						break;
					case 2:
						moeda = new Dolar(teclado.nextDouble());
						break;
					case 3:
						moeda = new Euro(teclado.nextDouble());
						break;
					case 0:
						System.out.println("Retornando ao menu principal!!");
						break;
					default:
						System.out.println("Opcao invalida, tente novamente!!");
					}
					cofre.adcionar(moeda);
					opcao2 = 0;
					}
				break;
			case 2: // Remover Moedas
				MenuRemover();
				opcao3 = teclado.nextInt();
				while(opcao3!=0) {
					switch(opcao3) {
					case 1:
						moeda = new Real(teclado.nextDouble());	
						break;
					case 2:
						moeda = new Dolar(teclado.nextDouble());
						break;
					case 3:
						moeda = new Euro(teclado.nextDouble());
						break;
					case 0:
						System.out.println("Retornando ao menu principal!!");
						break;
					default:
						System.out.println("Opcao invalida, tente novamente!!");
					}
					cofre.remover(moeda);
					opcao3 = 0;
					}
				break;
			case 3: // Listar Moedas
				cofre.listar();
				break;
			case 4: // Calcular valor total em reais
				cofre.totalConvertido();
				break;
			default:
				System.out.println("Opção invalida,tente novamente");
			}
			MenuPrincipal();
			opcao = teclado.nextInt();
		}
}
}
