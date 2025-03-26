package br.com.engsenai;

import br.com.engsenai.ui.Menu;
import model.Retangulo;

public class Calculadora {

	public static void main(String[] args) {
//		Retangulo retangulo = new Retangulo();
//		retangulo.setDados(10, 15);
//		retangulo.exibirDados();
//		
//		Menu.mostrarMenu();
		int contador = 1;
		while(contador <= 100) {
			System.out.println("SENAI" + contador);
			contador *= 2;
			
		}
	}
	
	public static void escrever(String nome) {
		System.out.println(nome);
		
	}
}