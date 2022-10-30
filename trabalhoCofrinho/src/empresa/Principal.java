package empresa;
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
				+ "3 - Euro");
	}
	public static void MenuRemover(){
		System.out.println("Escolha a moeda para remover: ");
		System.out.println("1 - Real \n"
				+ "2 - Dolar \n"
				+ "3 - Euro");
	}
	
//	--------- PROGRAMA PRINCIPAL ---------
	
	public static void main(String[] args) {

//		Criando variaveis a serem utilizadas
		Scanner teclado = new Scanner(System.in);
		int opcao, opcao2, opcao3;
		Moeda moeda = null;
		Cofrinho cofre = new Cofrinho(); 

		MenuPrincipal();
		opcao = teclado.nextInt();
		
//		Iniciando o Loop de execução do programa
		while (opcao!=0) {
			switch(opcao) {
			case 1: // Adcionar Moedas
				MenuMoedas();
				opcao2 = teclado.nextInt();
				while(opcao2!=0) { // loop para inserção de dados
					switch(opcao2) {
					case 1:
						System.out.println("Digite o Valor:");
						moeda = new Real(teclado.nextDouble());	
						break;
					case 2:
						System.out.println("Digite o Valor:");
						moeda = new Dolar(teclado.nextDouble());
						break;
					case 3:
						System.out.println("Digite o Valor:");
						moeda = new Euro(teclado.nextDouble());
						break;
					case 0:
						System.out.println("Retornando ao menu principal!!");
						break;
					default:
						System.out.println("Opção inválida, tente novamente!!");
					}
					cofre.adcionar(moeda);
					opcao2 = 0;
					}
				break;
			case 2: // Remover Moedas
				MenuRemover();
				opcao3 = teclado.nextInt();
				while(opcao3!=0) { // loop para remoção de dados
					switch(opcao3) {
					case 1:
						System.out.println("Digite o Valor:");
						moeda = new Real(teclado.nextDouble());	
						break;
					case 2:
						System.out.println("Digite o Valor:");
						moeda = new Dolar(teclado.nextDouble());
						break;
					case 3:
						System.out.println("Digite o Valor:");
						moeda = new Euro(teclado.nextDouble());
						break;
					case 0:
						System.out.println("Retornando ao menu principal!!");
						break;
					default:
						System.out.println("Opção inválida, tente novamente!!");
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
//		Fim do loop de execução do programa
		System.out.println("Programa encerrado!!");
}
}
