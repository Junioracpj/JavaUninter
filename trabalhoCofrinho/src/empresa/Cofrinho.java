package empresa;

import java.util.Scanner;

public class Cofrinho {
	private double listaMoeda = 0;

//	construtor vazio
	public Cofrinho() {
	}
	
//	construtor
	public Cofrinho(double listaMoeda) {
		super();
		this.listaMoeda = listaMoeda;
	}
	
//	methods
	
	void adcionar(Moeda moeda) {
		listaMoeda = moeda;
	}
	
	void remover(Moeda moeda) {
		listaMoeda -= moeda;
	}
	
	void listagemMoeda() {
		Moeda.info();
	}
	
	void totalConvertido() {
		Moeda.converter();
	}
	

}
