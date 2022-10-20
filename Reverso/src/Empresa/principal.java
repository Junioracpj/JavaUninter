package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
 
		// int megaSena [] = {10,20,30,40,50,55};
		// array, no java e bem limitado
		// arrayList e superior, pois tem funcoes especificas
		
		/* Variaveis primitivas Java
		 * int, float, double, char
		 */
		
		// String e uma classe em java, Integer tbm
		
		Scanner teclado = new Scanner(System.in);
		
		// ArrayList<Integer> megaSena = new ArrayList<Integer>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		String msg;
		System.out.println("Digite quantos nomes ira inserir:");
		int total = teclado.nextInt();
		
		System.out.println("Digite os nomes:");
		for (int i = 0; i < total; i++) {
			msg = teclado.next();
			nomes.add(msg);
		}
		
		System.out.println("Ordem normal");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Ordem inversa");
		for (int i = total-1; i >=0; i--) {
			System.out.println(nomes.get(i));
		}
	}
}
