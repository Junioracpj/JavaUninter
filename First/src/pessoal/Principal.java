package pessoal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		idade = idade + 2;
		double peso = 72.5;
		float peso2 = 80.6f;
		String nome = "Junior";
		
		// double e float sao variaveis numericas decimais
		// float é mais economico de memoria
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite idade, peso, nome : ");
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println("Nome: " + nome);
		System.out.printf("Idade: %d\n", idade);		
		System.out.printf("Peso: %2f\n", peso);
	}

}
