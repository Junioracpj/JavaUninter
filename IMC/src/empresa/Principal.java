package empresa;

import java.util.Scanner;

public class Principal {
	// area nao codificavel
	public static void main(String[] args) {
		// area codificavel
		
		int peso;
		double altura;
		
		System.out.println("Digite peso seguido de altura: ");
		Scanner teclado = new Scanner(System.in);
		// leitura similiar a input no python
		
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
	
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %2f", imc);
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
