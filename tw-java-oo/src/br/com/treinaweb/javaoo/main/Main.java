package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo corsa = new Veiculo();
		corsa.setMarca("GM");
		corsa.setNome("Corsa");
		System.out.println(corsa.getNome());
		corsa.ligar();
		Veiculo celta = new Veiculo();
		celta.setMarca("GM");		
		celta.setNome("Celta");
		System.out.println(celta.getNome());
		celta.ligar();
	}
	
}
