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
	
//	--------- PROGRAMA PRINCIPAL ---------
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		int opcao2;
		
//		Criando lista de moedas 
		Cofrinho cofre = new Cofrinho();

		
		MenuPrincipal();
		opcao = teclado.nextInt();

		while (opcao!=0) {
			switch(opcao) {
			case 1: // Adcionar Moedas
				MenuMoedas();
				opcao2 = teclado.nextInt();
				Moeda moeda = null;
				if(opcao == 1) {
					moeda = new Real(teclado.nextDouble());	
				}else if(opcao == 2) {
					moeda = new Dolar(teclado.nextDouble());
				}else if(opcao == 3) {
					moeda = new Euro(teclado.nextDouble());
				}else {
					System.out.println("Opcao invalida, tente novamente!!");
				}
				cofre.adcionar(moeda);
				break;
			case 2: // Remover Moedas
//				cofre.remover(teclado.nextInt());
				break;
			case 3: // Listar Moedas
				cofre.listar();
				break;
			case 4: // Calcular valor total em reais
				break;
			default:
				System.out.println("Opção invalida,tente novamente");
			}
			MenuPrincipal();
			opcao = teclado.nextInt();
		}
}
}
